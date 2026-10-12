public class Factorial {

public static int factorial(int n) {
    if (n == 0) {
        return 1;

    else 
        return n * factorial(n-1);
    }
}
public static void main(String[] args) {
    if (args.length != 1) {
        System.err.println("Usage: java factorial <number>");
        System.exit(1);
    }
    int n = Integer.parseInt(args[0]);
    int result = factorial(n);
    System.out.println(result);
}
