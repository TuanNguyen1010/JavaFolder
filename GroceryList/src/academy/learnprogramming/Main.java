package academy.learnprogramming;

import java.util.Scanner;

public class Main {

	private static Scanner scanner = new Scanner(System.in);
	private static GroceryList tuanShopping = new GroceryList();

    public static void main(String[] args) {
    	boolean quit = false;
    	int choice = 0;
    	printInstructions();
		while(!quit) {
			System.out.println("Enter a choice");
			choice = scanner.nextInt();
			scanner.nextLine();
			switch(choice) {
				case 0:
					printInstructions();
					break;
				case 1:
					tuanShopping.printGroceryList();
					break;
				case 2:
					addItem();
					break;
				case 3:
					modifyItem();
					break;
				case 4:
					removeItem();
					break;
				case 5:
					searchForItem();
					break;
				case 6:
					quit = true;
					break;
			}

		}

    }

    public static void printInstructions() {
		System.out.println("0 - print options");
		System.out.println("1 - to print list of grocery items");
		System.out.println("2 - to add an item to the list ");
		System.out.println("3 - to modify item in list");
		System.out.println("4 - to remove an item from the list");
		System.out.println("5 - to search for item in list");
		System.out.println("6 - to quit application");
	}

	public static void addItem() {
		System.out.println("Enter the item to add");
		tuanShopping.addGroceryItem(scanner.nextLine());
	}

	public static void modifyItem() {
		System.out.println("Enter the Item you would like modified");
		String currentItem = scanner.nextLine() ;
		System.out.println("Enter item you would like to replace with ");
		String updateItem = scanner.nextLine();
		tuanShopping.modifyGroceryList(currentItem, updateItem);
	}

	public static void removeItem() {
		System.out.println("Enter item  you would like to remove");
		String itemToRemove = scanner.nextLine();
		tuanShopping.removeGroceryItem(itemToRemove);
	}

	public static void searchForItem() {
		System.out.println("Enter item you'd like to search for ");
		String itemQuery = scanner.nextLine();
		if(tuanShopping.onFile(itemQuery)) {
		System.out.println("Found " + itemQuery + " on shopping list");
		} else {
			System.out.println("Unable to find " + itemQuery + " on shopping list");
		}
	}
}
