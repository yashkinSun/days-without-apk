package com.dayswithoutracker.data.database

import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import android.content.Context
import com.dayswithoutracker.data.database.dao.CheckpointDao
import com.dayswithoutracker.data.database.dao.UserProfileDao
import com.dayswithoutracker.data.database.entities.CheckpointEntity
import com.dayswithoutracker.data.database.entities.UserProfileEntity

/**
 * Основная база данных приложения
 */
@Database(
    entities = [UserProfileEntity::class, CheckpointEntity::class],
    version = 1,
    exportSchema = false
)
@TypeConverters(Converters::class)
abstract class AppDatabase : RoomDatabase() {
    
    abstract fun userProfileDao(): UserProfileDao
    abstract fun checkpointDao(): CheckpointDao
    
    companion object {
        const val DATABASE_NAME = "days_without_tracker_db"
    }
}

