public class Nickle extends Coin { //nickle is spelled nickel
	private double valueN = 0.05; //valueN to make distinction that its value of a nickle
	
	public Nickle(String Name) {
		super(Name); 
	}

	public double getValue() { //returns value of Nickle
		
		return valueN;
	}
	
	public String toString() {
		String result = "Nickle";
		return result;
	}

}
