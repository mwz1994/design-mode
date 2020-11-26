package design.mode.reactivex.observable;


import io.reactivex.Observable;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public class SimpleReactiveDemo {

    public static void main(String[] args) {
        Observable<String> switcherA = Observable.just("on", "off", "on", "on");
        Observable<String> switcherB = Observable.create(emitter -> {
            emitter.onNext("on");
            emitter.onNext("off");
            emitter.onNext("off");
            emitter.onNext("on");
            emitter.onComplete();
        });

        Subscriber lightA = new Subscriber<String>() {
            @Override
            public void onSubscribe(Subscription s) {
            }
            @Override
            public void onNext(String o) {
                System.out.println("lightA handle : " + o);
            }
            @Override
            public void onError(Throwable t) {
            }
            @Override
            public void onComplete() {
                System.out.println("lightA complete subscription");
            }
        };
    }

}
