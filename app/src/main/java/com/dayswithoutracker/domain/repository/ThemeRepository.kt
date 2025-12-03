package com.dayswithoutracker.domain.repository

import com.dayswithoutracker.domain.model.ThemeSetting
import kotlinx.coroutines.flow.Flow

/**
 * Репозиторий для работы с настройками темы оформления
 */
interface ThemeRepository {
    
    /**
     * Получить текущую настройку темы
     * @return Flow с текущей темой
     */
    fun getThemeSetting(): Flow<ThemeSetting>
    
    /**
     * Сохранить настройку темы
     * @param theme выбранная тема
     */
    suspend fun saveThemeSetting(theme: ThemeSetting)
}
