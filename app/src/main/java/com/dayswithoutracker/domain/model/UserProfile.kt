package com.dayswithoutracker.domain.model

import java.time.LocalDate

/**
 * Domain модель профиля пользователя
 */
data class UserProfile(
    val gender: Gender,
    val habitType: HabitType,
    val startDate: LocalDate
)

