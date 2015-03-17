package exercises;


import java.util.Scanner;

public class HowManyChars {

	public static void main(String[] args) {
		
		String randWord;
		char[] vowels = {'a', 'e', 'i', 'o', 'u'};
		int[] vowCount = new int[5];
		int vowelCount = 0, i = 0, b = -1;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter a random word: ");
		randWord = keyboard.nextLine();
		randWord = randWord.toLowerCase().replaceAll("\\s+", "");
		
		System.out.println("Your condensed phrase is: " + randWord);
		
		//loop through vowels array to search for vowels in "randWord" variable
		for (char vow : vowels) {
			//resets counter and moves the index of vowCount up one
			i = 0;
			b++;
			for(int y=0; y<randWord.length(); y++) {
				if (randWord.charAt(y) == vow) {
					//counts each vowel and adds the number to corresponding array vowCount
					i++;
					vowelCount++;
					vowCount[b] = i;
					
				}	
			}
		}
		
		System.out.println("You have " + vowelCount + " vowels.");
		for (int z=0 ; z<vowels.length; z++) {
			System.out.println(Character.toString(vowels[z]).toUpperCase() + ": " + vowCount[z]);
		}

		

	}

}
