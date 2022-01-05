package basic.netty.callback;

/**
 * @author aspirin
 * @version 1.0
 * @date 2022/1/4 15:25
 */
public class MyFetcher implements Fetcher {

    final Data data;

    public MyFetcher(Data data) {
        this.data = data;
    }

    @Override
    public void fetchData(FetcherCallback callback) {
        try {
            callback.onData(data);
        }catch (Exception e){
            callback.onError(e);
        }
    }
}
