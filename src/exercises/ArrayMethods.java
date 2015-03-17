package exercises;


public class ArrayMethods {

	public static void main(String[] args) {

		int[] evan = {3,5,6,7,2,4,1};
		System.out.println(evan[1]);
		change(evan);
		System.out.println(evan[1]);
	}
	
	public static void change(int[] x){
		for(int count=0; count<x.length; count++)
			x[count]+=5;
	}

}
