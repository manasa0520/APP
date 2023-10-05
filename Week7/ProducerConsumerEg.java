package Week7;
import java.util.LinkedList;
class ProducerConsumer {
    private LinkedList<Integer> buffer_010;
    private int capacity_010;
    public ProducerConsumer(int capacity_010) {
        this.buffer_010 = new LinkedList<>();
        this.capacity_010 = capacity_010;
    }
    public void produce() throws InterruptedException {
        int value_010 = 1;
        while (true) {
            synchronized (this) {
                while (buffer_010.size() == capacity_010) {
                    wait();
                }
                System.out.println("Producer produces: " + value_010);
                buffer_010.add(value_010);
                value_010++;
                notify();
                Thread.sleep(1000);
            }
        }
    }
    public void consume() throws InterruptedException {
        while (true) {
            synchronized (this) {
                while (buffer_010.isEmpty()) {
                    wait();
                }
                int value_010 = buffer_010.poll();
                System.out.println("Consumer consumes: " + value_010);
                notify();
                Thread.sleep(1000);
            }
        }
    }
}
public class ProducerConsumerEg {
    public static void main(String[] args) {
        ProducerConsumer pc_010 = new ProducerConsumer(5);
        Thread producerThread_010 = new Thread(() -> {
            try {
                pc_010.produce();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });
        Thread consumerThread_010 = new Thread(() -> {
            try {
                pc_010.consume();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });
        producerThread_010.start();
        consumerThread_010.start();
    }
}
