package com.dayswithoutracker.domain.usecase;

/**
 * UseCase для планирования ежедневных мотивационных уведомлений
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006J\t\u0010\u0007\u001a\u00020\u0006H\u0086\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/dayswithoutracker/domain/usecase/ScheduleMotivationalNotificationsUseCase;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "cancel", "", "invoke", "app_debug"})
public final class ScheduleMotivationalNotificationsUseCase {
    @org.jetbrains.annotations.NotNull
    private final android.content.Context context = null;
    
    @javax.inject.Inject
    public ScheduleMotivationalNotificationsUseCase(@dagger.hilt.android.qualifiers.ApplicationContext
    @org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super();
    }
    
    /**
     * Запланировать ежедневные уведомления в 9:00
     */
    public final void invoke() {
    }
    
    /**
     * Отменить запланированные уведомления
     */
    public final void cancel() {
    }
}