class Animal{
    String a;

    public String  getName() { 
        return a;       
    }

    public void  setName(String a){ 
        this.a=a;       
    }
}
class Dog extends Animal{
    public String y;

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }
}


public class Quizinheritance {
    
    public static void main(String[] args) {
        Animal ab = new Animal();
        ab.setName("pupy");
        System.out.println(ab.getName());


        Dog b=new Dog();
        b.setY("DOGGY");
        System.out.println(b.getY());
    }
}
