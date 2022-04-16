public class Breakcontinue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
              break;
            }
            System.out.println(i);
          }
 


          
          for (int p = 0; p < 10; p++) {
            if (p == 4) {
              continue;
            }
            System.out.println(p);
          }
    }
}
