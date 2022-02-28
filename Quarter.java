public class Quarter extends Coin{
	private double valueQ = 0.25; //valueQ to make distinction that its value of a Quarter
	
	public Quarter(String Name) {
		super(Name);
		
	}

	
	public double getValue() { //returns value of Quarter
		
		return valueQ;
	}
	
	public String toString() {
		String result = "Quarter";
		return result;
	}
	
}
