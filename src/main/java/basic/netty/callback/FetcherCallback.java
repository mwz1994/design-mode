package basic.netty.callback;

/**
 * @author aspirin
 * @version 1.0
 * @date 2022/1/4 15:21
 */
public interface FetcherCallback {
    void onData(Data data) throws Exception;
    void onError(Throwable throwable);
}
