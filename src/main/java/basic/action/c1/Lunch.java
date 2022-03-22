package basic.action.c1;

import lombok.AllArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
public class Lunch {
    String source;
    Double price;
    LocalDateTime time;

    @Override
    public String toString() {
        return "Lunch{" +
                "source='" + source + '\'' +
                ", price=" + price +
                ", time=" + time +
                '}';
    }
}
