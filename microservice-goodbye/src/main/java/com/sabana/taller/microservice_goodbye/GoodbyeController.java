package com.sabana.taller.microservice_goodbye;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GoodbyeController {

    @GetMapping("/goodbye")
    public String sayGoodbye() {
        return "Adiós a todos desde una nueva versión 5";
    }
}
