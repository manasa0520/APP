package Week6;
interface Sortable {
    void sort(int[] array_010);
}
class BubbleSort_010 implements Sortable {
    @Override
    public void sort(int[] array_010) {
        int n = array_010.length;
        boolean swapped;
         do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (array_010[i - 1] > array_010[i]) {
                    // Swap arr[i-1] and arr[i]
                    int temp = array_010[i - 1];
                    array_010[i - 1] = array_010[i];
                    array_010[i] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }
}
class SelectionSort_010 implements Sortable {
    @Override
    public void sort(int[] array_010) {
        int n = array_010.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array_010[j] < array_010[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array_010[minIndex];
            array_010[minIndex] = array_010[i];
            array_010[i] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = { 4, 2, 3, 0, 1 };
        Sortable bubbleSort = new BubbleSort_010();
        Sortable selectionSort = new SelectionSort_010();
        bubbleSort.sort(arr);
        System.out.println("Bubble Sorted Array:");
        printArray(arr);
        int[] arr2 = { 10, 7, 3, 4, 2 };
        selectionSort.sort(arr2);
        System.out.println("\nSelection Sorted Array:");
        printArray(arr2);
    }
    static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}

