package Structural.Adapter;

public class Paypal implements PaymentProcessor{
    @Override
    public void makePayment(int amount) {
        System.out.println("Payment of"+amount+" done Paypal");
    }
}
