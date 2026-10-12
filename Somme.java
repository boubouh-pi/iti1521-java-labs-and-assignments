public class Somme {
    public static void main(String[] args) {
        int somme = 0;
        for (String arg : args) {
            try {
                int nombre = Integer.parseInt(arg);
                somme += nombre;
            } catch (NumberFormatException e) {
                System.err.println("L'argument \"" + arg + "\" n'est pas un entier valide.");
            }
        }
        System.out.println("La somme est " + somme);
    }
}
