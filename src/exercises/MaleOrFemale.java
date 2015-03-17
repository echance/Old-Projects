package exercises;

import java.util.Scanner; 

public class MaleOrFemale {

	public static void main(String[] args) {
		
		String[] celebs = {"Beyonce (f)", "David Bowie (m)", "Elvis Costello (m)",
				"Madonna (f)", "Elton John (m)", "Charles Aznavour (m)"};
		Scanner keyboard = new Scanner(System.in);
		String choose, male = "(m)", fem = "(f)";
		int count = 0;
		
		System.out.println("Check for male (m) or female (f): ");
		choose = keyboard.nextLine();
		
		if (choose.equals("m")){
			for (String celeb : celebs){
				if (celeb.indexOf(male) != -1){
					count ++;
				}
				
			}
			
			System.out.println("There are " + count + " males in the list.");
		}
		else if (choose.equals("f")){
			for (String celeb : celebs){
				if (celeb.indexOf(fem) != -1){
					count ++;
				}
				
		}
			System.out.println("There are " + count + " females in the list.");
			
	}
	keyboard.close();

}}
