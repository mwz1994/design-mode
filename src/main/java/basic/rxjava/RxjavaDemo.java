package basic.rxjava;


import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import lombok.extern.slf4j.Slf4j;

/**
 * @author aspirin
 * @version 1.0
 * @date 2022/1/17 18:30
 */
@Slf4j
public class RxjavaDemo {
    public static void main(String[] args) throws InterruptedException {
        log.info("开始程序");
        Observable novel = Observable.create(new ObservableOnSubscribe<String>() {
            @Override
            public void subscribe(@NonNull ObservableEmitter<String> emitter) throws Exception {
                emitter.onNext("连载1");
                emitter.onNext("连载2");
                emitter.onNext("连载3");
                emitter.onComplete();
            }
        });
        log.info("被观察者创建完毕");

        Observer<String> reader = new Observer<String>() {

            Disposable mDisposable;

            @Override
            public void onSubscribe(@NonNull Disposable d) {
                mDisposable = d;
                log.info("on subscribe");
            }

            @Override
            public void onNext(@NonNull String s) {
                log.info("{} disposable next {}",s,mDisposable.isDisposed());
                if ("连载2".equals(s)){
//                    mDisposable.dispose();
                    return;
                }
                log.info("onNext : "+s);
            }

            @Override
            public void onError(@NonNull Throwable e) {
                log.error("onError="+e.getMessage());
            }

            @Override
            public void onComplete() {
                log.info("onComplete");
            }
        };

        Thread.sleep(5000);
        novel.subscribe(reader);
    }
}
