package com.nicoleSar;

import java.util.Scanner;

/*
Διαβάζει από τον χρήστη 3 ακέραιους αριθμούς και τους μετατρέπει σε ημερομηνία της μορφής dd/mm/yy.
 */

public class DateFormatterApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int day = 0, month = 0, year = 0;

        System.out.println("Please give 3 integers numbers");
        day = scanner.nextInt();
        month = scanner.nextInt();
        year = scanner.nextInt();

        System.out.println("The date is: "+"0"+day+"/"+month+"/"+year%1000);
    }
}
