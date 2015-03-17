package exercises;

import java.util.Scanner;

public class FootyScores {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter numbers separated by spaces: ");
		String nums = keyboard.nextLine();
		String[] result = nums.split(" ");
		double[] intoDub = new double[result.length];
		double finalres = 0;
		
		for (int i=0; i< result.length; i++){
			intoDub[i] = Double.parseDouble(result[i]);
			finalres += intoDub[i];
		}
		
		finalres = Math.round(finalres * 100);
		finalres = finalres/100;
		
		System.out.println("All your numbers added: " + finalres);

	keyboard.close();
	}
}
