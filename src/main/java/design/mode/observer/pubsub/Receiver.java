package design.mode.observer.pubsub;

import java.util.Map;
import java.util.concurrent.Flow;

public class Receiver implements Flow.Subscriber<Map<String,Object>> {
    private Flow.Subscription subscription;
    private int REQ;

    Receiver(int req){
        this.REQ=req;
    }

    @Override
    public void onSubscribe(Flow.Subscription subscription) {
        this.subscription=subscription;
        this.subscription.request(REQ);
    }

    @Override
    public void onNext(Map<String,Object> item) {
        subscription.request(REQ);
        System.out.println(REQ + " onNext "+ item.toString());
    }

    @Override
    public void onError(Throwable throwable) {
        throwable.printStackTrace();
    }

    @Override
    public void onComplete() {
        System.out.println(REQ + " onComplete");
    }
}
