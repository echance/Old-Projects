package exercises;


public class Diagonal {

	public static void main(String[] args) {
		
		String diag = "DIAGONALLY";
		String pad = "";
		
		for (int i=0; i<diag.length(); i++){
			pad = diag.substring(i, i + 1);
			pad = padLeft(pad, i + 1);
			
			System.out.println(pad);
		}

	}
	
	public static String padLeft(String str, int position){
		return String.format("%1$" + position + "s", str);
	}

}
