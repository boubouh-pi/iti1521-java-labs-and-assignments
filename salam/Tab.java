/*Exercice2 LAB3*/

class Tab {
    public static void trier(int[] tab) {
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

    public static int moyenne(int[] tab) {
        int somme = 0;
        for (int element : tab) {
            somme += element;
        }
        return somme / tab.length;
    }

    public static int count(int[] tab, int val) {
        int count = 0;
        for (int element : tab) {
            if (element < val) {
                count++;
            }
        }
        return count;
    }

    public static void split(int[] tab, int[] petitTab, int val) {
        int index = 0;
        for (int element : tab) {
            if (element < val) {
                petitTab[index] = element;
                index++;
            }
        }
    }

    public static void main(String args[]) {

        int tab1[] = { 3, 55, 7, 1, 88, 9, 4, -10 };
        int i, moyenne, size;
        int[] petitTab, tab2;
        tab2 = new int[] { 10, 34, 62, 56, 82, 7, 95 };
        trier(tab1);
        trier(tab2);
        moyenne = moyenne(tab2);
        size = count(tab2, moyenne);
        petitTab = new int[size];

        System.out.println("Les elements de tab1 et tab2 tries sont : ");
        for (i = 0; i < tab1.length; i++) {
            /* Impression du contenu de tab1 trie */
            if (i > 0) {
                System.out.print(" , ");
            }
            System.out.print(tab1[i]);
        }
        System.out.println();
        for (i = 0; i < tab2.length; i++) {
            /* Impression du contenu de tab2 trie */
            if (i > 0) {
                System.out.print(" , ");
            }
            System.out.print(tab2[i]);
        }
        System.out.println();
        System.out.println("La valeur moyenne de tab2 est " + moyenne(tab2));
        moyenne = moyenne(tab2);
        split(tab2, petitTab, moyenne);
        System.out.print("Les elements de petitTab sont : ");
        for (i = 0; i < petitTab.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(petitTab[i]);
        }
        System.out.println();
    }
}
