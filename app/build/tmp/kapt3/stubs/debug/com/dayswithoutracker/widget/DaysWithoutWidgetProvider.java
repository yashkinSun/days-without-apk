package com.dayswithoutracker.widget;

/**
 * AppWidget Provider для виджета "Дни без привычки"
 */
@dagger.hilt.android.AndroidEntryPoint
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0010H\u0002J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J \u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J \u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u0010H\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/dayswithoutracker/widget/DaysWithoutWidgetProvider;", "Landroid/appwidget/AppWidgetProvider;", "()V", "getWidgetDataUseCase", "Lcom/dayswithoutracker/domain/usecase/GetWidgetDataUseCase;", "getGetWidgetDataUseCase", "()Lcom/dayswithoutracker/domain/usecase/GetWidgetDataUseCase;", "setGetWidgetDataUseCase", "(Lcom/dayswithoutracker/domain/usecase/GetWidgetDataUseCase;)V", "job", "Lkotlinx/coroutines/CompletableJob;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "getDaysWord", "", "days", "", "getHoursWord", "hours", "onDisabled", "", "context", "Landroid/content/Context;", "onEnabled", "onUpdate", "appWidgetManager", "Landroid/appwidget/AppWidgetManager;", "appWidgetIds", "", "updateAppWidget", "appWidgetId", "Companion", "app_debug"})
public final class DaysWithoutWidgetProvider extends android.appwidget.AppWidgetProvider {
    @javax.inject.Inject
    public com.dayswithoutracker.domain.usecase.GetWidgetDataUseCase getWidgetDataUseCase;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.CompletableJob job = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.CoroutineScope scope = null;
    @org.jetbrains.annotations.NotNull
    public static final com.dayswithoutracker.widget.DaysWithoutWidgetProvider.Companion Companion = null;
    
    public DaysWithoutWidgetProvider() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.dayswithoutracker.domain.usecase.GetWidgetDataUseCase getGetWidgetDataUseCase() {
        return null;
    }
    
    public final void setGetWidgetDataUseCase(@org.jetbrains.annotations.NotNull
    com.dayswithoutracker.domain.usecase.GetWidgetDataUseCase p0) {
    }
    
    @java.lang.Override
    public void onUpdate(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    android.appwidget.AppWidgetManager appWidgetManager, @org.jetbrains.annotations.NotNull
    int[] appWidgetIds) {
    }
    
    @java.lang.Override
    public void onEnabled(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
    }
    
    @java.lang.Override
    public void onDisabled(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
    }
    
    private final void updateAppWidget(android.content.Context context, android.appwidget.AppWidgetManager appWidgetManager, int appWidgetId) {
    }
    
    private final java.lang.String getDaysWord(int days) {
        return null;
    }
    
    private final java.lang.String getHoursWord(int hours) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/dayswithoutracker/widget/DaysWithoutWidgetProvider$Companion;", "", "()V", "updateAllWidgets", "", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * Обновить все виджеты
         */
        public final void updateAllWidgets(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
        }
    }
}