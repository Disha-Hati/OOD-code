import Creational.AbstractFactory.EmailNotification;
import Creational.AbstractFactory.GoogleNotificatonFactory;
import Creational.AbstractFactory.NotificationFactory;
import Creational.Builder.User;
import Creational.FactoryMethod.Notification;
import Creational.Singleton.SingletonDouble;
import Creational.Singleton.SingletonEager;
import Creational.Singleton.SingletonLazy;
import Creational.Singleton.SingletonSync;

public class Main {
    public static void main(String[] args) {

        SingletonDouble obj1= SingletonDouble.getInstance();
        SingletonDouble obj2= SingletonDouble.getInstance();
        System.out.println(obj1==obj2);

        //To test: Thread-safe or not?
//        Runnable task=()->{
//            SingletonSync obj= SingletonSync.getInstance();
//        };
//
//        Thread t1=new Thread(task);
//        Thread t2=new Thread(task);
//
//        t1.start();
//        t2.start();

        //Factory
//            Notification noti1= NotificationFactory.createNotification("email");
//            noti1.notifyUser();
//            Notification noti2= NotificationFactory.createNotification("SMS");
//            noti2.notifyUser();
//        Notification noti3=NotificationFactory.createNotification("dfgsyfhyef");
//        noti3.notifyUser();

        //Abstract Factory
//        NotificationFactory googleFact=new GoogleNotificatonFactory();
//        EmailNotification googleEmail=googleFact.createEmail();
//        googleEmail.sendEmail();


        //Builder
//        User user1=new User.UserBuilder("Saraswati").setAge(26).setEmail("123%fdgrt").setPhone("54735874").build();
//        user1.display();
    }
}