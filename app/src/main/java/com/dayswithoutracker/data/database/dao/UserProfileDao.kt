package com.dayswithoutracker.data.database.dao

import androidx.room.*
import com.dayswithoutracker.data.database.entities.UserProfileEntity
import kotlinx.coroutines.flow.Flow

/**
 * DAO для работы с профилем пользователя
 */
@Dao
interface UserProfileDao {
    
    @Query("SELECT * FROM user_profile WHERE id = 1")
    fun getUserProfile(): Flow<UserProfileEntity?>
    
    @Query("SELECT * FROM user_profile WHERE id = 1")
    suspend fun getUserProfileOnce(): UserProfileEntity?
    
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertUserProfile(userProfile: UserProfileEntity)
    
    @Query("DELETE FROM user_profile")
    suspend fun deleteUserProfile()
}

