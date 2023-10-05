package Week7;
public class MultiThreadExample {
    public static void main(String[] args) {
        Thread userThread1 = new Thread(() -> {
            try {
                Thread.sleep(1000);
                System.out.println("User Thread 1: Executing after 1 second.");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });
        Thread userThread2 = new Thread(() -> {
            try {
                Thread.sleep(1000);
                System.out.println("User Thread 2: Executing after 1 second.");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });
        userThread1.start();
        userThread2.start();
        Thread mainThread = new Thread(() -> {
            try {
                Thread.sleep(1000);
                System.out.println("Main Thread: Executing after 1 second.");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });
        mainThread.start();
        try {
            userThread1.join();
            userThread2.join();
            mainThread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("All threads have finished.");
    }
}

