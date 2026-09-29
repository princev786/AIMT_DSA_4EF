class A{
    void greet(){
        System.out.println("greetings from A.....");
    }
}
class B extends A{
    void greet(){
        super.greet();
        System.out.println("I m from B");
    }
}
// class C extends B{
//     void display(){
//         greet();
//     }
// }
public class ABC {
    //overriding    
    public static void main(String[] args) {
        B obj = new B();
        obj.greet();
    }
}
