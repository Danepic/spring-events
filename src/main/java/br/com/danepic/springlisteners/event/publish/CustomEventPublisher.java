package br.com.danepic.springlisteners.event.publish;

import br.com.danepic.springlisteners.event.CustomEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class CustomEventPublisher {

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    public void doSomethingAndPublish(final String message, Integer seconds) {
        System.out.println("Publishing custom event...");

        CustomEvent customEvent = new CustomEvent(this, message, seconds);

        applicationEventPublisher.publishEvent(customEvent);
    }

}
