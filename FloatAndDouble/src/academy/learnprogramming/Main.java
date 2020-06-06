package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("my Min Float value = " + myMinFloatValue);
        System.out.println("my Max Float value = " + myMaxFloatValue);


        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("my Min Double value = " + myMinDoubleValue);
        System.out.println("my Max Double value = " + myMaxDoubleValue);

        int myIntValue = 5/2;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3d;
        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        int rice = 5;
        double riceInPounds = rice / 0.45359237;

        System.out.println("Rice in pounds = " + riceInPounds);
    }
}
