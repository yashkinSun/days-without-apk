package com.dayswithoutracker.presentation.settings

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.ui.text.input.KeyboardType
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.dayswithoutracker.R
import com.dayswithoutracker.domain.model.ThemeSetting
import androidx.compose.material3.Switch

/**
 * Экран настроек
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SettingsScreen(
    onNavigateBack: () -> Unit,
    onNavigateToOnboarding: () -> Unit,
    viewModel: SettingsViewModel = hiltViewModel()
) {
    val uiState by viewModel.uiState.collectAsStateWithLifecycle()
    
    LaunchedEffect(uiState.isResetCompleted) {
        if (uiState.isResetCompleted) {
            onNavigateToOnboarding()
        }
    }
    
    uiState.error?.let { error ->
        LaunchedEffect(error) {
            // Показать ошибку
            viewModel.clearError()
        }
    }
    
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = stringResource(R.string.settings))
                },
                navigationIcon = {
                    IconButton(onClick = onNavigateBack) {
                        Icon(
                            imageVector = Icons.Default.ArrowBack,
                            contentDescription = "Назад"
                        )
                    }
                }
            )
        }
    ) { paddingValues ->
        SettingsContent(
            uiState = uiState,
            onResetClick = viewModel::showResetConfirmation,
            onShowMoneyDialog = viewModel::showMoneyCalculatorDialog,
            onThemeChange = viewModel::toggleTheme,
            onNotificationsToggle = viewModel::toggleNotifications,
            onAchievementsToggle = viewModel::toggleAchievements,
            onMotivationalToggle = viewModel::toggleMotivational,
            modifier = Modifier.padding(paddingValues)
        )
        
        // Диалог подтверждения сброса
        if (uiState.showResetDialog) {
            ResetConfirmationDialog(
                onConfirm = {
                    viewModel.hideResetConfirmation()
                    viewModel.resetCounter()
                },
                onDismiss = viewModel::hideResetConfirmation
            )
        }
        
        // Диалог редактирования калькулятора денег
        if (uiState.showMoneyDialog) {
            MoneyCalculatorDialog(
                moneyPerUnit = uiState.moneyPerUnit,
                unitsPerDay = uiState.unitsPerDay,
                currencySymbol = uiState.currencySymbol,
                onMoneyPerUnitChange = viewModel::updateMoneyPerUnit,
                onUnitsPerDayChange = viewModel::updateUnitsPerDay,
                onCurrencySymbolChange = viewModel::updateCurrencySymbol,
                onSave = viewModel::saveMoneySettings,
                onDismiss = viewModel::hideMoneyCalculatorDialog
            )
        }
    }
}

@Composable
private fun SettingsContent(
    uiState: SettingsUiState,
    onResetClick: () -> Unit,
    onShowMoneyDialog: () -> Unit,
    onThemeChange: (Boolean) -> Unit,
    onNotificationsToggle: (Boolean) -> Unit,
    onAchievementsToggle: (Boolean) -> Unit,
    onMotivationalToggle: (Boolean) -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        // Темная тема
        Card(
            modifier = Modifier.fillMaxWidth()
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column(modifier = Modifier.weight(1f)) {
                    Text(
                        text = "Темная тема",
                        style = MaterialTheme.typography.titleMedium
                    )
                    Text(
                        text = "Переключить оформление приложения",
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }
                
                Switch(
                    checked = uiState.isDarkTheme,
                    onCheckedChange = onThemeChange
                )
            }
        }
        
        // Уведомления
        Card(
            modifier = Modifier.fillMaxWidth()
        ) {
            Column(
                modifier = Modifier.padding(20.dp),
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                Text(
                    text = "Уведомления",
                    style = MaterialTheme.typography.titleMedium
                )
                
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "Включить уведомления",
                        style = MaterialTheme.typography.bodyMedium
                    )
                    Switch(
                        checked = uiState.notificationsEnabled,
                        onCheckedChange = onNotificationsToggle
                    )
                }
                
                if (uiState.notificationsEnabled) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "Достижения",
                            style = MaterialTheme.typography.bodyMedium,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                        Switch(
                            checked = uiState.achievementsEnabled,
                            onCheckedChange = onAchievementsToggle
                        )
                    }
                    
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "Мотивация (ежедневно в 9:00)",
                            style = MaterialTheme.typography.bodyMedium,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                        Switch(
                            checked = uiState.motivationalEnabled,
                            onCheckedChange = onMotivationalToggle
                        )
                    }
                }
            }
        }
        
        // Калькулятор денег
        Card(
            modifier = Modifier.fillMaxWidth(),
            onClick = onShowMoneyDialog
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column(modifier = Modifier.weight(1f)) {
                    Text(
                        text = "Калькулятор денег",
                        style = MaterialTheme.typography.titleMedium
                    )
                    Text(
                        text = if (uiState.hasMoneyData) 
                            "Настроено" 
                        else 
                            "Настроить параметры",
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }
            }
        }
        
        // Сброс счетчика
        Card(
            modifier = Modifier.fillMaxWidth(),
            onClick = onResetClick,
            enabled = !uiState.isLoading
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column(modifier = Modifier.weight(1f)) {
                    Text(
                        text = stringResource(R.string.reset_counter),
                        style = MaterialTheme.typography.titleMedium
                    )
                    Text(
                        text = "Удалить все данные и начать заново",
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }
                
                if (uiState.isLoading) {
                    CircularProgressIndicator(
                        modifier = Modifier.size(24.dp)
                    )
                }
            }
        }
        
        // Смена профиля
        Card(
            modifier = Modifier.fillMaxWidth(),
            onClick = onResetClick,
            enabled = !uiState.isLoading
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column(modifier = Modifier.weight(1f)) {
                    Text(
                        text = stringResource(R.string.change_profile),
                        style = MaterialTheme.typography.titleMedium
                    )
                    Text(
                        text = "Изменить пол или тип привычки",
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }
            }
        }
        
        Spacer(modifier = Modifier.weight(1f))
        
        // Информация о приложении
        Card(
            modifier = Modifier.fillMaxWidth()
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp)
            ) {
                Text(
                    text = "О приложении",
                    style = MaterialTheme.typography.titleMedium
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = "Счетчик дней без вредных привычек\nВерсия 1.0",
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
            }
        }
    }
}

@Composable
private fun ResetConfirmationDialog(
    onConfirm: () -> Unit,
    onDismiss: () -> Unit
) {
    AlertDialog(
        onDismissRequest = onDismiss,
        title = {
            Text(text = "Подтверждение")
        },
        text = {
            Text(text = stringResource(R.string.confirm_reset))
        },
        confirmButton = {
            TextButton(onClick = onConfirm) {
                Text(text = stringResource(R.string.yes))
            }
        },
        dismissButton = {
            TextButton(onClick = onDismiss) {
                Text(text = stringResource(R.string.no))
            }
        }
    )
}


/**
 * Диалог для редактирования параметров калькулятора денег
 */
