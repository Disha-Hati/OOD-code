package Behavioral.Strategy;

public class PaymentContext {

    private PaymentStrategy type;

    public void setPaymentContext(PaymentStrategy type){
        this.type=type;
    }

    public void executePayment(int amount){
        if(type==null){
            System.out.println("No type selected yet");
            return;
        }
        type.pay(amount);
    }
}
