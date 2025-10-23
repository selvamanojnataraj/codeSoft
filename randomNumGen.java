package NumberGuessGame;

import java.util.Random;
import java.util.Scanner;

public class randomNumGen {
	public static void game() {
		Scanner sc = new Scanner(System.in);
		int Score = 0;
		Random rand = new Random();
		int num = rand.nextInt(1, 10);
		int i = 1;
		while (i <= 3) {
			System.out.println();
			System.out.println("Enter Your Guessing Number --->");
			int guess = sc.nextInt();
			if (num == guess) {
				System.out.println("congratulation you are correct");
				System.out.println("--------------------------------");
				num = rand.nextInt(1, 10);
				Score += 1;
			}

			else {
				System.out.println("Better Luck next time");
				System.out.println("-----------------------");
			}
			i += 1;
		}
		System.out.println(" your Score  = " + Score);
		System.out.println("--------------------------");
		System.out.println("if you want to continue press 1");
		System.out.println("if you want to exit press 0");
		int in = sc.nextInt();
		if (in == 1) {
			game();
		} else if (in == 0) {
			System.out.println("Thank you ");
		} else {
			System.out.println("Invalid input ");
		}
	}

	public static void main(String[] args) {
		game();
	}
}
