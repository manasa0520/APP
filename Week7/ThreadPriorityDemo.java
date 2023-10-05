package Week7;
public class ThreadPriorityDemo {
    public static void main(String[] args) {
        Thread process1_010 = new ProcessThread_010("Process 1", Thread.MIN_PRIORITY);
        Thread process2_010 = new ProcessThread_010("Process 2", Thread.NORM_PRIORITY - 1);
        Thread process3_010 = new ProcessThread_010("Process 3", Thread.NORM_PRIORITY);
        Thread process4_010 = new ProcessThread_010("Process 4", Thread.NORM_PRIORITY + 1);
        Thread process5_010 = new ProcessThread_010("Process 5", Thread.MAX_PRIORITY);
        process1_010.start();
        process2_010.start();
        process3_010.start();
        process4_010.start();
        process5_010.start();
    }
}
class ProcessThread_010 extends Thread {
    public ProcessThread_010(String name_010, int priority_010) {
        super(name_010);
        setPriority(priority_010);
    }
    public void run() {
        System.out.println(getName() + " is running with priority " + getPriority());
    }
}

