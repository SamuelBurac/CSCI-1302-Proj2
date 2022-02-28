abstract public class Coin {
	private String NM; //NM stands for name
	
	
	public Coin(String Name) {
		setNM(Name);   
	}
	
	public String getNM() {  //returns the coins name
		return NM;
	}

	public void setNM(String nM) {  // set the coins name
		NM = nM;
	}
	
	public String returnName(Coin c) {  // Also returns the coins name using 
		return c.toString();     	    // toString() which is overridden in each coin class
										// I put this because it says in the instruction that there needs
		                                //to be a method that returns the coins name via the parent class
	}
	
	public abstract double getValue(); //gets coins value

	

}
