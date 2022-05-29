package pl.sda.ptools;

import java.util.Scanner;

public class NumberEquality {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your number A: ");
        int a = scanner.nextInt();
        System.out.print("Please enter your number B: ");
        int b = scanner.nextInt();

        if (a > b) {
            printMessageWithNewLine("a is greater than b");

        } else if (a < b) {
            System.out.println("The a is smaller than b");
        } else {
            System.out.println("The same");
        }
    }

    private static void printMessageWithNewLine(String message) {
        System.out.println(message);

    }
}
