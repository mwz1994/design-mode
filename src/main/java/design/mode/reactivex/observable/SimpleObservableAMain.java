package design.mode.reactivex.observable;

import io.reactivex.Observable;
import io.reactivex.observables.ConnectableObservable;

import java.util.Map;

public class SimpleObservableAMain {
    public static void main(String[] args) throws InterruptedException {
//        simple stream
        createDemo();
//        hot stream
//        connectableObservableDemo();
    }



    private static void connectableObservableDemo() throws InterruptedException {
        ConnectableObservable<String> observable = Observable.just("alpha","beta","gamma","delta","epsilon").publish();
        observable.subscribe(s -> System.out.println("observer 1: "+s));
        observable.subscribe(s -> System.out.println("observer 2: "+s));
        observable.map(s->s.length()).subscribe(s-> System.out.println("length : "+s));
        observable.connect();
    }

    private static void createDemo() {
        Observable<Map<String,String>> myStrings = Observable.create(emitter -> {
            emitter.onNext(Map.of("apple","red"));
            emitter.onNext(Map.of("banana","yellow"));
            emitter.onNext(Map.of("watermelon","green"));
            emitter.onNext(Map.of("orange","orange"));
            emitter.onComplete();
        });
        myStrings.subscribe(s->singlePrint(s));
    }

    private static void singlePrint(Map<String,String> map) {
        System.out.println(map);
    }

    private static void simpleDemo() {
        Observable<String> myStrings = Observable.just("alpha","beta","gamma","delta","epsilon");
        myStrings.map(s -> s.length()).subscribe(s-> System.out.println(s));
    }
}
