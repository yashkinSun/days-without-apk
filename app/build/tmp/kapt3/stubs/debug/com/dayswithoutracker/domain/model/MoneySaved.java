package com.dayswithoutracker.domain.model;

/**
 * Модель данных для отображения сэкономленных денег
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0005H\u00c6\u0003J\'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b\u00a8\u0006\u0017"}, d2 = {"Lcom/dayswithoutracker/domain/model/MoneySaved;", "", "amount", "", "currencySymbol", "", "formattedAmount", "(FLjava/lang/String;Ljava/lang/String;)V", "getAmount", "()F", "getCurrencySymbol", "()Ljava/lang/String;", "getFormattedAmount", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
public final class MoneySaved {
    
    /**
     * Сумма сэкономленных денег
     */
    private final float amount = 0.0F;
    
    /**
     * Символ валюты
     */
    @org.jetbrains.annotations.NotNull
    private final java.lang.String currencySymbol = null;
    
    /**
     * Отформатированная строка для отображения
     */
    @org.jetbrains.annotations.NotNull
    private final java.lang.String formattedAmount = null;
    
    public MoneySaved(float amount, @org.jetbrains.annotations.NotNull
    java.lang.String currencySymbol, @org.jetbrains.annotations.NotNull
    java.lang.String formattedAmount) {
        super();
    }
    
    /**
     * Сумма сэкономленных денег
     */
    public final float getAmount() {
        return 0.0F;
    }
    
    /**
     * Символ валюты
     */
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCurrencySymbol() {
        return null;
    }
    
    /**
     * Отформатированная строка для отображения
     */
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getFormattedAmount() {
        return null;
    }
    
    public final float component1() {
        return 0.0F;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.dayswithoutracker.domain.model.MoneySaved copy(float amount, @org.jetbrains.annotations.NotNull
    java.lang.String currencySymbol, @org.jetbrains.annotations.NotNull
    java.lang.String formattedAmount) {
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