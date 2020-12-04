package design.mode.observer.framework;

import io.micronaut.context.event.ApplicationEventListener;
import io.micronaut.runtime.event.annotation.EventListener;
import lombok.extern.slf4j.Slf4j;

import javax.inject.Singleton;

@Slf4j
@Singleton
public class Reciever implements ApplicationEventListener<Message> {

    @Override
    public void onApplicationEvent(Message event) {
        log.info("on application event {}-{}-{}",event.msg,event.phone,event.username);
    }

    @EventListener
    public void customerListener(Message event){
        log.info("customer received event {}-{}-{}",event.msg,event.phone,event.username);
    }

}
