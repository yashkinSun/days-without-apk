package com.dayswithoutracker.data.database.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.dayswithoutracker.domain.model.Gender
import com.dayswithoutracker.domain.model.HabitType

/**
 * Entity для хранения чек-поинтов в базе данных
 */
@Entity(tableName = "checkpoints")
data class CheckpointEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val gender: Gender,
    val habitType: HabitType,
    val dayNumber: Int,
    val description: String
)

