package exercises;

import java.util.Scanner;

public class NumberYear {
	
	//calculate the total number of days in a year given a date in "month day" format
	public static void main(String[] args) {
		
		String[] months = {"january", "february", "march", "april", "may",
				"june", "july", "august", "september", "october", "november",
				"december"};
		int[] numDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		Scanner key = new Scanner(System.in);
		int counter = -1;
		int total = 0;
		
		System.out.println("Please enter the month and day to calculate: ");
		String userIn = key.nextLine().toLowerCase();
		int userNum = Integer.parseInt(userIn.replaceAll("[\\D]", ""));
		
		for (String mon : months){
			counter++;
			if (userIn.indexOf(mon) != -1){
				System.out.println(mon);
				break;
			}
		}
		
		for (int i=0; i<counter; i++){
			total += numDays[i];
		}
		
		System.out.println(total + userNum);
		
		key.close();

	}

}
