
     public class De {
     
    private int value;   // Numero figurant sur le de. 

    /**
     * Le constructeur cree un de et le lance de sorte qu il
     * montre initialement une valeur aleatoire entre 1 et 6. 
     */
    public De() {
        lancer();
    }
        
    /**
     * Lancez le de pour qu il indique un nombre aleatoire entre 1 et 6. 
     */
    public void lancer() {
        value = (int) (Math.random() * 6) + 1;
    }
                
    /**
     * Renvoie le nombre indique sur le de. 
     */ 
    public int getValue() {
        return value;
    }
        
    /**
     * Definit la valeur du de. Imprime Valeur illegale du de
     * si la valeur n'est pas comprise entre 1 et 6. 
     */
    public void setValue(int val) {
        if (val >= 1 && val <= 6) {
            value = val;
        } else {
            System.out.println("Valeur illegale du de " + val);
        }
    }
        
    // Programme principal main
      
    /** 
     * Lancer deux des jusqu a ce qu ils indiquent la meme valeur 
     * et afficher le nombre de fois que ces des ont ete lances. 
     */
    
    public static void main(String[] args) {
       
        De de1;  // 1er de
        De de2;  // second de
        int count = 0;

        de1 = new De();
        de2 = new De();
        
        while (de1.getValue() != de2.getValue()) {
            de1.lancer();
            de2.lancer();
            count++;
        }
        
        System.out.println("Ca a pris " + count + " lances pour que les deux des indiquent la meme valeur:");
        System.out.println(de1.getValue());
        System.out.println(de2.getValue());
        System.out.println();
        
        /* Generer une exception. */
        System.out.println("Ce programme va maintenant se terminer avec un message d erreur ");
        System.out.println("lorsqu il essaie de fixer la valeur d un de a 100.");
        De de3;  // Nouveau de pour le dernier test
        de3 = new De();  // Creer l objet
        de3.setValue(100);
    }
        
}  // end class De