package design.mode.reactivex.observable.rxjava;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class ReactiveDemo {

    public static void main(String[] args) {
        Observable<String> switcher = Observable.just("on", "off", "on", "on");

        Observable<String> switcherB = Observable.create(emitter -> {
            emitter.onNext("on");
            emitter.onNext("off");
            emitter.onNext("off");
            emitter.onNext("on");
            emitter.onComplete();
        });

        Observer lightA = new Observer() {
            @Override
            public void onSubscribe(Disposable d) {
            }
            @Override
            public void onNext(Object o) {
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

        switcher.subscribe(lightA);
    }
}
