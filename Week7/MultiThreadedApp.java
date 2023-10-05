package Week7;
import java.util.Random;
class RandomNumberGenerator implements Runnable {
    private volatile boolean isRunning = true;
    @Override
    public void run() {
        Random random_010 = new Random();
        while (isRunning) {
            int randomNumber_010 = random_010.nextInt(100);
            System.out.println("Generated number: " + randomNumber_010);
            if (randomNumber_010 % 2 == 0) {
                // If the number is even, create and start the square thread
                Thread squareThread_010 = new Thread(new SquareCalculator(randomNumber_010));
                squareThread_010.start();
            } 
            else {
                // If the number is odd, create and start the cube thread
                Thread cubeThread_010 = new Thread(new CubeCalculator(randomNumber_010));
                cubeThread_010.start();
            }
            try {
                Thread.sleep(1000); // Wait for 1 second
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
    public void stop() {
        isRunning = false;
    }
}
class SquareCalculator implements Runnable {
    private int number_010;
    public SquareCalculator(int number_010) {
        this.number_010 = number_010;
    }
    @Override
    public void run() {
        int square_010 = number_010 * number_010;
        System.out.println("Square of " + number_010 + ": " + square_010);
    }
}
class CubeCalculator implements Runnable {
    private int number_010;
    public CubeCalculator(int number_010) {
        this.number_010 = number_010;
    }
    @Override
    public void run() {
        int cube_010 = number_010 * number_010 * number_010;
        System.out.println("Cube of " + number_010 + ": " + cube_010);
    }
}
public class MultiThreadedApp {
    public static void main(String[] args) {
        RandomNumberGenerator randomNumberGenerator_010 = new RandomNumberGenerator();
        Thread generatorThread_010 = new Thread(randomNumberGenerator_010);
        generatorThread_010.start();
        try {
            // Let the program run for 10 seconds
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        randomNumberGenerator_010.stop();
    }
}

