package design.pattern;

/**
 * @author aspirin
 * @version 1.0
 * @date 2022/2/8 16:01
 */
public class ProcessorV2 {
    private IBankGateway iBankGateway;

    public ProcessorV2(IBankGateway gateway){
        iBankGateway = gateway;
    }

    public void process(){
        iBankGateway.TransferMoney();
    }
}
