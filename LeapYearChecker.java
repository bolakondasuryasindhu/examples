public class LeapYearChecker {

    public static void main(String[] args) {
        // Test the function with a few examples
        int[] years = {1900, 2000, 2004, 2023, 2024};
        for (int year : years) {
            if (isLeapYear(year)) {
                System.out.println(year + " is a leap year.");
            } else {
                System.out.println(year + " is not a leap year.");
            }
        }
    }

    public static boolean isLeapYear(int year) {
        // Check if the year is divisible by 4 but not 100, or divisible by 400
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }
}
