package com.dayswithoutracker.presentation.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.dayswithoutracker.domain.model.Checkpoint
import com.dayswithoutracker.domain.model.HabitType
import com.dayswithoutracker.domain.model.UserProfile
import com.dayswithoutracker.domain.usecase.CalculateDaysUseCase
import com.dayswithoutracker.domain.usecase.CalculateDetailedTimeUseCase
import com.dayswithoutracker.domain.usecase.DetailedTime
import com.dayswithoutracker.domain.usecase.GetCheckpointsWithProgressUseCase
import com.dayswithoutracker.domain.usecase.GetUserProfileUseCase
import com.dayswithoutracker.domain.usecase.CalculateMoneySavedUseCase
import com.dayswithoutracker.domain.model.MoneySaved
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import javax.inject.Inject

/**
 * ViewModel для главного экрана
 */
@HiltViewModel
class MainViewModel @Inject constructor(
    private val getUserProfileUseCase: GetUserProfileUseCase,
    private val getCheckpointsWithProgressUseCase: GetCheckpointsWithProgressUseCase,
    private val calculateDaysUseCase: CalculateDaysUseCase,
    private val calculateDetailedTimeUseCase: CalculateDetailedTimeUseCase,
    private val calculateMoneySavedUseCase: CalculateMoneySavedUseCase
) : ViewModel() {
    
    private val _uiState = MutableStateFlow(MainUiState())
    val uiState: StateFlow<MainUiState> = _uiState.asStateFlow()
    
    init {
        observeUserProfile()
        startTimeUpdater()
    }
    
    private fun observeUserProfile() {
        viewModelScope.launch {
            getUserProfileUseCase().collect { userProfile ->
                if (userProfile != null) {
                    updateTimeData(userProfile)
                    _uiState.value = _uiState.value.copy(
                        userProfile = userProfile,
                        isLoading = false
                    )
                    
                    // Загружаем чек-поинты
                    loadCheckpoints(userProfile)
                } else {
                    _uiState.value = _uiState.value.copy(
                        userProfile = null,
                        isLoading = false
                    )
                }
            }
        }
    }
    
    private fun updateTimeData(userProfile: UserProfile) {
        val startDateTime = userProfile.getEffectiveStartDateTime()
        val detailedTime = calculateDetailedTimeUseCase(startDateTime)
        val days = calculateDaysUseCase(userProfile.startDate)
        val progress = calculateDetailedTimeUseCase.calculateProgress(startDateTime)
        
        val habitText = when (userProfile.habitType) {
            HabitType.NO_SMOKING -> "не курю"
            HabitType.NO_DRINKING -> "не пью"
        }
        
        val formattedTime = calculateDetailedTimeUseCase.formatTime(detailedTime, habitText)
        
        // Расчет сэкономленных денег
        val moneySaved = calculateMoneySavedUseCase(userProfile)
        
        _uiState.value = _uiState.value.copy(
            daysSinceStart = days,
            detailedTime = detailedTime,
            formattedTimeText = formattedTime,
            progress = progress,
            moneySaved = moneySaved
        )
    }
    
    private fun startTimeUpdater() {
        viewModelScope.launch {
            while (true) {
                delay(1000) // Обновляем каждую секунду
                _uiState.value.userProfile?.let { userProfile ->
                    updateTimeData(userProfile)
                }
            }
        }
    }
    
    private fun loadCheckpoints(userProfile: UserProfile) {
        viewModelScope.launch {
            getCheckpointsWithProgressUseCase(
                userProfile.gender,
                userProfile.habitType,
                userProfile.startDate
            ).collect { checkpoints ->
                _uiState.value = _uiState.value.copy(checkpoints = checkpoints)
            }
        }
    }
    
    fun refreshData() {
        _uiState.value = _uiState.value.copy(isLoading = true)
        observeUserProfile()
    }
}

/**
 * UI состояние для главного экрана
 */
data class MainUiState(
    val userProfile: UserProfile? = null,
    val daysSinceStart: Int = 0,
    val detailedTime: DetailedTime? = null,
    val formattedTimeText: String = "",
    val progress: Float = 0f,
    val checkpoints: List<Checkpoint> = emptyList(),
    val moneySaved: MoneySaved? = null,
    val isLoading: Boolean = true,
    val error: String? = null
) {
    val isYearCompleted: Boolean
        get() = daysSinceStart >= 365
    
    val achievedCheckpoints: Int
        get() = checkpoints.count { it.isAchieved }
}

