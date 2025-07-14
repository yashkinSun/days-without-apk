package com.dayswithoutracker.data.database

import androidx.room.TypeConverter
import com.dayswithoutracker.domain.model.Gender
import com.dayswithoutracker.domain.model.HabitType
import java.time.LocalDate

/**
 * Конвертеры для Room базы данных
 */
class Converters {
    
    @TypeConverter
    fun fromLocalDate(date: LocalDate?): String? {
        return date?.toString()
    }
    
    @TypeConverter
    fun toLocalDate(dateString: String?): LocalDate? {
        return dateString?.let { LocalDate.parse(it) }
    }
    
    @TypeConverter
    fun fromGender(gender: Gender): String {
        return gender.name
    }
    
    @TypeConverter
    fun toGender(genderString: String): Gender {
        return Gender.valueOf(genderString)
    }
    
    @TypeConverter
    fun fromHabitType(habitType: HabitType): String {
        return habitType.name
    }
    
    @TypeConverter
    fun toHabitType(habitTypeString: String): HabitType {
        return HabitType.valueOf(habitTypeString)
    }
}

