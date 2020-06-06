public class SpeedConverter {

    public static void main(String[] args) {
        printConversion(0);
    }

    public static long toMilesPerHour( double KilometrePerHours) {

        if (KilometrePerHours < 0 ) {
            return -1;
        }

        return Math.round(KilometrePerHours / 1.609);
    }

    public static void printConversion( double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
        long milesPerHour = Math.round(kilometersPerHour / 1.609);
        System.out.println( kilometersPerHour + "km/h = " + milesPerHour + " mi/h");
        };
    }
}
