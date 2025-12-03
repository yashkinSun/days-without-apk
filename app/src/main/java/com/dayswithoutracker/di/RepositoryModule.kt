package com.dayswithoutracker.di

import com.dayswithoutracker.data.repository.CheckpointRepositoryImpl
import com.dayswithoutracker.data.repository.UserRepositoryImpl
import com.dayswithoutracker.data.repository.ThemeRepositoryImpl
import com.dayswithoutracker.data.repository.NotificationRepositoryImpl
import com.dayswithoutracker.domain.repository.CheckpointRepository
import com.dayswithoutracker.domain.repository.UserRepository
import com.dayswithoutracker.domain.repository.ThemeRepository
import com.dayswithoutracker.domain.repository.NotificationRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/**
 * Модуль Hilt для предоставления репозиториев
 */
@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {
    
    @Binds
    @Singleton
    abstract fun bindUserRepository(
        userRepositoryImpl: UserRepositoryImpl
    ): UserRepository
    
    @Binds
    @Singleton
    abstract fun bindCheckpointRepository(
        checkpointRepositoryImpl: CheckpointRepositoryImpl
    ): CheckpointRepository
    
    @Binds
    @Singleton
    abstract fun bindThemeRepository(
        themeRepositoryImpl: ThemeRepositoryImpl
    ): ThemeRepository
    
    @Binds
    @Singleton
    abstract fun bindNotificationRepository(
        notificationRepositoryImpl: NotificationRepositoryImpl
    ): NotificationRepository
}

