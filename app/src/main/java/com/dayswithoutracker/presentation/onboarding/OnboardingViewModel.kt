package com.dayswithoutracker.presentation.onboarding

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.dayswithoutracker.domain.model.Gender
import com.dayswithoutracker.domain.model.HabitType
import com.dayswithoutracker.domain.model.UserProfile
import com.dayswithoutracker.domain.repository.CheckpointRepository
import com.dayswithoutracker.domain.usecase.SaveUserProfileUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import java.time.LocalDate
import javax.inject.Inject

/**
 * ViewModel для экрана онбординга
 */
@HiltViewModel
class OnboardingViewModel @Inject constructor(
    private val saveUserProfileUseCase: SaveUserProfileUseCase,
    private val checkpointRepository: CheckpointRepository
) : ViewModel() {
    
    private val _uiState = MutableStateFlow(OnboardingUiState())
    val uiState: StateFlow<OnboardingUiState> = _uiState.asStateFlow()
    
    init {
        // Инициализируем чек-поинты при первом запуске
        viewModelScope.launch {
            checkpointRepository.initializeCheckpoints()
        }
    }
    
    fun selectGender(gender: Gender) {
        _uiState.value = _uiState.value.copy(selectedGender = gender)
    }
    
    fun selectHabitType(habitType: HabitType) {
        _uiState.value = _uiState.value.copy(selectedHabitType = habitType)
    }
    
    fun startTracking() {
        val currentState = _uiState.value
        if (currentState.selectedGender != null && currentState.selectedHabitType != null) {
            _uiState.value = currentState.copy(isLoading = true)
            
            viewModelScope.launch {
                try {
                    val now = LocalDate.now()
                    val nowDateTime = java.time.LocalDateTime.now()
                    val userProfile = UserProfile(
                        gender = currentState.selectedGender,
                        habitType = currentState.selectedHabitType,
                        startDate = now,
                        startDateTime = nowDateTime,
                        moneyPerUnit = currentState.moneyPerUnit.toFloatOrNull(),
                        unitsPerDay = currentState.unitsPerDay.toFloatOrNull(),
                        currencySymbol = currentState.currencySymbol.takeIf { it.isNotEmpty() }
                    )
                    saveUserProfileUseCase(userProfile)
                    _uiState.value = currentState.copy(
                        isLoading = false,
                        isCompleted = true
                    )
                } catch (e: Exception) {
                    _uiState.value = currentState.copy(
                        isLoading = false,
                        error = e.message
                    )
                }
            }
        }
    }
    
    fun clearError() {
        _uiState.value = _uiState.value.copy(error = null)
    }
    
    fun updateMoneyPerUnit(value: String) {
        // Валидация: только цифры и одна точка
        if (value.isEmpty() || value.matches(Regex("^\\d*\\.?\\d{0,1}$"))) {
            _uiState.value = _uiState.value.copy(moneyPerUnit = value)
        }
    }
    
    fun updateUnitsPerDay(value: String) {
        // Валидация: только цифры и одна точка
        if (value.isEmpty() || value.matches(Regex("^\\d*\\.?\\d{0,1}$"))) {
            _uiState.value = _uiState.value.copy(unitsPerDay = value)
        }
    }
    
    fun updateCurrencySymbol(value: String) {
        _uiState.value = _uiState.value.copy(currencySymbol = value)
    }
}

/**
 * UI состояние для экрана онбординга
 */
data class OnboardingUiState(
    val selectedGender: Gender? = null,
    val selectedHabitType: HabitType? = null,
    val isLoading: Boolean = false,
    val isCompleted: Boolean = false,
    val error: String? = null,
    // Поля для калькулятора денег
    val showMoneyCalculator: Boolean = true,
    val moneyPerUnit: String = "",
    val unitsPerDay: String = "",
    val currencySymbol: String = "₽"
) {
    val isStartButtonEnabled: Boolean
        get() = selectedGender != null && selectedHabitType != null && !isLoading
}

