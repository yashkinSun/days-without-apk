package com.dayswithoutracker

import android.app.Application
import com.dayswithoutracker.util.NotificationHelper
import dagger.hilt.android.HiltAndroidApp

/**
 * Application класс для инициализации Hilt DI и каналов уведомлений
 */
@HiltAndroidApp
class DaysWithoutTrackerApplication : Application() {
    
    override fun onCreate() {
        super.onCreate()
        // Создаем каналы уведомлений
        NotificationHelper.createNotificationChannels(this)
    }
}

