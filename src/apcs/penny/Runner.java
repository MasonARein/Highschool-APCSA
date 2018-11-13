package apcs.penny;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(" ______   ______     __   __     __   __     __  __        ______   __     ______   ______     __  __       ");
		System.out.println("/\\  == \\ /\\  ___\\   /\\ \"-.\\ \\   /\\ \"-.\\ \\   /\\ \\_\\ \\      /\\  == \\ /\\ \\   /\\__  _\\ /\\  ___\\   /\\ \\_\\ \\      ");
		System.out.println("\\ \\  _-/ \\ \\  __\\   \\ \\ \\-.  \\  \\ \\ \\-.  \\  \\ \\____ \\     \\ \\  _-/ \\ \\ \\  \\/_/\\ \\/ \\ \\ \\____  \\ \\  __ \\     ");
		System.out.println(" \\ \\_\\    \\ \\_____\\  \\ \\_\\\\\"\\_\\  \\ \\_\\\\\"\\_\\  \\/\\_____\\     \\ \\_\\    \\ \\_\\    \\ \\_\\  \\ \\_____\\  \\ \\_\\ \\_\\    ");
		System.out.println("  \\/_/     \\/_____/   \\/_/ \\/_/   \\/_/ \\/_/   \\/_____/      \\/_/     \\/_/     \\/_/   \\/_____/   \\/_/\\/_/    ");
		Square [][] board = new Square [5][5];
		board [0][0] = new Square(1);
		board [0][1] = new Square(1);
		board [0][2] = new Square(1);
		board [0][3] = new Square(1);
		board [0][4] = new Square(1);
		
		board [1][0] = new Square(1);
		board [1][1] = new Square(2);
		board [1][2] = new Square(2);
		board [1][3] = new Square(2);
		board [1][4] = new Square(1);
		
		board [2][0] = new Square(1);
		board [2][1] = new Square(2);
		board [2][2] = new Square(3);
		board [2][3] = new Square(2);
		board [2][4] = new Square(1);
		
		board [3][0] = new Square(1);
		board [3][1] = new Square(2);
		board [3][2] = new Square(2);
		board [3][3] = new Square(2);
		board [3][4] = new Square(1);
		
		board [4][0] = new Square(1);
		board [4][1] = new Square(1);
		board [4][2] = new Square(1);
		board [4][3] = new Square(1);
		board [4][4] = new Square(1);
		
		for(int i = 0; i < board.length;i++) {
			for(int j = 0; j < board[0].length; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println("");
		}
		
		int yrand = 0;
		int xrand = 0;
		int total = 0;
		int point = 0;
		String response = "a";
		Scanner reader = new Scanner(System.in);
		System.out.println("How Many Throws?");
		int goal = reader.nextInt();
		for(int a = 1; a < goal+1; a++) {
			System.out.println("Press Enter to Play");
			reader.nextLine();
			xrand = (int)(Math.random() * 5);
			yrand = (int)(Math.random() * 5);
			if(board[yrand][xrand].isOcc() == true) {
				point = board[yrand][xrand].getScore() * 2;
			}
			else {
				point = board[yrand][xrand].getScore();
			}
			if(board[yrand][xrand].isOcc() == true) {
				response = "Double up";
			}
			else if(board[yrand][xrand].getScore() == 1) {
				response = "Lame sauce";
			}
			else if(board[yrand][xrand].getScore() == 2) {
				response = "Not bad";
			}
			else{
				response = "Bullseye";
			}
			total = total + point;
			board[yrand][xrand].setOcc(true);
			
			for(int i = 0; i < board.length;i++) {
				for(int j = 0; j < board[0].length; j++) {
					System.out.print(board[i][j] + " ");
				}
				System.out.println("");
			}
			
			System.out.println("Throw " + a + " (" + yrand + ", " + xrand + "): " + board[yrand][xrand].getScore() + " Points - " + response + "!: Total Score: " + total );
		}
		System.out.println("Total score: " + total);
		if(total >= 2 * goal) {
			System.out.println("YOU WIN!");
		}
		else {
			System.out.println("YOU LOSE");
		}
	}

}
