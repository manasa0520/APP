package Week7;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
public class Printersync {
    public static void main(String[] args) {
        Printer printer = new Printer();
        
        Thread job1 = new Thread(new PrintJob(printer, "Job 1"));
        Thread job2 = new Thread(new PrintJob(printer, "Job 2"));
        Thread job3 = new Thread(new PrintJob(printer, "Job 3"));
        job1.start();
        job2.start();
        job3.start();
    }
}
class Printer {
    private Lock lock = new ReentrantLock();
    private int currentJob = 1;
    public void print(String jobName) {
        lock.lock();
        try {
            while (currentJob != Integer.parseInt(jobName.split(" ")[1])) {
                System.out.println(jobName + " is waiting for the correct job in order.");
                Thread.sleep(100);
            }
            System.out.println("Printing " + jobName);
            currentJob++;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            lock.unlock();
        }
    }
}
class PrintJob implements Runnable {
    private Printer printer;
    private String jobName;
    public PrintJob(Printer printer, String jobName) {
        this.printer = printer;
        this.jobName = jobName;
    }
    @Override
    public void run() {
        System.out.println(jobName + " is starting.");
        printer.print(jobName);
        System.out.println(jobName + " is finished.");
    }
}
