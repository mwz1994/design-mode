package design.effective.eight;

import java.io.Closeable;
import java.io.IOException;
import java.lang.ref.Cleaner;

public class Room implements Closeable {
    private static final Cleaner cleaner = Cleaner.create();

    private static class State implements Runnable{
        int numJunkPiles;
        State(int junk){
            this.numJunkPiles = junk;
        }
        @Override
        public void run() {
            System.out.println("cleaning room");
            numJunkPiles = 0;
        }
    }

    private final State state;
    private final Cleaner.Cleanable cleanable;
    public Room(int junk){
        state = new State(junk);
        cleanable = cleaner.register(this,state);
    }

    @Override
    public void close() throws IOException {
        cleanable.clean();
    }
}
