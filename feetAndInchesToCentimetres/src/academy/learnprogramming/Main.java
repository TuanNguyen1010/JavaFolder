package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	System.out.println(calcFeetAndInchesToCentimetres( 62));
    }

    public static double calcFeetAndInchesToCentimetres(double feet, double inches) {

        if(feet < 0) {
            return -1;
        } else if (inches < 0 || inches > 12) {
            return -1;
        } else {
            return ((feet * 12) + inches) * 2.54;
        }
    }

    public static double calcFeetAndInchesToCentimetres(double inches) {

        if (inches < 0 ) {
            return -1;
        } else {
           double feet = (int) (inches / 12);
           double remainderInches = inches % 12;
           System.out.println( "feet is " + feet);
            return calcFeetAndInchesToCentimetres(feet, remainderInches);
        }
    }
}
