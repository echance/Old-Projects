package exercises;


public class DivideThree {

	public static void main(String[] args) {
		int thr = 0, two = 0;
		
		for (int i=1; i<=1000; i++){
			if (i % 3 == 0)
				thr++;
			if (i % 2 == 0)
				two++;
		}
		
		System.out.println("There are " + thr + " numbers divisible by 3.");
		System.out.println("There are " + two + " numbers divisible by 2.");

	}

}
