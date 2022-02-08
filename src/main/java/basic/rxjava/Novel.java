package basic.rxjava;

import io.reactivex.Observable;
import io.reactivex.Observer;

/**
 * @author  aspirin
 * @date  2022/1/25 11:23
 * @version 1.0
 */
public class Novel extends Observable<String> {


    @Override
    protected void subscribeActual(Observer<? super String> observer) {

    }
}
