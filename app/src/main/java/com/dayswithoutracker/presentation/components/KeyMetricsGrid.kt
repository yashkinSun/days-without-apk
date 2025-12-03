package com.dayswithoutracker.presentation.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.dayswithoutracker.domain.model.MoneySaved

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
@Composable
fun KeyMetricsGrid(
    days: Int,
    hours: Int,
    progressPercent: Float,
    achievedCount: Int,
    totalCount: Int,
    moneySaved: MoneySaved?,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        // Первая строка: Дни и Прогресс
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            MetricCard(
                icon = Icons.Default.DateRange,
                label = "Дней без привычки",
                value = "$days д. $hours ч.",
                modifier = Modifier.weight(1f)
            )
            
            MetricCard(
                icon = Icons.Default.ThumbUp,
                label = "Прогресс до года",
                value = "${progressPercent.toInt()}%",
                modifier = Modifier.weight(1f)
            )
        }
        
        // Вторая строка: Деньги (если есть) и Достижения
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            if (moneySaved != null) {
                MetricCard(
                    icon = Icons.Default.Star,
                    label = "Сэкономлено",
                    value = "${moneySaved.currencySymbol}${String.format("%.1f", moneySaved.amount)}",
                    modifier = Modifier.weight(1f)
                )
            } else {
                MetricCard(
                    icon = Icons.Default.Star,
                    label = "Сэкономлено",
                    value = "Не настроено",
                    modifier = Modifier.weight(1f)
                )
            }
            
            MetricCard(
                icon = Icons.Default.Check,
                label = "Достижения",
                value = "$achievedCount/$totalCount",
                modifier = Modifier.weight(1f)
            )
        }
    }
}

/**
 * Карточка метрики
 */
@Composable
private fun MetricCard(
    icon: ImageVector,
    label: String,
    value: String,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier,
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            Icon(
                imageVector = icon,
                contentDescription = null,
                tint = MaterialTheme.colorScheme.primary,
                modifier = Modifier.size(24.dp)
            )
            
            Text(
                text = label,
                style = MaterialTheme.typography.bodySmall,
                color = MaterialTheme.colorScheme.onSurfaceVariant,
                textAlign = TextAlign.Center,
                maxLines = 1
            )
            
            Text(
                text = value,
                style = MaterialTheme.typography.titleMedium,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.primary,
                textAlign = TextAlign.Center
            )
        }
    }
}
