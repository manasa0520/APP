package Week7;
public class SleepThreadDemo {
    public static void main(String[] args) {
        SleepThread_010 thread1_010 = new SleepThread_010("Thread 1", 10);
        SleepThread_010 thread2_010 = new SleepThread_010("Thread 2", 20);
        SleepThread_010 thread3_010 = new SleepThread_010("Thread 3", 50);
        SleepThread_010 thread4_010 = new SleepThread_010("Thread 4", 70);
        SleepThread_010 thread5_010 = new SleepThread_010("Thread 5", 100);
        thread1_010.start();
        thread2_010.start();
        thread3_010.start();
        thread4_010.start();
        thread5_010.start();
    }
}
class SleepThread_010 extends Thread {
    private int sleepDuration_010;
    public SleepThread_010(String name, int sleepDuration_010) {
        super(name);
        this.sleepDuration_010 = sleepDuration_010;
    }
    public void run() {
        System.out.println(getName() + " is starting.");
        try {
            Thread.sleep(sleepDuration_010);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println(getName() + " has finished after sleeping for " + sleepDuration_010 + " milliseconds.");
    }
}

