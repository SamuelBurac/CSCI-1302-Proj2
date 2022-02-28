public class Dime extends Coin{
	private double valueD = 0.1; //valueD to make distinction that its value of a Dime
	public Dime(String Name) {
		super(Name);
		
	}

	
	public double getValue() { //returns value of Dime
		
		return valueD;
	}
	
	public String toString() {
		String result = "Dime";
		return result;
	}

}