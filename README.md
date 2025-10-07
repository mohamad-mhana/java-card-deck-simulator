# Java Deck of Cards

A Java program modeling a **standard 52-card deck** with full functionality, including shuffling, dealing, peeking, printing remaining cards, and resetting the deck. Each card displays its **suit symbol** (♥ ♦ ♣ ♠) for better readability. This project demonstrates **object-oriented programming**, array management, and basic game logic in Java. It’s perfect for learning OOP concepts and building card game foundations.

## Features

- Shuffle the deck randomly
- Deal cards one at a time
- Peek at the next undealt card
- Print all remaining cards
- Reset the deck back to full 52 cards
- Check if the deck is empty
- Displays suit symbols (♥ ♦ ♣ ♠) for easy readability
- Clean and formatted output in columns

## Classes

### `Card`
Represents a single playing card with:

- Face (Ace, 2…King)  
- Suit (Hearts, Diamonds, Clubs, Spades)  
- Suit symbol for printing  
- String representation via `toString()`

### `DeckOfCards`
Represents the deck, including:

- Array of 52 `Card` objects  
- Methods:  
  - `shuffle()`  
  - `deal()`  
  - `peekNextCard()`  
  - `printRemainingCards()`  
  - `reset()`  
  - `cardsRemaining()`  
  - `isEmpty()`

### `Main`
Demonstrates the deck usage with formatted output.

# Sample Output:

Ace of Hearts ♥      Deuce of Hearts ♥     Three of Hearts ♥    Four of Hearts ♥
Five of Hearts ♥     Six of Hearts ♥       Seven of Hearts ♥    Eight of Hearts ♥
Nine of Hearts ♥     Ten of Hearts ♥       Jack of Hearts ♥     Queen of Hearts ♥
King of Hearts ♥     Ace of Diamonds ♦     Deuce of Diamonds ♦  Three of Diamonds ♦
Four of Diamonds ♦   Five of Diamonds ♦    Six of Diamonds ♦   Seven of Diamonds ♦
Eight of Diamonds ♦  Nine of Diamonds ♦    Ten of Diamonds ♦   Jack of Diamonds ♦
Queen of Diamonds ♦  King of Diamonds ♦    Ace of Clubs ♣      Deuce of Clubs ♣
Three of Clubs ♣     Four of Clubs ♣       Five of Clubs ♣     Six of Clubs ♣
Seven of Clubs ♣     Eight of Clubs ♣      Nine of Clubs ♣     Ten of Clubs ♣
Jack of Clubs ♣      Queen of Clubs ♣      King of Clubs ♣      Ace of Spades ♠
Deuce of Spades ♠    Three of Spades ♠     Four of Spades ♠    Five of Spades ♠
Six of Spades ♠      Seven of Spades ♠     Eight of Spades ♠   Nine of Spades ♠
Ten of Spades ♠      Jack of Spades ♠      Queen of Spades ♠   King of Spades ♠

Cards Remaining: 0

Next card (peek only): No more cards left to peek at

Remaining cards in deck:
No cards remaining in the deck

Deck reset. Cards remaining: 52
Next card after reset: Ace of Hearts ♥

Is the deck empty? false

## Learning Outcomes

Practice Object-Oriented Programming in Java

Work with arrays and indexing

Implement randomization and shuffling logic

Build utility methods for real-world applications
