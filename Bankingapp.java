import java.util.*;

class User {
    private int id;
    private int pin;
    private String name;
    private double balance;

    public User(int id, int pin, String name, double balance) {
        this.id = id;
        this.pin = pin;
        this.name = name;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public int getPin() {
        return pin;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void addBalance(double amount) {
        this.balance += amount;
    }

    public boolean transferBalance(User receiver, double amount) {
        if (amount > this.balance) {
            return false;
        } else {
            this.balance -= amount;
            receiver.addBalance(amount);
            return true;
        }
    }
}

public class Bankingapp {
    private static Map<Integer, User> users = new HashMap<>();

    public static void main(String[] args) {
        users.put(412435, new User(412435, 7452, "Chris Sandoval", 32000));
        users.put(264863, new User(264863, 1349, "Marc Yim", 1000));

        Scanner scanner = new Scanner(System.in);
        User currentUser = null;

        while (true) {
            System.out.println("1. Login\n2. Check Balance\n3. Cash-in\n4. Money Transfer\n5. Logout\n6. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter user ID: ");
                    int id = scanner.nextInt();
                    System.out.print("Enter PIN: ");
                    int pin = scanner.nextInt();
                    currentUser = users.get(id);
                    if (currentUser != null && currentUser.getPin() == pin) {
                        System.out.println("Login successful!");
                    } else {
                        System.out.println("Invalid ID or PIN.");
                        currentUser = null;
                    }
                    break;
                case 2:
                    if (currentUser != null) {
                        System.out.println("Balance: " + currentUser.getBalance());
                    } else {
                        System.out.println("Please login first.");
                    }
                    break;
                case 3:
                    if (currentUser != null) {
                        System.out.print("Enter amount to cash-in: ");
                        double amount = scanner.nextDouble();
                        currentUser.addBalance(amount);
                        System.out.println("Cash-in successful!");
                    } else {
                        System.out.println("Please login first.");
                    }
                    break;
                case 4:
                    if (currentUser != null) {
                        System.out.print("Enter receiver's user ID: ");
                        int receiverId = scanner.nextInt();
                        System.out.print("Enter amount to transfer: ");
                        double transferAmount = scanner.nextDouble();
                        User receiver = users.get(receiverId);
                        if (receiver != null && currentUser.transferBalance(receiver, transferAmount)) {
                            System.out.println("Transfer successful!");
                        } else {
                            System.out.println("Transfer failed.");
                        }
                    } else {
                        System.out.println("Please login first.");
                    }
                    break;
                case 5:
                    currentUser = null;
                    System.out.println("Logout successful!");
                    break;
                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
            }
        }
    }
}
