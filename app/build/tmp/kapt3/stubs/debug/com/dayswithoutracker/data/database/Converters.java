package com.dayswithoutracker.data.database;

/**
 * Конвертеры для Room базы данных
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0007J\u0014\u0010\n\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0007J\u0014\u0010\r\u001a\u0004\u0018\u00010\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007J\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0004H\u0007J\u0010\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0004H\u0007J\u0014\u0010\u0014\u001a\u0004\u0018\u00010\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004H\u0007J\u0014\u0010\u0016\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0004H\u0007\u00a8\u0006\u0018"}, d2 = {"Lcom/dayswithoutracker/data/database/Converters;", "", "()V", "fromGender", "", "gender", "Lcom/dayswithoutracker/domain/model/Gender;", "fromHabitType", "habitType", "Lcom/dayswithoutracker/domain/model/HabitType;", "fromLocalDate", "date", "Ljava/time/LocalDate;", "fromLocalDateTime", "dateTime", "Ljava/time/LocalDateTime;", "toGender", "genderString", "toHabitType", "habitTypeString", "toLocalDate", "dateString", "toLocalDateTime", "dateTimeString", "app_debug"})
public final class Converters {
    
    public Converters() {
        super();
    }
    
    @androidx.room.TypeConverter
    @org.jetbrains.annotations.Nullable
    public final java.lang.String fromLocalDate(@org.jetbrains.annotations.Nullable
    java.time.LocalDate date) {
        return null;
    }
    
    @androidx.room.TypeConverter
    @org.jetbrains.annotations.Nullable
    public final java.time.LocalDate toLocalDate(@org.jetbrains.annotations.Nullable
    java.lang.String dateString) {
        return null;
    }
    
    @androidx.room.TypeConverter
    @org.jetbrains.annotations.Nullable
    public final java.lang.String fromLocalDateTime(@org.jetbrains.annotations.Nullable
    java.time.LocalDateTime dateTime) {
        return null;
    }
    
    @androidx.room.TypeConverter
    @org.jetbrains.annotations.Nullable
    public final java.time.LocalDateTime toLocalDateTime(@org.jetbrains.annotations.Nullable
    java.lang.String dateTimeString) {
        return null;
    }
    
    @androidx.room.TypeConverter
    @org.jetbrains.annotations.NotNull
    public final java.lang.String fromGender(@org.jetbrains.annotations.NotNull
    com.dayswithoutracker.domain.model.Gender gender) {
        return null;
    }
    
    @androidx.room.TypeConverter
    @org.jetbrains.annotations.NotNull
    public final com.dayswithoutracker.domain.model.Gender toGender(@org.jetbrains.annotations.NotNull
    java.lang.String genderString) {
        return null;
    }
    
    @androidx.room.TypeConverter
    @org.jetbrains.annotations.NotNull
    public final java.lang.String fromHabitType(@org.jetbrains.annotations.NotNull
    com.dayswithoutracker.domain.model.HabitType habitType) {
        return null;
    }
    
    @androidx.room.TypeConverter
    @org.jetbrains.annotations.NotNull
    public final com.dayswithoutracker.domain.model.HabitType toHabitType(@org.jetbrains.annotations.NotNull
    java.lang.String habitTypeString) {
        return null;
    }
}