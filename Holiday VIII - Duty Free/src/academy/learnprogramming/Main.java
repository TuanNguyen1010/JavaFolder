package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	dutyFree(24, 35, 3000);
    }

    public static int dutyFree(int normPrice, int discount, int hol) {
        double discountPercentage = (double)discount/100;
        double discountAmount = (double) normPrice *  discountPercentage;
        int bottles = (int) (hol/ discountAmount);
        return bottles;
    }
}
