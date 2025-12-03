package com.dayswithoutracker.domain.usecase

import java.time.LocalDateTime
import java.time.temporal.ChronoUnit
import javax.inject.Inject

/**
 * Use case для расчета детального времени без привычки в формате дней/часов/минут/секунд
 */
class CalculateDetailedTimeUseCase @Inject constructor() {
    
    /**
     * Расчет детального времени с момента начала
     */
    operator fun invoke(startDate: LocalDateTime): DetailedTime {
        val now = LocalDateTime.now()
        
        val totalSeconds = ChronoUnit.SECONDS.between(startDate, now)
        
        val days = totalSeconds / (24 * 60 * 60)
        val hours = (totalSeconds % (24 * 60 * 60)) / (60 * 60)
        val minutes = (totalSeconds % (60 * 60)) / 60
        val seconds = totalSeconds % 60
        
        return DetailedTime(
            days = days.toInt(),
            hours = hours.toInt(),
            minutes = minutes.toInt(),
            seconds = seconds.toInt(),
            totalSeconds = totalSeconds
        )
    }
    
    /**
     * Расчет прогресса до года (365 дней)
     */
    fun calculateProgress(startDate: LocalDateTime): Float {
        val detailedTime = invoke(startDate)
        return (detailedTime.days.toFloat() / 365f).coerceAtMost(1f)
    }
    
    /**
     * Форматирование времени в читаемую строку
     */
    fun formatTime(detailedTime: DetailedTime, habitText: String): String {
        val dayText = when {
            detailedTime.days % 10 == 1 && detailedTime.days % 100 != 11 -> "день"
            detailedTime.days % 10 in 2..4 && detailedTime.days % 100 !in 12..14 -> "дня"
            else -> "дней"
        }
        
        val hourText = when {
            detailedTime.hours % 10 == 1 && detailedTime.hours % 100 != 11 -> "час"
            detailedTime.hours % 10 in 2..4 && detailedTime.hours % 100 !in 12..14 -> "часа"
            else -> "часов"
        }
        
        val minuteText = when {
            detailedTime.minutes % 10 == 1 && detailedTime.minutes % 100 != 11 -> "минуту"
            detailedTime.minutes % 10 in 2..4 && detailedTime.minutes % 100 !in 12..14 -> "минуты"
            else -> "минут"
        }
        
        val secondText = when {
            detailedTime.seconds % 10 == 1 && detailedTime.seconds % 100 != 11 -> "секунду"
            detailedTime.seconds % 10 in 2..4 && detailedTime.seconds % 100 !in 12..14 -> "секунды"
            else -> "секунд"
        }
        
        return buildString {
            append("Я $habitText ")
            
            if (detailedTime.days > 0) {
                append("${detailedTime.days} $dayText ")
            }
            if (detailedTime.hours > 0) {
                append("${detailedTime.hours} $hourText ")
            }
            if (detailedTime.minutes > 0) {
                append("${detailedTime.minutes} $minuteText ")
            }
            append("${detailedTime.seconds} $secondText")
        }
    }
}

/**
 * Модель детального времени
 */
data class DetailedTime(
    val days: Int,
    val hours: Int,
    val minutes: Int,
    val seconds: Int,
    val totalSeconds: Long
)

