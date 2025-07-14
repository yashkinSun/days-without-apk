package com.dayswithoutracker.presentation.onboarding

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.dayswithoutracker.R
import com.dayswithoutracker.domain.model.Gender
import com.dayswithoutracker.domain.model.HabitType

/**
 * Экран онбординга для выбора пола и привычки
 */
@Composable
fun OnboardingScreen(
    onNavigateToMain: () -> Unit,
    viewModel: OnboardingViewModel = hiltViewModel()
) {
    val uiState by viewModel.uiState.collectAsStateWithLifecycle()
    
    LaunchedEffect(uiState.isCompleted) {
        if (uiState.isCompleted) {
            onNavigateToMain()
        }
    }
    
    uiState.error?.let { error ->
        LaunchedEffect(error) {
            // Показать ошибку через SnackBar или другой способ
            viewModel.clearError()
        }
    }
    
    OnboardingContent(
        uiState = uiState,
        onGenderSelected = viewModel::selectGender,
        onHabitTypeSelected = viewModel::selectHabitType,
        onStartClick = viewModel::startTracking
    )
}

@Composable
private fun OnboardingContent(
    uiState: OnboardingUiState,
    onGenderSelected: (Gender) -> Unit,
    onHabitTypeSelected: (HabitType) -> Unit,
    onStartClick: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = stringResource(R.string.app_name),
            style = MaterialTheme.typography.headlineLarge,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            color = MaterialTheme.colorScheme.primary
        )
        
        Spacer(modifier = Modifier.height(48.dp))
        
        // Выбор пола
        GenderSelection(
            selectedGender = uiState.selectedGender,
            onGenderSelected = onGenderSelected
        )
        
        Spacer(modifier = Modifier.height(32.dp))
        
        // Выбор привычки
        HabitTypeSelection(
            selectedHabitType = uiState.selectedHabitType,
            onHabitTypeSelected = onHabitTypeSelected
        )
        
        Spacer(modifier = Modifier.height(48.dp))
        
        // Кнопка "Начать"
        Button(
            onClick = onStartClick,
            enabled = uiState.isStartButtonEnabled,
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp)
        ) {
            if (uiState.isLoading) {
                CircularProgressIndicator(
                    modifier = Modifier.size(24.dp),
                    color = MaterialTheme.colorScheme.onPrimary
                )
            } else {
                Text(
                    text = stringResource(R.string.start_button),
                    style = MaterialTheme.typography.titleMedium
                )
            }
        }
    }
}

@Composable
private fun GenderSelection(
    selectedGender: Gender?,
    onGenderSelected: (Gender) -> Unit
) {
    Column {
        Text(
            text = stringResource(R.string.choose_gender),
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.Medium
        )
        
        Spacer(modifier = Modifier.height(16.dp))
        
        Column(Modifier.selectableGroup()) {
            GenderOption(
                text = stringResource(R.string.male),
                selected = selectedGender == Gender.MALE,
                onClick = { onGenderSelected(Gender.MALE) }
            )
            
            Spacer(modifier = Modifier.height(8.dp))
            
            GenderOption(
                text = stringResource(R.string.female),
                selected = selectedGender == Gender.FEMALE,
                onClick = { onGenderSelected(Gender.FEMALE) }
            )
        }
    }
}

@Composable
private fun HabitTypeSelection(
    selectedHabitType: HabitType?,
    onHabitTypeSelected: (HabitType) -> Unit
) {
    Column {
        Text(
            text = stringResource(R.string.choose_habit),
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.Medium
        )
        
        Spacer(modifier = Modifier.height(16.dp))
        
        Column(Modifier.selectableGroup()) {
            HabitTypeOption(
                text = stringResource(R.string.no_smoking),
                selected = selectedHabitType == HabitType.NO_SMOKING,
                onClick = { onHabitTypeSelected(HabitType.NO_SMOKING) }
            )
            
            Spacer(modifier = Modifier.height(8.dp))
            
            HabitTypeOption(
                text = stringResource(R.string.no_drinking),
                selected = selectedHabitType == HabitType.NO_DRINKING,
                onClick = { onHabitTypeSelected(HabitType.NO_DRINKING) }
            )
        }
    }
}

@Composable
private fun GenderOption(
    text: String,
    selected: Boolean,
    onClick: () -> Unit
) {
    Row(
        Modifier
            .fillMaxWidth()
            .height(56.dp)
            .selectable(
                selected = selected,
                onClick = onClick,
                role = Role.RadioButton
            )
            .padding(horizontal = 16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        RadioButton(
            selected = selected,
            onClick = null
        )
        Text(
            text = text,
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(start = 16.dp)
        )
    }
}

@Composable
private fun HabitTypeOption(
    text: String,
    selected: Boolean,
    onClick: () -> Unit
) {
    Row(
        Modifier
            .fillMaxWidth()
            .height(56.dp)
            .selectable(
                selected = selected,
                onClick = onClick,
                role = Role.RadioButton
            )
            .padding(horizontal = 16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        RadioButton(
            selected = selected,
            onClick = null
        )
        Text(
            text = text,
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(start = 16.dp)
        )
    }
}

