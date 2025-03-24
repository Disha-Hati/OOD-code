package Creational.Singleton;

public class SingletonDouble {
    public static volatile SingletonDouble instance;

    private SingletonDouble(){}

    public static SingletonDouble getInstance(){
        if(instance==null){
            synchronized (SingletonDouble.class){
                if(instance==null){
                    instance=new SingletonDouble();
                }
            }
        }
        return instance;
    }
}
