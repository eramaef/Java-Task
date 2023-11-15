public class Task1115 {
    public static void main(String[] args) {
        String input = "madam";

        StringBuilder reversed = new StringBuilder(input);
        reversed.reverse();

        if (input.equals(reversed.toString())) {
            System.out.println("The input string is a palindrome.");
        } else {
            System.out.println("The input string is not a palindrome.");
        }
    }
}
