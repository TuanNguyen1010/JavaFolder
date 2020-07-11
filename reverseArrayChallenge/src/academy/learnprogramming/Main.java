package academy.learnprogramming;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	int[] array = new int[]{1,2,3,4,5};
        System.out.println("Default array = " + Arrays.toString(array));
        reverse(array);
        System.out.println("New array = " + Arrays.toString(array));
    }

    private static void reverse(int[] array) {
        int halfLengthOfArray = array.length/2;

        for(int i = 0; i < halfLengthOfArray; i++){
            int temp = array[i];
            array[i] = array[array.length-(i+1)];
            array[array.length-(i+1)] = temp;
        }
    }
}
