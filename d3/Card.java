/**
 * Card class represents a playing card from a deck.  A card has a color and a value
 */

public class Card {
  
    private final int color;   // Card's color
    private final int value;   // Card's value (1 - 13, with 1 representing ACE).

    public final static int CLUBS = 0;
    public final static int DIAMONDS = 1;
    public final static int HEARTS = 2;
    public final static int SPADES = 3;

    public final static int ACE = 1;
    public final static int JACK = 11;
    public final static int QUEEN = 12;
    public final static int KING = 13;

    /**
     * Constructor that creates a card with a specified color and value.
     * @throws IllegalArgumentException if the parameter values are not in the ranges
     */
    public Card(int value, int color) {
        if (color < 0 || color > 3 || value < 1 || value > 13) {
            throw new IllegalArgumentException("Invalid card value or color");
        }
        this.color = color;
        this.value = value;
    }

    /**
     * Returns the color of this card.
     */
    public int getColor() {
        return color;
    }

    /**
     * Returns the value of this card.
     * @return the value, which is one of the numbers 1 through 13, inclusive for a regular card.
     */
    public int getValue() {
        return value;
    }

    /**
     * Returns a String representation of the card's color.
     * @return one of the strings "Spades", "Hearts", "Diamonds", or "Clubs"
     */
    public String ColorToString() {
        switch (color) {
            case CLUBS:
                return "Clubs";
            case DIAMONDS:
                return "Diamonds";
            case HEARTS:
                return "Hearts";
            case SPADES:
                return "Spades";
            default:
                return "";
        }
    }

    /**
     * Returns a String representation of the card's value.
     * @return for a regular card, one of the strings "Ace", "2", "3", ..., "10", "Jack", "Queen", or "King".
     */
    public String ValueToString() {
        switch (value) {
            case ACE:
                return "Ace";
            case JACK:
                return "Jack";
            case QUEEN:
                return "Queen";
            case KING:
                return "King";
            default:
                return String.valueOf(value);
        }
    }

    /**
     * Returns a string representation of this card, including both its color and its value.
     * @return a string representation of the card
     */
    public String toString() {
        return ValueToString() + " of " + ColorToString();
    }
}