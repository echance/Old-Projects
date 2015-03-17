package exercises;


public class Fibonacci {

	public static void main(String[] args) {
		int first = 0;
		int second = 1;
		int fib = 0;
		
		for (int i=0; i<22; i++){
			fib = first + second;
			first = second;
			second = fib;
			System.out.println(second);
		}

	}

}
