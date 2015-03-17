package exercises;

import java.util.Scanner;

public class CenturyLeap {

	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);
		int year;
		String isLeapYear;
		
		System.out.println("Which year would you like info on? ");
		year = inp.nextInt();
		
		int cent = (int)(year * .01) + 1;
		if (year % 400 == 0)
			isLeapYear = "Yes";
		else if (year % 100 == 0)
			isLeapYear = "No";
		else if (year % 4 == 0)
			isLeapYear = "Yes";
		else
			isLeapYear = "No";
		
		
		System.out.println("Century: " + cent + "\nLeap Year: " + isLeapYear);
		
		inp.close();
	}
}
