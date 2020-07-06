package academy.learnprogramming;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int intValue = 10;
        int anotherValue = intValue;

        System.out.println("intValue = " + intValue);
        System.out.println("anotherValue = " + anotherValue);

        intValue += 1;
        anotherValue += 20;

        System.out.println("intValue = " + intValue);
        System.out.println("anotherValue = " + anotherValue);

        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;

        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));

        myIntArray[3] = 20;
        anotherArray[2] = 10;

        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));
    }
}
