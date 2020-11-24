package design.mode.observer.pubsub;

public class Main {
    public static void main(String[] args) {
        Sender sender = new Sender();

        Receiver receiver1 = new Receiver(1);
        sender.subscribe(receiver1);

        Receiver receiver2 = new Receiver(2);
        sender.subscribe(receiver2);

        for (int i = 0; i < 10; i++) {
            sender.send(i+"");
        }
    }
}
