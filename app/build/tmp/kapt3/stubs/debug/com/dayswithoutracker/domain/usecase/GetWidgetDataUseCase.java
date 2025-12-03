package com.dayswithoutracker.domain.usecase;

/**
 * UseCase для получения данных для виджета
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0086B\u00a2\u0006\u0002\u0010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/dayswithoutracker/domain/usecase/GetWidgetDataUseCase;", "", "userRepository", "Lcom/dayswithoutracker/domain/repository/UserRepository;", "calculateDetailedTimeUseCase", "Lcom/dayswithoutracker/domain/usecase/CalculateDetailedTimeUseCase;", "(Lcom/dayswithoutracker/domain/repository/UserRepository;Lcom/dayswithoutracker/domain/usecase/CalculateDetailedTimeUseCase;)V", "calculateProgressToYear", "", "days", "", "invoke", "Lcom/dayswithoutracker/domain/usecase/WidgetData;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class GetWidgetDataUseCase {
    @org.jetbrains.annotations.NotNull
    private final com.dayswithoutracker.domain.repository.UserRepository userRepository = null;
    @org.jetbrains.annotations.NotNull
    private final com.dayswithoutracker.domain.usecase.CalculateDetailedTimeUseCase calculateDetailedTimeUseCase = null;
    
    @javax.inject.Inject
    public GetWidgetDataUseCase(@org.jetbrains.annotations.NotNull
    com.dayswithoutracker.domain.repository.UserRepository userRepository, @org.jetbrains.annotations.NotNull
    com.dayswithoutracker.domain.usecase.CalculateDetailedTimeUseCase calculateDetailedTimeUseCase) {
        super();
    }
    
    /**
     * Получить данные для виджета
     *
     * @return WidgetData или null если профиль не создан
     */
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.dayswithoutracker.domain.usecase.WidgetData> $completion) {
        return null;
    }
    
    private final float calculateProgressToYear(int days) {
        return 0.0F;
    }
}