package ch2;


/*
Διαβάζει από τον χρήστη 3 ακέραιους αριθμούς και τους μετατρέπει σε ημερομηνία της μορφής dd/mm/yy.
 */

import java.util.Scanner;

public class DateFormatterApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int day = 0, month = 0, year = 0;

        System.out.println("Please give 3 integers numbers");
        day = scanner.nextInt();
        month = scanner.nextInt();
        year = scanner.nextInt();
        int yy = year %= 100;

        System.out.printf("The date is: %02d/%d/%d", day, month, yy);
    }
}