import static java.lang.Math.*;

public class Task1119 {

    public static int add(int a, int b) {
        return addExact(a, b);
    }

    public static int subtract(int a, int b) {
        return subtractExact(a, b);
    }

    public static int multiply(int a, int b) {
        return multiplyExact(a, b);
    }

    public static int divide(int a, int b) {
        return floorDiv(a, b);
    }

    public static void main(String[] args) {
        // Demonstrate the math operations
        int num1 = 20;
        int num2 = 5;

        // Addition
        int sum = add(num1, num2);
        System.out.println("Addition: " + sum);

        // Subtraction
        int difference = subtract(num1, num2);
        System.out.println("Subtraction: " + difference);

        // Multiplication
        int product = multiply(num1, num2);
        System.out.println("Multiplication: " + product);

        // Division
        int quotient = divide(num1, num2);
        System.out.println("Division: " + quotient);
    }
}
