//Card shuffling and dealing
public class Main {
    //execute application
    public static void main(String[] args) {
        DeckOfCards myDeckOfCards = new DeckOfCards();
        myDeckOfCards.shuffle();

        // deal all 52 cards in 4 columns
        for (int i = 1; i <= 52; i++) {
            Card card = myDeckOfCards.deal();
            if (card != null) {
                System.out.printf("%-20s ", card);
                if (i % 4 == 0) {
                    System.out.println();
                }
            } else {
                System.out.println("No more cards to deal!");
                break; // Stop the loop if we run out of cards
            }
        }

        // show how many cards left
        System.out.println("\nCards Remaining: " + myDeckOfCards.cardsRemaining());

        //Peek at the next card (Without dealing)
        Card nextCard = myDeckOfCards.peekNextCard();
        if (nextCard != null) {
            System.out.println("\nNext card (peek only): " + nextCard);
        } else {
            System.out.println("\nNo more cards left to peek at");
        }

        //Print all remaining cards
        System.out.println("\nRemaining cards in deck:)");
        myDeckOfCards.printRemainingCards();

        //Reset the deck
        myDeckOfCards.reset();
        System.out.println("\nDeck reset. Cards remaining: " + myDeckOfCards.cardsRemaining());
        System.out.println("Next card after reset: " + myDeckOfCards.peekNextCard());

        // check if the deck is empty

        System.out.println("\nIs the deck empty? " + myDeckOfCards.isEmpty());

    }
}