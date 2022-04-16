class MyEmployee {
    private int id;
    private String name;
    private int salary;

    // public MyEmployee(){
    // id=5;
    // name="Arundhatib";
    // }
    public MyEmployee(String myName, int myid) {
        id = myid;
        name = myName;
    }

    public MyEmployee(int empsalary) {
        salary = empsalary;
    }

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        this.name = n;
    }

    public int getId() {
        return id;
    }

    public void setId(int i) {
        this.id = i;
    }
}

public class Constructor {
    public static void main(String[] args) {
        // MyEmployee tinni= new MyEmployee();
        MyEmployee tinni = new MyEmployee("arundhti", 5);
        MyEmployee s = new MyEmployee(10000);

        System.out.println(tinni.getName());
        System.out.println(tinni.getId());

        System.out.println(s.getSalary());

    }
}