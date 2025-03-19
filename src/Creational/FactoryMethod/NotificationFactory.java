package Creational.FactoryMethod;

public class NotificationFactory {
    public static Notification createNotification(String type){
        if(type==null||type.isEmpty()) return null;
        if(type.toLowerCase().equals("email")) return new EmailNotification();
        if(type.toLowerCase().equals("sms")) return new SMSNotification();
        throw new IllegalArgumentException("Unknown type");
    }
}
