import java.security.SecureRandom;
import java.util.Collections;

public class DeckOfCards {
    private Card[] deck;                          // array of Card objects
    private int currentCard;                      // index of the next card to deal
    private static final int NUMBER_OF_CARDS = 52;
    private static final SecureRandom randomNumbers = new SecureRandom();

    // constructor builds a deck of cards
    public DeckOfCards() {
        initializeDeck();
    }

    // helper method to build a fresh 52-card deck
    private void initializeDeck() {
        String[] faces = {"Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven",
                "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

        deck = new Card[NUMBER_OF_CARDS];
        currentCard = 0; // reset dealing index

        for (int count = 0; count < deck.length; count++) {
            deck[count] = new Card(faces[count % 13], suits[count / 13]);
        }
    }

    // shuffle deck
    public void shuffle() {
        currentCard = 0; // reset dealing index
        for (int first = 0; first < deck.length; first++) {
            int second = randomNumbers.nextInt(NUMBER_OF_CARDS);

            // swap cards
            Card temp = deck[first];
            deck[first] = deck[second];
            deck[second] = temp;
        }
    }

    // deal one card
    public Card deal() {
        if (!isEmpty()) {
            return deck[currentCard++];
        } else
            return null;
    }

    // count remaining undealt cards
    public int cardsRemaining() {
        return deck.length - currentCard;
    }

    // peek at next undealt cards
    public Card peekNextCard() {
        if (currentCard < deck.length) {
            return deck[currentCard];
        } else
            return null;
    }

    // reset deck to full 52 cards (ordered, unshuffled)
    public void reset() {
        initializeDeck();
    }

    // print all undealt cards
    public void printRemainingCards() {
        if (isEmpty()) {
            System.out.println("No cards remaining in the deck");
        } else {
            System.out.println("Remaining cards:");
            for (int i = currentCard; i < deck.length; i++) {
                System.out.println(deck[i]);
            }
        }
    }

    // check if the deck is empty (no cards left to deal)

    public boolean isEmpty () {
        return currentCard >= deck.length;
    }
}
