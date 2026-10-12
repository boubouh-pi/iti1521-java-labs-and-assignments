import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *  Deck represents a deck of playing cards and contains 52 regular cards.
 */
public class Deck {
    private List<Card> cards;
    private int number;

    /**
     * Constructs a regular 52-card poker deck. Initially, the cards are in a sorted order.
     */
    public Deck() {
        cards = new ArrayList<>();
        number = 0;
        for (int color = 0; color <= 3; color++) {
            for (int value = 1; value <= 13; value++) {
                cards.add(new Card(value, color));
            }
        }
    }

    /**
     * Put all the used cards back into the deck (if any), and shuffle the deck into a random order.
     */
    public void shuffle() {
        Collections.shuffle(cards);
    }

    /**
     * Returns the number of cards left in the deck.
     */
    public int numberLeft() {
        return cards.size();
    }

    /**
     * Removes the next card from the deck and return it. It is illegal to call this method if there are no more cards in the deck.
     * You can check the number of cards remaining by calling the numberLeft() function.
     *
     * @return the card which is removed from the deck.
     * @throws IllegalStateException if there are no cards left in the deck
     */
    public Card take() {
        if (cards.isEmpty()) {
            throw new IllegalStateException("No cards left in the deck.");
        }
        return cards.remove(0);
    }
}





