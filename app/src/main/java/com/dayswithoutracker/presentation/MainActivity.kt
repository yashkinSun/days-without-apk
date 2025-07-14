package com.dayswithoutracker.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.dayswithoutracker.domain.usecase.GetUserProfileUseCase
import com.dayswithoutracker.presentation.main.MainScreen
import com.dayswithoutracker.presentation.onboarding.OnboardingScreen
import com.dayswithoutracker.presentation.settings.SettingsScreen
import com.dayswithoutracker.presentation.theme.DaysWithoutTrackerTheme
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    
    @Inject
    lateinit var getUserProfileUseCase: GetUserProfileUseCase
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        
        setContent {
            DaysWithoutTrackerTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    DaysWithoutTrackerApp(getUserProfileUseCase)
                }
            }
        }
    }
}

@Composable
fun DaysWithoutTrackerApp(
    getUserProfileUseCase: GetUserProfileUseCase
) {
    val navController = rememberNavController()
    val userProfile by getUserProfileUseCase().collectAsStateWithLifecycle(initialValue = null)
    
    // Определяем стартовый экран
    val startDestination = if (userProfile != null) "main" else "onboarding"
    
    NavHost(
        navController = navController,
        startDestination = startDestination
    ) {
        composable("onboarding") {
            OnboardingScreen(
                onNavigateToMain = {
                    navController.navigate("main") {
                        popUpTo("onboarding") { inclusive = true }
                    }
                }
            )
        }
        
        composable("main") {
            MainScreen(
                onNavigateToSettings = {
                    navController.navigate("settings")
                }
            )
        }
        
        composable("settings") {
            SettingsScreen(
                onNavigateBack = {
                    navController.popBackStack()
                },
                onNavigateToOnboarding = {
                    navController.navigate("onboarding") {
                        popUpTo(0) { inclusive = true }
                    }
                }
            )
        }
    }
}

