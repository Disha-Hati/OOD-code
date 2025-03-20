package Creational.AbstractFactory;

public class GoogleNotificatonFactory implements NotificationFactory{
    @Override
    public EmailNotification createEmail() {
        return new GoogleEmail();
    }

    @Override
    public SMSNotification createSMS() {
        return new GoogleSMS();
    }
}
