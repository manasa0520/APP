package Week7;
import java.util.Scanner;
public class UserThreadPriority {
    private String k_010;
    private char c_010;
    public UserThreadPriority(String k, char c) {
        this.k_010 = k;
        this.c_010 = c;
    }
    public void printValues() {
        System.out.println("String: " + k_010);
        System.out.println("Character: " + c_010);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String userString = scanner.nextLine();
        System.out.print("Enter a Character: ");
        char userChar = scanner.next().charAt(0);
        UserThreadPriority threadObj1 = new UserThreadPriority(userString, userChar);
        UserThreadPriority threadObj2 = new UserThreadPriority(userString, userChar);
        Thread thread1 = new Thread(new Runnable() {
            public void run() {
                System.out.println("ThreadA - Priority: " + Thread.currentThread().getPriority());
                threadObj1.printValues();
            }
        });
        thread1.setName("ThreadA");
        Thread thread2 = new Thread(new Runnable() {
            public void run() {
                System.out.println("ThreadB - Priority: " + Thread.currentThread().getPriority());
                threadObj2.printValues();
            }
        });
        thread2.setName("ThreadB");
        thread1.start();
        thread2.start();
        scanner.close();
    }
}


