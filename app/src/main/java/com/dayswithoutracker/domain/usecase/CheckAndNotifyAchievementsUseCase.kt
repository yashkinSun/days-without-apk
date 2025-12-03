package com.dayswithoutracker.domain.usecase

import android.content.Context
import com.dayswithoutracker.domain.model.Checkpoint
import com.dayswithoutracker.domain.repository.NotificationRepository
import com.dayswithoutracker.util.NotificationHelper
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.flow.first
import javax.inject.Inject

/**
 * UseCase для проверки и отправки уведомлений о достижениях
 */
class CheckAndNotifyAchievementsUseCase @Inject constructor(
    @ApplicationContext private val context: Context,
    private val notificationRepository: NotificationRepository
) {
    
    /**
     * Проверить достижение и отправить уведомление если нужно
     * 
     * @param checkpoint достигнутый чек-поинт
     * @param habitName название привычки (для персонализации сообщения)
     */
    suspend operator fun invoke(checkpoint: Checkpoint, habitName: String) {
        // Проверяем настройки уведомлений
        val settings = notificationRepository.getNotificationSettings().first()
        
        if (!settings.notificationsEnabled || !settings.achievementsEnabled) {
            return
        }
        
        // Формируем сообщение
        val title = "🎉 Поздравляем с достижением!"
        val message = buildAchievementMessage(checkpoint, habitName)
        
        // Показываем уведомление
        NotificationHelper.showAchievementNotification(
            context = context,
            title = title,
            message = message
        )
    }
    
    private fun buildAchievementMessage(checkpoint: Checkpoint, habitName: String): String {
        return when {
            checkpoint.dayNumber >= 365 -> {
                "Невероятно! Целый год без $habitName! Вы — настоящий герой! 🏆"
            }
            checkpoint.dayNumber >= 180 -> {
                "Полгода без $habitName! Вы на полпути к году! 🌟"
            }
            checkpoint.dayNumber >= 90 -> {
                "3 месяца без $habitName! Отличный результат! 💪"
            }
            checkpoint.dayNumber >= 30 -> {
                "Месяц без $habitName! Привычка начинает формироваться! 🎯"
            }
            checkpoint.dayNumber >= 7 -> {
                "Неделя без $habitName! Первый важный рубеж пройден! 🔥"
            }
            else -> {
                "${checkpoint.dayNumber} ${getDaysWord(checkpoint.dayNumber)} без $habitName! Так держать! ✨"
            }
        }
    }
    
    private fun getDaysWord(days: Int): String {
        return when {
            days % 10 == 1 && days % 100 != 11 -> "день"
            days % 10 in 2..4 && days % 100 !in 12..14 -> "дня"
            else -> "дней"
        }
    }
}
