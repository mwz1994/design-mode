package design.mode.observer.framework;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import lombok.extern.slf4j.Slf4j;

import javax.inject.Inject;

@Controller("/design-mode/observer")
@Slf4j
public class FrameworkController {
    @Inject
    Sender sender;

    @Get(value = "/framework")
    public HttpResponse frameworkPublisher(){
        Message msg = new Message("Michael","13012345678","hello");
        sender.publishEvent(msg);
        return HttpResponse.status(HttpStatus.OK).body("SUCCESS");
    }
}
