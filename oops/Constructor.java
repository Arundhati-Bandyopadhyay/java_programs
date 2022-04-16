class MyEmployee{
     private int id;
     private String name;

     public MyEmployee(){
         id=5;
         name="Arundhatib";
     }
     public String getName(){
         return name;
     }
     public void setName(String n){
         this.name=n;
     }
     public int getId(){
         return id;
     }
     public void setId(int i){
         this.id=i;
     }
}
public class Constructor {
    public static void main(String[] args) {
        MyEmployee tinni= new MyEmployee();
       
        System.out.println(tinni.getName());

    }
}
