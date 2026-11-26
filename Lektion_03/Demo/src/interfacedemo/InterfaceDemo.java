package interfacedemo;

public class InterfaceDemo {

    public void demo() {

        SwishPayment swishPayment = new SwishPayment();
        paymentProcessor(swishPayment, 100.0);
        paymentProcessor(new CardPayment(), 200.0);

    }

    /*

        This method is responsible for doing the actual payment.

        But if we have multiple payment systems - how can we send the
        right one to the method? A parameter can only have _one_ type.

     */
    private void paymentProcessor(PaymentService ps, Double amount) {
        ps.pay(amount);
    }

}
