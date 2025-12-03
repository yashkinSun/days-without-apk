package com.dayswithoutracker.data.database.entities;

/**
 * Entity для хранения профиля пользователя в базе данных
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0002\u0010\u0011J\t\u0010\"\u001a\u00020\u0003H\u00c6\u0003J\t\u0010#\u001a\u00020\u0005H\u00c6\u0003J\t\u0010$\u001a\u00020\u0007H\u00c6\u0003J\t\u0010%\u001a\u00020\tH\u00c6\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u0010\u0010\'\u001a\u0004\u0018\u00010\rH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001bJ\u0010\u0010(\u001a\u0004\u0018\u00010\rH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001bJ\u000b\u0010)\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003Jf\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u00c6\u0001\u00a2\u0006\u0002\u0010+J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010/\u001a\u00020\u0003H\u00d6\u0001J\t\u00100\u001a\u00020\u0010H\u00d6\u0001R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0015\u0010\f\u001a\u0004\u0018\u00010\r\u00a2\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\r\u00a2\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b!\u0010\u001b\u00a8\u00061"}, d2 = {"Lcom/dayswithoutracker/data/database/entities/UserProfileEntity;", "", "id", "", "gender", "Lcom/dayswithoutracker/domain/model/Gender;", "habitType", "Lcom/dayswithoutracker/domain/model/HabitType;", "startDate", "Ljava/time/LocalDate;", "startDateTime", "Ljava/time/LocalDateTime;", "moneyPerUnit", "", "unitsPerDay", "currencySymbol", "", "(ILcom/dayswithoutracker/domain/model/Gender;Lcom/dayswithoutracker/domain/model/HabitType;Ljava/time/LocalDate;Ljava/time/LocalDateTime;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;)V", "getCurrencySymbol", "()Ljava/lang/String;", "getGender", "()Lcom/dayswithoutracker/domain/model/Gender;", "getHabitType", "()Lcom/dayswithoutracker/domain/model/HabitType;", "getId", "()I", "getMoneyPerUnit", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getStartDate", "()Ljava/time/LocalDate;", "getStartDateTime", "()Ljava/time/LocalDateTime;", "getUnitsPerDay", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(ILcom/dayswithoutracker/domain/model/Gender;Lcom/dayswithoutracker/domain/model/HabitType;Ljava/time/LocalDate;Ljava/time/LocalDateTime;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;)Lcom/dayswithoutracker/data/database/entities/UserProfileEntity;", "equals", "", "other", "hashCode", "toString", "app_debug"})
@androidx.room.Entity(tableName = "user_profile")
public final class UserProfileEntity {
    @androidx.room.PrimaryKey
    private final int id = 0;
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
    
    public UserProfileEntity(int id, @org.jetbrains.annotations.NotNull
    com.dayswithoutracker.domain.model.Gender gender, @org.jetbrains.annotations.NotNull
    com.dayswithoutracker.domain.model.HabitType habitType, @org.jetbrains.annotations.NotNull
    java.time.LocalDate startDate, @org.jetbrains.annotations.Nullable
    java.time.LocalDateTime startDateTime, @org.jetbrains.annotations.Nullable
    java.lang.Float moneyPerUnit, @org.jetbrains.annotations.Nullable
    java.lang.Float unitsPerDay, @org.jetbrains.annotations.Nullable
    java.lang.String currencySymbol) {
        super();
    }
    
    public final int getId() {
        return 0;
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
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.dayswithoutracker.domain.model.Gender component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.dayswithoutracker.domain.model.HabitType component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.time.LocalDate component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.time.LocalDateTime component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Float component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Float component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.dayswithoutracker.data.database.entities.UserProfileEntity copy(int id, @org.jetbrains.annotations.NotNull
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