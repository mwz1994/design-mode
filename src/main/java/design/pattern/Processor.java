package design.pattern;

/**
 * @author aspirin
 * @version 1.0
 * @date 2022/2/8 15:44
 */
public class Processor {

    public Processor(){
        BankGateway.Instance.TransferMoney();
    }
}