@Composable
private fun MoneyCalculatorDialog(
    moneyPerUnit: String,
    unitsPerDay: String,
    currencySymbol: String,
    onMoneyPerUnitChange: (String) -> Unit,
    onUnitsPerDayChange: (String) -> Unit,
    onCurrencySymbolChange: (String) -> Unit,
    onSave: () -> Unit,
    onDismiss: () -> Unit
) {
    AlertDialog(
        onDismissRequest = onDismiss,
        title = {
            Text(text = "Калькулятор денег")
        },
        text = {
            Column(
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                Text(
                    text = "Настройте параметры для расчета сэкономленных средств",
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
                
                OutlinedTextField(
                    value = moneyPerUnit,
                    onValueChange = onMoneyPerUnitChange,
                    label = { Text("Стоимость одной пачки/бутылки") },
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Decimal
                    ),
                    modifier = Modifier.fillMaxWidth(),
                    singleLine = true
                )
                
                OutlinedTextField(
                    value = unitsPerDay,
                    onValueChange = onUnitsPerDayChange,
                    label = { Text("Количество в день (например, 1.5)") },
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Decimal
                    ),
                    modifier = Modifier.fillMaxWidth(),
                    singleLine = true
                )
                
                OutlinedTextField(
                    value = currencySymbol,
                    onValueChange = onCurrencySymbolChange,
                    label = { Text("Символ валюты (₽, $, €)") },
                    modifier = Modifier.fillMaxWidth(),
                    singleLine = true
                )
            }
        },
        confirmButton = {
            TextButton(onClick = onSave) {
                Text(text = "Сохранить")
            }
        },
        dismissButton = {
            TextButton(onClick = onDismiss) {
                Text(text = "Отмена")
            }
        }
    )
}
