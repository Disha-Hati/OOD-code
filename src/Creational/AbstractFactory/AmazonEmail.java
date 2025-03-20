package Creational.AbstractFactory;

public class AmazonEmail implements EmailNotification{
    public void sendEmail(){
        System.out.println("Email from Amazon");
    }
}
