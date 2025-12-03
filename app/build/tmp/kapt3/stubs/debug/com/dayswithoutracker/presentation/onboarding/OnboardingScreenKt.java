package com.dayswithoutracker.presentation.onboarding;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001a&\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0003\u001a&\u0010\b\u001a\u00020\u00012\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\fH\u0003\u001a&\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0003\u001a&\u0010\u000e\u001a\u00020\u00012\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\fH\u0003\u001ad\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00032\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\f2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\f2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\fH\u0003\u001a\u0082\u0001\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u001c2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\f2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\f2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\f2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\f2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0003\u001a \u0010\u001e\u001a\u00020\u00012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010 \u001a\u00020!H\u0007\u00a8\u0006\""}, d2 = {"GenderOption", "", "text", "", "selected", "", "onClick", "Lkotlin/Function0;", "GenderSelection", "selectedGender", "Lcom/dayswithoutracker/domain/model/Gender;", "onGenderSelected", "Lkotlin/Function1;", "HabitTypeOption", "HabitTypeSelection", "selectedHabitType", "Lcom/dayswithoutracker/domain/model/HabitType;", "onHabitTypeSelected", "MoneyCalculatorSection", "showCalculator", "moneyPerUnit", "unitsPerDay", "currencySymbol", "onMoneyPerUnitChange", "onUnitsPerDayChange", "onCurrencySymbolChange", "OnboardingContent", "uiState", "Lcom/dayswithoutracker/presentation/onboarding/OnboardingUiState;", "onStartClick", "OnboardingScreen", "onNavigateToMain", "viewModel", "Lcom/dayswithoutracker/presentation/onboarding/OnboardingViewModel;", "app_debug"})
public final class OnboardingScreenKt {
    
    /**
     * Экран онбординга для выбора пола и привычки
     */
    @androidx.compose.runtime.Composable
    public static final void OnboardingScreen(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onNavigateToMain, @org.jetbrains.annotations.NotNull
    com.dayswithoutracker.presentation.onboarding.OnboardingViewModel viewModel) {
    }
    
    @androidx.compose.runtime.Composable
    private static final void OnboardingContent(com.dayswithoutracker.presentation.onboarding.OnboardingUiState uiState, kotlin.jvm.functions.Function1<? super com.dayswithoutracker.domain.model.Gender, kotlin.Unit> onGenderSelected, kotlin.jvm.functions.Function1<? super com.dayswithoutracker.domain.model.HabitType, kotlin.Unit> onHabitTypeSelected, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onMoneyPerUnitChange, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onUnitsPerDayChange, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onCurrencySymbolChange, kotlin.jvm.functions.Function0<kotlin.Unit> onStartClick) {
    }
    
    @androidx.compose.runtime.Composable
    private static final void GenderSelection(com.dayswithoutracker.domain.model.Gender selectedGender, kotlin.jvm.functions.Function1<? super com.dayswithoutracker.domain.model.Gender, kotlin.Unit> onGenderSelected) {
    }
    
    @androidx.compose.runtime.Composable
    private static final void HabitTypeSelection(com.dayswithoutracker.domain.model.HabitType selectedHabitType, kotlin.jvm.functions.Function1<? super com.dayswithoutracker.domain.model.HabitType, kotlin.Unit> onHabitTypeSelected) {
    }
    
    @androidx.compose.runtime.Composable
    private static final void GenderOption(java.lang.String text, boolean selected, kotlin.jvm.functions.Function0<kotlin.Unit> onClick) {
    }
    
    @androidx.compose.runtime.Composable
    private static final void HabitTypeOption(java.lang.String text, boolean selected, kotlin.jvm.functions.Function0<kotlin.Unit> onClick) {
    }
    
    /**
     * Секция для ввода данных калькулятора денег (опционально)
     */
    @androidx.compose.runtime.Composable
    private static final void MoneyCalculatorSection(boolean showCalculator, java.lang.String moneyPerUnit, java.lang.String unitsPerDay, java.lang.String currencySymbol, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onMoneyPerUnitChange, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onUnitsPerDayChange, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onCurrencySymbolChange) {
    }
}