import java.util.Scanner;

class Task117 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("10");
        int num1 = scanner.nextInt();
        System.out.println("20");
        int num2 = scanner.nextInt();

        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + add(num1, num2));
        System.out.println("The difference of " + num1 + " and " + num2 + " is: " + subtract(num1, num2));
        System.out.println("The product of " + num1 + " and " + num2 + " is: " + multiply(num1, num2));
        System.out.println("The quotient of " + num1 + " and " + num2 + " is: " + divide(num1, num2));
    }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static double divide(int num1, int num2) {
        if (num2 != 0) {
            return (double) num1 / num2;
        } else {
            System.out.println("Error! Dividing by zero is not allowed.");
            return 0;
        }
    }
}
