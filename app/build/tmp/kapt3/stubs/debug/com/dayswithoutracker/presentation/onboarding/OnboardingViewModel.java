package com.dayswithoutracker.presentation.onboarding;

/**
 * ViewModel для экрана онбординга
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u000fJ\u000e\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0019J\u000e\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0019J\u000e\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0019R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u001c"}, d2 = {"Lcom/dayswithoutracker/presentation/onboarding/OnboardingViewModel;", "Landroidx/lifecycle/ViewModel;", "saveUserProfileUseCase", "Lcom/dayswithoutracker/domain/usecase/SaveUserProfileUseCase;", "checkpointRepository", "Lcom/dayswithoutracker/domain/repository/CheckpointRepository;", "(Lcom/dayswithoutracker/domain/usecase/SaveUserProfileUseCase;Lcom/dayswithoutracker/domain/repository/CheckpointRepository;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/dayswithoutracker/presentation/onboarding/OnboardingUiState;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "clearError", "", "selectGender", "gender", "Lcom/dayswithoutracker/domain/model/Gender;", "selectHabitType", "habitType", "Lcom/dayswithoutracker/domain/model/HabitType;", "startTracking", "updateCurrencySymbol", "value", "", "updateMoneyPerUnit", "updateUnitsPerDay", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class OnboardingViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.dayswithoutracker.domain.usecase.SaveUserProfileUseCase saveUserProfileUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final com.dayswithoutracker.domain.repository.CheckpointRepository checkpointRepository = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<com.dayswithoutracker.presentation.onboarding.OnboardingUiState> _uiState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.dayswithoutracker.presentation.onboarding.OnboardingUiState> uiState = null;
    
    @javax.inject.Inject
    public OnboardingViewModel(@org.jetbrains.annotations.NotNull
    com.dayswithoutracker.domain.usecase.SaveUserProfileUseCase saveUserProfileUseCase, @org.jetbrains.annotations.NotNull
    com.dayswithoutracker.domain.repository.CheckpointRepository checkpointRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.dayswithoutracker.presentation.onboarding.OnboardingUiState> getUiState() {
        return null;
    }
    
    public final void selectGender(@org.jetbrains.annotations.NotNull
    com.dayswithoutracker.domain.model.Gender gender) {
    }
    
    public final void selectHabitType(@org.jetbrains.annotations.NotNull
    com.dayswithoutracker.domain.model.HabitType habitType) {
    }
    
    public final void startTracking() {
    }
    
    public final void clearError() {
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
}