/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

/**
 * A class that models each Player in the game. Players have an identifier, which should be unique.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 * modified by Baldeen 22 November 2024
 * 
 */
public  class Player {
       private String name;  // The player's name
    private int score;  // The player's score

    // Constructor to initialize the player with a name and starting score of 0
    public Player(String name) {
        this.name = name;
        this.score = 0;
    }

    // Getter for the player's name
    public String getName() {
        return name;
    }

    // Getter for the player's score
    public int getScore() {
        return score;
    }

    // Method to simulate the player's turn
    public void play() {
        int points = drawCard();  // Draw a card
        score += points;  // Add points to the player's score
        System.out.println(name + " drew a card worth " + points + " points. Total score: " + score);
    }

    // Method to simulate drawing a card with a random value between 1 and 10
    private int drawCard() {
        return (int) (Math.random() * 10) + 1;  // Return a random value between 1 and 10
    }
}
