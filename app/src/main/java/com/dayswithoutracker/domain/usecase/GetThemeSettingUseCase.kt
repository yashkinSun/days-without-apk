package com.dayswithoutracker.domain.usecase

import com.dayswithoutracker.domain.model.ThemeSetting
import com.dayswithoutracker.domain.repository.ThemeRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

/**
 * UseCase для получения текущей настройки темы
 */
class GetThemeSettingUseCase @Inject constructor(
    private val themeRepository: ThemeRepository
) {
    operator fun invoke(): Flow<ThemeSetting> {
        return themeRepository.getThemeSetting()
    }
}
