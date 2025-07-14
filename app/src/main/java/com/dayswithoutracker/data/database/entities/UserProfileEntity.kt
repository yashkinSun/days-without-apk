package com.dayswithoutracker.data.database.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.dayswithoutracker.domain.model.Gender
import com.dayswithoutracker.domain.model.HabitType
import java.time.LocalDate

/**
 * Entity для хранения профиля пользователя в базе данных
 */
@Entity(tableName = "user_profile")
data class UserProfileEntity(
    @PrimaryKey
    val id: Int = 1, // Всегда один профиль
    val gender: Gender,
    val habitType: HabitType,
    val startDate: LocalDate
)

