package com.dayswithoutracker.domain.model;

/**
 * Настройки уведомлений приложения
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b\u00a8\u0006\u0015"}, d2 = {"Lcom/dayswithoutracker/domain/model/NotificationSettings;", "", "notificationsEnabled", "", "achievementsEnabled", "motivationalEnabled", "(ZZZ)V", "getAchievementsEnabled", "()Z", "getMotivationalEnabled", "getNotificationsEnabled", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "app_debug"})
public final class NotificationSettings {
    
    /**
     * Глобальное включение/выключение уведомлений
     */
    private final boolean notificationsEnabled = false;
    
    /**
     * Уведомления о достижении чек-поинтов
     */
    private final boolean achievementsEnabled = false;
    
    /**
     * Ежедневные мотивационные уведомления
     */
    private final boolean motivationalEnabled = false;
    
    public NotificationSettings(boolean notificationsEnabled, boolean achievementsEnabled, boolean motivationalEnabled) {
        super();
    }
    
    /**
     * Глобальное включение/выключение уведомлений
     */
    public final boolean getNotificationsEnabled() {
        return false;
    }
    
    /**
     * Уведомления о достижении чек-поинтов
     */
    public final boolean getAchievementsEnabled() {
        return false;
    }
    
    /**
     * Ежедневные мотивационные уведомления
     */
    public final boolean getMotivationalEnabled() {
        return false;
    }
    
    public NotificationSettings() {
        super();
    }
    
    public final boolean component1() {
        return false;
    }
    
    public final boolean component2() {
        return false;
    }
    
    public final boolean component3() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.dayswithoutracker.domain.model.NotificationSettings copy(boolean notificationsEnabled, boolean achievementsEnabled, boolean motivationalEnabled) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return null;
    }
}