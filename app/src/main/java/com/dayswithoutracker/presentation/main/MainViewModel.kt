package com.dayswithoutracker.presentation.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.dayswithoutracker.domain.model.Checkpoint
import com.dayswithoutracker.domain.model.UserProfile
import com.dayswithoutracker.domain.usecase.CalculateDaysUseCase
import com.dayswithoutracker.domain.usecase.GetCheckpointsWithProgressUseCase
import com.dayswithoutracker.domain.usecase.GetUserProfileUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
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
    private val calculateDaysUseCase: CalculateDaysUseCase
) : ViewModel() {
    
    private val _uiState = MutableStateFlow(MainUiState())
    val uiState: StateFlow<MainUiState> = _uiState.asStateFlow()
    
    init {
        observeUserProfile()
    }
    
    private fun observeUserProfile() {
        viewModelScope.launch {
            getUserProfileUseCase().collect { userProfile ->
                if (userProfile != null) {
                    val days = calculateDaysUseCase(userProfile.startDate)
                    val progress = calculateDaysUseCase.calculateProgress(userProfile.startDate)
                    
                    _uiState.value = _uiState.value.copy(
                        userProfile = userProfile,
                        daysSinceStart = days,
                        progress = progress,
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
    val progress: Float = 0f,
    val checkpoints: List<Checkpoint> = emptyList(),
    val isLoading: Boolean = true,
    val error: String? = null
) {
    val isYearCompleted: Boolean
        get() = daysSinceStart >= 365
    
    val achievedCheckpoints: Int
        get() = checkpoints.count { it.isAchieved }
}

