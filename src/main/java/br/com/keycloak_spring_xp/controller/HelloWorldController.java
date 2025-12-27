package br.com.keycloak_spring_xp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("hello-world")
    public String saysHelloWorld() {
        return "Hello World!";
    }
}
