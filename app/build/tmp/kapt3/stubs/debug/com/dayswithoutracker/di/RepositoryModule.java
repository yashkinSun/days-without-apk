package com.dayswithoutracker.di;

/**
 * Модуль Hilt для предоставления репозиториев
 */
@dagger.Module
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\'J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\'J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\'\u00a8\u0006\u0013"}, d2 = {"Lcom/dayswithoutracker/di/RepositoryModule;", "", "()V", "bindCheckpointRepository", "Lcom/dayswithoutracker/domain/repository/CheckpointRepository;", "checkpointRepositoryImpl", "Lcom/dayswithoutracker/data/repository/CheckpointRepositoryImpl;", "bindNotificationRepository", "Lcom/dayswithoutracker/domain/repository/NotificationRepository;", "notificationRepositoryImpl", "Lcom/dayswithoutracker/data/repository/NotificationRepositoryImpl;", "bindThemeRepository", "Lcom/dayswithoutracker/domain/repository/ThemeRepository;", "themeRepositoryImpl", "Lcom/dayswithoutracker/data/repository/ThemeRepositoryImpl;", "bindUserRepository", "Lcom/dayswithoutracker/domain/repository/UserRepository;", "userRepositoryImpl", "Lcom/dayswithoutracker/data/repository/UserRepositoryImpl;", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public abstract class RepositoryModule {
    
    public RepositoryModule() {
        super();
    }
    
    @dagger.Binds
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public abstract com.dayswithoutracker.domain.repository.UserRepository bindUserRepository(@org.jetbrains.annotations.NotNull
    com.dayswithoutracker.data.repository.UserRepositoryImpl userRepositoryImpl);
    
    @dagger.Binds
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public abstract com.dayswithoutracker.domain.repository.CheckpointRepository bindCheckpointRepository(@org.jetbrains.annotations.NotNull
    com.dayswithoutracker.data.repository.CheckpointRepositoryImpl checkpointRepositoryImpl);
    
    @dagger.Binds
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public abstract com.dayswithoutracker.domain.repository.ThemeRepository bindThemeRepository(@org.jetbrains.annotations.NotNull
    com.dayswithoutracker.data.repository.ThemeRepositoryImpl themeRepositoryImpl);
    
    @dagger.Binds
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public abstract com.dayswithoutracker.domain.repository.NotificationRepository bindNotificationRepository(@org.jetbrains.annotations.NotNull
    com.dayswithoutracker.data.repository.NotificationRepositoryImpl notificationRepositoryImpl);
}