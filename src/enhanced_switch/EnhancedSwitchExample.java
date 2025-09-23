package enhanced_switch;

import java.time.Month;
import java.time.Year;

public class EnhancedSwitchExample {

    public static void main(String[] args) {

        int i = getDays(Month.JANUARY, 2020);
        System.out.println(i);

        int result = yieldExample(Month.FEBRUARY, 2020);
        System.out.println(result);

        int result1 = exhaustiveNatureOfSwitch(Month.MARCH, 2020);
        System.out.println(result1);
    }

    private static int exhaustiveNatureOfSwitch(Month month, int i) {
        return switch (month) {
            case SEPTEMBER, APRIL, JUNE, NOVEMBER -> 30;
            case FEBRUARY -> {
                System.out.println("check if year is = " + i + " is leap year?");
                yield Year.isLeap(i) ? 29 : 28;
            }
            //default -> 31;
            case JANUARY,MARCH,MAY,JULY,AUGUST,OCTOBER,DECEMBER -> 31;
        };
    }

    private static int yieldExample(Month month, int i) {
        return switch (month) {
            case SEPTEMBER, APRIL, JUNE, NOVEMBER -> 30;
            case FEBRUARY -> {
                System.out.println("check if year is = " + i + " is leap year?");
                yield Year.isLeap(i) ? 29 : 28;
            }
            default -> 31;
        };
    }

    private static int getDays(Month month, int i) {
        return switch (month) {
            case SEPTEMBER, APRIL, JUNE, NOVEMBER -> 30;
            case FEBRUARY -> Year.isLeap(i) ? 29 : 28;
            default -> 31;
        };
    }
}
