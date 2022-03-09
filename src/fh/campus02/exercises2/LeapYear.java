package fh.campus02.exercises2;

public class LeapYear {
    public static void main(String[] args) {

        int year = 1;
        while (year <= 2100) {
            isLeapYear(year);
            year++;
        }
        for (int i = 1; i <= 2100; i++) {
            isLeapYear(i);
        }
    }

    public static void isLeapYear(int year) {

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " is leap year.");
        } else {
            System.out.println(year + " is not leap year.");
        }

    }
}
