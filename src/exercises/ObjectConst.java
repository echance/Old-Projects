package exercises;


public class ObjectConst {
	private String last;
	private String location;
	private int numPeople;
	public static int total = 0;
	
	public ObjectConst(String ln, String loc, int p){
		this.last = ln;
		this.location = loc;
		this.numPeople = p;
		total += this.numPeople;
		
		System.out.printf("New guest added: %s from %s. Number in family: %d. Guestlist total: %d.",
				this.last, this.location, this.numPeople, total);
	}
	
	public String getLast(){
		return this.last;
	}
	
	public String getLocation(){
		return this.location;
	}
	
	public int getNumPeople(){
		return this.numPeople;
	}
	
	

}
