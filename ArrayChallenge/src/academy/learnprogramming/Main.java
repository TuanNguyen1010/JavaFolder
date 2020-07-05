package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
	int[] arr = getInteger(5);
	printArray(arr);
//
	printArray(sortIntegers(arr));
    }

    private static int[] getInteger(int number){
        int[] arr = new int[number];

        System.out.println("Enter in your numbers");
        for(int i = 0; i < number; i++){
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    private static void printArray(int[] array){
        for(int i = 0; i < array.length; i ++){
            System.out.println("Element at position " + i + " is " + array[i]);
        }
    }

    private static int[] sortIntegers(int[] array) {
        for(int i = 0; i< array.length; i++) {
            for (int v = i +1; v< array.length; v++){
                if(array[i] < array[v]) {
                    int temp = array[i];
                    array[i] = array[v];
                    array[v] = temp;
                }
            }
        }
        return array;
    }
}
