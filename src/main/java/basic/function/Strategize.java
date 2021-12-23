package basic.function;

/**
 * @author aspirin
 * @version 1.0
 * @date 2021/12/13 10:50
 */
public class Strategize {
    Strategy strategy;
    String msg;

    Strategize(String msg){
        strategy = new Soft();
        this.msg = msg;
    }

    void communicate(){
        System.out.println(strategy.approach(msg));
    }

    void changeStrategy(Strategy strategy){
        this.strategy = strategy;
    }

    public static void main(String[] args) {
        Strategy[] strategies = {
                new Strategy() {
                    @Override
                    public String approach(String msg) {
                        return msg.toUpperCase()+ "!";
                    }
                },
                msg -> msg.substring(0,5),
                Unrelated::twice,
                new Hard(),
                Unrelated::twiceplustwice
        };
        Strategize s = new Strategize("Hello There");
        s.communicate();

        for (Strategy newStrategy: strategies){
            s.changeStrategy(newStrategy);
            s.communicate();
        }
    }
}
