package Week5;

import java.util.Scanner;

public class Count {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a text or string: ");
        String text = scanner.nextLine();

        int[] charCount = new int[256];

        countCharacters(text, charCount);

        System.out.println("Character count:");
        for (int i_010 = 0; i_010 < charCount.length; i_010++) {
            if (charCount[i_010] > 0) {
                System.out.println("'" + (char) i_010 + "': " + charCount[i_010]);
            }
        }

        scanner.close();
    }

    public static void countCharacters(String text, int[] charCount) {
        for (char c : text.toCharArray()) {
            charCount[c]++;
        }
    }
}

