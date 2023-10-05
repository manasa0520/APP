package Week7;
public class ThreadNameChange {
    public static void main(String[] args) {
        Thread myThread = new Thread(() -> {
            try {
                // Sleep for 5 seconds
                Thread.sleep(5000);
                // Change the name of the thread
                Thread.currentThread().setName("MyNewThreadName_010");
                // Print the new thread name
                System.out.println("Thread Name after changing: " + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });
        System.out.println("Initial Thread Name: " + myThread.getName());
        myThread.start();
    }
}
