package com.dayswithoutracker.worker

import android.content.Context
import androidx.hilt.work.HiltWorker
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters
import com.dayswithoutracker.domain.repository.NotificationRepository
import com.dayswithoutracker.util.NotificationHelper
import dagger.assisted.Assisted
import dagger.assisted.AssistedInject
import kotlinx.coroutines.flow.first

/**
 * Worker для отправки ежедневных мотивационных уведомлений
 */
@HiltWorker
class MotivationalNotificationWorker @AssistedInject constructor(
    @Assisted context: Context,
    @Assisted params: WorkerParameters,
    private val notificationRepository: NotificationRepository
) : CoroutineWorker(context, params) {
    
    companion object {
        const val WORK_NAME = "motivational_notification_work"
        
        // Пул мотивационных сообщений
        private val MOTIVATIONAL_MESSAGES = listOf(
            "Каждый день без вредной привычки — это победа! Продолжайте в том же духе! 💪",
            "Вы на правильном пути! Ваше здоровье благодарит вас за каждый день без привычки! 🌟",
            "Гордитесь собой! Вы делаете то, что многие только мечтают сделать! 🎯",
            "Сила воли — это мышца. Вы тренируете её каждый день! Так держать! 🔥"
        )
    }
    
    override suspend fun doWork(): Result {
        return try {
            // Проверяем настройки уведомлений
            val settings = notificationRepository.getNotificationSettings().first()
            
            if (settings.notificationsEnabled && settings.motivationalEnabled) {
                // Выбираем случайное сообщение
                val message = MOTIVATIONAL_MESSAGES.random()
                
                // Показываем уведомление
                NotificationHelper.showMotivationalNotification(
                    context = applicationContext,
                    message = message
                )
            }
            
            Result.success()
        } catch (e: Exception) {
            Result.failure()
        }
    }
}
