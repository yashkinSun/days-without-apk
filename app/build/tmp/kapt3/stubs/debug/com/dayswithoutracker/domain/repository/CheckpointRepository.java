package com.dayswithoutracker.domain.repository;

/**
 * Интерфейс репозитория для работы с чек-поинтами
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J$\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u00a6@\u00a2\u0006\u0002\u0010\u000bJ\u000e\u0010\f\u001a\u00020\rH\u00a6@\u00a2\u0006\u0002\u0010\u000eJ\u000e\u0010\u000f\u001a\u00020\u0010H\u00a6@\u00a2\u0006\u0002\u0010\u000e\u00a8\u0006\u0011"}, d2 = {"Lcom/dayswithoutracker/domain/repository/CheckpointRepository;", "", "getCheckpoints", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/dayswithoutracker/domain/model/Checkpoint;", "gender", "Lcom/dayswithoutracker/domain/model/Gender;", "habitType", "Lcom/dayswithoutracker/domain/model/HabitType;", "getCheckpointsOnce", "(Lcom/dayswithoutracker/domain/model/Gender;Lcom/dayswithoutracker/domain/model/HabitType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initializeCheckpoints", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isCheckpointsInitialized", "", "app_debug"})
public abstract interface CheckpointRepository {
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.dayswithoutracker.domain.model.Checkpoint>> getCheckpoints(@org.jetbrains.annotations.NotNull
    com.dayswithoutracker.domain.model.Gender gender, @org.jetbrains.annotations.NotNull
    com.dayswithoutracker.domain.model.HabitType habitType);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getCheckpointsOnce(@org.jetbrains.annotations.NotNull
    com.dayswithoutracker.domain.model.Gender gender, @org.jetbrains.annotations.NotNull
    com.dayswithoutracker.domain.model.HabitType habitType, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.dayswithoutracker.domain.model.Checkpoint>> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object initializeCheckpoints(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object isCheckpointsInitialized(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion);
}