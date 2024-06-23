package com.bharat.game;

public class Game {
	private int expectedGuess;
	private Player p1, p2, p3;

	// Constructor
	public Game(String name1, String name2, String name3) {
		p1 = new Player(name1);
		p2 = new Player(name2);
		p3 = new Player(name3);
	}

	private boolean checkWinner() {
		if (p1.getGuess() == expectedGuess) {
			System.out.println("\nWoah " + p1.getName() + " wins!");
			return true;
		} else if (p2.getGuess() == expectedGuess) {
			System.out.println("\nWoah " + p2.getName() + " wins!");
			return true;
		} else if (p3.getGuess() == expectedGuess) {
			System.out.println("\nWoah " + p3.getName() + " wins!");
			return true;
		}

		return false;
	}

	// Launch the Game
	public void startGame() {
		System.out.println("Hi " + p1.getName() + ", " + p2.getName() + ", " + p3.getName() + " Welcome to the Game!!");

		while (true) {
			System.out.println("\n====================================================\n");

			expectedGuess = (int) (Math.random() * 10);

			p1.makeGuess();
			p2.makeGuess();
			p3.makeGuess();

			System.out.println("\nNumber to guess is: " + expectedGuess);

			System.out.println(p1.getName() + " guessed " + p1.getGuess());
			System.out.println(p2.getName() + " guessed " + p2.getGuess());
			System.out.println(p3.getName() + " guessed " + p3.getGuess());

			boolean someOneWins = checkWinner();

			if (someOneWins) {
				System.out.println("Game Over!!");
				break;
			} else {
				// Update the Guess
				expectedGuess = (int) (Math.random() * 10);
			}
		}
	}

}
