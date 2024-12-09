package cz.dejfcold.deploy.app

import jakarta.transaction.Transactional
import org.springframework.stereotype.Service

@Service
class AppService(
    private val repository: AppRepository,
) {
    fun findClicks(): AppResponseDto {
        val count = repository.count()
        return AppResponseDto(count)
    }

    @Transactional
    fun createClick(): AppModel {
        val model = AppModel()
        return repository.save(model)
    }
}