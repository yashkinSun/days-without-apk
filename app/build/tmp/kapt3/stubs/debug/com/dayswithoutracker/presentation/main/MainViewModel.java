package com.dayswithoutracker.presentation.main;

/**
 * ViewModel для главного экрана
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0015H\u0002J\u0006\u0010\u0019\u001a\u00020\u0015J\b\u0010\u001a\u001a\u00020\u0015H\u0002J\u0010\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006\u001c"}, d2 = {"Lcom/dayswithoutracker/presentation/main/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "getUserProfileUseCase", "Lcom/dayswithoutracker/domain/usecase/GetUserProfileUseCase;", "getCheckpointsWithProgressUseCase", "Lcom/dayswithoutracker/domain/usecase/GetCheckpointsWithProgressUseCase;", "calculateDaysUseCase", "Lcom/dayswithoutracker/domain/usecase/CalculateDaysUseCase;", "calculateDetailedTimeUseCase", "Lcom/dayswithoutracker/domain/usecase/CalculateDetailedTimeUseCase;", "calculateMoneySavedUseCase", "Lcom/dayswithoutracker/domain/usecase/CalculateMoneySavedUseCase;", "(Lcom/dayswithoutracker/domain/usecase/GetUserProfileUseCase;Lcom/dayswithoutracker/domain/usecase/GetCheckpointsWithProgressUseCase;Lcom/dayswithoutracker/domain/usecase/CalculateDaysUseCase;Lcom/dayswithoutracker/domain/usecase/CalculateDetailedTimeUseCase;Lcom/dayswithoutracker/domain/usecase/CalculateMoneySavedUseCase;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/dayswithoutracker/presentation/main/MainUiState;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "loadCheckpoints", "", "userProfile", "Lcom/dayswithoutracker/domain/model/UserProfile;", "observeUserProfile", "refreshData", "startTimeUpdater", "updateTimeData", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.dayswithoutracker.domain.usecase.GetUserProfileUseCase getUserProfileUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final com.dayswithoutracker.domain.usecase.GetCheckpointsWithProgressUseCase getCheckpointsWithProgressUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final com.dayswithoutracker.domain.usecase.CalculateDaysUseCase calculateDaysUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final com.dayswithoutracker.domain.usecase.CalculateDetailedTimeUseCase calculateDetailedTimeUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final com.dayswithoutracker.domain.usecase.CalculateMoneySavedUseCase calculateMoneySavedUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<com.dayswithoutracker.presentation.main.MainUiState> _uiState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.dayswithoutracker.presentation.main.MainUiState> uiState = null;
    
    @javax.inject.Inject
    public MainViewModel(@org.jetbrains.annotations.NotNull
    com.dayswithoutracker.domain.usecase.GetUserProfileUseCase getUserProfileUseCase, @org.jetbrains.annotations.NotNull
    com.dayswithoutracker.domain.usecase.GetCheckpointsWithProgressUseCase getCheckpointsWithProgressUseCase, @org.jetbrains.annotations.NotNull
    com.dayswithoutracker.domain.usecase.CalculateDaysUseCase calculateDaysUseCase, @org.jetbrains.annotations.NotNull
    com.dayswithoutracker.domain.usecase.CalculateDetailedTimeUseCase calculateDetailedTimeUseCase, @org.jetbrains.annotations.NotNull
    com.dayswithoutracker.domain.usecase.CalculateMoneySavedUseCase calculateMoneySavedUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.dayswithoutracker.presentation.main.MainUiState> getUiState() {
        return null;
    }
    
    private final void observeUserProfile() {
    }
    
    private final void updateTimeData(com.dayswithoutracker.domain.model.UserProfile userProfile) {
    }
    
    private final void startTimeUpdater() {
    }
    
    private final void loadCheckpoints(com.dayswithoutracker.domain.model.UserProfile userProfile) {
    }
    
    public final void refreshData() {
    }
}