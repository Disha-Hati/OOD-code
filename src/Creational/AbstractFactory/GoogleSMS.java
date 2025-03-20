package Creational.AbstractFactory;

public class GoogleSMS implements SMSNotification{
    public void sendSMS(){
        System.out.println("SMS from Google");
    }
}
