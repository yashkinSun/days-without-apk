package com.dayswithoutracker.domain.usecase;

/**
 * Use case для получения чек-поинтов с расчетом прогресса
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J-\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0086\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/dayswithoutracker/domain/usecase/GetCheckpointsWithProgressUseCase;", "", "checkpointRepository", "Lcom/dayswithoutracker/domain/repository/CheckpointRepository;", "(Lcom/dayswithoutracker/domain/repository/CheckpointRepository;)V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/dayswithoutracker/domain/model/Checkpoint;", "gender", "Lcom/dayswithoutracker/domain/model/Gender;", "habitType", "Lcom/dayswithoutracker/domain/model/HabitType;", "startDate", "Ljava/time/LocalDate;", "app_debug"})
public final class GetCheckpointsWithProgressUseCase {
    @org.jetbrains.annotations.NotNull
    private final com.dayswithoutracker.domain.repository.CheckpointRepository checkpointRepository = null;
    
    @javax.inject.Inject
    public GetCheckpointsWithProgressUseCase(@org.jetbrains.annotations.NotNull
    com.dayswithoutracker.domain.repository.CheckpointRepository checkpointRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.dayswithoutracker.domain.model.Checkpoint>> invoke(@org.jetbrains.annotations.NotNull
    com.dayswithoutracker.domain.model.Gender gender, @org.jetbrains.annotations.NotNull
    com.dayswithoutracker.domain.model.HabitType habitType, @org.jetbrains.annotations.NotNull
    java.time.LocalDate startDate) {
        return null;
    }
}