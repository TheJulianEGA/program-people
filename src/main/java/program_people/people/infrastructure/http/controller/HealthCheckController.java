package program_people.people.infrastructure.http.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/health")
public class HealthCheckController {
    @GetMapping
    public ResponseEntity<Void> checkHealth() {
        return ResponseEntity.ok().build();
    }
}
