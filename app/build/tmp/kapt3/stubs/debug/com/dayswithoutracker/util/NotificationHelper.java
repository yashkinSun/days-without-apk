package com.dayswithoutracker.util;

/**
 * Помощник для работы с уведомлениями
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u001e\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004J\u0016\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/dayswithoutracker/util/NotificationHelper;", "", "()V", "CHANNEL_ID_ACHIEVEMENTS", "", "CHANNEL_ID_MOTIVATIONAL", "NOTIFICATION_ID_ACHIEVEMENT", "", "NOTIFICATION_ID_MOTIVATIONAL", "createNotificationChannels", "", "context", "Landroid/content/Context;", "showAchievementNotification", "title", "message", "showMotivationalNotification", "app_debug"})
public final class NotificationHelper {
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String CHANNEL_ID_ACHIEVEMENTS = "achievements_channel";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String CHANNEL_ID_MOTIVATIONAL = "motivational_channel";
    public static final int NOTIFICATION_ID_ACHIEVEMENT = 1001;
    public static final int NOTIFICATION_ID_MOTIVATIONAL = 1002;
    @org.jetbrains.annotations.NotNull
    public static final com.dayswithoutracker.util.NotificationHelper INSTANCE = null;
    
    private NotificationHelper() {
        super();
    }
    
    /**
     * Создание каналов уведомлений (для Android 8.0+)
     */
    public final void createNotificationChannels(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
    }
    
    /**
     * Показать уведомление о достижении
     */
    public final void showAchievementNotification(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.lang.String title, @org.jetbrains.annotations.NotNull
    java.lang.String message) {
    }
    
    /**
     * Показать мотивационное уведомление
     */
    public final void showMotivationalNotification(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.lang.String message) {
    }
}