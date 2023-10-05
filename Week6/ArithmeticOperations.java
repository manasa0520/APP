package Week6;

public class ArithmeticOperations {
    private int a_010;
    private int b_010;
    public ArithmeticOperations(int a_010, int b_010) {
        this.a_010 = a_010;
        this.b_010 = b_010;
    }
    public int add(int a, int b) {
        return a_010 + b_010;
    }
    public double add(double a, double b) {
        return a_010 + b_010;
    }
    public int subtract(int a, int b) {
        return a_010 - b_010;
    }
    public double subtract(double a, double b) {
        return a_010 - b_010;
    }
    public int multiply(int a, int b) {
        return a_010 * b_010;
    }
    public double multiply(double a, double b) {
        return a_010 * b_010;
    }
    public int divide(int a, int b) {
        if (b_010 == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a_010 / b_010;
    }
    public double divide(double a, double b) {
        if (b_010 == 0.0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a_010 / b_010;
    }
    public static void main(String[] args) {
        ArithmeticOperations calculator = new ArithmeticOperations(10, 5);
        int resultIntAdd = calculator.add(5, 3);
        int resultIntSubtract = calculator.subtract(10, 4);
        int resultIntMultiply = calculator.multiply(6, 2);
        int resultIntDivide = calculator.divide(8, 2);
        System.out.println("Integer Addition: " + resultIntAdd);
        System.out.println("Integer Subtraction: " + resultIntSubtract);
        System.out.println("Integer Multiplication: " + resultIntMultiply);
        System.out.println("Integer Division: " + resultIntDivide);
        double resultDoubleAdd = calculator.add(5.5, 3.2);
        double resultDoubleSubtract = calculator.subtract(10.0, 4.5);
        double resultDoubleMultiply = calculator.multiply(6.3, 2.0);
        double resultDoubleDivide = calculator.divide(8.0, 2.5);
        System.out.println("\nDouble Addition: " + resultDoubleAdd);
        System.out.println("Double Subtraction: " + resultDoubleSubtract);
        System.out.println("Double Multiplication: " + resultDoubleMultiply);
        System.out.println("Double Division: " + resultDoubleDivide);
    }
}
