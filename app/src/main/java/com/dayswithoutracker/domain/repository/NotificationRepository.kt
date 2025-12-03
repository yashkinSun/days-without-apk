package com.dayswithoutracker.domain.repository

import com.dayswithoutracker.domain.model.NotificationSettings
import kotlinx.coroutines.flow.Flow

/**
 * Репозиторий для работы с настройками уведомлений
 */
interface NotificationRepository {
    
    /**
     * Получить текущие настройки уведомлений
     * @return Flow с настройками уведомлений
     */
    fun getNotificationSettings(): Flow<NotificationSettings>
    
    /**
     * Сохранить настройки уведомлений
     * @param settings новые настройки
     */
    suspend fun saveNotificationSettings(settings: NotificationSettings)
}
