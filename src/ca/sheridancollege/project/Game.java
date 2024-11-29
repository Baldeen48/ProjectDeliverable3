/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Author: Baldeen
 * Date: [29 November 2024]
 */
package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 * The class that models your game. You should create a more specific child of this class and instantiate the methods
 * given.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 * modified by Baldeen 22 November 2024
 */
public  class Game {

     private final String name;  // The name of the game
    private final int rounds;  // Number of rounds to play
    private final ArrayList<Player> players;  // List of players

    // Constructor to initialize the game with a name and number of rounds
    public Game(String name, int rounds) {
        this.name = name;
        this.rounds = rounds;
        this.players = new ArrayList<>();
    }

    // Method to add a player to the game
    public void addPlayer(Player player) {
        players.add(player);
    }

    // Method to start the game and play the rounds
    public void start() {
        System.out.println("Starting the game: " + name);
        for (int round = 1; round <= rounds; round++) {
            System.out.println("\nRound " + round);
            for (Player player : players) {
                player.play();  // Each player takes their turn in the round
            }
        }
        declareWinner();  // Declare the winner after all rounds are complete
    }

    // Method to declare the winner by comparing scores
    public void declareWinner() {
        Player winner = players.get(0);  // Assume the first player is the winner
        for (Player player : players) {
            if (player.getScore() > winner.getScore()) {
                winner = player;  // Update winner if the player's score is higher
            }
        }
        System.out.println("\nThe winner is: " + winner.getName() + " with score " + winner.getScore());
    }

    // Main method to start the game
    public static void main(String[] args) {
        // Create a new game with 4 rounds
        Game game = new Game("Card Game", 4);

        // Add players to the game
        Player player1 = new Player("Alice");  // Human player
        Player player2 = new Player("Bob");  // AI player

        game.addPlayer(player1);  // Adding player1
        game.addPlayer(player2);  // Adding player2

        // Start the game and run the rounds
        game.start();
    }
}