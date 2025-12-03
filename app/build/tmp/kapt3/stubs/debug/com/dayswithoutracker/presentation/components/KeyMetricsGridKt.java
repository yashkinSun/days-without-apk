package com.dayswithoutracker.presentation.components;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001aD\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007\u001a*\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0003\u00a8\u0006\u0013"}, d2 = {"KeyMetricsGrid", "", "days", "", "hours", "progressPercent", "", "achievedCount", "totalCount", "moneySaved", "Lcom/dayswithoutracker/domain/model/MoneySaved;", "modifier", "Landroidx/compose/ui/Modifier;", "MetricCard", "icon", "Landroidx/compose/ui/graphics/vector/ImageVector;", "label", "", "value", "app_debug"})
public final class KeyMetricsGridKt {
    
    /**
     * Сетка ключевых показателей 2x2
     *
     * @param days количество дней без привычки
     * @param hours количество часов (дополнительно к дням)
     * @param progressPercent процент прогресса до года
     * @param achievedCount количество достигнутых чек-поинтов
     * @param totalCount общее количество чек-поинтов
     * @param moneySaved данные о сэкономленных деньгах (может быть null)
     * @param modifier модификатор для кастомизации
     */
    @androidx.compose.runtime.Composable
    public static final void KeyMetricsGrid(int days, int hours, float progressPercent, int achievedCount, int totalCount, @org.jetbrains.annotations.Nullable
    com.dayswithoutracker.domain.model.MoneySaved moneySaved, @org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier) {
    }
    
    /**
     * Карточка метрики
     */
    @androidx.compose.runtime.Composable
    private static final void MetricCard(androidx.compose.ui.graphics.vector.ImageVector icon, java.lang.String label, java.lang.String value, androidx.compose.ui.Modifier modifier) {
    }
}