package design.mode.reactivex.observable.rxjava;

import io.reactivex.Observable;

public class ObserverRxjavaMain {

    public static void main(String[] args) {

        Observable observable = Observable.just("today","is","Friday","jack","busy");

        ObserverRxjava observerRxjava = new ObserverRxjava(observable);

        observable.subscribe(observerRxjava);

    }
}
