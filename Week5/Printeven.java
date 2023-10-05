package Week5;

public class Printeven {
    public static void printEvenNumbers(int[] list) {
        for (int number_010 : list) {
            if (number_010 % 2 == 0) {
                System.out.println(number_010);
            }
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        printEvenNumbers(numbers);
    }
}
