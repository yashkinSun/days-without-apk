package com.dayswithoutracker.domain.model;

/**
 * Domain модель профиля пользователя
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0002\u0010\u000fJ\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0005H\u00c6\u0003J\t\u0010 \u001a\u00020\u0007H\u00c6\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0017J\u0010\u0010#\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0017J\u000b\u0010$\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\\\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00c6\u0001\u00a2\u0006\u0002\u0010&J\u0013\u0010\'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\u0006\u0010*\u001a\u00020\tJ\u0006\u0010+\u001a\u00020(J\t\u0010,\u001a\u00020-H\u00d6\u0001J\t\u0010.\u001a\u00020\u000eH\u00d6\u0001R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0015\u0010\f\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u001d\u0010\u0017\u00a8\u0006/"}, d2 = {"Lcom/dayswithoutracker/domain/model/UserProfile;", "", "gender", "Lcom/dayswithoutracker/domain/model/Gender;", "habitType", "Lcom/dayswithoutracker/domain/model/HabitType;", "startDate", "Ljava/time/LocalDate;", "startDateTime", "Ljava/time/LocalDateTime;", "moneyPerUnit", "", "unitsPerDay", "currencySymbol", "", "(Lcom/dayswithoutracker/domain/model/Gender;Lcom/dayswithoutracker/domain/model/HabitType;Ljava/time/LocalDate;Ljava/time/LocalDateTime;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;)V", "getCurrencySymbol", "()Ljava/lang/String;", "getGender", "()Lcom/dayswithoutracker/domain/model/Gender;", "getHabitType", "()Lcom/dayswithoutracker/domain/model/HabitType;", "getMoneyPerUnit", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getStartDate", "()Ljava/time/LocalDate;", "getStartDateTime", "()Ljava/time/LocalDateTime;", "getUnitsPerDay", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Lcom/dayswithoutracker/domain/model/Gender;Lcom/dayswithoutracker/domain/model/HabitType;Ljava/time/LocalDate;Ljava/time/LocalDateTime;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;)Lcom/dayswithoutracker/domain/model/UserProfile;", "equals", "", "other", "getEffectiveStartDateTime", "hasMoneyCalculatorData", "hashCode", "", "toString", "app_debug"})
public final class UserProfile {
    @org.jetbrains.annotations.NotNull
    private final com.dayswithoutracker.domain.model.Gender gender = null;
    @org.jetbrains.annotations.NotNull
    private final com.dayswithoutracker.domain.model.HabitType habitType = null;
    @org.jetbrains.annotations.NotNull
    private final java.time.LocalDate startDate = null;
    @org.jetbrains.annotations.Nullable
    private final java.time.LocalDateTime startDateTime = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Float moneyPerUnit = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Float unitsPerDay = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String currencySymbol = null;
    
    public UserProfile(@org.jetbrains.annotations.NotNull
    com.dayswithoutracker.domain.model.Gender gender, @org.jetbrains.annotations.NotNull
    com.dayswithoutracker.domain.model.HabitType habitType, @org.jetbrains.annotations.NotNull
    java.time.LocalDate startDate, @org.jetbrains.annotations.Nullable
    java.time.LocalDateTime startDateTime, @org.jetbrains.annotations.Nullable
    java.lang.Float moneyPerUnit, @org.jetbrains.annotations.Nullable
    java.lang.Float unitsPerDay, @org.jetbrains.annotations.Nullable
    java.lang.String currencySymbol) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.dayswithoutracker.domain.model.Gender getGender() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.dayswithoutracker.domain.model.HabitType getHabitType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.time.LocalDate getStartDate() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.time.LocalDateTime getStartDateTime() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Float getMoneyPerUnit() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Float getUnitsPerDay() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getCurrencySymbol() {
        return null;
    }
    
    /**
     * Получить точное время начала или преобразовать дату в начало дня
     */
    @org.jetbrains.annotations.NotNull
    public final java.time.LocalDateTime getEffectiveStartDateTime() {
        return null;
    }
    
    /**
     * Проверка наличия данных для калькулятора денег
     */
    public final boolean hasMoneyCalculatorData() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.dayswithoutracker.domain.model.Gender component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.dayswithoutracker.domain.model.HabitType component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.time.LocalDate component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.time.LocalDateTime component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Float component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Float component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.dayswithoutracker.domain.model.UserProfile copy(@org.jetbrains.annotations.NotNull
    com.dayswithoutracker.domain.model.Gender gender, @org.jetbrains.annotations.NotNull
    com.dayswithoutracker.domain.model.HabitType habitType, @org.jetbrains.annotations.NotNull
    java.time.LocalDate startDate, @org.jetbrains.annotations.Nullable
    java.time.LocalDateTime startDateTime, @org.jetbrains.annotations.Nullable
    java.lang.Float moneyPerUnit, @org.jetbrains.annotations.Nullable
    java.lang.Float unitsPerDay, @org.jetbrains.annotations.Nullable
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