// Represents a single playing card with a face and a suit
public class Card {
    private final String face;
    private final String suit;

    // Constructor: builds a card with given face and suit
    public Card(String face, String suit) {
        this.face = face;
        this.suit = suit;
    }
    // Get the face of the card
    public String getFace() {
        return face;
    }

    // Get the suit of the card
    public String getSuit() {
        return suit;
    }

    //Get Unicode symbol for each suit
    private String getSuitSymbol() {
        return switch (suit) {
            case "Hearts" -> "♥";
            case "Diamonds" -> "♦";
            case "Clubs" -> "♣";
            case "Spades" -> "♠";
            default -> "";
        };
    }

    // String representation of a card (e.g., "Ace of Hearts ♥")
    public String toString() {
        return face + " of " + suit + " " + getSuitSymbol();
    }
}
