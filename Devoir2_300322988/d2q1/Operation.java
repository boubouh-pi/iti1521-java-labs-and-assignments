/**
 *ITI 1521 - Introduction a l informatique II
 *@author ZHOR SEBBANI, Universite d'Ottawa/University of Ottawa
 * 
 */


public class Operation {

    private int x, y;  //nombres aleatoires pour l operation arithmetique
    private int rand;  //nombre aleatoire = 0 pour l addition et 1 pour la multiplication

    public Operation(int randOperation) { // constructor
        // Generer deux entiers positifs aleatoires entre 0 et 9 (inclusivement) 
        x = (int)(Math.random() * 10); 
        y = (int)(Math.random() * 10);
        rand = (int)(Math.random() * 2); // Genere un entier positif aleatoire entre 0 et 1 (inclusivement) 
    }

    public String getQuestion0() {
        return "Quelle est la valeur de " + x + " + " + y + " ?";
    }

    public String getQuestion1() {
        return "Quelle est la valeur de " + x + " * " + y + " ?";
    }
    public int getAddition() {
        return x + y;
    }
    public int getProduct() {
        return x*y;
    }
     public int getRand() {
        return rand;
    }
}
