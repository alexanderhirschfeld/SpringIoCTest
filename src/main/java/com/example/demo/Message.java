package com.example.demo;

import java.time.ZonedDateTime;
import java.util.UUID;

public class Message {
    private final UUID uuid;
    private final ZonedDateTime dateTime;
    private final String message;

    public Message(final UUID uuid, final ZonedDateTime dateTime, final String message) {
        this.uuid = uuid;
        this.dateTime = dateTime;
        this.message = message;
    }

    public UUID getUuid() {
        return this.uuid;
    }

    public ZonedDateTime getDateTime() {
        return this.dateTime;
    }

    public String getMessage() {
        return this.message;
    }
}
