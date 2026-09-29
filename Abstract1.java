abstract class Animal{
    abstract void sound();

    void eat(){
        System.out.println("Its eating time guyssss...");
    }
}
abstract class Bird extends Animal{
    abstract void fly();

}
class Pigeon extends Bird{
    void sound(){
        System.out.println("Pigeon is Singing...");
    }
    void fly(){
        System.out.println("flying....");
    }   
}
public class Abstract1{
    public static void main(String[] args) {
        Bird pigeon = new Pigeon(); 
        pigeon.sound();
        pigeon.eat(); 
        pigeon.fly(); 
    }
}