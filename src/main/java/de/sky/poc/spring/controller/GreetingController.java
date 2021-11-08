package de.sky.poc.spring.controller;

import de.sky.poc.spring.domain.CoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class GreetingController {

    private CoolService coolService;

    @Autowired
    public void setCoolService(CoolService coolService) {
        this.coolService = coolService;
    }

    @GetMapping(produces = MediaType.TEXT_PLAIN_VALUE)
    public String hello() {
        return coolService.getGreetingMessage();
    }
}
