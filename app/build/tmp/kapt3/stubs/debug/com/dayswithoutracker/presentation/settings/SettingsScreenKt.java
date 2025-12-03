package com.dayswithoutracker.presentation.settings;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001ax\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000bH\u0003\u001a$\u0010\r\u001a\u00020\u00012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000bH\u0003\u001a\u0086\u0001\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00010\u00072\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00010\u00072\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00010\u00072\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\u0019\u001a\u00020\u001aH\u0003\u001a.\u0010\u001b\u001a\u00020\u00012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\b\b\u0002\u0010\u001e\u001a\u00020\u001fH\u0007\u00a8\u0006 "}, d2 = {"MoneyCalculatorDialog", "", "moneyPerUnit", "", "unitsPerDay", "currencySymbol", "onMoneyPerUnitChange", "Lkotlin/Function1;", "onUnitsPerDayChange", "onCurrencySymbolChange", "onSave", "Lkotlin/Function0;", "onDismiss", "ResetConfirmationDialog", "onConfirm", "SettingsContent", "uiState", "Lcom/dayswithoutracker/presentation/settings/SettingsUiState;", "onResetClick", "onShowMoneyDialog", "onThemeChange", "", "onNotificationsToggle", "onAchievementsToggle", "onMotivationalToggle", "modifier", "Landroidx/compose/ui/Modifier;", "SettingsScreen", "onNavigateBack", "onNavigateToOnboarding", "viewModel", "Lcom/dayswithoutracker/presentation/settings/SettingsViewModel;", "app_debug"})
public final class SettingsScreenKt {
    
    /**
     * Экран настроек
     */
    @kotlin.OptIn(markerClass = {androidx.compose.material3.ExperimentalMaterial3Api.class})
    @androidx.compose.runtime.Composable
    public static final void SettingsScreen(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onNavigateBack, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onNavigateToOnboarding, @org.jetbrains.annotations.NotNull
    com.dayswithoutracker.presentation.settings.SettingsViewModel viewModel) {
    }
    
    @androidx.compose.runtime.Composable
    private static final void SettingsContent(com.dayswithoutracker.presentation.settings.SettingsUiState uiState, kotlin.jvm.functions.Function0<kotlin.Unit> onResetClick, kotlin.jvm.functions.Function0<kotlin.Unit> onShowMoneyDialog, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> onThemeChange, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> onNotificationsToggle, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> onAchievementsToggle, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> onMotivationalToggle, androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable
    private static final void ResetConfirmationDialog(kotlin.jvm.functions.Function0<kotlin.Unit> onConfirm, kotlin.jvm.functions.Function0<kotlin.Unit> onDismiss) {
    }
    
    /**
     * Диалог для редактирования параметров калькулятора денег
     */
    @androidx.compose.runtime.Composable
    private static final void MoneyCalculatorDialog(java.lang.String moneyPerUnit, java.lang.String unitsPerDay, java.lang.String currencySymbol, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onMoneyPerUnitChange, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onUnitsPerDayChange, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onCurrencySymbolChange, kotlin.jvm.functions.Function0<kotlin.Unit> onSave, kotlin.jvm.functions.Function0<kotlin.Unit> onDismiss) {
    }
}