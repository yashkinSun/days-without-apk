package com.dayswithoutracker.domain.usecase;

/**
 * UseCase для расчета сэкономленных денег
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/dayswithoutracker/domain/usecase/CalculateMoneySavedUseCase;", "", "calculateDetailedTimeUseCase", "Lcom/dayswithoutracker/domain/usecase/CalculateDetailedTimeUseCase;", "(Lcom/dayswithoutracker/domain/usecase/CalculateDetailedTimeUseCase;)V", "invoke", "Lcom/dayswithoutracker/domain/model/MoneySaved;", "userProfile", "Lcom/dayswithoutracker/domain/model/UserProfile;", "app_debug"})
public final class CalculateMoneySavedUseCase {
    @org.jetbrains.annotations.NotNull
    private final com.dayswithoutracker.domain.usecase.CalculateDetailedTimeUseCase calculateDetailedTimeUseCase = null;
    
    @javax.inject.Inject
    public CalculateMoneySavedUseCase(@org.jetbrains.annotations.NotNull
    com.dayswithoutracker.domain.usecase.CalculateDetailedTimeUseCase calculateDetailedTimeUseCase) {
        super();
    }
    
    /**
     * Рассчитать сэкономленные деньги на основе профиля пользователя
     *
     * @param userProfile профиль пользователя с данными о стоимости и потреблении
     * @return MoneySaved или null, если данные не заполнены
     */
    @org.jetbrains.annotations.Nullable
    public final com.dayswithoutracker.domain.model.MoneySaved invoke(@org.jetbrains.annotations.NotNull
    com.dayswithoutracker.domain.model.UserProfile userProfile) {
        return null;
    }
}