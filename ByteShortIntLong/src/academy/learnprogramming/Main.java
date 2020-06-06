package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;

        int myMaxIntValue = Integer.MAX_VALUE;
        int myMinIntValue = Integer.MIN_VALUE;

        System.out.println(myMaxIntValue);
        System.out.println(myMinIntValue);


        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;

        System.out.println(myMinByteValue);
        System.out.println(myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;

        System.out.println(myMinShortValue);
        System.out.println(myMaxShortValue);

        byte myNewByte = 120;
        short myNewShort = 190;
        int myNewInt = 940;
        long myNewLong = 5000 + (long) (10* myNewByte) + (long) (myNewShort) + (long) (myNewInt);

        System.out.println((myNewLong));

    }
}
