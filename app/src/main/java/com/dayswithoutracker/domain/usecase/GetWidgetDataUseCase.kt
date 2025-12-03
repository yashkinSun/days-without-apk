package com.dayswithoutracker.domain.usecase

import com.dayswithoutracker.domain.repository.UserRepository
import kotlinx.coroutines.flow.first
import javax.inject.Inject

/**
 * UseCase для получения данных для виджета
 */
class GetWidgetDataUseCase @Inject constructor(
    private val userRepository: UserRepository,
    private val calculateDetailedTimeUseCase: CalculateDetailedTimeUseCase
) {
    
    /**
     * Получить данные для виджета
     * 
     * @return WidgetData или null если профиль не создан
     */
    suspend operator fun invoke(): WidgetData? {
        val profile = userRepository.getUserProfile().first() ?: return null
        val startDateTime = profile.startDateTime ?: return null
        val detailedTime = calculateDetailedTimeUseCase(startDateTime)
        
        return WidgetData(
            days = detailedTime.days,
            hours = detailedTime.hours,
            progressToYear = calculateProgressToYear(detailedTime.days),
            habitName = profile.habitType.name
        )
    }
    
    private fun calculateProgressToYear(days: Int): Float {
        return (days.toFloat() / 365f * 100f).coerceIn(0f, 100f)
    }
}

/**
 * Данные для отображения в виджете
 */
data class WidgetData(
    val days: Int,
    val hours: Int,
    val progressToYear: Float,
    val habitName: String
)
