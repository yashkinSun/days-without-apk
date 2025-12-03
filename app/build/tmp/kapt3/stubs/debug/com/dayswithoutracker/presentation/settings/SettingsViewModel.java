package com.dayswithoutracker.presentation.settings;

/**
 * ViewModel для экрана настроек
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\u0013J\u0006\u0010\u0015\u001a\u00020\u0013J\b\u0010\u0016\u001a\u00020\u0013H\u0002J\b\u0010\u0017\u001a\u00020\u0013H\u0002J\b\u0010\u0018\u001a\u00020\u0013H\u0002J\u0006\u0010\u0019\u001a\u00020\u0013J\u0006\u0010\u001a\u001a\u00020\u0013J\u0006\u0010\u001b\u001a\u00020\u0013J\u0006\u0010\u001c\u001a\u00020\u0013J\u000e\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u001fJ\u000e\u0010 \u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u001fJ\u000e\u0010!\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u001fJ\u000e\u0010\"\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\u001fJ\u000e\u0010$\u001a\u00020\u00132\u0006\u0010%\u001a\u00020&J\u000e\u0010\'\u001a\u00020\u00132\u0006\u0010%\u001a\u00020&J\u000e\u0010(\u001a\u00020\u00132\u0006\u0010%\u001a\u00020&R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006)"}, d2 = {"Lcom/dayswithoutracker/presentation/settings/SettingsViewModel;", "Landroidx/lifecycle/ViewModel;", "userRepository", "Lcom/dayswithoutracker/domain/repository/UserRepository;", "themeRepository", "Lcom/dayswithoutracker/domain/repository/ThemeRepository;", "notificationRepository", "Lcom/dayswithoutracker/domain/repository/NotificationRepository;", "scheduleMotivationalNotificationsUseCase", "Lcom/dayswithoutracker/domain/usecase/ScheduleMotivationalNotificationsUseCase;", "(Lcom/dayswithoutracker/domain/repository/UserRepository;Lcom/dayswithoutracker/domain/repository/ThemeRepository;Lcom/dayswithoutracker/domain/repository/NotificationRepository;Lcom/dayswithoutracker/domain/usecase/ScheduleMotivationalNotificationsUseCase;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/dayswithoutracker/presentation/settings/SettingsUiState;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "clearError", "", "hideMoneyCalculatorDialog", "hideResetConfirmation", "loadNotificationSettings", "loadThemeSetting", "loadUserProfile", "resetCounter", "saveMoneySettings", "showMoneyCalculatorDialog", "showResetConfirmation", "toggleAchievements", "enabled", "", "toggleMotivational", "toggleNotifications", "toggleTheme", "isDark", "updateCurrencySymbol", "value", "", "updateMoneyPerUnit", "updateUnitsPerDay", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class SettingsViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.dayswithoutracker.domain.repository.UserRepository userRepository = null;
    @org.jetbrains.annotations.NotNull
    private final com.dayswithoutracker.domain.repository.ThemeRepository themeRepository = null;
    @org.jetbrains.annotations.NotNull
    private final com.dayswithoutracker.domain.repository.NotificationRepository notificationRepository = null;
    @org.jetbrains.annotations.NotNull
    private final com.dayswithoutracker.domain.usecase.ScheduleMotivationalNotificationsUseCase scheduleMotivationalNotificationsUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<com.dayswithoutracker.presentation.settings.SettingsUiState> _uiState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.dayswithoutracker.presentation.settings.SettingsUiState> uiState = null;
    
    @javax.inject.Inject
    public SettingsViewModel(@org.jetbrains.annotations.NotNull
    com.dayswithoutracker.domain.repository.UserRepository userRepository, @org.jetbrains.annotations.NotNull
    com.dayswithoutracker.domain.repository.ThemeRepository themeRepository, @org.jetbrains.annotations.NotNull
    com.dayswithoutracker.domain.repository.NotificationRepository notificationRepository, @org.jetbrains.annotations.NotNull
    com.dayswithoutracker.domain.usecase.ScheduleMotivationalNotificationsUseCase scheduleMotivationalNotificationsUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.dayswithoutracker.presentation.settings.SettingsUiState> getUiState() {
        return null;
    }
    
    private final void loadUserProfile() {
    }
    
    private final void loadThemeSetting() {
    }
    
    private final void loadNotificationSettings() {
    }
    
    public final void resetCounter() {
    }
    
    public final void showResetConfirmation() {
    }
    
    public final void hideResetConfirmation() {
    }
    
    public final void clearError() {
    }
    
    public final void showMoneyCalculatorDialog() {
    }
    
    public final void hideMoneyCalculatorDialog() {
    }
    
    public final void updateMoneyPerUnit(@org.jetbrains.annotations.NotNull
    java.lang.String value) {
    }
    
    public final void updateUnitsPerDay(@org.jetbrains.annotations.NotNull
    java.lang.String value) {
    }
    
    public final void updateCurrencySymbol(@org.jetbrains.annotations.NotNull
    java.lang.String value) {
    }
    
    public final void saveMoneySettings() {
    }
    
    public final void toggleTheme(boolean isDark) {
    }
    
    public final void toggleNotifications(boolean enabled) {
    }
    
    public final void toggleAchievements(boolean enabled) {
    }
    
    public final void toggleMotivational(boolean enabled) {
    }
}