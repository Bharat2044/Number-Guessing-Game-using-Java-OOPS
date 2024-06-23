package com.bharat.game;

import java.util.Scanner;

public class TestGame {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter Player1 Name: ");
			String name1 = sc.nextLine();
			
			System.out.print("Enter Player2 Name: ");
			String name2 = sc.nextLine();
			
			System.out.print("Enter Player3 Name: ");
			String name3 = sc.nextLine();
			
			System.out.println();
			
			Game g = new Game(name1, name2, name3);

			g.startGame();
		}
	}
}
