

public class Array {
    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(cars[0]);
        System.out.println(cars.length);

        int[]marks= new int[3];
        marks[0]=60;
        marks[1]=70;
        marks[2]=90;
        System.out.println(marks[2]);



        //displaying the array(for loop)

        // for(int i=0;i<marks.length;i++){
        //     System.out.println(marks[i]);
        // }


         //displaying the array IN REVERSE ORDER(for loop)
        for(int i=marks.length -1;i>=0;i-- ){
            System.out.println(marks[i]);
        }


         //displaying the array(for-each loop)
         for(int element:marks){
             System.out.println(element);
         }

      }
}

