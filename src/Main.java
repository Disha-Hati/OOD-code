import Behavioral.Observer.Observers;
import Behavioral.Observer.Subject;
import Behavioral.Observer.User;
import Behavioral.Strategy.CreditPayment;
import Behavioral.Strategy.PaymentContext;
import Behavioral.Strategy.UPIPayment;

public class Main {
    public static void main(String[] args) {

//        SingletonDouble obj1= SingletonDouble.getInstance();
//        SingletonDouble obj2= SingletonDouble.getInstance();
//        System.out.println(obj1==obj2);

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

        //Observer
//        Subject s1=new Subject();
//
//        Observers o1=new User("Alice");
//        Observers o2=new User("Bob");
//
//        s1.addObserver(o1);
//        s1.addObserver(o2);
//
//        s1.notifyObserver("New Video Uploaded");
//
//        s1.removeObserver(o2);
//
//        s1.notifyObserver("Again new Song");

        //Adapter
//        PaymentProcessor paypal=new Paypal();
//        paypal.makePayment(10000000);
//
//        RazorPay razor=new RazorPay();
//        PaymentProcessor razorAdapter=new Adapter(razor);
//        razorAdapter.makePayment(120000);

        //Strategy
        PaymentContext paymentType=new PaymentContext();
        paymentType.setPaymentContext(new CreditPayment(123));
        paymentType.executePayment(10000);

        paymentType.setPaymentContext(new UPIPayment(567));
        paymentType.executePayment(888000);
    }
}