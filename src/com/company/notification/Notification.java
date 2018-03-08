package com.company.notification;

public abstract class Notification {
    private String message;


    public Notification(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public abstract String getType();
}
