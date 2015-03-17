package exercises;


public class PrimeNums {
	
	public static void main(String[] args){
		
		int num = 3;
		boolean isPrime = true;
		
	
		for  (int count = 2; count <= 1000; ){
			for (int i=2; i<num; i++){
				if (num%i == 0){
					isPrime = false;
					break;
				}
				
			}
			if (isPrime){
				System.out.println(num);
				count++;
			}
			isPrime = true;
			num++;
			
		}
		}
	}
