package Creational.AbstractFactory;

public interface NotificationFactory {
    EmailNotification createEmail();
    SMSNotification createSMS();
}
