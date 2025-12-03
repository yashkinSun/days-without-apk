package com.dayswithoutracker.domain.usecase

import com.dayswithoutracker.domain.model.MoneySaved
import com.dayswithoutracker.domain.model.UserProfile
import java.time.LocalDateTime
import java.time.temporal.ChronoUnit
import javax.inject.Inject

/**
 * UseCase для расчета сэкономленных денег
 */
class CalculateMoneySavedUseCase @Inject constructor(
    private val calculateDetailedTimeUseCase: CalculateDetailedTimeUseCase
) {
    
    /**
     * Рассчитать сэкономленные деньги на основе профиля пользователя
     * 
     * @param userProfile профиль пользователя с данными о стоимости и потреблении
     * @return MoneySaved или null, если данные не заполнены
     */
    operator fun invoke(userProfile: UserProfile): MoneySaved? {
        // Проверка наличия всех необходимых данных
        if (!userProfile.hasMoneyCalculatorData()) {
            return null
        }
        
        val startDateTime = userProfile.getEffectiveStartDateTime()
        val now = LocalDateTime.now()
        
        // Расчет общего количества дней (с учетом часов)
        val totalHours = ChronoUnit.HOURS.between(startDateTime, now)
        val totalDays = totalHours / 24.0
        
        // Расчет сэкономленной суммы
        // Формула: (дни без привычки) * (единиц в день) * (стоимость единицы)
        val savedAmount = (totalDays * userProfile.unitsPerDay!! * userProfile.moneyPerUnit!!).toFloat()
        
        // Форматирование с одним знаком после запятой
        val formatted = String.format("%.1f", savedAmount)
        
        return MoneySaved(
            amount = savedAmount,
            currencySymbol = userProfile.currencySymbol!!,
            formattedAmount = "$formatted ${userProfile.currencySymbol}"
        )
    }
}
