package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	roundToNext5(-1);
	roundToNext5(-1837617);
    }

    public static int roundToNext5(int number) {
        int remainder = (number + 5) % 5 == 0? 0 : (5 - ((number + 5) % 5)) % 5;
        System.out.println("remainder is " +remainder);
        int roundedNumber = number + remainder;
        System.out.println("Input : " + number + " output : " + (roundedNumber));
        return roundedNumber;
    }
}
