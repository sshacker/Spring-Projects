package com.sshacker.tutorialpoint;

import org.springframework.context.ApplicationEvent;

public class CustomEvent extends ApplicationEvent {
    CustomEvent(Object source) {
        super(source);
    }

    @Override
    public String toString() {
        return "My Custom Event";
    }
}
