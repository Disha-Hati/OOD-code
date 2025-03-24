package Creational.Singleton;

public class SingletonLazy {
    private static SingletonLazy instance;
    public static int counter=0;

    private SingletonLazy(){
        counter++;
        System.out.println("Instance"+counter);
    }

    public static SingletonLazy getInstance(){
        if(instance==null){
            instance= new SingletonLazy();
        }
        return instance;
    }
}
