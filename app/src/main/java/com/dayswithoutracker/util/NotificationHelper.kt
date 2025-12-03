package com.dayswithoutracker.util

import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.os.Build
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import com.dayswithoutracker.R
import com.dayswithoutracker.presentation.MainActivity

/**
 * Помощник для работы с уведомлениями
 */
object NotificationHelper {
    
    private const val CHANNEL_ID_ACHIEVEMENTS = "achievements_channel"
    private const val CHANNEL_ID_MOTIVATIONAL = "motivational_channel"
    
    const val NOTIFICATION_ID_ACHIEVEMENT = 1001
    const val NOTIFICATION_ID_MOTIVATIONAL = 1002
    
    /**
     * Создание каналов уведомлений (для Android 8.0+)
     */
    fun createNotificationChannels(context: Context) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val notificationManager = context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            
            // Канал для достижений
            val achievementsChannel = NotificationChannel(
                CHANNEL_ID_ACHIEVEMENTS,
                "Достижения",
                NotificationManager.IMPORTANCE_HIGH
            ).apply {
                description = "Уведомления о достижении чек-поинтов"
                enableVibration(true)
            }
            
            // Канал для мотивационных сообщений
            val motivationalChannel = NotificationChannel(
                CHANNEL_ID_MOTIVATIONAL,
                "Мотивация",
                NotificationManager.IMPORTANCE_DEFAULT
            ).apply {
                description = "Ежедневные мотивационные сообщения"
                enableVibration(false)
            }
            
            notificationManager.createNotificationChannel(achievementsChannel)
            notificationManager.createNotificationChannel(motivationalChannel)
        }
    }
    
    /**
     * Показать уведомление о достижении
     */
    fun showAchievementNotification(
        context: Context,
        title: String,
        message: String
    ) {
        val intent = Intent(context, MainActivity::class.java).apply {
            flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        }
        
        val pendingIntent = PendingIntent.getActivity(
            context,
            0,
            intent,
            PendingIntent.FLAG_IMMUTABLE or PendingIntent.FLAG_UPDATE_CURRENT
        )
        
        val notification = NotificationCompat.Builder(context, CHANNEL_ID_ACHIEVEMENTS)
            .setSmallIcon(android.R.drawable.ic_dialog_info)
            .setContentTitle(title)
            .setContentText(message)
            .setPriority(NotificationCompat.PRIORITY_HIGH)
            .setAutoCancel(true)
            .setContentIntent(pendingIntent)
            .build()
        
        with(NotificationManagerCompat.from(context)) {
            notify(NOTIFICATION_ID_ACHIEVEMENT, notification)
        }
    }
    
    /**
     * Показать мотивационное уведомление
     */
    fun showMotivationalNotification(
        context: Context,
        message: String
    ) {
        val intent = Intent(context, MainActivity::class.java).apply {
            flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        }
        
        val pendingIntent = PendingIntent.getActivity(
            context,
            0,
            intent,
            PendingIntent.FLAG_IMMUTABLE or PendingIntent.FLAG_UPDATE_CURRENT
        )
        
        val notification = NotificationCompat.Builder(context, CHANNEL_ID_MOTIVATIONAL)
            .setSmallIcon(android.R.drawable.ic_dialog_info)
            .setContentTitle("Мотивация дня")
            .setContentText(message)
            .setPriority(NotificationCompat.PRIORITY_DEFAULT)
            .setAutoCancel(true)
            .setContentIntent(pendingIntent)
            .build()
        
        with(NotificationManagerCompat.from(context)) {
            notify(NOTIFICATION_ID_MOTIVATIONAL, notification)
        }
    }
}
