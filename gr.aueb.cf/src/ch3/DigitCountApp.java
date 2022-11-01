package ch3;

import java.util.Scanner;

/**
 * Υπολογίζει το πλήθος των ψηφίων ενός ακεραίου
 * μέχρι το αποτέλεσμα της διαίρεσης, το υπόλοιπο, να μην είναι 0
 */
public class DigitCountApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int inputNum = 0;
        int remainingNum = 0;
        int digitsCount = 0;

        System.out.println("Please insert a number");

        inputNum = scanner.nextInt();
        remainingNum = inputNum;

        do {
            digitsCount++;
            remainingNum = remainingNum / 10;
        } while (remainingNum != 0);

        System.out.println("The total digits are "+digitsCount);
    }
}
