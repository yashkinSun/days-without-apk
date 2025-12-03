package com.dayswithoutracker.domain.usecase;

/**
 * UseCase для проверки и отправки уведомлений о достижениях
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bH\u0002J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u001e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bH\u0086B\u00a2\u0006\u0002\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/dayswithoutracker/domain/usecase/CheckAndNotifyAchievementsUseCase;", "", "context", "Landroid/content/Context;", "notificationRepository", "Lcom/dayswithoutracker/domain/repository/NotificationRepository;", "(Landroid/content/Context;Lcom/dayswithoutracker/domain/repository/NotificationRepository;)V", "buildAchievementMessage", "", "checkpoint", "Lcom/dayswithoutracker/domain/model/Checkpoint;", "habitName", "getDaysWord", "days", "", "invoke", "", "(Lcom/dayswithoutracker/domain/model/Checkpoint;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class CheckAndNotifyAchievementsUseCase {
    @org.jetbrains.annotations.NotNull
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull
    private final com.dayswithoutracker.domain.repository.NotificationRepository notificationRepository = null;
    
    @javax.inject.Inject
    public CheckAndNotifyAchievementsUseCase(@dagger.hilt.android.qualifiers.ApplicationContext
    @org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    com.dayswithoutracker.domain.repository.NotificationRepository notificationRepository) {
        super();
    }
    
    /**
     * Проверить достижение и отправить уведомление если нужно
     *
     * @param checkpoint достигнутый чек-поинт
     * @param habitName название привычки (для персонализации сообщения)
     */
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull
    com.dayswithoutracker.domain.model.Checkpoint checkpoint, @org.jetbrains.annotations.NotNull
    java.lang.String habitName, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    private final java.lang.String buildAchievementMessage(com.dayswithoutracker.domain.model.Checkpoint checkpoint, java.lang.String habitName) {
        return null;
    }
    
    private final java.lang.String getDaysWord(int days) {
        return null;
    }
}