class MyEmployee{
   private int id;
   private String name;

    public void setName(String n){
        name=n;
    }
    public String getName(){
        return name;
    }
    public void setId(int i) {
        id=i;
    }

    public int getId() {
        return id;
    }
    
}
public class GetterSetter {
    public static void main(String[] args) {
        MyEmployee tinni =new MyEmployee();
        tinni.setName("arundhati");
        tinni.setId(2);

        System.out.println(tinni.getId());
    }
}
