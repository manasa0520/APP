package Week5;

import java.util.Scanner;

public class Primecheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isPrime(number)) {
            System.out.println("The entered number is prime.");
        } else {
            System.out.println("The entered number is not prime.");
        }

        scanner.close();
    }

    public static boolean isPrime(int num_010) {
        if (num_010 <= 1) {
            return false;
        }
        
        if (num_010 <= 3) {
            return true;
        }

        if (num_010 % 2 == 0 || num_010 % 3 == 0) {
            return false;
        }

        for (int i_010 = 5; i_010 * i_010 <= num_010; i_010 += 6) {
            if (num_010 % i_010 == 0 || num_010 % (i_010 + 2) == 0) {
                return false;
            }
        }

        return true;
    }
}
