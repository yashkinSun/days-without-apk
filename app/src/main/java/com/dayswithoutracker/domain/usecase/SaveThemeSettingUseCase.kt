package com.dayswithoutracker.domain.usecase

import com.dayswithoutracker.domain.model.ThemeSetting
import com.dayswithoutracker.domain.repository.ThemeRepository
import javax.inject.Inject

/**
 * UseCase для сохранения настройки темы
 */
class SaveThemeSettingUseCase @Inject constructor(
    private val themeRepository: ThemeRepository
) {
    suspend operator fun invoke(theme: ThemeSetting) {
        themeRepository.saveThemeSetting(theme)
    }
}
