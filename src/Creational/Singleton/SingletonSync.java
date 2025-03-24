package Creational.Singleton;

public class SingletonSync {
    private static SingletonSync instance;
    private static int counter=0;

    private SingletonSync(){
        counter++;
        System.out.println("Instance:"+counter);
    }

    public static synchronized  SingletonSync getInstance(){
        if(instance==null){
            instance=new SingletonSync();
        }
        return instance;
    }
}
