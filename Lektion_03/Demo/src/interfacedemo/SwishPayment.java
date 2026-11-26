package interfacedemo;

public class SwishPayment implements PaymentService {

    @Override
    public void pay(Double amount) {
        System.out.printf("You just paid %f via Swish\n", amount);
    }

}
