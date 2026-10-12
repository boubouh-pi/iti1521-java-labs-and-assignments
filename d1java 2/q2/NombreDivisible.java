
public class NombreDivisible{
public static int nombreDivisible(int[] x, int n) {
    int count = 0;

        for (int i = 0; i < x.length; i++) {
            if (x[i] % n == 0) {
                count++;
            }
        }

        return count;
    }
 

  public static void main(String[] args) {
   int n1=3, n2=2;
    int[] Tab1 = {6, 10, 2, 3, 4, 5, 6,0};
    int[] Tab2 = {1, 2, 3, 0, 5, -6, 995};
    
     System.out.println("Le nombre d elements divisibles par 3 dans Tab1 est : " +nombreDivisible(Tab1, n1));
     System.out.println("Le nombre d elements divisibles par 2 dans Tab2 est : " +nombreDivisible(Tab2, n2));
     System.out.println();
    }

  } 

