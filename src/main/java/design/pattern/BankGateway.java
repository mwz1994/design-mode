package design.pattern;

/**
 * @author aspirin
 * @version 1.0
 * @date 2022/2/8 15:42
 */
public class BankGateway {
    public static BankGateway Instance = new BankGateway();

    private BankGateway(){}

    public void TransferMoney(){
        System.out.println("[v1] transferring money to family");
    }
}
