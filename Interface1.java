interface Animal{
    void sound();
    default void eat(){
        System.out.println("eating...");
    }
}

interface Bird extends Animal{

    void fly();
}

class Pigeon implements Bird{
    public void sound(){
        System.out.println("pigeon is singing");
    }
    public void fly(){
        System.out.println("pigeon is flying");
    }
}
public class Interface1 {
    public static void main(String[] args) {
        Pigeon p = new Pigeon();
        p.eat();
        p.fly();
        p.sound();
    }
}
