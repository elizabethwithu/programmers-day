import java.util.Scanner;

public class Praktikum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год:");
        int year = scanner.nextInt();
        String monthAndYear = ".09." + year;
        String leapYearDay = "12";
        String notLeapYearDay = "13";

        if (isLeapYear(year)) {
            System.out.println(leapYearDay + monthAndYear);
        } else {
            System.out.println(notLeapYearDay + monthAndYear);
        }
    }

    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return year % 4 == 0;
        }
    }
}
