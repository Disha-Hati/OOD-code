package Behavioral.Strategy;

public class CreditPayment implements PaymentStrategy{
    public int creditid;

    public CreditPayment(int creditid){
        this.creditid=creditid;
    }
    public void pay(int amount){
        System.out.println("Payment done using Credit Card of amount:"+amount+" on "+ creditid);
    }
}
