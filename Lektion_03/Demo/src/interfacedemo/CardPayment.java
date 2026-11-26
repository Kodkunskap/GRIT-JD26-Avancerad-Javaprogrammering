package interfacedemo;

public class CardPayment implements PaymentService{
    @Override
    public void pay(Double amount) {
        System.out.printf("You just paid %f via Credit Card\n", amount);
    }
}
