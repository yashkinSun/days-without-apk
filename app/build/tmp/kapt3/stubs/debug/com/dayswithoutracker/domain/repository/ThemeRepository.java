package com.dayswithoutracker.domain.repository;

/**
 * Репозиторий для работы с настройками темы оформления
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u00a6@\u00a2\u0006\u0002\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/dayswithoutracker/domain/repository/ThemeRepository;", "", "getThemeSetting", "Lkotlinx/coroutines/flow/Flow;", "Lcom/dayswithoutracker/domain/model/ThemeSetting;", "saveThemeSetting", "", "theme", "(Lcom/dayswithoutracker/domain/model/ThemeSetting;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface ThemeRepository {
    
    /**
     * Получить текущую настройку темы
     * @return Flow с текущей темой
     */
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<com.dayswithoutracker.domain.model.ThemeSetting> getThemeSetting();
    
    /**
     * Сохранить настройку темы
     * @param theme выбранная тема
     */
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object saveThemeSetting(@org.jetbrains.annotations.NotNull
    com.dayswithoutracker.domain.model.ThemeSetting theme, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
}