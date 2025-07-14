package com.dayswithoutracker.data.database.dao

import androidx.room.*
import com.dayswithoutracker.data.database.entities.CheckpointEntity
import com.dayswithoutracker.domain.model.Gender
import com.dayswithoutracker.domain.model.HabitType
import kotlinx.coroutines.flow.Flow

/**
 * DAO для работы с чек-поинтами
 */
@Dao
interface CheckpointDao {
    
    @Query("SELECT * FROM checkpoints WHERE gender = :gender AND habitType = :habitType ORDER BY dayNumber ASC")
    fun getCheckpoints(gender: Gender, habitType: HabitType): Flow<List<CheckpointEntity>>
    
    @Query("SELECT * FROM checkpoints WHERE gender = :gender AND habitType = :habitType ORDER BY dayNumber ASC")
    suspend fun getCheckpointsOnce(gender: Gender, habitType: HabitType): List<CheckpointEntity>
    
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertCheckpoints(checkpoints: List<CheckpointEntity>)
    
    @Query("DELETE FROM checkpoints")
    suspend fun deleteAllCheckpoints()
    
    @Query("SELECT COUNT(*) FROM checkpoints")
    suspend fun getCheckpointsCount(): Int
}

