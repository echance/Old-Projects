package exercises;

import java.util.Scanner;

public class MoreFormulas {

	private static Scanner keyboard;

	public static void main(String[] args) {
		
		keyboard = new Scanner(System.in);
		int a, b, c;
		
		System.out.println("Welcome to the circus of value!");
		System.out.println("Please enter each part of your SSN:");
		a = keyboard.nextInt();
		b = keyboard.nextInt();
		c = keyboard.nextInt();
		
		System.out.println("Your SSN multiplied together is: " + eatFood(a,b,c));

	}
	
	public static int eatFood(int a, int b, int c)
	{
		int x = (int) (a * b * c);
		
		return x;
	}

}
