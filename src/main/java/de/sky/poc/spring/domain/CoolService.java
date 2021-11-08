package de.sky.poc.spring.domain;

import org.springframework.stereotype.Service;

@Service
public class CoolService {

    private static final String GREETING_MESSAGE = "Cool Greeting Message!";

    public String getGreetingMessage() {
        return GREETING_MESSAGE;
    }
}
