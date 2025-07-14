package com.dayswithoutracker.domain.usecase

import java.time.LocalDate
import java.time.temporal.ChronoUnit
import javax.inject.Inject

/**
 * Use case для расчета количества дней без привычки
 */
class CalculateDaysUseCase @Inject constructor() {
    
    operator fun invoke(startDate: LocalDate): Int {
        return ChronoUnit.DAYS.between(startDate, LocalDate.now()).toInt()
    }
    
    fun calculateProgress(startDate: LocalDate): Float {
        val days = invoke(startDate)
        return (days.toFloat() / 365f).coerceAtMost(1f)
    }
}

