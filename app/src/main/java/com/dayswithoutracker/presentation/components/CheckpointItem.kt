package com.dayswithoutracker.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.dayswithoutracker.R
import com.dayswithoutracker.domain.model.Checkpoint
import com.dayswithoutracker.presentation.theme.CheckpointAchieved
import com.dayswithoutracker.presentation.theme.CheckpointPending

/**
 * Компонент для отображения чек-поинта
 */
@Composable
fun CheckpointItem(
    checkpoint: Checkpoint,
    currentDays: Int,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier.fillMaxWidth(),
        colors = CardDefaults.cardColors(
            containerColor = if (checkpoint.isAchieved) {
                CheckpointAchieved.copy(alpha = 0.1f)
            } else {
                MaterialTheme.colorScheme.surface
            }
        ),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            // Иконка статуса
            Box(
                modifier = Modifier
                    .size(40.dp)
                    .clip(CircleShape)
                    .background(
                        if (checkpoint.isAchieved) CheckpointAchieved else CheckpointPending
                    ),
                contentAlignment = Alignment.Center
            ) {
                if (checkpoint.isAchieved) {
                    Icon(
                        imageVector = Icons.Default.Check,
                        contentDescription = stringResource(R.string.achieved),
                        tint = Color.White,
                        modifier = Modifier.size(24.dp)
                    )
                } else {
                    Text(
                        text = checkpoint.dayNumber.toString(),
                        style = MaterialTheme.typography.labelSmall,
                        color = Color.White,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
            
            Spacer(modifier = Modifier.width(16.dp))
            
            // Информация о чек-поинте
            Column(
                modifier = Modifier.weight(1f)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = if (checkpoint.isAchieved) {
                            stringResource(R.string.achieved)
                        } else {
                            val daysLeft = checkpoint.dayNumber - currentDays
                            stringResource(R.string.in_days, daysLeft)
                        },
                        style = MaterialTheme.typography.labelSmall,
                        color = if (checkpoint.isAchieved) {
                            CheckpointAchieved
                        } else {
                            MaterialTheme.colorScheme.onSurfaceVariant
                        },
                        fontWeight = FontWeight.Medium
                    )
                    
                    Text(
                        text = "${checkpoint.dayNumber} ${getDayText(checkpoint.dayNumber)}",
                        style = MaterialTheme.typography.labelSmall,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }
                
                Spacer(modifier = Modifier.height(4.dp))
                
                Text(
                    text = checkpoint.description,
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.onSurface
                )
            }
        }
    }
}

@Composable
private fun getDayText(days: Int): String {
    return when {
        days % 10 == 1 && days % 100 != 11 -> stringResource(R.string.day_singular)
        else -> stringResource(R.string.days_plural)
    }
}

