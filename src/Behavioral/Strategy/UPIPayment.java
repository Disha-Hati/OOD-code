package Behavioral.Strategy;

public class UPIPayment implements PaymentStrategy{

    public int upiid;

    public UPIPayment(int upiid){
        this.upiid=upiid;
    }
    public void pay(int amount){
        System.out.println("Payment done using UPI of "+ amount);
    }
}
