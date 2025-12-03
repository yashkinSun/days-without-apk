package com.dayswithoutracker.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.dayswithoutracker.R
import com.dayswithoutracker.domain.model.Checkpoint
import com.dayswithoutracker.presentation.theme.CheckpointAchieved
import com.dayswithoutracker.presentation.theme.CheckpointPending

/**
 * Компонент для отображения чек-поинта с современными иконками
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
            // Иконка золотого щита слева
            Image(
                painter = painterResource(id = R.drawable.achievement_shield),
                contentDescription = "Achievement Shield",
                modifier = Modifier.size(48.dp),
                contentScale = ContentScale.Fit
            )
            
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
            
            Spacer(modifier = Modifier.width(16.dp))
            
            // Иконка статуса справа (замок или галочка)
            if (checkpoint.isAchieved) {
                Image(
                    painter = painterResource(id = R.drawable.achievement_check),
                    contentDescription = "Achievement Completed",
                    modifier = Modifier.size(32.dp),
                    contentScale = ContentScale.Fit
                )
            } else {
                Image(
                    painter = painterResource(id = R.drawable.achievement_lock),
                    contentDescription = "Achievement Locked",
                    modifier = Modifier.size(32.dp),
                    contentScale = ContentScale.Fit
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

