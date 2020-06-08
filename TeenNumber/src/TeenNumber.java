public class TeenNumber {

    public static boolean hasTeen( int first, int second, int third) {

        if ( first > 12 && first < 20) {
            return true;
        } else if (second > 12 && second < 20) {
            return true;
        } else if (third > 12 && third < 20) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isTeen(int first) {

        if ( first > 12 && first < 20) {
            return true;
        } else {
            return false;
        }
    }
}
