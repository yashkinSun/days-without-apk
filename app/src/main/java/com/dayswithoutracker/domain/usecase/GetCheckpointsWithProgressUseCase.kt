package com.dayswithoutracker.domain.usecase

import com.dayswithoutracker.domain.model.Checkpoint
import com.dayswithoutracker.domain.model.Gender
import com.dayswithoutracker.domain.model.HabitType
import com.dayswithoutracker.domain.repository.CheckpointRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import java.time.LocalDate
import java.time.temporal.ChronoUnit
import javax.inject.Inject

/**
 * Use case для получения чек-поинтов с расчетом прогресса
 */
class GetCheckpointsWithProgressUseCase @Inject constructor(
    private val checkpointRepository: CheckpointRepository
) {
    operator fun invoke(
        gender: Gender,
        habitType: HabitType,
        startDate: LocalDate
    ): Flow<List<Checkpoint>> {
        val currentDays = ChronoUnit.DAYS.between(startDate, LocalDate.now()).toInt()
        
        return checkpointRepository.getCheckpoints(gender, habitType).map { checkpoints ->
            checkpoints.map { checkpoint ->
                checkpoint.copy(isAchieved = currentDays >= checkpoint.dayNumber)
            }
        }
    }
}

