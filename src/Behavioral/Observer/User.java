package Behavioral.Observer;

public class User implements Observer{
    String userName;

    public User(String userName){
        this.userName=userName;
    }
    public void update(String update){
        System.out.println(userName+"received"+update);
    }
}
