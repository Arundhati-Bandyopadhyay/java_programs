import java.util.Scanner;
public class For_loop_23 {
    public static void main(String[] args) {
        // for(int i=0;i<=50;i++){
        //     System.out.println(i);
        // }
        // int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();

        for(int i=0;i<n;i++)
        {System.out.println( 2*i);}
        sc.close();

    }
    
}
