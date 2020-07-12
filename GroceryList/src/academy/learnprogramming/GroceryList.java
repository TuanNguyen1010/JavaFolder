package academy.learnprogramming;

import java.util.ArrayList;

public class GroceryList {

    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " in your grocery list");
        System.out.println("Your shopping list contains: ");
        for(int i = 0; i < groceryList.size(); i++) {
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }

    public void modifyGroceryList(String currentItem, String newItem) {
       int groceryPosition = findItem(currentItem);
       if(groceryPosition >= 0){
           modifyGroceryList(groceryPosition, newItem);
       }
    }
    private void modifyGroceryList(int position, String item) {
        System.out.println("Item " + groceryList.get(position) + " being replaced with " + item);
        groceryList.set(position, item);
    }

    public void removeGroceryItem(String itemName){
        int groceryPosition = findItem(itemName);
        if(groceryPosition >= 0){
            removeGroceryItem(groceryPosition);
        }
    }

    private void removeGroceryItem(int position) {
        System.out.println("Item " + groceryList.get(position) + " has been removed");
        groceryList.remove(position);
    }

    private int findItem(String searchItem) {
        return groceryList.indexOf(searchItem);
    }

    public boolean onFile(String item) {
        int groceryPosition = findItem(item);
        if(groceryPosition >= 0){
            return true;
        } else {
            return false;
        }
    }
}
