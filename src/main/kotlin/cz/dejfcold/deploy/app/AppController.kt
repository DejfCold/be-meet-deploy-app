package cz.dejfcold.deploy.app

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/clicks")
class AppController(
    private val appService: AppService
) {
    @GetMapping()
    fun findClicks(): AppResponseDto {
        return appService.findClicks()
    }

    @PostMapping
    fun createClick(): ResponseEntity<Unit> {
        appService.createClick()
        return ResponseEntity.noContent().build()
    }
}