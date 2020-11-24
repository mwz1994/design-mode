package design.mode.observer.pubsub;

import java.util.Map;

public class PubsubMain {
    public static void main(String[] args) {
        Sender sender = new Sender();

        Receiver receiver1 = new Receiver(1);
        sender.subscribe(receiver1);

        Receiver receiver2 = new Receiver(2);
        sender.subscribe(receiver2);

        for (int i = 0; i < 10; i++) {
            sender.send(Map.of(i+"","这是第"+i+"条消息"));
        }
    }
}
