package com.sabana.taller.microservice_hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "¡Hola mundo desde una nueva versión 2!";
    }
}
