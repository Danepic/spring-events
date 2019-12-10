package br.com.danepic.springlisteners.event;

import lombok.Getter;
import org.springframework.context.ApplicationEvent;

public class CustomEvent extends ApplicationEvent {

    @Getter
    private String message;

    @Getter
    private Integer seconds;

    public CustomEvent(Object source, String message, Integer seconds) {
        super(source);
        this.seconds = seconds;
        this.message = message;
    }
}
