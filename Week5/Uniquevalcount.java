package Week5;

import java.util.Scanner;

public class Uniquevalcount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[15];
        System.out.println("Enter 15 elements:");

        for (int i = 0; i < 15; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        int uniqueCount = countUniqueValues(array);
        System.out.println("Number of unique values: " + uniqueCount);

        scanner.close();
    }

    public static int countUniqueValues(int[] arr) {
        int uniqueCount = 0;
        boolean[] visited = new boolean[100]; // Assuming values in the range 0 to 99
        
        for (int value : arr) {
            if (!visited[value]) {
                visited[value] = true;
                uniqueCount++;
            }
        }

        return uniqueCount;
    }
}
