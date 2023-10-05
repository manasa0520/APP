package Week5;

import java.util.Scanner;

public class Checkvalue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int num1_010 = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int num2_010 = scanner.nextInt();

        boolean result = checkConditions(num1_010, num2_010);

        if (result) {
            System.out.println("The conditions are met.");
        } else {
            System.out.println("The conditions are not met.");
        }

        scanner.close();
    }

    public static boolean checkConditions(int a_010, int b_010) {
        return (a_010 == b_010) || (Math.abs(a_010 - b_010) == 5) || (a_010 + b_010 == 5);
    }
}
