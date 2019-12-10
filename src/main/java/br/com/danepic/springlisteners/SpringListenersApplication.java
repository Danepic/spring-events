package br.com.danepic.springlisteners;

import br.com.danepic.springlisteners.event.CustomEvent;
import br.com.danepic.springlisteners.event.publish.CustomEventPublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringListenersApplication {

	@Autowired
	private ApplicationEventPublisher applicationEventPublisher;

	@Autowired
	private CustomEventPublisher customEventPublisher;

    public static void main(String[] args) {
        SpringApplication.run(SpringListenersApplication.class, args);
    }

    @Bean
	public ApplicationEventPublisher start(){

    	applicationEventPublisher.publishEvent(new CustomEvent(applicationEventPublisher, "Olá mundo!", 20));

		applicationEventPublisher.publishEvent(new CustomEvent(applicationEventPublisher, "Hello world!", 10));

		applicationEventPublisher.publishEvent(new CustomEvent(applicationEventPublisher, "Hola mundo!", 1));

		customEventPublisher.doSomethingAndPublish("USING COMPONENT", 5);

    	return applicationEventPublisher;
	}

}
