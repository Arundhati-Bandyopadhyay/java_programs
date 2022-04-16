import java.util.Scanner;
public class Conditionals_16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE AGE");
        int age=sc.nextInt();

        if(age>18){
            System.out.println("boy can drive");
        }
        else{
            System.out.println("boy cannot drive");
        }
        sc.close();
    }
}
