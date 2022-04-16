public class Methods2 {
    static int mysum(int x, int y){
        int z;
        z=x+y;
        return z;
    };

 
    public static void main(String[] args) {
            int a = 5; 
            int b = 7;
            int c;
            // Method invocation using Object creation
            //methods obj = new Methods();
            //c = obj.logic(a, b);
            c = mysum(a, b);
            System.out.println(a + " "+ b);
            System.out.println(c);
       
        }
        
    }

