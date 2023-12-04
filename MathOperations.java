import static java.lang.Math.*;

public class MathOperations {

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
        int num1 = 10;
        int num2 = 5;

        System.out.println("Addition of " + num1 + " and " + num2 + " is: " + add(num1, num2));
        System.out.println("Subtraction of " + num1 + " and " + num2 + " is: " + subtract(num1, num2));
        System.out.println("Multiplication of " + num1 + " and " + num2 + " is: " + multiply(num1, num2));
        System.out.println("Division of " + num1 + " and " + num2 + " is: " + divide(num1, num2));
    }
}
