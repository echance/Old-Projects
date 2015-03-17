package exercises;

import java.io.*;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.StringTokenizer;

public class GuestList {

	public GuestList(){
		
		String name;
		Integer num, total1 = 0;
		Scanner keyboard = new Scanner(System.in);
		HashMap<String, Integer> guests = new HashMap<String, Integer>();
		
		System.out.println("Enter anything to start: ");
		
		do {
			keyboard.nextLine();
			System.out.println("Enter last name: ");
			name = keyboard.nextLine();
			System.out.println("Enter number of people in family: ");
			num = keyboard.nextInt();
			
			guests.put(name, num);
		} while (!name.equals("exit"));
		
		guests.remove(name);
		
		for (int value : guests.values()){
			total1 += value;
		}
		System.out.println("Number of guests added: " + total1);
		keyboard.close();
		readWrite(guests);

	}
	
	public void readWrite(HashMap<String, Integer> map){
		int total = 0;
		//write to file: guestlist.txt
		try{
			//File guestList = new File("guestlist.txt");
			//FileOutputStream fos = new FileOutputStream(guestList);
				PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("guestList.txt", true)));
				
				for(Entry<String, Integer> m : map.entrySet()){
					out.println(m.getKey() + ":\t" + m.getValue());
				}
				

				out.close();
		} catch (Exception e){}
		
		try {
			File toRead = new File("guestlist.txt");
			FileInputStream fis = new FileInputStream(toRead);
			
			Scanner sc = new Scanner(fis);
			
			HashMap<String, Integer> mapInFile = new HashMap<String, Integer>();
			
			//read data from file line by line:
			String currentLine;
			while(sc.hasNextLine()){
				currentLine = sc.nextLine();
				//now tokenize the currentLine:
				StringTokenizer st = new StringTokenizer(currentLine, ":\t", false);
				//put tokens on currentLine in map
				mapInFile.put(st.nextToken(), Integer.parseInt(st.nextToken()));
			}
			fis.close();
			
			//print All data in Map
			for (Entry<String, Integer> m : mapInFile.entrySet()){
				System.out.println(m.getKey() + "\t" + m.getValue());
			}
			
			for (int value : mapInFile.values()){
				total += value;
			}
			
			System.out.println("Total number of guests " + total);
			sc.close();
		} catch(Exception e){}
		
		
		
	}
	
public static void main(String args[]){
	new GuestList();
}

}


