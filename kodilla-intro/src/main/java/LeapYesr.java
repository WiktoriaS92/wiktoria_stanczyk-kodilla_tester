public class LeapYesr {
    public static void main(String[] args) {
        boolean test = CheckIfYearIsLeap(2008);
        System.out.println(test);
    }

    public static boolean CheckIfYearIsLeap(int year) {
        if ((year % 4 == 0 && year % 100 != 0)
                || (year % 4 == 0 && year % 100 == 0 && year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }
}
