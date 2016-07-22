package vendingMachine;

import java.util.Scanner;

public class MainMenu {
	public static void main(String[] args) {
		mainMenu();
	}
	/**
	 * This is the Main menu of the vending machine
	 */
	public static void mainMenu(){
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		menu();
		// Opening a while loop
		while(true){
			
			String currentId = in.nextLine();
			
			if (currentId.equals("1")) {
				addProduct();
			}else if (currentId.equals("2")) {
				addCoins();
			}else if (currentId.equals("3")) {
				purchase();
			}else if (currentId.equals("4")) {
				break;
			}else{
				System.out.println("Invalid option... Try again");
			}
			
		}// End of loop
		System.out.println("Thanks for stopping by! Have a nice day!");
	}
	
	/**
	 * Here we created the addProcuct menu
	 */
	public static void addProduct(){

		System.out.println("Please choose some product from the MENU\n");
		List.product();		
	}
	
	/**
	 * Here we created the addCoin menu
	 */
	public static void addCoins(){
		
		System.out.println("Add some coins...");		
	}
	
	/**
	 * Here we add the purchase menu
	 */
	public static void purchase(){
		
		System.out.println("Your order is compelte, press 4 to exit, "
				+ "or press 1 for another product!");
	}
	public static void menu(){
		System.out.println("[1] add product, [2] add coins, [3] purchase, [4] exit");
	}
}
