package exercises;

import java.util.Scanner;

public class ObjectLearning {

	public static void main(String[] args) {
		
		String x; 
		String y;
		int z;
		
		Scanner inp = new Scanner(System.in);
		
		do {
			inp.nextLine();
			System.out.println("\nEnter Last Name: ");
			x = inp.nextLine();
			System.out.println("Enter location: ");
			y = inp.nextLine();
			System.out.println("Enter number of people: ");
			z = inp.nextInt();
			
			ObjectConst guest = new ObjectConst(x, y, z);
		
		} while (z != 0);
		
		inp.close();

	}

}
