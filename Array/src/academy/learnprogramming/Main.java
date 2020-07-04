package academy.learnprogramming;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = getInteger(5);

        for(int i = 0; i < array.length; i++) {
            System.out.println("Array position " + i + " is value " + array[i]);
        }

        System.out.println("Average of array is " + calculateAverage(array));
    }

    public static int[] getInteger(int number) {
        System.out.println("Enter in " + number + " integers");
        int[] values = new int[number];
        for(int i = 0; i < values.length; i++){
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static double calculateAverage(int[] array){
        int sum = 0;
        for(int i = 0; i < array.length; i ++){
            sum += array[i];
        }
        return (double) sum / (double) array.length;
    }
}
