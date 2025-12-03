package com.dayswithoutracker.data.repository;

/**
 * Реализация репозитория для работы с чек-поинтами
 */
@javax.inject.Singleton
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J$\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J$\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0096@\u00a2\u0006\u0002\u0010\u000eJ\u000e\u0010\u000f\u001a\u00020\u0010H\u0096@\u00a2\u0006\u0002\u0010\u0011J\u000e\u0010\u0012\u001a\u00020\u0013H\u0096@\u00a2\u0006\u0002\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/dayswithoutracker/data/repository/CheckpointRepositoryImpl;", "Lcom/dayswithoutracker/domain/repository/CheckpointRepository;", "checkpointDao", "Lcom/dayswithoutracker/data/database/dao/CheckpointDao;", "(Lcom/dayswithoutracker/data/database/dao/CheckpointDao;)V", "getCheckpoints", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/dayswithoutracker/domain/model/Checkpoint;", "gender", "Lcom/dayswithoutracker/domain/model/Gender;", "habitType", "Lcom/dayswithoutracker/domain/model/HabitType;", "getCheckpointsOnce", "(Lcom/dayswithoutracker/domain/model/Gender;Lcom/dayswithoutracker/domain/model/HabitType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initializeCheckpoints", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isCheckpointsInitialized", "", "app_debug"})
public final class CheckpointRepositoryImpl implements com.dayswithoutracker.domain.repository.CheckpointRepository {
    @org.jetbrains.annotations.NotNull
    private final com.dayswithoutracker.data.database.dao.CheckpointDao checkpointDao = null;
    
    @javax.inject.Inject
    public CheckpointRepositoryImpl(@org.jetbrains.annotations.NotNull
    com.dayswithoutracker.data.database.dao.CheckpointDao checkpointDao) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.flow.Flow<java.util.List<com.dayswithoutracker.domain.model.Checkpoint>> getCheckpoints(@org.jetbrains.annotations.NotNull
    com.dayswithoutracker.domain.model.Gender gender, @org.jetbrains.annotations.NotNull
    com.dayswithoutracker.domain.model.HabitType habitType) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object getCheckpointsOnce(@org.jetbrains.annotations.NotNull
    com.dayswithoutracker.domain.model.Gender gender, @org.jetbrains.annotations.NotNull
    com.dayswithoutracker.domain.model.HabitType habitType, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.dayswithoutracker.domain.model.Checkpoint>> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object initializeCheckpoints(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object isCheckpointsInitialized(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion) {
        return null;
    }
}