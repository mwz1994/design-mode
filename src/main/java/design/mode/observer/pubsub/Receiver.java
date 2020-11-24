package design.mode.observer.pubsub;

import java.util.concurrent.Flow;

public class Receiver implements Flow.Subscriber<String> {
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
    public void onNext(String item) {
        subscription.request(REQ);
        System.out.println(REQ + " onNext "+ item);
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
