
public class SequenceMax{
public static int sequenceMax(int[] x) {
    /*
     cette focntion prend un tableau de nombres et retourne
     la longueur de la plus longue sequence des elements consecutive egaux 
     */
     if (x.length == 0) {
            return 0;
        }

        int maxSequenceLength = 1;
        int currentSequenceLength = 1;

        for (int i = 1; i < x.length; i++) {
            if (x[i] == x[i - 1]) {
                currentSequenceLength++;
            } else {
                if (currentSequenceLength > maxSequenceLength) {
                    maxSequenceLength = currentSequenceLength;
                }
                currentSequenceLength = 1;
            }
        }

        if (currentSequenceLength > maxSequenceLength) {
            maxSequenceLength = currentSequenceLength;
        }

        return maxSequenceLength;
    }

 

  public static void main(String[] args) {
   
    int[] Tab1 = {1,2,1,3,3,3,6,1,1};
    int[] Tab2 = {1,5,2,2,2,7,3,3,3,3};
    int[] Tab3 = {3,1,7,1};
    
     System.out.println("La plus longue sequence d elements consecutifs egaux dans Tab1 est : " + sequenceMax(Tab1));
     System.out.println("La plus longue sequence d elements consecutifs egaux dans Tab2 est : " + sequenceMax(Tab2));
     System.out.println("La plus longue sequence d elements consecutifs egaux dans Tab3 est : " + sequenceMax(Tab3));
     System.out.println();
    }

  } 

