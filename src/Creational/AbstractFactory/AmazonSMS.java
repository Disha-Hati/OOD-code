package Creational.AbstractFactory;

public class AmazonSMS implements SMSNotification{
    public void sendSMS(){
        System.out.println("SMS from Amazon");
    }
}
