package Behavioral.Observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observers> observers=new ArrayList<Observers>();

    public void addObserver(Observers observer){
        observers.add(observer);
    }

    public void removeObserver(Observers observer){
        observers.remove(observer);
    }

    public void notifyObserver(String message){
        for(Observers obs:observers){
            obs.update(message);
        }
    }
}
