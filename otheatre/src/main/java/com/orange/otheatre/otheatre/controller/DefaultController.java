package com.orange.otheatre.otheatre.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {

    @RequestMapping(value = "/greeting")
    public String index(@RequestParam String param) {
        return "Greetings from otheatre application" + param;
    }
}
