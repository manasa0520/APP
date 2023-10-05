package Week7;
public class ThreadSleepAndNameChange {
    public static void main(String[] args) {
        Thread myThread = new Thread(() -> {
            for (int i = 5; i >= 1; i--) {
                try {
                    // Sleep for 6 seconds
                    Thread.sleep(6000);
                    // Change the name of the thread
                    Thread.currentThread().setName("MyThread_" + i + "_010");
                    // Print the new thread name
                    System.out.println("Thread Name after changing: " + Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });
        System.out.println("Initial Thread Name: " + myThread.getName());
        myThread.start();
    }
}

