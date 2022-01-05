package basic.netty.callback;

/**
 * @author aspirin
 * @version 1.0
 * @date 2022/1/4 15:21
 */
public interface Fetcher {
    void fetchData(FetcherCallback callback);
}
