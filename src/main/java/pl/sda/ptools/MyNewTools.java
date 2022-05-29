package pl.sda.ptools;

import java.util.Scanner;

public class MyNewTools {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your number A: ");
        int a = scanner.nextInt();
        System.out.print("Please enter your number B: ");
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println("a is larger than b.");
        }
        else if (a < b) {
            System.out.println("The a is smaller than b");
        }
        else  {
            System.out.println("The same");
        }
    }

}
