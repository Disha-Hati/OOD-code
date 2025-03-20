package Creational.AbstractFactory;

public class AmazonNotificationFactory implements NotificationFactory{
    @Override
    public EmailNotification createEmail() {
        return new AmazonEmail();
    }

    @Override
    public SMSNotification createSMS() {
        return new AmazonSMS();
    }
}
