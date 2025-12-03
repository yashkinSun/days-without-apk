package com.dayswithoutracker.domain.model

/**
 * Модель данных для отображения сэкономленных денег
 */
data class MoneySaved(
    /**
     * Сумма сэкономленных денег
     */
    val amount: Float,
    
    /**
     * Символ валюты
     */
    val currencySymbol: String,
    
    /**
     * Отформатированная строка для отображения
     */
    val formattedAmount: String
)
