package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter array size");
        int count = scanner.nextInt();
        scanner.nextLine();

        int[] randomArray = readIntegers(count);
        System.out.println("Minimum value is");
        System.out.println(findMin(randomArray));
    }

    private static Scanner scanner = new Scanner(System.in);

    private static int[] readIntegers(int count) {
        int[] newArr = new int[count];
        System.out.println("Enter a number");
        for (int i = 0; i < count; i++) {
            newArr[i] = scanner.nextInt();

        }
        return newArr;
    }

    private static int findMin(int[] array) {
        int currentLowest = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < currentLowest) {
                currentLowest = array[i];
            }
        }
        return currentLowest;
    }
}
