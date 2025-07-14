package com.dayswithoutracker.di

import android.content.Context
import androidx.room.Room
import com.dayswithoutracker.data.database.AppDatabase
import com.dayswithoutracker.data.database.dao.CheckpointDao
import com.dayswithoutracker.data.database.dao.UserProfileDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/**
 * Модуль Hilt для предоставления зависимостей базы данных
 */
@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {
    
    @Provides
    @Singleton
    fun provideAppDatabase(@ApplicationContext context: Context): AppDatabase {
        return Room.databaseBuilder(
            context,
            AppDatabase::class.java,
            AppDatabase.DATABASE_NAME
        ).build()
    }
    
    @Provides
    fun provideUserProfileDao(database: AppDatabase): UserProfileDao {
        return database.userProfileDao()
    }
    
    @Provides
    fun provideCheckpointDao(database: AppDatabase): CheckpointDao {
        return database.checkpointDao()
    }
}

