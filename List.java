package vendingMachine;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class List {

	public static void product() {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		// Adding products in list
		Map<Integer, String> product = new HashMap<Integer, String>();
		
		product.put(1, "Milk");
		product.put(2, "Wather");
		product.put(3, "Snickers");
		product.put(4, "Bounty");

		// Adding prices for the products
		Map<Integer, Double> price = new HashMap<Integer, Double>();
		
		price.put(1, 1.25);
		price.put(2, 1.0);
		price.put(3, 0.80);
		price.put(4, 0.80);
		
		// Creating the menu
		System.out.println("MENU:");
		
		System.out.println("---------------------------");
		// Adding each product with its price to the screen
		for (int i = 1; i <= price.size() && i <= product.size(); i++) {
			System.out.printf("| [%d] %s - %.2f leva\n", i, product.get(i), price.get(i));
		}
		
		System.out.println("---------------------------");
		// An option to return in Main menu
		System.out.println("[5] Return to main menu.");	
		
		String currentValue = in.nextLine();
		// First product
		if (currentValue.equals("1")) {
			
			System.out.printf("You have order %s\nPress [2] to add coins\n", product.get(1));
			
			String cV = in.nextLine();
			
			/*
			 * If we press 2, we are going in addCoins method
			 */
			if (cV.equals("2")) {
				MainMenu.addCoins();
				
				System.out.printf("You have to pay %.2f leva\nPlease add coins now\n", price.get(1));
				
				// The program are waiting the user to pay
				double coins = in.nextDouble();
				/*
				 * When we are in addCoins method we need to check if the sum
				 * is the expected sum, or its grater. If it grater, we have
				 * to give back some change, otherwise we continue to the next menu
				 */
				if (coins == price.get(1)) {
				
					System.out.println("Press [3] to complete.");
				
				}else if(coins > price.get(1)){
					System.out.printf("Your change is %.2f leva\nPress [3] to complete the order.\n", (coins - price.get(1)));
				}
			}// Second product		
		}else if (currentValue.equals("2")) {
			
			System.out.printf("You have order %s\nPress [2] to add coins\n", product.get(2));
			
			String cV = in.nextLine();
			
			if (cV.equals("2")) {
			
				MainMenu.addCoins();
				
				System.out.printf("You have to pay %.2f leva\nPlease add coins now\n", price.get(2));
				
				double coins = in.nextDouble();
				
				if (coins == price.get(2)) {
					System.out.println("Press [3] to complete.");
				
				}else if(coins > price.get(2)){
					System.out.printf("Your change is %.2f leva\nPress [3] to complete the order.\n", (coins - price.get(2)));
				}
				
			}else{
				System.out.println("Please press [2] to add coins!");
			} 	
			// Third product
		}else if (currentValue.equals("3")) {
			
			System.out.printf("You have order %s\nPress [2] to add coins\n", product.get(3));
			
			String cV = in.nextLine();
			
			if (cV.equals("2")) {
			
				MainMenu.addCoins();
				
				System.out.printf("You have to pay %.2f leva\nPlease add coins now\n", price.get(3));
				
				double coins = in.nextDouble();
				
				if (coins == price.get(3)) {
					System.out.println("Press [3] to complete.");
				
				}else if(coins > price.get(3)){
					System.out.printf("Your change is %.2f leva\nPress [3] to complete the order.\n", (coins - price.get(3)));
				}
				
			}else{
				System.out.println("Please press [2] to add coins!");
			}
			// Fourth product
		}else if (currentValue.equals("4")) {
			
			System.out.printf("You have order %s\nPress [2] to add coins\n", product.get(4));
			
			String cV = in.nextLine();
			
			if (cV.equals("2")) {
			
				MainMenu.addCoins();
				
				System.out.printf("You have to pay %.2f leva\nPlease add coins now\n", price.get(4));
				
				double coins = in.nextDouble();
				
				if (coins == price.get(4)) {
					System.out.println("Press [3] to complete.");
				
				}else if(coins > price.get(4)){
					System.out.printf("Your change is %.2f leva\nPress [3] to complete the order.\n", (coins - price.get(4)));
				}
				
			}else{
				System.out.println("Please press [2] to add coins!");
			} 	
			// Return option
		}else{
			MainMenu.menu();
		} 	
	}
}