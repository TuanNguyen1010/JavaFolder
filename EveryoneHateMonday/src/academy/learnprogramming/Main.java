package academy.learnprogramming;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class Main {

    public static void main(String[] args) {
//        count(LocalDate.of(1995, 4, 2), LocalDate.of(2018, 4, 2));
//        System.out.println("second test");
//        count(LocalDate.of(1995, 4, 3), LocalDate.of(2017, 4, 3));
//        System.out.println("retirement, expect 2921");
//        count(LocalDate.of(2025,1,1), LocalDate.of(3100, 1, 1));
        System.out.println("output = " +  count(LocalDate.of(4977,1, 01), LocalDate.of(5999, 01, 01)));
    }

    static long count(final LocalDate birthday, final LocalDate today) {
        System.out.println("day betweens = " + ChronoUnit.DAYS.between(birthday, today));
        long daysBetweenDate = ChronoUnit.DAYS.between(birthday, today);
        long Mondays = ((daysBetweenDate-8030)/7);
        System.out.println("amount of Mondays = " + Mondays);
        if (Mondays == 0) {
            System.out.println("first week");
            Mondays = 1;
        } else if ( Mondays < 0) {
            Mondays = 0;
        } else if (Mondays > 2921){
            final LocalDate retirement = birthday.plusYears(78);
            long daysBetweenRetirement = ChronoUnit.DAYS.between(birthday, retirement) - 8030;
            System.out.println("days inbetween retirement is " + daysBetweenRetirement);
            Mondays = daysBetweenRetirement / 7;
        }
        return Mondays;

    }

}
