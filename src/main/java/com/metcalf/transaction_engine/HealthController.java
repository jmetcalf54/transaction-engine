package com.metcalf.transaction_engine;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping("/health")
    public String health(){
        return "transaction-engine is running";
    }
}
