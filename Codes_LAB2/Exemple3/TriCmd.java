/*************************Exemple3 *********************/
class TriCmd {
    // Tri d'un tableau d'entiers
    static void trier(int [] tab)
    {
      int i;   // Indice de l'élément à insérer 
      int j;   // Indice de la position d'insertion 
      int save;   // Sauvegarde de l'élément à insérer
      for (i = 1; i < tab.length; i++) {
 // Sauvegarde de l'élément
 save = tab[i];
 // Recherche de la position d'insertion
 for (j = i-1; j >= 0 && tab[j] > save; j--)
   tab[j+1] = tab[j];
 // Insertion proprement dite
 tab[j+1] = save;
      }
    }
    // Lecture et tri des entiers sur la ligne de commande
    public static void main(String [] args)
    {
 // Création du tableau
 int[] a = new int [args.length];

 // Lecture des entiers
 for(int i = 0; i < args.length; i++)
     a[i] = Integer.parseInt(args[i]);

 // Tri
 trier(a);

 // Affichage dans l'ordre
System.out.print("Le tableau trié est : {");
 System.out.print(a[0]);
 for(int i = 1; i < a.length; i++)
     System.out.print(","+ a[i]);
  System.out.println("}");
    }

}
