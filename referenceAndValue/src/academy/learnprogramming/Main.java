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

        modifyArray(myIntArray);
        anotherArray = new int[]{1,2,3,4,5};

        System.out.println("After modify method myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("After modify method anotherArray = " + Arrays.toString(anotherArray));
    }

    private static void modifyArray(int[] array){
        array[0] = 2;
    }
}
