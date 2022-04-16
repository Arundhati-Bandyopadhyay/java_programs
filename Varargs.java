public class Varargs {
//     static int sum(int a,int b){
//         return a+b;
// };
//     static int sum(int a,int b,int c){
//         return a+b+c;
//     }

static int sum(int ...arr){
    //available as int []arr
    int result=0;
    for (int a : arr) {
        result +=a;


    }
    return result;
}

    public static void main(String[] args) {
        System.out.println("sum of 2 and 3 is "+ sum( 2,3));
        System.out.println("sum of 2 , 3 and 5 is "+ sum(2,3,5));
        System.out.println("sum of 2 , 3 ,5 ,7,9is "+ sum(2,3,5,7,9));
    }
}
