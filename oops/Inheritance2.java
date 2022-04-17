class Parent{
    public void bike(){
        System.out.println("hii");
    }
}
class Child extends Parent{
    public void cycle(){
        System.out.println("how are you");
    }
}
public class Inheritance2 {
    public static void main(String[] args) {
        //Parent p =new Parent();
        Child c =new Child();

        c.bike();
    }
}
