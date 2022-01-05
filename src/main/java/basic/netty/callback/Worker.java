package basic.netty.callback;

/**
 * @author aspirin
 * @version 1.0
 * @date 2022/1/4 15:19
 */
public class Worker {

    private void doWork() {
        Fetcher fetcher = new MyFetcher(new Data(1,0));
        fetcher.fetchData(new FetcherCallback() {
            @Override
            public void onData(Data data) throws Exception {
                System.out.println("Data received: "+data);
            }

            @Override
            public void onError(Throwable throwable) {
                System.out.println("An error accour: "+ throwable.getMessage());
            }
        });
    }

    public static void main(String[] args) {
        Worker w = new Worker();
        w.doWork();
    }
}
