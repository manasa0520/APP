import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word_010 = scanner.next();
        String reversedword_010 = "";

        for (int i = word_010.length() - 1; i >= 0; i--) {
            reversedword_010 += word_010.charAt(i);
        }

        System.out.println("Reversed word: " + reversedword_010);
        scanner.close();
    }
}
