import java.util.Random;

public class TestOperation {
    
    private static Operation[] questions;  // questions pour le test
    private static int[] reponses;   // reponses de l utilisateur aux questions
    
    /**
     * Cree le tableau questions de 10 elements
     */
    private static void creezTest() {
        questions = new Operation[10];
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            int randOperation = rand.nextInt(2); // 0 pour addition, 1 pour multiplication
            questions[i] = new Operation(randOperation);
        }
    }
    
    /**
     * Affiche toutes les questions du test 
     * et obtient les reponses de l'utilisateur.
     * Compare la reponse de l'eleve a la bonne reponse 
     * (si elles sont differentes, affiche la bonne reponse); 
     * les bonnes reponses sont comptees et affichees a la fin.
     */
    private static void effectuezTest() {
        reponses = new int[10];
        int bonnesReponses = 0;

        for (int i = 0; i < 10; i++) {
            Operation question = questions[i];
            int numeroQuestion = i + 1;

            if (question.getRand() == 0) {
                System.out.print("Question " + numeroQuestion + ": " + question.getQuestion0() + " ? ");
            } else {
                System.out.print("Question " + numeroQuestion + ": " + question.getQuestion1() + " ? ");
            }

            reponses[i] = ReadInt.getInt("");

            if (reponses[i] == question.getAddition() || reponses[i] == question.getProduct()) {
                System.out.println("CORRECT.");
                bonnesReponses++;
            } else {
                System.out.println("INCORRECT. La reponse est " + (question.getRand() == 0 ? question.getAddition() : question.getProduct()));
            }
        }

        double note = (double) bonnesReponses / 10 * 100;
        System.out.println("\nVous avez " + bonnesReponses + " reponses correctes.");
        System.out.println("Votre note pour ce test est " + note + "%");
    }
    
    /*
     * Programme principal main
     */ 
    public static void main(String[] args) {
        System.out.println();
        System.out.println("SVP repondez aux 10 questions d operations arithmetiques suivantes :");
        System.out.println();
        creezTest();
        effectuezTest();
    }//end of main()
}