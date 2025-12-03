package com.dayswithoutracker.domain.model

/**
 * Настройки уведомлений приложения
 */
data class NotificationSettings(
    /**
     * Глобальное включение/выключение уведомлений
     */
    val notificationsEnabled: Boolean = true,
    
    /**
     * Уведомления о достижении чек-поинтов
     */
    val achievementsEnabled: Boolean = true,
    
    /**
     * Ежедневные мотивационные уведомления
     */
    val motivationalEnabled: Boolean = true
)
