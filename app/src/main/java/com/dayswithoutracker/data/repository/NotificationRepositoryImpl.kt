package com.dayswithoutracker.data.repository

import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import com.dayswithoutracker.domain.model.NotificationSettings
import com.dayswithoutracker.domain.repository.NotificationRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Реализация репозитория для работы с настройками уведомлений
 */
@Singleton
class NotificationRepositoryImpl @Inject constructor(
    private val dataStore: DataStore<Preferences>
) : NotificationRepository {
    
    companion object {
        private val NOTIFICATIONS_ENABLED_KEY = booleanPreferencesKey("notifications_enabled")
        private val ACHIEVEMENTS_ENABLED_KEY = booleanPreferencesKey("achievements_enabled")
        private val MOTIVATIONAL_ENABLED_KEY = booleanPreferencesKey("motivational_enabled")
    }
    
    override fun getNotificationSettings(): Flow<NotificationSettings> {
        return dataStore.data.map { preferences ->
            NotificationSettings(
                notificationsEnabled = preferences[NOTIFICATIONS_ENABLED_KEY] ?: true,
                achievementsEnabled = preferences[ACHIEVEMENTS_ENABLED_KEY] ?: true,
                motivationalEnabled = preferences[MOTIVATIONAL_ENABLED_KEY] ?: true
            )
        }
    }
    
    override suspend fun saveNotificationSettings(settings: NotificationSettings) {
        dataStore.edit { preferences ->
            preferences[NOTIFICATIONS_ENABLED_KEY] = settings.notificationsEnabled
            preferences[ACHIEVEMENTS_ENABLED_KEY] = settings.achievementsEnabled
            preferences[MOTIVATIONAL_ENABLED_KEY] = settings.motivationalEnabled
        }
    }
}
