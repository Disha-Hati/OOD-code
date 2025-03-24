package Creational.Singleton;

public class SingletonEager {
    private static final SingletonEager instance=new SingletonEager();
    private static int counter=0;

    private SingletonEager(){
        counter++;
        System.out.println("Instance:"+counter);
    }

    public static SingletonEager getInstance(){
        return instance;
    }
}
