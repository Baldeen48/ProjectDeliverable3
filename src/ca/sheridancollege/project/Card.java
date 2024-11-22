package ca.sheridancollege.project;

/**
 * A class to be used as the base Card class for the project. Must be general enough to be instantiated for any Card
 * game. Students wishing to add to the code should remember to add themselves as a modifier.
 */

/**
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 * modified by Baldeen 22 November 2024
 */
public  class Card {
    private final int value;  // The value of the card (1-10)

    // Constructor to initialize the card with a value
    public Card(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}