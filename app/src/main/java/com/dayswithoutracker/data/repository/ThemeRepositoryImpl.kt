package com.dayswithoutracker.data.repository

import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import com.dayswithoutracker.domain.model.ThemeSetting
import com.dayswithoutracker.domain.repository.ThemeRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Реализация репозитория для работы с настройками темы
 */
@Singleton
class ThemeRepositoryImpl @Inject constructor(
    private val dataStore: DataStore<Preferences>
) : ThemeRepository {
    
    companion object {
        private val THEME_KEY = stringPreferencesKey("theme_setting")
        private const val DEFAULT_THEME = "LIGHT"
    }
    
    override fun getThemeSetting(): Flow<ThemeSetting> {
        return dataStore.data.map { preferences ->
            val themeString = preferences[THEME_KEY] ?: DEFAULT_THEME
            try {
                ThemeSetting.valueOf(themeString)
            } catch (e: IllegalArgumentException) {
                ThemeSetting.LIGHT
            }
        }
    }
    
    override suspend fun saveThemeSetting(theme: ThemeSetting) {
        dataStore.edit { preferences ->
            preferences[THEME_KEY] = theme.name
        }
    }
}
