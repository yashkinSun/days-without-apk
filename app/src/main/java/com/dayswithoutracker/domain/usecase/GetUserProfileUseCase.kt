package com.dayswithoutracker.domain.usecase

import com.dayswithoutracker.domain.model.UserProfile
import com.dayswithoutracker.domain.repository.UserRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

/**
 * Use case для получения профиля пользователя
 */
class GetUserProfileUseCase @Inject constructor(
    private val userRepository: UserRepository
) {
    operator fun invoke(): Flow<UserProfile?> {
        return userRepository.getUserProfile()
    }
}

