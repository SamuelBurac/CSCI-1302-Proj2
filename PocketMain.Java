import java.util.Scanner;
public class PocketMain {
	static Pocket Sam = new Pocket();  //Not exactly sure what to name a pocket so I just put my name xD
	
	static void Menu() { // this is a method to print the main menu I wrote it because I didn't want it taking space in main
		System.out.println("If you would like to add a coin type the letter 'A' and press enter.\n"
				 
				 + "If you would like to remove a coin type the letter 'R' and press enter.\n"
				 
				 + "If you would like to display the coins in you pocket type the letter " 
				 + "'D' and press enter.\n" 
				 
				 + "If you would like to see the total value of the coins in your pocket " 
				 + "type the letter 'C' and press enter.\n" 
				 + "If you would like to quit the program type the letter 'X' and press enter.");
	}
	
	public static void main(String[] args) throws NoSuchCoin {
		Scanner scan = new Scanner(System.in); 
		
		NoSuchCoin problem = new NoSuchCoin //is used in the submenu for adding and removing coins
				("Sorry, that doesn't seem to be a valid coin \n" 
			   + "Please check your spelling and don't type any spaces. \n" 
			   + "Valid coin spellings are penny, pennies, nickel, nickels, dime," 
			   + " dimes, quarter, and quarters.\n");
		
		NoSuchCoin problema = new NoSuchCoin("Please type and enter a valid menu option\n");  
												// thrown when there's a wrong input in the main menu
		Coin P = new Penny("penny");   //these coin objects are instantiated here and then used to add and remove coins 
		Coin N = new Nickle("Nickle"); 
		Coin D = new Dime("Dime");
		Coin Q = new Quarter("Quarter");
		String keepGoing = "Y";				//To keep the while loop going 
		String menuOptions = "K";			//To hold menu options
		String subMenuOptions = "G";		//to hold submenu options though I might've been fine with just menuOptions
		
		System.out.println("Hello, welcome to your pocket.\n"); // welcomes user
		
		while (keepGoing.equals("Y")) {
			Menu();						//shows menu which prompts user to enter an option
			
			menuOptions = scan.nextLine(); //gets user input
			int A = menuOptions.charAt(0); //converts user input to ASCII which I used to catch any wrong inputs 
			
			try {   					//8 if statements with different ranges that would throw an exception
				if (A > 0 && A < 65) {  //I originally tried to write it as one if statement like I did in line 79, 
					throw problema;    //but I was putting || instead of && and I didn't realize that till I wrote  
				}					   //the try statements for the add coins submenu
				if (A == 66) {
					throw problema;
				}
				if (A > 68 && A < 82) {
					throw problema;
				}
				if (A > 82 && A < 97) {
					throw problema;
				}
				if (A == 98) {
					throw problema;
				}
				if (A > 100 && A < 114) {
					throw problema;
				}
				if (A > 114 && A < 120) {
					throw problema;
				}
				if (A >120) {
					throw problema;
				}
			
			if (menuOptions.equals("A") || menuOptions.equals("a")) {  //if statement to add coins
				String keepGoing2 = "Y"; // allows the code to keep going
				while (keepGoing2 == "y" || keepGoing2 == "Y") { //while loop so you can add more coins
					System.out.println("To add a coin type the name of the coin and press enter."); //prompts user to enter coin type 
					subMenuOptions = scan.nextLine();					//I hope its ok that the user enters the coin type here rather then the main menu
					
					try { //try statment to catch inccorect spellings
						if (!subMenuOptions.equals("penny") && !subMenuOptions.equals("Penny") && !subMenuOptions.equals("nickel") 
								&& !subMenuOptions.equals("Nickel") && subMenuOptions.equals("dime") && subMenuOptions.equals("Dime")
								&& subMenuOptions.equals("quarter") && subMenuOptions.equals("Quarter")) {
							throw problem;
						}
					
					if (subMenuOptions.equals("penny") || subMenuOptions.equals("Penny")) { //adds penny if user enters "penny" or "Penny"
						Sam.addCoin(P);
						System.out.println("You just added a penny.\n");//tells user that a coin was added
					}
				
					if (subMenuOptions.equals("nickel") || subMenuOptions.equals("Nickel")) {//adds nickel if user enters "nickel" or "nickel"
						Sam.addCoin(N);
						System.out.println("You just added a nickel.\n");
					}
				
					if (subMenuOptions.equals("dime") || subMenuOptions.equals("Dime")) {//adds dime if user enters "dime" or "Dime"
						Sam.addCoin(D);
						System.out.println("You just added a dime.\n");
					}
				
					if (subMenuOptions.equals("quarter") || subMenuOptions.equals("Quarter")) {//adds quarter if user enters "quarter" or "Quarter"
						Sam.addCoin(Q);
						System.out.println("You just added a quarter.\n");
					}
					
					}
					catch(NoSuchCoin exception) {// the catch statement prints the exception message
						if (!subMenuOptions.equals("penny") && !subMenuOptions.equals("Penny") && !subMenuOptions.equals("nickel") 
								&& !subMenuOptions.equals("Nickel") && subMenuOptions.equals("dime") && subMenuOptions.equals("Dime")
								&& subMenuOptions.equals("quarter") && subMenuOptions.equals("Quarter")) {
							System.out.println(problem.getMessage());
						}
						
					}
					//prompts the user to add another coin or return to main menu
					System.out.println("If you would like to add another coin type 'Y' and press enter.\n"
									 + "If you would like to exit back to the main menu\n"
									 + "type 'exit' and press enter.");
					subMenuOptions = scan.nextLine();
					if (subMenuOptions.equals("y") || subMenuOptions.equals("Y")) {
						keepGoing2 = "Y";
						
					}
					else {								//anything other than y or Y will exit the adding loop
						keepGoing2 = subMenuOptions;
					}
				}
			}
			
			if (menuOptions.equals("R") || menuOptions.equals("r")) { //if statement for removal pretty much and exact copy of the add if statement
				String keepGoing3 = "Y";							 // but with remove instead of add
				while (keepGoing3 == "y" || keepGoing3 == "Y") {
					System.out.println("To remove a coin type the name of the coin and press enter."); //User prompt
					subMenuOptions = scan.nextLine();
					
					try { //the exact same try statement from the add option 
						if (!subMenuOptions.equals("penny") && !subMenuOptions.equals("Penny") && !subMenuOptions.equals("nickel") 
								&& !subMenuOptions.equals("Nickel") && subMenuOptions.equals("dime") && subMenuOptions.equals("Dime")
								&& subMenuOptions.equals("quarter") && subMenuOptions.equals("Quarter")) {
							throw problem;
						}
					
					if (subMenuOptions.equals("penny") || subMenuOptions.equals("Penny")) {//removes a penny
						Sam.removeCoin(P);
						System.out.println("You just removed a penny.\n");
					}
				
					if (subMenuOptions.equals("nickel") || subMenuOptions.equals("Nickel")) {//removes a nickel
						Sam.removeCoin(N);
						System.out.println("You just removed a nickel.\n");
					}
				
					if (subMenuOptions.equals("dime") || subMenuOptions.equals("Dime")) {//removes a dime
						Sam.removeCoin(D);
						System.out.println("You just removed a dime.\n");
					}
				
					if (subMenuOptions.equals("quarter") || subMenuOptions.equals("Quarter")) {//removes a quarter
						Sam.removeCoin(Q);
						System.out.println("You just removed a quarter.\n");
					}
					
					}
					catch(NoSuchCoin exception) {//same as catch statement from add
						if (!subMenuOptions.equals("penny") && !subMenuOptions.equals("Penny") && !subMenuOptions.equals("nickel") 
								&& !subMenuOptions.equals("Nickel") && subMenuOptions.equals("dime") && subMenuOptions.equals("Dime")
								&& subMenuOptions.equals("quarter") && subMenuOptions.equals("Quarter")) {
							System.out.println(problem.getMessage());
						}
						
					}
					//prompts user to remove more coins or go back to the main menu
					System.out.println("If you would like to remove another coin type 'Y' and press enter.\n"
									 + "If you would like to exit back to the main menu\n"
									 + "type 'exit' and press enter.");
					subMenuOptions = scan.nextLine();
					if (subMenuOptions.equals("y") || subMenuOptions.equals("Y")) {
						keepGoing3 = "Y";
						
					}
					else {
						keepGoing3 = subMenuOptions;
					}
				}
			}
			
			if (menuOptions.equals("D") || menuOptions.equals("d")) {
				System.out.println(Sam.coinCount()); //calls method from Pocket.java to count the coins and return a string
			}
			
			if (menuOptions.equals("C") || menuOptions.equals("c")) {
				System.out.println("Your pocket is worth $" + Sam.coinsValue());//calls method from Pocket.java to add up the value of the coins
			}																	//and return a string
			
			if (menuOptions.equals("x") || menuOptions.equals("X")) {
				keepGoing = "x";									//sets keepGoing to 'x' which ends the loop
			}
			
			} 
			catch(NoSuchCoin excetpion) {// catches the problema exception and prints the message
				if (A > 0 && A < 65) {
					System.out.println(problema.getMessage());
				}
				if (A == 66) {
					System.out.println(problema.getMessage());
				}
				if (A > 68 && A < 82) {
					System.out.println(problema.getMessage());
				}
				if (A > 82 && A < 97) {
					System.out.println(problema.getMessage());
				}
				if (A == 98) {
					System.out.println(problema.getMessage());
				}
				if (A > 100 && A < 114) {
					System.out.println(problema.getMessage());
				}
				if (A > 114 && A < 120) {
					System.out.println(problema.getMessage());
				}
				if (A >120) {
					System.out.println(problema.getMessage());
				}
				
			}	

		}
		scan.close();
	}
}

