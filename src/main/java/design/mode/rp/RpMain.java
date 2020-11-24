package design.mode.rp;

import io.reactivex.Observable;
import io.reactivex.observables.ConnectableObservable;

public class RpMain {
    public static void main(String[] args) {
//        simple stream
//        createDemo();
//        hot stream
        connectableObservableDemo();
    }

    private static void connectableObservableDemo() {
        ConnectableObservable<String> observable = Observable.just("alpha","beta","gamma","delta","epsilon").publish();
        observable.subscribe(s -> System.out.println("observer 1: "+s));
        observable.subscribe(s -> System.out.println("observer 2: "+s));
        observable.map(s->s.length()).subscribe(s-> System.out.println("length : "+s));
        observable.connect();
    }

    private static void createDemo() {
        Observable<String> myStrings = Observable.create(emitter -> {
            emitter.onNext("apple");
            emitter.onNext("bear");
            emitter.onNext("change");
            emitter.onComplete();
        });
        myStrings.subscribe(s-> System.out.println(s));
    }

    private static void simpleDemo() {
        Observable<String> myStrings = Observable.just("alpha","beta","gamma","delta","epsilon");
        myStrings.map(s -> s.length()).subscribe(s-> System.out.println(s));
    }
}
