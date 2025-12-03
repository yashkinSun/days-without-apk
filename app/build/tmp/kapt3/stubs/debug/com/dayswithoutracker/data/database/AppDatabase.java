package com.dayswithoutracker.data.database;

/**
 * Основная база данных приложения
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\b"}, d2 = {"Lcom/dayswithoutracker/data/database/AppDatabase;", "Landroidx/room/RoomDatabase;", "()V", "checkpointDao", "Lcom/dayswithoutracker/data/database/dao/CheckpointDao;", "userProfileDao", "Lcom/dayswithoutracker/data/database/dao/UserProfileDao;", "Companion", "app_debug"})
@androidx.room.Database(entities = {com.dayswithoutracker.data.database.entities.UserProfileEntity.class, com.dayswithoutracker.data.database.entities.CheckpointEntity.class}, version = 2, exportSchema = false)
@androidx.room.TypeConverters(value = {com.dayswithoutracker.data.database.Converters.class})
public abstract class AppDatabase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String DATABASE_NAME = "days_without_tracker_db";
    @org.jetbrains.annotations.NotNull
    public static final com.dayswithoutracker.data.database.AppDatabase.Companion Companion = null;
    
    public AppDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract com.dayswithoutracker.data.database.dao.UserProfileDao userProfileDao();
    
    @org.jetbrains.annotations.NotNull
    public abstract com.dayswithoutracker.data.database.dao.CheckpointDao checkpointDao();
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/dayswithoutracker/data/database/AppDatabase$Companion;", "", "()V", "DATABASE_NAME", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}