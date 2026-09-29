interface A{
    default void display(){
        System.out.println("I m from A");
    }
}
interface B{
    default void display(){
        System.out.println("I m from B");
    }
}
class C implements A,B{
    public void display(){
        A.super.display();
        B.super.display();
        System.out.println("I m from C");
    }
}
public class Interface2 {
    public static void main(String[] args) {
        C obj = new C();
        obj.display();
    }
}
