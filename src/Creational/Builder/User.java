package Creational.Builder;

public class User {
    private String name;
    private String email;
    private String phone;
    private int age;

    private User(UserBuilder builder){
        this.name=builder.name;
        this.email=builder.email;
        this.age=builder.age;
        this.phone=builder.phone;
    }

    public void display(){
        System.out.println("User Details:");
        System.out.println(name);
        System.out.println(age);
        System.out.println(email);
        System.out.println(phone);
    }

    public static class UserBuilder{
        private String name;
        private String email;
        private String phone;
        private int age;

        public UserBuilder(String name){
            this.name=name;
        }

        public UserBuilder setEmail(String email){
            this.email=email;
            return this;
        }

        public UserBuilder setAge(int age){
            this.age=age;
            return this;
        }

        public UserBuilder setPhone(String phone){
            this.phone=phone;
            return this;
        }

        public User build(){
            return new User(this);
        }


    }
}
