package com.dayswithoutracker.domain.usecase

import android.content.Context
import androidx.work.*
import com.dayswithoutracker.worker.MotivationalNotificationWorker
import dagger.hilt.android.qualifiers.ApplicationContext
import java.util.Calendar
import java.util.concurrent.TimeUnit
import javax.inject.Inject

/**
 * UseCase для планирования ежедневных мотивационных уведомлений
 */
class ScheduleMotivationalNotificationsUseCase @Inject constructor(
    @ApplicationContext private val context: Context
) {
    
    /**
     * Запланировать ежедневные уведомления в 9:00
     */
    operator fun invoke() {
        val currentTime = Calendar.getInstance()
        val targetTime = Calendar.getInstance().apply {
            set(Calendar.HOUR_OF_DAY, 9)
            set(Calendar.MINUTE, 0)
            set(Calendar.SECOND, 0)
            
            // Если 9:00 уже прошло сегодня, планируем на завтра
            if (before(currentTime)) {
                add(Calendar.DAY_OF_MONTH, 1)
            }
        }
        
        val initialDelay = targetTime.timeInMillis - currentTime.timeInMillis
        
        val workRequest = PeriodicWorkRequestBuilder<MotivationalNotificationWorker>(
            repeatInterval = 1,
            repeatIntervalTimeUnit = TimeUnit.DAYS
        )
            .setInitialDelay(initialDelay, TimeUnit.MILLISECONDS)
            .setConstraints(
                Constraints.Builder()
                    .setRequiresBatteryNotLow(false)
                    .build()
            )
            .build()
        
        WorkManager.getInstance(context).enqueueUniquePeriodicWork(
            MotivationalNotificationWorker.WORK_NAME,
            ExistingPeriodicWorkPolicy.KEEP,
            workRequest
        )
    }
    
    /**
     * Отменить запланированные уведомления
     */
    fun cancel() {
        WorkManager.getInstance(context)
            .cancelUniqueWork(MotivationalNotificationWorker.WORK_NAME)
    }
}
