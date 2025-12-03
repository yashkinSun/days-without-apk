package com.dayswithoutracker.domain.repository;

/**
 * Репозиторий для работы с настройками уведомлений
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u00a6@\u00a2\u0006\u0002\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/dayswithoutracker/domain/repository/NotificationRepository;", "", "getNotificationSettings", "Lkotlinx/coroutines/flow/Flow;", "Lcom/dayswithoutracker/domain/model/NotificationSettings;", "saveNotificationSettings", "", "settings", "(Lcom/dayswithoutracker/domain/model/NotificationSettings;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface NotificationRepository {
    
    /**
     * Получить текущие настройки уведомлений
     * @return Flow с настройками уведомлений
     */
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<com.dayswithoutracker.domain.model.NotificationSettings> getNotificationSettings();
    
    /**
     * Сохранить настройки уведомлений
     * @param settings новые настройки
     */
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object saveNotificationSettings(@org.jetbrains.annotations.NotNull
    com.dayswithoutracker.domain.model.NotificationSettings settings, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
}