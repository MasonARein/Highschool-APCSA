package apcs.guess;

import java.util.Scanner;

public class GuessRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Value rand = new Value();
		boolean sucsess = false;
		int in = 0;
		int input = 0;
		boolean play = true;
		Scanner reader = new Scanner(System.in);
		while (play == true) {
			while (sucsess == (false)) {
				try {
					System.out.println("What number am I thinking of?");
					in = reader.nextInt();
					Value guess = new Value(in);
					input += 1;
					if (rand.less(guess)) {
						System.out.println("Your guess is higher");
					} else if (rand.more(guess)) {
						System.out.println("Your guess is lower");
					} else if (rand.equals(guess)) {
						System.out.println("YOU WIN!");
						System.out.println("Number of Guesses: " + input);
						sucsess = true;
					}
				} catch (Exception e) {
					reader.nextLine();
					System.out.println("Error: " + e);
				}
			}
			System.out.println("\n");
			System.out.println("Would you like to play again? Yes-true No-false");
			try {
				play = reader.nextBoolean();
			} catch (Exception e) {
				reader.nextLine();
				System.out.println("Error: " + e);
			}
		}

	}

}
