public class TestArithmetic {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }

    public static void main(String[] args) {
        TestArithmetic arithmetic = new TestArithmetic();
        System.out.println("Addition: " + arithmetic.add(5, 3));
        System.out.println("Subtraction: " + arithmetic.subtract(5, 3));
        System.out.println("Multiplication: " + arithmetic.multiply(5, 3));
        System.out.println("Division: " + arithmetic.divide(5, 3));
    }
}
