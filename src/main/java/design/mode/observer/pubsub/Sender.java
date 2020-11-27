package design.mode.observer.pubsub;

import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Flow;
import java.util.concurrent.SubmissionPublisher;

public class Sender implements Flow.Publisher {
    private SubmissionPublisher<Object> publisher;

    public Sender(){
        int THREAD_POOL_SIZE = 5;
        ExecutorService EXECUTOR = Executors.newFixedThreadPool(THREAD_POOL_SIZE);
        publisher = new SubmissionPublisher<>(EXECUTOR,Flow.defaultBufferSize());
    }

    @Override
    public void subscribe(Flow.Subscriber subscriber) {
        getPublisher().subscribe(subscriber);
    }

    public SubmissionPublisher<Object> getPublisher() {
        return publisher;
    }

    public void send(Map<String,Object> map){
        System.out.println("publish send msg : "+map);
        getPublisher().submit(map);
    }

    public void printSender(){
        System.out.println("here is sender");
    }
}
