package br.com.danepic.springlisteners.event.listener;

import br.com.danepic.springlisteners.event.CustomEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
public class CustomSpringListener implements ApplicationListener<CustomEvent> {
    @Override
    public void onApplicationEvent(CustomEvent event) {
        try {
            TimeUnit.SECONDS.sleep(event.getSeconds());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Receiving custom event - " + event.getMessage());
    }
}
