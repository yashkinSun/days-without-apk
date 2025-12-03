package com.dayswithoutracker.domain.usecase;

/**
 * Use case для расчета детального времени без привычки в формате дней/часов/минут/секунд
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bJ\u0011\u0010\f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0006H\u0086\u0002\u00a8\u0006\r"}, d2 = {"Lcom/dayswithoutracker/domain/usecase/CalculateDetailedTimeUseCase;", "", "()V", "calculateProgress", "", "startDate", "Ljava/time/LocalDateTime;", "formatTime", "", "detailedTime", "Lcom/dayswithoutracker/domain/usecase/DetailedTime;", "habitText", "invoke", "app_debug"})
public final class CalculateDetailedTimeUseCase {
    
    @javax.inject.Inject
    public CalculateDetailedTimeUseCase() {
        super();
    }
    
    /**
     * Расчет детального времени с момента начала
     */
    @org.jetbrains.annotations.NotNull
    public final com.dayswithoutracker.domain.usecase.DetailedTime invoke(@org.jetbrains.annotations.NotNull
    java.time.LocalDateTime startDate) {
        return null;
    }
    
    /**
     * Расчет прогресса до года (365 дней)
     */
    public final float calculateProgress(@org.jetbrains.annotations.NotNull
    java.time.LocalDateTime startDate) {
        return 0.0F;
    }
    
    /**
     * Форматирование времени в читаемую строку
     */
    @org.jetbrains.annotations.NotNull
    public final java.lang.String formatTime(@org.jetbrains.annotations.NotNull
    com.dayswithoutracker.domain.usecase.DetailedTime detailedTime, @org.jetbrains.annotations.NotNull
    java.lang.String habitText) {
        return null;
    }
}