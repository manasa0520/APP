package Week5;

import java.util.Scanner;

public class Missingdigit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a mobile number: ");
        String mobileNumber = scanner.nextLine();

        String absentDigits = findAbsentDigits(mobileNumber);

        if (absentDigits.isEmpty()) {
            System.out.println("No digits are absent in the mobile number.");
        } else {
            System.out.println("Absent digits in the mobile number: " + absentDigits);
        }

        scanner.close();
    }

    public static String findAbsentDigits(String number) {
        String allDigits = "0123456789";
        StringBuilder absentDigits = new StringBuilder();

        for (char digit : allDigits.toCharArray()) {
            if (number.indexOf(digit) == -1) {
                absentDigits.append(digit);
            }
        }

        return absentDigits.toString();
    }
}

