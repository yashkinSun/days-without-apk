package com.dayswithoutracker.domain.model

/**
 * Domain модель чек-поинта
 */
data class Checkpoint(
    val dayNumber: Int,
    val description: String,
    val isAchieved: Boolean = false
)

