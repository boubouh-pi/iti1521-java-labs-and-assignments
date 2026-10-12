/*************************Exemple1 *********************/
public class Somme {
    public static void main( String[] args ) {

        int Somme = 0;
        for ( int i=0; i<args.length; i++ ) {
            Somme += Integer.parseInt( args[ i ] );
        }
        System.out.println( "La somme est " + Somme );

    }
}
