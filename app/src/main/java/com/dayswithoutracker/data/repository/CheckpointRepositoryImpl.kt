package com.dayswithoutracker.data.repository

import com.dayswithoutracker.data.database.dao.CheckpointDao
import com.dayswithoutracker.data.database.entities.CheckpointEntity
import com.dayswithoutracker.domain.model.Checkpoint
import com.dayswithoutracker.domain.model.Gender
import com.dayswithoutracker.domain.model.HabitType
import com.dayswithoutracker.domain.repository.CheckpointRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Реализация репозитория для работы с чек-поинтами
 */
@Singleton
class CheckpointRepositoryImpl @Inject constructor(
    private val checkpointDao: CheckpointDao
) : CheckpointRepository {
    
    override fun getCheckpoints(gender: Gender, habitType: HabitType): Flow<List<Checkpoint>> {
        return checkpointDao.getCheckpoints(gender, habitType).map { entities ->
            entities.map { entity ->
                Checkpoint(
                    dayNumber = entity.dayNumber,
                    description = entity.description
                )
            }
        }
    }
    
    override suspend fun getCheckpointsOnce(gender: Gender, habitType: HabitType): List<Checkpoint> {
        return checkpointDao.getCheckpointsOnce(gender, habitType).map { entity ->
            Checkpoint(
                dayNumber = entity.dayNumber,
                description = entity.description
            )
        }
    }
    
    override suspend fun initializeCheckpoints() {
        if (isCheckpointsInitialized()) return
        
        val checkpoints = mutableListOf<CheckpointEntity>()
        
        // Мужчины - Не пью
        checkpoints.addAll(listOf(
            CheckpointEntity(gender = Gender.MALE, habitType = HabitType.NO_DRINKING, dayNumber = 1, description = "Улучшение качества сна"),
            CheckpointEntity(gender = Gender.MALE, habitType = HabitType.NO_DRINKING, dayNumber = 3, description = "Уменьшение обезвоживания кожи"),
            CheckpointEntity(gender = Gender.MALE, habitType = HabitType.NO_DRINKING, dayNumber = 7, description = "Нормализация сахара в крови"),
            CheckpointEntity(gender = Gender.MALE, habitType = HabitType.NO_DRINKING, dayNumber = 14, description = "Стабилизация настроения"),
            CheckpointEntity(gender = Gender.MALE, habitType = HabitType.NO_DRINKING, dayNumber = 30, description = "Начало регенерации печени"),
            CheckpointEntity(gender = Gender.MALE, habitType = HabitType.NO_DRINKING, dayNumber = 60, description = "Укрепление иммунитета"),
            CheckpointEntity(gender = Gender.MALE, habitType = HabitType.NO_DRINKING, dayNumber = 72, description = "Полное восстановление сперматозоидов"),
            CheckpointEntity(gender = Gender.MALE, habitType = HabitType.NO_DRINKING, dayNumber = 150, description = "Снижение нагрузки на сердечно-сосудистую систему"),
            CheckpointEntity(gender = Gender.MALE, habitType = HabitType.NO_DRINKING, dayNumber = 180, description = "Улучшение когнитивных функций"),
            CheckpointEntity(gender = Gender.MALE, habitType = HabitType.NO_DRINKING, dayNumber = 365, description = "1 год без алкоголя – основной рубеж здоровья")
        ))
        
        // Женщины - Не пью
        checkpoints.addAll(listOf(
            CheckpointEntity(gender = Gender.FEMALE, habitType = HabitType.NO_DRINKING, dayNumber = 1, description = "Восстановление уровня гидратации"),
            CheckpointEntity(gender = Gender.FEMALE, habitType = HabitType.NO_DRINKING, dayNumber = 3, description = "Улучшение цвета лица"),
            CheckpointEntity(gender = Gender.FEMALE, habitType = HabitType.NO_DRINKING, dayNumber = 7, description = "Повышение уровня энергии"),
            CheckpointEntity(gender = Gender.FEMALE, habitType = HabitType.NO_DRINKING, dayNumber = 14, description = "Улучшение сна"),
            CheckpointEntity(gender = Gender.FEMALE, habitType = HabitType.NO_DRINKING, dayNumber = 30, description = "Восстановление гормонального баланса"),
            CheckpointEntity(gender = Gender.FEMALE, habitType = HabitType.NO_DRINKING, dayNumber = 60, description = "Улучшение обмена веществ"),
            CheckpointEntity(gender = Gender.FEMALE, habitType = HabitType.NO_DRINKING, dayNumber = 72, description = "Регуляризация цикла"),
            CheckpointEntity(gender = Gender.FEMALE, habitType = HabitType.NO_DRINKING, dayNumber = 150, description = "Повышение плотности костей"),
            CheckpointEntity(gender = Gender.FEMALE, habitType = HabitType.NO_DRINKING, dayNumber = 180, description = "Стабилизация эмоционального фона"),
            CheckpointEntity(gender = Gender.FEMALE, habitType = HabitType.NO_DRINKING, dayNumber = 365, description = "1 год без алкоголя – основной рубеж здоровья")
        ))
        
        // Мужчины - Не курю
        checkpoints.addAll(listOf(
            CheckpointEntity(gender = Gender.MALE, habitType = HabitType.NO_SMOKING, dayNumber = 1, description = "Снижение уровня никотина в крови"),
            CheckpointEntity(gender = Gender.MALE, habitType = HabitType.NO_SMOKING, dayNumber = 3, description = "Улучшение обоняния и вкуса"),
            CheckpointEntity(gender = Gender.MALE, habitType = HabitType.NO_SMOKING, dayNumber = 7, description = "Снижение кашля, начало восстановления лёгочной функции"),
            CheckpointEntity(gender = Gender.MALE, habitType = HabitType.NO_SMOKING, dayNumber = 21, description = "Стабилизация артериального давления"),
            CheckpointEntity(gender = Gender.MALE, habitType = HabitType.NO_SMOKING, dayNumber = 30, description = "Улучшение кровообращения"),
            CheckpointEntity(gender = Gender.MALE, habitType = HabitType.NO_SMOKING, dayNumber = 60, description = "Сокращение накопления бляшек в сосудах"),
            CheckpointEntity(gender = Gender.MALE, habitType = HabitType.NO_SMOKING, dayNumber = 90, description = "Увеличение жизненной ёмкости лёгких"),
            CheckpointEntity(gender = Gender.MALE, habitType = HabitType.NO_SMOKING, dayNumber = 180, description = "Значительное снижение риска инфаркта"),
            CheckpointEntity(gender = Gender.MALE, habitType = HabitType.NO_SMOKING, dayNumber = 270, description = "Снижение долгосрочного риска онкологии"),
            CheckpointEntity(gender = Gender.MALE, habitType = HabitType.NO_SMOKING, dayNumber = 365, description = "1 год без курения – критический рубеж восстановления лёгких")
        ))
        
        // Женщины - Не курю
        checkpoints.addAll(listOf(
            CheckpointEntity(gender = Gender.FEMALE, habitType = HabitType.NO_SMOKING, dayNumber = 1, description = "Нормализация частоты сердцебиения"),
            CheckpointEntity(gender = Gender.FEMALE, habitType = HabitType.NO_SMOKING, dayNumber = 3, description = "Улучшение обоняния"),
            CheckpointEntity(gender = Gender.FEMALE, habitType = HabitType.NO_SMOKING, dayNumber = 7, description = "Улучшение функции лёгких"),
            CheckpointEntity(gender = Gender.FEMALE, habitType = HabitType.NO_SMOKING, dayNumber = 21, description = "Снижение уровня стресса"),
            CheckpointEntity(gender = Gender.FEMALE, habitType = HabitType.NO_SMOKING, dayNumber = 30, description = "Улучшение цвета кожи"),
            CheckpointEntity(gender = Gender.FEMALE, habitType = HabitType.NO_SMOKING, dayNumber = 60, description = "Повышение прочности ногтей"),
            CheckpointEntity(gender = Gender.FEMALE, habitType = HabitType.NO_SMOKING, dayNumber = 90, description = "Укрепление иммунитета"),
            CheckpointEntity(gender = Gender.FEMALE, habitType = HabitType.NO_SMOKING, dayNumber = 180, description = "Снижение риска осложнений при беременности"),
            CheckpointEntity(gender = Gender.FEMALE, habitType = HabitType.NO_SMOKING, dayNumber = 270, description = "Улучшение качества волос"),
            CheckpointEntity(gender = Gender.FEMALE, habitType = HabitType.NO_SMOKING, dayNumber = 365, description = "1 год без курения – критический рубеж восстановления")
        ))
        
        checkpointDao.insertCheckpoints(checkpoints)
    }
    
    override suspend fun isCheckpointsInitialized(): Boolean {
        return checkpointDao.getCheckpointsCount() > 0
    }
}

