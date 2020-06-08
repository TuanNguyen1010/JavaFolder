public class ThreeDecimalPlaces {

    public static void main(String[] args) {
        testing(3.1236, 3.123);
    }

    public static boolean areEqualByThreeDecimalPlaces(double first, double second) {

        String firstString = String.format("%.4f", first);
        String secondString = String.format("%.4f", second);

        String subFirst = firstString.substring(0, firstString.length() -1);
        String subSecond = secondString.substring(0, secondString.length() -1);

        if (subFirst.equals(subSecond)) {
            return true;
        } else {
            return false;
        }

    };

    public static void testing(double first, double second) {
        String firstString = String.format("%.4f", first);
        String secondString = String.format("%.4f", second);

        String subFirst = firstString.substring(0, firstString.length() -1);
        String subSecond = secondString.substring(0, secondString.length() -1);

        String result = "testing if matching";

        if (subFirst.equals(subSecond)) {
           result = "matching";
        } else {
            result = "not matching";
        }

        System.out.println(result);
        System.out.println(subFirst);
        System.out.println(subSecond);
    };
}
