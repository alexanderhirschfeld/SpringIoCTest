package com.example.demo;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.ZonedDateTime;
import java.util.UUID;

@Component
public class SingletonComponent {
    private UUID uuid;
    private ZonedDateTime dateTime;
    private String message;

    @PostConstruct
    void init() {
        this.uuid = UUID.randomUUID();
        this.dateTime = ZonedDateTime.now();
        this.message = "";
    }

    public Message getMessage() {
        return new Message(this.uuid, this.dateTime, this.message);
    }

    public void setMessage(final String message) {
        this.message = message;
    }
}
