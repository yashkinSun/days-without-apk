package com.dayswithoutracker.di

import com.dayswithoutracker.data.repository.CheckpointRepositoryImpl
import com.dayswithoutracker.data.repository.UserRepositoryImpl
import com.dayswithoutracker.domain.repository.CheckpointRepository
import com.dayswithoutracker.domain.repository.UserRepository
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
}

