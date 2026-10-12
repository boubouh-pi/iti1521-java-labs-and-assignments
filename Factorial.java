public class Factorial {

    public static int factorial(int n) {
        int m = 1;
        for (int i = 2; i <= n; i++) 
            m = m*i;
        return m;
    }

    public static void main(String[] args) {
        if (args.length != 1)
            System.out.println("Pas de factorielle ");
        else
            System.out.println(factorial(Integer.parseInt(args[0])));
    }
}

