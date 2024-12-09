package cz.dejfcold.deploy.app

import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Value
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/clicks")
class AppController(
    private val appService: AppService,
    @Value("\${spring.application.name}")
    private val appName: String,
) {
    private val log = LoggerFactory.getLogger(AppController::class.java)

    init {
        log.info("App Controller initialized with name $appName")
    }

    @GetMapping()
    fun findClicks(): AppResponseDto {

        log.info("Got GET app clicks")

        return appService.findClicks()
    }

    @PostMapping
    fun createClick(): ResponseEntity<Unit> {
        log.info("Got POST app clicks")

        appService.createClick()

        log.info("Created POST app clicks")
        return ResponseEntity.noContent().build()
    }
}