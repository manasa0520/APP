package Week5;

import java.util.Scanner;

public class Rotationequ {
    public static boolean isRotationallyEquivalent(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        String str1Concatenated = str1 + str1;
        return str1Concatenated.contains(str2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string 1: ");
        String str1 = scanner.nextLine();

        System.out.println("Enter string 2: ");
        String str2 = scanner.nextLine();

        if (isRotationallyEquivalent(str1, str2)) {
            System.out.println("The strings are rotationally equivalent");
        } else {
            System.out.println("The strings are not rotationally equivalent");
            scanner.close();
        }
    }
}

