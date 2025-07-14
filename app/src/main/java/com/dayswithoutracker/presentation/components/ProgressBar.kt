package com.dayswithoutracker.presentation.components

import androidx.compose.animation.core.*
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.dp
import com.dayswithoutracker.presentation.theme.CheckpointAchieved
import com.dayswithoutracker.presentation.theme.ProgressBackground

/**
 * Анимированный прогресс-бар с градиентом
 */
@Composable
fun AnimatedProgressBar(
    progress: Float,
    modifier: Modifier = Modifier,
    animationDuration: Int = 2000
) {
    val density = LocalDensity.current
    val animatedProgress by animateFloatAsState(
        targetValue = progress,
        animationSpec = tween(
            durationMillis = animationDuration,
            easing = EaseOutCubic
        ),
        label = "progress_animation"
    )
    
    Canvas(
        modifier = modifier
            .fillMaxWidth()
            .height(24.dp)
    ) {
        drawProgressBar(
            progress = animatedProgress,
            size = size
        )
    }
}

private fun DrawScope.drawProgressBar(
    progress: Float,
    size: Size
) {
    val cornerRadius = size.height / 2
    
    // Фон прогресс-бара
    drawRoundRect(
        color = ProgressBackground,
        size = size,
        cornerRadius = androidx.compose.ui.geometry.CornerRadius(cornerRadius)
    )
    
    // Заполненная часть с градиентом
    if (progress > 0f) {
        val progressWidth = size.width * progress.coerceIn(0f, 1f)
        
        val gradient = Brush.horizontalGradient(
            colors = listOf(
                CheckpointAchieved.copy(alpha = 0.8f),
                CheckpointAchieved,
                CheckpointAchieved.copy(alpha = 0.9f)
            ),
            startX = 0f,
            endX = progressWidth
        )
        
        drawRoundRect(
            brush = gradient,
            size = Size(progressWidth, size.height),
            cornerRadius = androidx.compose.ui.geometry.CornerRadius(cornerRadius)
        )
        
        // Добавляем блеск для эффекта
        if (progress > 0.1f) {
            val shimmerGradient = Brush.horizontalGradient(
                colors = listOf(
                    Color.Transparent,
                    Color.White.copy(alpha = 0.3f),
                    Color.Transparent
                ),
                startX = progressWidth * 0.3f,
                endX = progressWidth * 0.7f
            )
            
            drawRoundRect(
                brush = shimmerGradient,
                size = Size(progressWidth, size.height),
                cornerRadius = androidx.compose.ui.geometry.CornerRadius(cornerRadius)
            )
        }
    }
}

