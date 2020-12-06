package design.effective.eight;

import java.io.IOException;

public class Adult {
    public static void main(String[] args) throws IOException {
        try(Room myRoom = new Room(7)){
            System.out.println("Goodbye");
        }
    }


}
