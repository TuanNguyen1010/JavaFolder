package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        double doubleValue = 20.00;
        double secondValue = 80;
        double total = (doubleValue + secondValue) * 100;

        System.out.println(total);

        double remainder = total % 40;
        System.out.println(remainder);

        boolean isNoRemainder = remainder == 0 ? true : false;

        System.out.println(isNoRemainder);

        if (isNoRemainder == false) {
            System.out.println("Got some remainder");
        }

    }
}
