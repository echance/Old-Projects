package exercises;

import java.util.Scanner;

public class DartBoard {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		int choice = 0;
		System.out.println("Choose a number to check scores (1-20): ");
		do {
			choice = keyboard.nextInt();
			if (choice < 21) {
				System.out.println("The scores possible for number " + choice + " on a dartboard ");
				System.out.printf("are %d, %d, and %d.", choice, choice*2, choice*3);
			}
		} while (choice < 21);
		
		System.out.println("\nGoodbye.");
		keyboard.close();
	}

}
