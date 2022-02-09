package design.pattern;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import javax.inject.Inject;

/**
 * @author aspirin
 * @version 1.0
 * @date 2022/2/8 16:10
 */
@Controller("/design-mode/pattern")
public class PatternController {
    @Inject
    IBankGateway bankGatewayV2;

    @Get("/di")
    HttpResponse DI(){
        System.out.println("handler di request");
//        Processor processor = new Processor();
        ProcessorV2 processorV2 = new ProcessorV2(bankGatewayV2);
        processorV2.process();
        return HttpResponse.ok();
    }
}
