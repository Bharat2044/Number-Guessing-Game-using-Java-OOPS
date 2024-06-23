package com.bharat.game;

import java.util.Scanner;

public class Player {
	private String name;
	private int guess;
	
	static Scanner sc = new Scanner(System.in);

	public Player(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGuess() {
		return guess;
	}

	public void setGuess(int guess) {
		this.guess = guess;
	}

	public void makeGuess() {		
		System.out.print("Hi " + name+ ", guess your number between 1 to 10: ");
		guess = sc.nextInt();
	}

}
