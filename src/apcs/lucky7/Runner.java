package apcs.lucky7;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int wall;
		int luck;
		int dice;
		int payin;
		int round = 0;
		int max = 0;
		int maxround = 0;
		boolean play = true;
		while (play == true) {
			System.out.println(" /$$                           /$$                       /$$$$$$$$ /$$       ");
			System.out.println("| $$                          | $$                      |_____ $$/| $/       ");
			System.out.println("| $$       /$$   /$$  /$$$$$$$| $$   /$$ /$$   /$$           /$$/ |_//$$$$$$$");
			System.out.println("| $$      | $$  | $$ /$$_____/| $$  /$$/| $$  | $$          /$$/    /$$_____/");
			System.out.println("| $$      | $$  | $$| $$      | $$$$$$/ | $$  | $$         /$$/    |  $$$$$$ ");
			System.out.println("| $$      | $$  | $$| $$      | $$_  $$ | $$  | $$        /$$/      \\____  $$");
			System.out.println("| $$$$$$$$|  $$$$$$/|  $$$$$$$| $$ \\  $$|  $$$$$$$       /$$/       /$$$$$$$/");
			System.out.println("|________/ \\______/  \\_______/|__/  \\__/ \\____  $$      |__/       |_______/ ");
			System.out.println("                                         /$$  | $$                           ");
			System.out.println("                                        |  $$$$$$/                           ");
			System.out.println("                                         \\______/                            ");


			System.out.println("How much money do you have?");
			wall = reader.nextInt();
			System.out.println("What lucky number will you win on?");
			luck = reader.nextInt();
			System.out.println("How many sides does each die have?");
			dice = reader.nextInt();
			System.out.println("How much money will each round cost?");
			payin = reader.nextInt();

			for (; wall > 0;) {
				++round;
				System.out.println("");
				double x = Math.random();
				x = (int) (((x * dice) * 2) + 2);
				System.out.println("Dice Roll: " + round);
				System.out.println("Result: " + x);
				wall = wall - payin;
				if (x == luck) {
					wall = wall + (int) (payin * 4);
				}
				if (wall > max) {
					max = wall;
					maxround = round;
				}
				System.out.println("Current Amount of Money: " + wall);
				System.out.println("");
				if(wall > 100000) {
				System.out.println("Good job, you cheated!");
				wall = 0;
				}
			}
			System.out.println("");
			System.out.println("Number of Rolls:" + round);
			System.out.println("The max amount of money was " + max + " at roll number " + maxround);

			System.out.println("Play Again? (true or false)");
			play = reader.nextBoolean();
			System.out.println("");
			System.out.println("");
		}

	}

}
