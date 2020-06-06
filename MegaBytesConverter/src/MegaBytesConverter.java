public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes( int kiloBytes) {

        if ( kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            long MegaBytes = (long) Math.floor(kiloBytes / 1024 );
            int remainder = kiloBytes % 1024;
            System.out.println( kiloBytes + " KB = " + MegaBytes + " and " + remainder + " KB");
        };
    };
};
