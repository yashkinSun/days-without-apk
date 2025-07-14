package com.dayswithoutracker.domain.usecase

import com.dayswithoutracker.domain.model.UserProfile
import com.dayswithoutracker.domain.repository.UserRepository
import javax.inject.Inject

/**
 * Use case для сохранения профиля пользователя
 */
class SaveUserProfileUseCase @Inject constructor(
    private val userRepository: UserRepository
) {
    suspend operator fun invoke(userProfile: UserProfile) {
        userRepository.saveUserProfile(userProfile)
    }
}

