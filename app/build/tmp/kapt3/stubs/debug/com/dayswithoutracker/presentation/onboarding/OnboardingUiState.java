package com.dayswithoutracker.presentation.onboarding;

/**
 * UI состояние для экрана онбординга
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Be\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000fJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0007H\u00c6\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\nH\u00c6\u0003J\t\u0010!\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\"\u001a\u00020\nH\u00c6\u0003J\t\u0010#\u001a\u00020\nH\u00c6\u0003J\t\u0010$\u001a\u00020\nH\u00c6\u0003Ji\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\nH\u00c6\u0001J\u0013\u0010&\u001a\u00020\u00072\b\u0010\'\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010(\u001a\u00020)H\u00d6\u0001J\t\u0010*\u001a\u00020\nH\u00d6\u0001R\u0011\u0010\u000e\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u00078F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\f\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0011\u0010\r\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011\u00a8\u0006+"}, d2 = {"Lcom/dayswithoutracker/presentation/onboarding/OnboardingUiState;", "", "selectedGender", "Lcom/dayswithoutracker/domain/model/Gender;", "selectedHabitType", "Lcom/dayswithoutracker/domain/model/HabitType;", "isLoading", "", "isCompleted", "error", "", "showMoneyCalculator", "moneyPerUnit", "unitsPerDay", "currencySymbol", "(Lcom/dayswithoutracker/domain/model/Gender;Lcom/dayswithoutracker/domain/model/HabitType;ZZLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCurrencySymbol", "()Ljava/lang/String;", "getError", "()Z", "isStartButtonEnabled", "getMoneyPerUnit", "getSelectedGender", "()Lcom/dayswithoutracker/domain/model/Gender;", "getSelectedHabitType", "()Lcom/dayswithoutracker/domain/model/HabitType;", "getShowMoneyCalculator", "getUnitsPerDay", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "app_debug"})
public final class OnboardingUiState {
    @org.jetbrains.annotations.Nullable
    private final com.dayswithoutracker.domain.model.Gender selectedGender = null;
    @org.jetbrains.annotations.Nullable
    private final com.dayswithoutracker.domain.model.HabitType selectedHabitType = null;
    private final boolean isLoading = false;
    private final boolean isCompleted = false;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String error = null;
    private final boolean showMoneyCalculator = false;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String moneyPerUnit = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String unitsPerDay = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String currencySymbol = null;
    
    public OnboardingUiState(@org.jetbrains.annotations.Nullable
    com.dayswithoutracker.domain.model.Gender selectedGender, @org.jetbrains.annotations.Nullable
    com.dayswithoutracker.domain.model.HabitType selectedHabitType, boolean isLoading, boolean isCompleted, @org.jetbrains.annotations.Nullable
    java.lang.String error, boolean showMoneyCalculator, @org.jetbrains.annotations.NotNull
    java.lang.String moneyPerUnit, @org.jetbrains.annotations.NotNull
    java.lang.String unitsPerDay, @org.jetbrains.annotations.NotNull
    java.lang.String currencySymbol) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.dayswithoutracker.domain.model.Gender getSelectedGender() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.dayswithoutracker.domain.model.HabitType getSelectedHabitType() {
        return null;
    }
    
    public final boolean isLoading() {
        return false;
    }
    
    public final boolean isCompleted() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getError() {
        return null;
    }
    
    public final boolean getShowMoneyCalculator() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMoneyPerUnit() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getUnitsPerDay() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCurrencySymbol() {
        return null;
    }
    
    public final boolean isStartButtonEnabled() {
        return false;
    }
    
    public OnboardingUiState() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.dayswithoutracker.domain.model.Gender component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.dayswithoutracker.domain.model.HabitType component2() {
        return null;
    }
    
    public final boolean component3() {
        return false;
    }
    
    public final boolean component4() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component5() {
        return null;
    }
    
    public final boolean component6() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.dayswithoutracker.presentation.onboarding.OnboardingUiState copy(@org.jetbrains.annotations.Nullable
    com.dayswithoutracker.domain.model.Gender selectedGender, @org.jetbrains.annotations.Nullable
    com.dayswithoutracker.domain.model.HabitType selectedHabitType, boolean isLoading, boolean isCompleted, @org.jetbrains.annotations.Nullable
    java.lang.String error, boolean showMoneyCalculator, @org.jetbrains.annotations.NotNull
    java.lang.String moneyPerUnit, @org.jetbrains.annotations.NotNull
    java.lang.String unitsPerDay, @org.jetbrains.annotations.NotNull
    java.lang.String currencySymbol) {
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