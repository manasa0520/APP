package Week5;

import java.util.Scanner;

public class Palindromecheck {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("The entered string is a palindrome.");
        } else {
            System.out.println("The entered string is not a palindrome.");
        }

        scanner.close();
    }

    public static boolean isPalindrome(String str) {
        int left_010 = 0;
        int right_010 = str.length() - 1;

        while (left_010 < right_010) {
            if (str.charAt(left_010) != str.charAt(right_010)) {
                return false;
            }
            left_010++;
            right_010--;
        }
        return true;
    }
}
