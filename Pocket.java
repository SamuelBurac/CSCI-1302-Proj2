import java.util.ArrayList;
public class Pocket {
	public Pocket() {
		
	}
	
	ArrayList<Coin> coins = new ArrayList<Coin>();

	public void addCoin(Coin c) {  //Adds coin c to coins
		coins.add(c);
	}
	
	public void removeCoin(Coin c) { //removes coin c from coins
		coins.remove(c);
	}
	
	public String coinCount() {
		int size = coins.size();
		int pennies = 0;       //These variables store the amount of occurences for each type of coin
		int nickles = 0;
		int dimes = 0;
		int quarters = 0;
		int errors = 0;        //This is here just in case something goes wrong and to fill the else statment.
		
		String coinCount;
		if (size > 0) {
			for (int i = 0; i < size;++i) { //iterates through all coins in the coins and compares their value to other coins values
				if (coins.get(i).getValue() == 0.01) { // I know comparing doubles is not good with java but since 
					pennies++;							// the variables are not affected by math I think its ok.
				}
			
				else if (coins.get(i).getValue() == 0.05) {
					nickles++;
				}
				
				else if (coins.get(i).getValue() == 0.1) {
					dimes++;
				}
			
				else if (coins.get(i).getValue() == 0.25) {
					quarters++;
				}
				else {
					errors++;
				}
			}
		coinCount = "There are " + pennies + " pennies\n";  //this part instantiates the string
		coinCount += "There are " + nickles + " nickles\n"; // and these parts add on to the string resulting in the full string that will be submitted
		coinCount += "There are " + dimes + " dimes\n";
		coinCount += "There are " + quarters + " quarters\n";
		
		
		return coinCount;		
		}
		else {
			return("There are no coins in your pocket, add some.");
		}
	}
	
	public double coinsValue() {    // gets the value of all the coins in the coins
		double totalValue = 0;  // total value of the coins
		int size = coins.size();  // gets how many coins there are in the coins for loop purposes
		
		for (int i = 0; i < size; ++i) {  // finds value of a value then adds it to the toatalValue then move on till the end 
			totalValue += coins.get(i).getValue(); 
		}
		  
		return Math.round(totalValue * 100.0) / 100.0; //I put it to round up to nearest hundredth place so there isn't .0000000001 when coinsValue is called
	}
}		
