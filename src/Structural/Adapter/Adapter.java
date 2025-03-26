package Structural.Adapter;

public class Adapter implements PaymentProcessor{
    private RazorPay rp;

    public Adapter(RazorPay rp){
        this.rp=rp;
    }

    public void makePayment(int amount){
        System.out.println("Converting our integrated payment to RazorPay");
        rp.payUsingRazor((double)amount);
    }
}
