package com.dayswithoutracker.widget

import android.app.PendingIntent
import android.appwidget.AppWidgetManager
import android.appwidget.AppWidgetProvider
import android.content.Context
import android.content.Intent
import android.widget.RemoteViews
import com.dayswithoutracker.R
import com.dayswithoutracker.domain.usecase.GetWidgetDataUseCase
import com.dayswithoutracker.presentation.MainActivity
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.launch
import javax.inject.Inject

/**
 * AppWidget Provider для виджета "Дни без привычки"
 */
@AndroidEntryPoint
class DaysWithoutWidgetProvider : AppWidgetProvider() {
    
    @Inject
    lateinit var getWidgetDataUseCase: GetWidgetDataUseCase
    
    private val job = SupervisorJob()
    private val scope = CoroutineScope(Dispatchers.Main + job)
    
    override fun onUpdate(
        context: Context,
        appWidgetManager: AppWidgetManager,
        appWidgetIds: IntArray
    ) {
        // Обновляем все виджеты
        for (appWidgetId in appWidgetIds) {
            updateAppWidget(context, appWidgetManager, appWidgetId)
        }
    }
    
    override fun onEnabled(context: Context) {
        // Виджет добавлен впервые
        super.onEnabled(context)
    }
    
    override fun onDisabled(context: Context) {
        // Последний виджет удален
        super.onDisabled(context)
        job.cancel()
    }
    
    private fun updateAppWidget(
        context: Context,
        appWidgetManager: AppWidgetManager,
        appWidgetId: Int
    ) {
        scope.launch {
            try {
                val widgetData = getWidgetDataUseCase()
                
                val views = RemoteViews(context.packageName, R.layout.days_without_widget)
                
                if (widgetData != null) {
                    // Обновляем данные
                    views.setTextViewText(R.id.widget_title, "Дней без ${widgetData.habitName}")
                    views.setTextViewText(R.id.widget_days_count, widgetData.days.toString())
                    views.setTextViewText(
                        R.id.widget_time_detail,
                        "${widgetData.days} ${getDaysWord(widgetData.days)} ${widgetData.hours} ${getHoursWord(widgetData.hours)}"
                    )
                    views.setProgressBar(
                        R.id.widget_progress_bar,
                        365,
                        widgetData.days.coerceAtMost(365),
                        false
                    )
                    views.setTextViewText(
                        R.id.widget_progress_text,
                        "${widgetData.progressToYear.toInt()}% до года"
                    )
                } else {
                    // Профиль не создан
                    views.setTextViewText(R.id.widget_title, "Дней без привычки")
                    views.setTextViewText(R.id.widget_days_count, "—")
                    views.setTextViewText(R.id.widget_time_detail, "Откройте приложение")
                    views.setProgressBar(R.id.widget_progress_bar, 365, 0, false)
                    views.setTextViewText(R.id.widget_progress_text, "0% до года")
                }
                
                // Настраиваем клик по виджету
                val intent = Intent(context, MainActivity::class.java)
                val pendingIntent = PendingIntent.getActivity(
                    context,
                    0,
                    intent,
                    PendingIntent.FLAG_IMMUTABLE or PendingIntent.FLAG_UPDATE_CURRENT
                )
                views.setOnClickPendingIntent(R.id.widget_days_count, pendingIntent)
                
                // Обновляем виджет
                appWidgetManager.updateAppWidget(appWidgetId, views)
            } catch (e: Exception) {
                // Обработка ошибок
                e.printStackTrace()
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
    
    private fun getHoursWord(hours: Int): String {
        return when {
            hours % 10 == 1 && hours % 100 != 11 -> "час"
            hours % 10 in 2..4 && hours % 100 !in 12..14 -> "часа"
            else -> "часов"
        }
    }
    
    companion object {
        /**
         * Обновить все виджеты
         */
        fun updateAllWidgets(context: Context) {
            val intent = Intent(context, DaysWithoutWidgetProvider::class.java).apply {
                action = AppWidgetManager.ACTION_APPWIDGET_UPDATE
            }
            context.sendBroadcast(intent)
        }
    }
}
