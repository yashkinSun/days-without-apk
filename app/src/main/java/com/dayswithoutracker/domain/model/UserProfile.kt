package com.dayswithoutracker.domain.model

import java.time.LocalDate
import java.time.LocalDateTime

/**
 * Domain модель профиля пользователя
 */
data class UserProfile(
    val gender: Gender,
    val habitType: HabitType,
    val startDate: LocalDate,
    val startDateTime: LocalDateTime? = null, // Новое поле для точного времени
    
    // Поля для калькулятора сэкономленных денег
    val moneyPerUnit: Float? = null,      // Стоимость одной единицы (пачка/бутылка)
    val unitsPerDay: Float? = null,       // Количество единиц в день (с точностью до 0.1)
    val currencySymbol: String? = null    // Символ валюты (₽, $, € и т.д.)
) {
    /**
     * Получить точное время начала или преобразовать дату в начало дня
     */
    fun getEffectiveStartDateTime(): LocalDateTime {
        return startDateTime ?: startDate.atStartOfDay()
    }
    
    /**
     * Проверка наличия данных для калькулятора денег
     */
    fun hasMoneyCalculatorData(): Boolean {
        return moneyPerUnit != null && 
               unitsPerDay != null && 
               currencySymbol != null &&
               moneyPerUnit > 0 &&
               unitsPerDay > 0
    }
}

