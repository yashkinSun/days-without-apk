package com.dayswithoutracker.presentation.settings

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.dayswithoutracker.domain.repository.UserRepository
import com.dayswithoutracker.domain.repository.ThemeRepository
import com.dayswithoutracker.domain.repository.NotificationRepository
import com.dayswithoutracker.domain.model.ThemeSetting
import com.dayswithoutracker.domain.model.NotificationSettings
import com.dayswithoutracker.domain.usecase.ScheduleMotivationalNotificationsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.launch
import javax.inject.Inject

/**
 * ViewModel для экрана настроек
 */
@HiltViewModel
class SettingsViewModel @Inject constructor(
    private val userRepository: UserRepository,
    private val themeRepository: ThemeRepository,
    private val notificationRepository: NotificationRepository,
    private val scheduleMotivationalNotificationsUseCase: ScheduleMotivationalNotificationsUseCase
) : ViewModel() {
    
    private val _uiState = MutableStateFlow(SettingsUiState())
    val uiState: StateFlow<SettingsUiState> = _uiState.asStateFlow()
    
    init {
        loadUserProfile()
        loadThemeSetting()
        loadNotificationSettings()
    }
    
    private fun loadUserProfile() {
        viewModelScope.launch {
            userRepository.getUserProfile().collect { profile ->
                profile?.let {
                    _uiState.value = _uiState.value.copy(
                        hasMoneyData = it.hasMoneyCalculatorData(),
                        moneyPerUnit = it.moneyPerUnit?.toString() ?: "",
                        unitsPerDay = it.unitsPerDay?.toString() ?: "",
                        currencySymbol = it.currencySymbol ?: "₽"
                    )
                }
            }
        }
    }
    
    private fun loadThemeSetting() {
        viewModelScope.launch {
            themeRepository.getThemeSetting().collect { theme ->
                _uiState.value = _uiState.value.copy(
                    isDarkTheme = theme == ThemeSetting.DARK
                )
            }
        }
    }
    
    private fun loadNotificationSettings() {
        viewModelScope.launch {
            notificationRepository.getNotificationSettings().collect { settings ->
                _uiState.value = _uiState.value.copy(
                    notificationsEnabled = settings.notificationsEnabled,
                    achievementsEnabled = settings.achievementsEnabled,
                    motivationalEnabled = settings.motivationalEnabled
                )
            }
        }
    }
    
    fun resetCounter() {
        _uiState.value = _uiState.value.copy(isLoading = true)
        
        viewModelScope.launch {
            try {
                userRepository.deleteUserProfile()
                _uiState.value = _uiState.value.copy(
                    isLoading = false,
                    isResetCompleted = true
                )
            } catch (e: Exception) {
                _uiState.value = _uiState.value.copy(
                    isLoading = false,
                    error = e.message
                )
            }
        }
    }
    
    fun showResetConfirmation() {
        _uiState.value = _uiState.value.copy(showResetDialog = true)
    }
    
    fun hideResetConfirmation() {
        _uiState.value = _uiState.value.copy(showResetDialog = false)
    }
    
    fun clearError() {
        _uiState.value = _uiState.value.copy(error = null)
    }
    
    fun showMoneyCalculatorDialog() {
        _uiState.value = _uiState.value.copy(showMoneyDialog = true)
    }
    
    fun hideMoneyCalculatorDialog() {
        _uiState.value = _uiState.value.copy(showMoneyDialog = false)
    }
    
    fun updateMoneyPerUnit(value: String) {
        if (value.isEmpty() || value.matches(Regex("^\\d*\\.?\\d{0,1}$"))) {
            _uiState.value = _uiState.value.copy(moneyPerUnit = value)
        }
    }
    
    fun updateUnitsPerDay(value: String) {
        if (value.isEmpty() || value.matches(Regex("^\\d*\\.?\\d{0,1}$"))) {
            _uiState.value = _uiState.value.copy(unitsPerDay = value)
        }
    }
    
    fun updateCurrencySymbol(value: String) {
        _uiState.value = _uiState.value.copy(currencySymbol = value)
    }
    
    fun saveMoneySettings() {
        viewModelScope.launch {
            try {
                val currentProfile = userRepository.getUserProfileOnce()
                currentProfile?.let { profile ->
                    val updatedProfile = profile.copy(
                        moneyPerUnit = _uiState.value.moneyPerUnit.toFloatOrNull(),
                        unitsPerDay = _uiState.value.unitsPerDay.toFloatOrNull(),
                        currencySymbol = _uiState.value.currencySymbol.takeIf { it.isNotEmpty() }
                    )
                    userRepository.saveUserProfile(updatedProfile)
                    _uiState.value = _uiState.value.copy(
                        showMoneyDialog = false,
                        hasMoneyData = updatedProfile.hasMoneyCalculatorData()
                    )
                }
            } catch (e: Exception) {
                _uiState.value = _uiState.value.copy(error = e.message)
            }
        }
    }
    
    fun toggleTheme(isDark: Boolean) {
        viewModelScope.launch {
            val newTheme = if (isDark) ThemeSetting.DARK else ThemeSetting.LIGHT
            themeRepository.saveThemeSetting(newTheme)
        }
    }
    
    fun toggleNotifications(enabled: Boolean) {
        viewModelScope.launch {
            val currentSettings = notificationRepository.getNotificationSettings().first()
            val newSettings = currentSettings.copy(notificationsEnabled = enabled)
            notificationRepository.saveNotificationSettings(newSettings)
            
            if (enabled && newSettings.motivationalEnabled) {
                scheduleMotivationalNotificationsUseCase()
            } else if (!enabled) {
                scheduleMotivationalNotificationsUseCase.cancel()
            }
        }
    }
    
    fun toggleAchievements(enabled: Boolean) {
        viewModelScope.launch {
            val currentSettings = notificationRepository.getNotificationSettings().first()
            val newSettings = currentSettings.copy(achievementsEnabled = enabled)
            notificationRepository.saveNotificationSettings(newSettings)
        }
    }
    
    fun toggleMotivational(enabled: Boolean) {
        viewModelScope.launch {
            val currentSettings = notificationRepository.getNotificationSettings().first()
            val newSettings = currentSettings.copy(motivationalEnabled = enabled)
            notificationRepository.saveNotificationSettings(newSettings)
            
            if (enabled && currentSettings.notificationsEnabled) {
                scheduleMotivationalNotificationsUseCase()
            } else if (!enabled) {
                scheduleMotivationalNotificationsUseCase.cancel()
            }
        }
    }
}

/**
 * UI состояние для экрана настроек
 */
data class SettingsUiState(
    val isLoading: Boolean = false,
    val showResetDialog: Boolean = false,
    val isResetCompleted: Boolean = false,
    val error: String? = null,
    // Калькулятор денег
    val showMoneyDialog: Boolean = false,
    val hasMoneyData: Boolean = false,
    val moneyPerUnit: String = "",
    val unitsPerDay: String = "",
    val currencySymbol: String = "₽",
    // Тема
    val isDarkTheme: Boolean = false,
    // Уведомления
    val notificationsEnabled: Boolean = true,
    val achievementsEnabled: Boolean = true,
    val motivationalEnabled: Boolean = true
)

