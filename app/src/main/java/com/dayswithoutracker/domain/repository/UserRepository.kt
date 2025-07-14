package com.dayswithoutracker.domain.repository

import com.dayswithoutracker.domain.model.UserProfile
import kotlinx.coroutines.flow.Flow

/**
 * Интерфейс репозитория для работы с профилем пользователя
 */
interface UserRepository {
    
    fun getUserProfile(): Flow<UserProfile?>
    
    suspend fun getUserProfileOnce(): UserProfile?
    
    suspend fun saveUserProfile(userProfile: UserProfile)
    
    suspend fun deleteUserProfile()
}

