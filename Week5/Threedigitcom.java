package Week5;

public class Threedigitcom {

    public static void main(String[] args) {
        System.out.println("All Possible Combinations of Three Digits:");
        printCombinations();
    }

    public static void printCombinations() {
        for (int i_010 = 0; i_010 < 10; i_010++) {
            for (int j_010 = 0; j_010 < 10; j_010++) {
                for (int k_010 = 0; k_010 < 10; k_010++) {
                    System.out.println(i_010 + "" + j_010 + "" + k_010);
                }
            }
        }
    }
}

