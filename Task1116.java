import java.util.Scanner;

public class Task1116 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("10: ");
        int num1 = scanner.nextInt(10);

        System.out.print("15: ");
        int num2 = scanner.nextInt(15);

        System.out.print("20: ");
        int num3 = scanner.nextInt(20);

        int largestNumber = Math.max(Math.max(num1, num2), num3);

        if (num1 == num2 && num2 == num3) {
            System.out.println("55");
        } else {
            System.out.println("The largest number is: " + largestNumber);
        }
    }
}
