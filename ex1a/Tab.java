/*************************Exercice 2*********************/
class Tab {
public static void trier( int [ ] tab ){
  int n = tab.length;
          for (int i = 0; i < n - 1; i++) {
              for (int j = 0; j < n - i - 1; j++) {
                  if (tab[j] > tab[j + 1]) {
                      
                      int temp = tab[j];
                      tab[j] = tab[j + 1];
                      tab[j + 1] = temp;
                  }
              }
          }
      
}

public static int moyenne(int[] tab){

  int somme = 0;
  for (int element : tab) {
    somme += element;
  }
  return somme / tab.length;
  }



public static void main (String args [ ] )
{

int tab1 [ ] = { 3,55,7, 1, 88, 9 , 4, -10 };
int i,moyenne;
int[] tab2;
tab2 = new int[]{10,34,62,56,82,7,95};
trier(tab1 ) ;
trier(tab2 ) ;


System.out.println ("Les elements de tab1 tries sont : " ) ;
for ( i =0; i<tab1.length ; i++) {
/*Impression du contenu de tab1 trie*/
  if ( i >0) {
  System.out.print ( " , " ) ;
  }
  System.out.print (tab1 [ i ] ) ;
}
System.out.println ( ) ;
System.out.println ("Les elements de tab2 tries sont : " ) ;
for ( i =0; i<tab2.length ; i++) {
/*Impression du contenu de tab2 trie*/
  if ( i >0) {
    System.out.print ( " , " ) ;
  }
  System.out.print (tab2 [ i ] ) ;
}
System.out.println ( ) ;
System.out.print ("La valeur moyenne de tab1 est " + moyenne(tab1)) ;
System.out.println ( ) ;
moyenne=moyenne(tab2);
System.out.print ("La valeur moyenne de tab2 est " + moyenne) ;
System.out.println ( ) ;
}

}

