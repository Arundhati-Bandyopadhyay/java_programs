class Employee{
    int salary;
    String name;


    public int getSalary(){
        return salary;
    }
    public String getname(){
        return name;

    }
    public void setname(String n){
        name=n;
    }
};

class Cellphone{
    public void ringing(){
        System.out.println("ringing");
    }

    public void vibrating(){
        System.out.println("vibrating");
    }

    public void calling(){
        System.out.println("calling");
    }
}

class square{
    int side;
    
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}
class triangle{
    int length;
    int breadth;
    int s;

    public int area1(){
        return (length*breadth)/2;
    }
    public int perimeter1(){
        return length+breadth+s;
    }
}


public class Ex1_oops {
    public static void main(String[] args) {
        Employee Arundhati=new Employee();

        Arundhati.setname("Arundhati Bandyopadhyay");
        Arundhati.salary=2000;
        System.out.println(Arundhati.getname());
        System.out.println(Arundhati.getSalary());

        //prob2
        Cellphone func = new Cellphone();
        func.ringing();
        func.calling();
        func.vibrating();

        //problem 3
        square sq=new square();
        sq.side=4;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());
        

        //PROB4
        triangle tri=new triangle();
        tri.length=5;
        tri.breadth=6;
        tri.s=3;
        System.out.println(tri.area1());
        System.out.println(tri.perimeter1());
    }
}
