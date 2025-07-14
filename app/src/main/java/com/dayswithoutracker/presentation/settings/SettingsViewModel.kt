package com.dayswithoutracker.presentation.settings

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.dayswithoutracker.domain.repository.UserRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

/**
 * ViewModel для экрана настроек
 */
@HiltViewModel
class SettingsViewModel @Inject constructor(
    private val userRepository: UserRepository
) : ViewModel() {
    
    private val _uiState = MutableStateFlow(SettingsUiState())
    val uiState: StateFlow<SettingsUiState> = _uiState.asStateFlow()
    
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
}

/**
 * UI состояние для экрана настроек
 */
data class SettingsUiState(
    val isLoading: Boolean = false,
    val showResetDialog: Boolean = false,
    val isResetCompleted: Boolean = false,
    val error: String? = null
)

