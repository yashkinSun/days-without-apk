package com.dayswithoutracker.data.database.dao;

/**
 * DAO для работы с чек-поинтами
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u0003H\u00a7@\u00a2\u0006\u0002\u0010\u0004J$\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\'J\u000e\u0010\r\u001a\u00020\u000eH\u00a7@\u00a2\u0006\u0002\u0010\u0004J$\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u00a7@\u00a2\u0006\u0002\u0010\u0010J\u001c\u0010\u0011\u001a\u00020\u00032\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u00a7@\u00a2\u0006\u0002\u0010\u0013\u00a8\u0006\u0014"}, d2 = {"Lcom/dayswithoutracker/data/database/dao/CheckpointDao;", "", "deleteAllCheckpoints", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCheckpoints", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/dayswithoutracker/data/database/entities/CheckpointEntity;", "gender", "Lcom/dayswithoutracker/domain/model/Gender;", "habitType", "Lcom/dayswithoutracker/domain/model/HabitType;", "getCheckpointsCount", "", "getCheckpointsOnce", "(Lcom/dayswithoutracker/domain/model/Gender;Lcom/dayswithoutracker/domain/model/HabitType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertCheckpoints", "checkpoints", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
@androidx.room.Dao
public abstract interface CheckpointDao {
    
    @androidx.room.Query(value = "SELECT * FROM checkpoints WHERE gender = :gender AND habitType = :habitType ORDER BY dayNumber ASC")
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.dayswithoutracker.data.database.entities.CheckpointEntity>> getCheckpoints(@org.jetbrains.annotations.NotNull
    com.dayswithoutracker.domain.model.Gender gender, @org.jetbrains.annotations.NotNull
    com.dayswithoutracker.domain.model.HabitType habitType);
    
    @androidx.room.Query(value = "SELECT * FROM checkpoints WHERE gender = :gender AND habitType = :habitType ORDER BY dayNumber ASC")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getCheckpointsOnce(@org.jetbrains.annotations.NotNull
    com.dayswithoutracker.domain.model.Gender gender, @org.jetbrains.annotations.NotNull
    com.dayswithoutracker.domain.model.HabitType habitType, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.dayswithoutracker.data.database.entities.CheckpointEntity>> $completion);
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object insertCheckpoints(@org.jetbrains.annotations.NotNull
    java.util.List<com.dayswithoutracker.data.database.entities.CheckpointEntity> checkpoints, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "DELETE FROM checkpoints")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object deleteAllCheckpoints(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "SELECT COUNT(*) FROM checkpoints")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getCheckpointsCount(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion);
}