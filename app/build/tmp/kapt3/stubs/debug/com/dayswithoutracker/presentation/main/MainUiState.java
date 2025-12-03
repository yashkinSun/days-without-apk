package com.dayswithoutracker.presentation.main;

/**
 * UI состояние для главного экрана
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b$\b\u0086\b\u0018\u00002\u00020\u0001Bm\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\u0014J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010)\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\t\u0010+\u001a\u00020\tH\u00c6\u0003J\t\u0010,\u001a\u00020\u000bH\u00c6\u0003J\u000f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u00c6\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003J\t\u0010/\u001a\u00020\u0012H\u00c6\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\tH\u00c6\u0003Jq\u00101\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\tH\u00c6\u0001J\u0013\u00102\u001a\u00020\u00122\b\u00103\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00104\u001a\u00020\u0005H\u00d6\u0001J\t\u00105\u001a\u00020\tH\u00d6\u0001R\u0011\u0010\u0015\u001a\u00020\u00058F\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0011\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010 R\u0011\u0010!\u001a\u00020\u00128F\u00a2\u0006\u0006\u001a\u0004\b!\u0010 R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\'\u00a8\u00066"}, d2 = {"Lcom/dayswithoutracker/presentation/main/MainUiState;", "", "userProfile", "Lcom/dayswithoutracker/domain/model/UserProfile;", "daysSinceStart", "", "detailedTime", "Lcom/dayswithoutracker/domain/usecase/DetailedTime;", "formattedTimeText", "", "progress", "", "checkpoints", "", "Lcom/dayswithoutracker/domain/model/Checkpoint;", "moneySaved", "Lcom/dayswithoutracker/domain/model/MoneySaved;", "isLoading", "", "error", "(Lcom/dayswithoutracker/domain/model/UserProfile;ILcom/dayswithoutracker/domain/usecase/DetailedTime;Ljava/lang/String;FLjava/util/List;Lcom/dayswithoutracker/domain/model/MoneySaved;ZLjava/lang/String;)V", "achievedCheckpoints", "getAchievedCheckpoints", "()I", "getCheckpoints", "()Ljava/util/List;", "getDaysSinceStart", "getDetailedTime", "()Lcom/dayswithoutracker/domain/usecase/DetailedTime;", "getError", "()Ljava/lang/String;", "getFormattedTimeText", "()Z", "isYearCompleted", "getMoneySaved", "()Lcom/dayswithoutracker/domain/model/MoneySaved;", "getProgress", "()F", "getUserProfile", "()Lcom/dayswithoutracker/domain/model/UserProfile;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "app_debug"})
public final class MainUiState {
    @org.jetbrains.annotations.Nullable
    private final com.dayswithoutracker.domain.model.UserProfile userProfile = null;
    private final int daysSinceStart = 0;
    @org.jetbrains.annotations.Nullable
    private final com.dayswithoutracker.domain.usecase.DetailedTime detailedTime = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String formattedTimeText = null;
    private final float progress = 0.0F;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.dayswithoutracker.domain.model.Checkpoint> checkpoints = null;
    @org.jetbrains.annotations.Nullable
    private final com.dayswithoutracker.domain.model.MoneySaved moneySaved = null;
    private final boolean isLoading = false;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String error = null;
    
    public MainUiState(@org.jetbrains.annotations.Nullable
    com.dayswithoutracker.domain.model.UserProfile userProfile, int daysSinceStart, @org.jetbrains.annotations.Nullable
    com.dayswithoutracker.domain.usecase.DetailedTime detailedTime, @org.jetbrains.annotations.NotNull
    java.lang.String formattedTimeText, float progress, @org.jetbrains.annotations.NotNull
    java.util.List<com.dayswithoutracker.domain.model.Checkpoint> checkpoints, @org.jetbrains.annotations.Nullable
    com.dayswithoutracker.domain.model.MoneySaved moneySaved, boolean isLoading, @org.jetbrains.annotations.Nullable
    java.lang.String error) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.dayswithoutracker.domain.model.UserProfile getUserProfile() {
        return null;
    }
    
    public final int getDaysSinceStart() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.dayswithoutracker.domain.usecase.DetailedTime getDetailedTime() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getFormattedTimeText() {
        return null;
    }
    
    public final float getProgress() {
        return 0.0F;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.dayswithoutracker.domain.model.Checkpoint> getCheckpoints() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.dayswithoutracker.domain.model.MoneySaved getMoneySaved() {
        return null;
    }
    
    public final boolean isLoading() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getError() {
        return null;
    }
    
    public final boolean isYearCompleted() {
        return false;
    }
    
    public final int getAchievedCheckpoints() {
        return 0;
    }
    
    public MainUiState() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.dayswithoutracker.domain.model.UserProfile component1() {
        return null;
    }
    
    public final int component2() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.dayswithoutracker.domain.usecase.DetailedTime component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component4() {
        return null;
    }
    
    public final float component5() {
        return 0.0F;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.dayswithoutracker.domain.model.Checkpoint> component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.dayswithoutracker.domain.model.MoneySaved component7() {
        return null;
    }
    
    public final boolean component8() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.dayswithoutracker.presentation.main.MainUiState copy(@org.jetbrains.annotations.Nullable
    com.dayswithoutracker.domain.model.UserProfile userProfile, int daysSinceStart, @org.jetbrains.annotations.Nullable
    com.dayswithoutracker.domain.usecase.DetailedTime detailedTime, @org.jetbrains.annotations.NotNull
    java.lang.String formattedTimeText, float progress, @org.jetbrains.annotations.NotNull
    java.util.List<com.dayswithoutracker.domain.model.Checkpoint> checkpoints, @org.jetbrains.annotations.Nullable
    com.dayswithoutracker.domain.model.MoneySaved moneySaved, boolean isLoading, @org.jetbrains.annotations.Nullable
    java.lang.String error) {
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