package basic.onjava8.c4;

import java.util.Objects;

/**
 * @author aspirin
 * @version 1.0
 * @date 2022/3/11 10:50
 */
public class Tank {
    int level;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tank tank = (Tank) o;
        return level == tank.level;
    }

    @Override
    public int hashCode() {
        return Objects.hash(level);
    }
}
