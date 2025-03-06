import java.util.Scanner;

public class Calendar{

    // Array to store the names of the months
    static String[] monthNames = {
        "January", "February", "March", "April", "May", "June", 
        "July", "August", "September", "October", "November", "December"
    };

    // Array to store the number of days in each month
    static int[] daysInMonth = {
        31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
    };

    // get the name of the month
    public static String getMonthName(int month) {
        return monthNames[month - 1]; 
    }

    // check if a year is a leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // get the number of days in a given month
    public static int getDaysInMonth(int month, int year) {
        if (month == 2) { // February, check for leap year
            return isLeapYear(year) ? 29 : 28;
        }
        return daysInMonth[month - 1];
    }

    // calculate the first day of the month using the Gregorian calendar algorithm
    public static int getFirstDayOfMonth(int month, int year) {
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (1 + x + 31 * m0 / 12) % 7;

        return d0;
    }

    // print the calendar for the given month and year
    public static void printCalendar(int month, int year) {
       
        String monthName = getMonthName(month);
        int daysInMonth = getDaysInMonth(month, year);
        int firstDay = getFirstDayOfMonth(month, year);

        System.out.println("        " + monthName + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        for (int i = 0; i < firstDay; i++) {
            System.out.print("    "); 
        }

        // Print the days of the month
        int day = 1;
        for (int i = firstDay; i < 7; i++) {
            System.out.printf("%3d ", day);
            day++;
        }
        System.out.println();

        // remaining days of the month
        for (int i = 2; day <= daysInMonth; i++) {
            for (int j = 0; j < 7 && day <= daysInMonth; j++) {
                System.out.printf("%3d ", day);
                day++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the month (1-12): ");
        int month = sc.nextInt();

        System.out.print("Enter the year: ");
        int year = sc.nextInt();

        printCalendar(month, year);
    }
}