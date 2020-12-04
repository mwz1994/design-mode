package design.mode.observer.property;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/design-mode/observer")
public class ObserverController {
//    @Inject
//    PropertySubject propertySubject;

    @Get(value = "/property")
    HttpResponse propertyObserver(){
        System.out.println("start property change event");
        PropertySubject propertySubject = new PropertySubject();
        new PropertyListenerA(propertySubject);
        new PropertyListenerB(propertySubject);
        propertySubject.propertyEventChange();
        return HttpResponse.status(HttpStatus.OK).body("SUCCESS");
    }

}
