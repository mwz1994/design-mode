package basic.function;


/**
 * @author aspirin
 * @version 1.0
 * @date 2021/12/13 10:48
 */
public class Hard implements Strategy{
    @Override
    public String approach(String msg) {
        return msg.toLowerCase()+ "!!";
    }

    public String test() {
        return null;
    }
}
