import java.util.ArrayList;

public class Player {
    private ArrayList<Card> hand; // The cards in the player's hand.

    /*Constructor*/
    public Player() {
        hand = new ArrayList<>();
    }

    /*Accessor*/
    public ArrayList<Card> getHand() {
        return hand;
    }

    /**
     * Remove all cards from the hand, leaving it empty.
     */
    public void clear() {
        hand.clear();
    }

    /**
     * Add a card to the hand. It is added at the end of the current hand.
     *
     * @param card the non-null card to be added.
     * @throws NullPointerException if the parameter card is null.
     */
    public void add(Card card) {
        if (card == null) {
            throw new NullPointerException("Card cannot be null");
        }
        hand.add(card);
    }

    /**
     * Remove a card from the hand, if present.
     *
     * @param card the card to be removed. If card is null or if the card is not in the hand, then nothing is done.
     */
    public void remove(Card card) {
        hand.remove(card);
    }

    /**
     * Remove the card in a specified position from the hand.
     *
     * @param position the position of the card that is to be removed, where positions are numbered starting from zero.
     * @throws IllegalArgumentException if the position does not exist in the hand, that is if the position is less than 0 or greater than or equal to the number of cards in the hand.
     */
    public void remove(int position) {
        if (position < 0 || position >= hand.size()) {
            throw new IllegalArgumentException("Invalid position in hand");
        }
        hand.remove(position);
    }

    /**
     * Returns the number of cards in the hand.
     */
    public int totalCards() {
        return hand.size();
    }

    /**
     * Gets the card in a specified position in the hand. (Note that this card is not removed from the hand!)
     *
     * @param position the position of the card that is to be returned
     * @throws IllegalArgumentException if position does not exist in the hand
     */
    public Card getCard(int position) {
        if (position < 0 || position >= hand.size()) {
            throw new IllegalArgumentException("Invalid position in hand");
        }
        return hand.get(position);
    }

    /**
     * Computes and returns the total value of this hand in the game
     */
    public int getHandTotal() {
        int total = 0;
        boolean hasAce = false;

        for (Card card : hand) {
            int value = card.getValue();
            if (value == Card.ACE) {
                hasAce = true;
            }
            if (value > 10) {
                total += 10;
            } else {
                total += value;
            }
        }

        if (hasAce && total <= 11) {
            total += 10;
        }

        return total;
    }

    /**
     * Sorts the cards in the hand so that cards of the same color are grouped together,
     * and within a color the cards are sorted by value.
     * Note that aces are considered to have the lowest value, 1.
     */
    public void sortByColor() {
        hand.sort((c1, c2) -> {
            if (c1.getColor() == c2.getColor()) {
                return Integer.compare(c1.getValue(), c2.getValue());
            } else {
                return Integer.compare(c1.getColor(), c2.getColor());
            }
        });
    }
}