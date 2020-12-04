package design.mode.observer.framework;

import io.micronaut.context.event.ApplicationEventPublisher;
import io.micronaut.runtime.event.annotation.EventListener;
import lombok.extern.slf4j.Slf4j;

import javax.annotation.Nonnull;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
@Slf4j
public class Sender implements ApplicationEventPublisher {
    @Inject
    ApplicationEventPublisher publisher;

    @Override
    public void publishEvent(@Nonnull Object event) {
        publisher.publishEvent(event);
    }

    @EventListener
    public void customerListener(Message event){
        log.info("sender received event {}-{}-{}",event.msg,event.phone,event.username);
    }
}
