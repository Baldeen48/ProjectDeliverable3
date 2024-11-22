package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;

/**
 * A concrete class that represents any grouping of cards for a Game.
 * The group of cards has a maximum size attribute which is flexible for reuse.
 * 
 * modified by Baldeen 22 November 2024
 */
public class GroupOfCards {
     private ArrayList<Card> cards;  // List to hold the cards

    // Constructor to initialize the deck with 10 cards (with values from 1 to 10)
    public GroupOfCards() {
        cards = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            cards.add(new Card(i));  // Create 10 cards with values 1 to 10
        }
        shuffle();  // Shuffle the deck
    }

    // Method to shuffle the cards in the deck
    public void shuffle() {
        Collections.shuffle(cards);  // Shuffle the deck randomly
    }

    // Method to draw a card from the deck
    public Card drawCard() {
        if (cards.isEmpty()) {
            System.out.println("Deck is empty.");
            return null;
        }
        return cards.remove(0);  // Draw the top card (remove from deck)
    }
}