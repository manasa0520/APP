package Week5;
import java.util.Scanner;

public class Mirrorimage {

    public static String getMirrorImage(String str) {
        String mirrorImage = "";
        for (int i_010 = str.length() - 1; i_010 >= 0; i_010--) {
            mirrorImage += str.charAt(i_010);
        }
        return mirrorImage;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = scanner.nextLine();

        String mirrorImage = getMirrorImage(str);
        System.out.println("The mirror image of the string is: " + mirrorImage);
        scanner.close();
    }
}

