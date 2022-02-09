package design.pattern;


import javax.inject.Singleton;

/**
 * @author aspirin
 * @version 1.0
 * @date 2022/2/8 16:00
 */
@Singleton
public class BankGatewayV2 implements IBankGateway{
    @Override
    public void TransferMoney() {
        System.out.println("[v2] transferring money to family");
    }
}
