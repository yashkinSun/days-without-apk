package com.dayswithoutracker.domain.repository

import com.dayswithoutracker.domain.model.Checkpoint
import com.dayswithoutracker.domain.model.Gender
import com.dayswithoutracker.domain.model.HabitType
import kotlinx.coroutines.flow.Flow

/**
 * Интерфейс репозитория для работы с чек-поинтами
 */
interface CheckpointRepository {
    
    fun getCheckpoints(gender: Gender, habitType: HabitType): Flow<List<Checkpoint>>
    
    suspend fun getCheckpointsOnce(gender: Gender, habitType: HabitType): List<Checkpoint>
    
    suspend fun initializeCheckpoints()
    
    suspend fun isCheckpointsInitialized(): Boolean
}

