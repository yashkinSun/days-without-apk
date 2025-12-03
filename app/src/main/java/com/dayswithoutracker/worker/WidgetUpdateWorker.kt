package com.dayswithoutracker.worker

import android.content.Context
import androidx.hilt.work.HiltWorker
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters
import com.dayswithoutracker.widget.DaysWithoutWidgetProvider
import dagger.assisted.Assisted
import dagger.assisted.AssistedInject

/**
 * Worker для периодического обновления виджета
 */
@HiltWorker
class WidgetUpdateWorker @AssistedInject constructor(
    @Assisted context: Context,
    @Assisted params: WorkerParameters
) : CoroutineWorker(context, params) {
    
    companion object {
        const val WORK_NAME = "widget_update_work"
    }
    
    override suspend fun doWork(): Result {
        return try {
            // Обновляем все виджеты
            DaysWithoutWidgetProvider.updateAllWidgets(applicationContext)
            Result.success()
        } catch (e: Exception) {
            Result.failure()
        }
    }
}
