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

    // Deal Multiple Cards at Once
    public Card[] dealHand(int numberOfCards) {
        // Check if we have enough cards
        if (numberOfCards > cardsRemaining()) {
            System.out.println("Not enough cards! Only " + cardsRemaining() + " cards remaining.");
            return null;
        }

        // Create array to hold the hand
        Card[] hand = new Card[numberOfCards];

        // Deal the cards
        for (int i = 0; i < numberOfCards; i++) {
            hand[i] = deal();
        }

        return hand;
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

    // Count Cards by Suit

    public void countBySuit() {
        int hearts = 0, diamonds = 0, clubs = 0, spades = 0;

        // Count remaining cards by suit
        for (int i = currentCard; i < deck.length; i++) {
            String suit = deck[i].getSuit();
            switch (suit) {
                case "Hearts" -> hearts++;
                case "Diamonds" -> diamonds++;
                case "Clubs" -> clubs++;
                case "Spades" -> spades++;
            }
        }

        // Display the counts
        System.out.println("\n--- Cards Remaining by Suit ---");
        System.out.println("Hearts ♥: " + hearts);
        System.out.println("Diamonds ♦: " + diamonds);
        System.out.println("Clubs ♣: " + clubs);
        System.out.println("Spades ♠: " + spades);
        System.out.println("Total: " + cardsRemaining());
    }

    // Find a Specific Card
    public boolean findCard(String face, String suit) {
        // Search through remaining cards
        for (int i = currentCard; i < deck.length; i++) {
            if (deck[i].getFace().equals(face) && deck[i].getSuit().equals(suit)) {
                System.out.println("✓ Found: " + deck[i]);
                return true;
            }
        }

        System.out.println("✗ Card not found: " + face + " of " + suit);
        return false;
    }
    // check if the deck is empty (no cards left to deal)

    public boolean isEmpty () {
        return currentCard >= deck.length;
    }
}
