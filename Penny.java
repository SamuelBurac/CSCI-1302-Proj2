public class Penny extends Coin{
	private double valueP = 0.01; //valueP to make distinction that its value of a penny
	
	public Penny(String Name) {
		super(Name);
		
	}

	
	public double getValue() { //returns value of Penny
		
		return valueP;
	}
	
	public String toString() {
		String result = "Penny";
		return result;
	}

}
