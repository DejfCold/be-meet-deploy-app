package cz.dejfcold.deploy.app

import org.springframework.data.repository.CrudRepository
import java.util.UUID

interface AppRepository: CrudRepository<AppModel, UUID>