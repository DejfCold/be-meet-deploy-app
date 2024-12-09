package cz.dejfcold.deploy.app

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.time.LocalDateTime
import java.util.UUID

data class AppResponseDto(val size: Long)

@Entity
@Table(name = "click")
data class AppModel(
    @Column(name = "created_at", nullable = false)
    var createdAt: LocalDateTime? = LocalDateTime.now(),
) {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", nullable = false)
    var id: UUID? = null
}
