package design.mode.reactivex.observable.rxjava;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class ObserverRxjava implements Observer {
    Observable observable;

    ObserverRxjava(Observable observable){
        this.observable= observable;
    }

    @Override
    public void onSubscribe(Disposable d) {
        System.out.println("observer a on subscribe");
    }

    @Override
    public void onNext(Object o) {
        System.out.println("observer a on next : "+o);
    }

    @Override
    public void onError(Throwable e) {
    }

    @Override
    public void onComplete() {
        System.out.println("observer a complete");
    }
}
