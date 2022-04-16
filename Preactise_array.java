//import java.util.Scanner;
public class Preactise_array {
    public static void main(String[] args) {
        // float[]numbers={4.5f,9.7f,7.1f,9.4f};
        // float sum=0;
        // for(float element:numbers){
        //     sum=sum+element;
        // }
        // System.out.println(sum);


        // //prob2
        // float[]numbers={4.5f,9.7f,7.1f,9.4f};
        // boolean isInArray=false;
        // Scanner sc=new Scanner(System.in);
        // System.out.println("please enter the number");
        // float num=sc.nextFloat();


        // for(float element:numbers){
        //     if(num==element){
        //           isInArray=true;
        //           break;
        //     }
        // }
        // if(isInArray){
        //     System.out.println("the value is present");

        // }else{
        //     System.out.println("the value is not present");
        // }
        // sc.close();
        



        //prob3
         float[]marks={90.5f,90.70f,70.1f,80.4f};
        float sum=0;
        float avg=0;
        for(float element:marks){
        sum=(sum+element);
        avg=sum/4;
         }
        System.out.println(avg);



        //prob4
int [][] mat1 = {{1, 2, 3},
        {4, 5, 6}};
int [][] mat2 = {{2, 6, 13},
        {3, 7, 1}};
int [][] result = {{0, 0, 0},
          {0, 0, 0}};

for (int i=0;i<2;i++){ // row number of times
for (int j=0;j<3;j++) { // column number of time

result[i][j] = mat1[i][j] + mat2[i][j];
System.out.print(result[i][j] + " ");
result[i][j] = mat1[i][j] + mat2[i][j];
}
System.out.println(""); // Prints a new line
 }
//prob5
 int [] arr = {1, 21, 3, 4, 5, 34, 67};
        int l = arr.length;
        int n = Math.floorDiv(l, 2);
        int temp;

        for(int i=0; i<n; i++){
            // Swap a[i] and a[l-1-i]
            // a   b   temp
            // |4| |3| ||
            temp = arr[i];
            arr[i] = arr[l-i-1];
            arr[l-i-1] = temp;
        }

        for(int element: arr){
            System.out.print(element + " ");
        }

    }
}



