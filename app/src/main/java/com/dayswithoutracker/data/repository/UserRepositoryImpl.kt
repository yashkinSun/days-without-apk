package com.dayswithoutracker.data.repository

import com.dayswithoutracker.data.database.dao.UserProfileDao
import com.dayswithoutracker.data.database.entities.UserProfileEntity
import com.dayswithoutracker.domain.model.UserProfile
import com.dayswithoutracker.domain.repository.UserRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Реализация репозитория для работы с профилем пользователя
 */
@Singleton
class UserRepositoryImpl @Inject constructor(
    private val userProfileDao: UserProfileDao
) : UserRepository {
    
    override fun getUserProfile(): Flow<UserProfile?> {
        return userProfileDao.getUserProfile().map { entity ->
            entity?.let {
                UserProfile(
                    gender = it.gender,
                    habitType = it.habitType,
                    startDate = it.startDate,
                    startDateTime = it.startDateTime,
                    moneyPerUnit = it.moneyPerUnit,
                    unitsPerDay = it.unitsPerDay,
                    currencySymbol = it.currencySymbol
                )
            }
        }
    }
    
    override suspend fun getUserProfileOnce(): UserProfile? {
        return userProfileDao.getUserProfileOnce()?.let { entity ->
            UserProfile(
                gender = entity.gender,
                habitType = entity.habitType,
                startDate = entity.startDate,
                startDateTime = entity.startDateTime,
                moneyPerUnit = entity.moneyPerUnit,
                unitsPerDay = entity.unitsPerDay,
                currencySymbol = entity.currencySymbol
            )
        }
    }
    
    override suspend fun saveUserProfile(userProfile: UserProfile) {
        val entity = UserProfileEntity(
            gender = userProfile.gender,
            habitType = userProfile.habitType,
            startDate = userProfile.startDate,
            startDateTime = userProfile.startDateTime,
            moneyPerUnit = userProfile.moneyPerUnit,
            unitsPerDay = userProfile.unitsPerDay,
            currencySymbol = userProfile.currencySymbol
        )
        userProfileDao.insertUserProfile(entity)
    }
    
    override suspend fun deleteUserProfile() {
        userProfileDao.deleteUserProfile()
    }
}

