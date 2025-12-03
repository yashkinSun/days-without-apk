package com.dayswithoutracker.data.repository;

/**
 * Реализация репозитория для работы с профилем пользователя
 */
@javax.inject.Singleton
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u0006H\u0096@\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tH\u0016J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096@\u00a2\u0006\u0002\u0010\u0007J\u0016\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\nH\u0096@\u00a2\u0006\u0002\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/dayswithoutracker/data/repository/UserRepositoryImpl;", "Lcom/dayswithoutracker/domain/repository/UserRepository;", "userProfileDao", "Lcom/dayswithoutracker/data/database/dao/UserProfileDao;", "(Lcom/dayswithoutracker/data/database/dao/UserProfileDao;)V", "deleteUserProfile", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUserProfile", "Lkotlinx/coroutines/flow/Flow;", "Lcom/dayswithoutracker/domain/model/UserProfile;", "getUserProfileOnce", "saveUserProfile", "userProfile", "(Lcom/dayswithoutracker/domain/model/UserProfile;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class UserRepositoryImpl implements com.dayswithoutracker.domain.repository.UserRepository {
    @org.jetbrains.annotations.NotNull
    private final com.dayswithoutracker.data.database.dao.UserProfileDao userProfileDao = null;
    
    @javax.inject.Inject
    public UserRepositoryImpl(@org.jetbrains.annotations.NotNull
    com.dayswithoutracker.data.database.dao.UserProfileDao userProfileDao) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.flow.Flow<com.dayswithoutracker.domain.model.UserProfile> getUserProfile() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object getUserProfileOnce(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.dayswithoutracker.domain.model.UserProfile> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object saveUserProfile(@org.jetbrains.annotations.NotNull
    com.dayswithoutracker.domain.model.UserProfile userProfile, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object deleteUserProfile(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
}