package mcextension_a1605.auth;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LocalAuthManager {
    private static Map<String, String> userCredentials;

    public static void main(String[] args) {
        userCredentials = new HashMap();
        Scanner scanner = new Scanner(System.in);

        boolean isRunning = true;
        while (isRunning) {
            System.out.println("1. Register a new user");
            System.out.println("2. Authenticate a user");
            System.out.println("3. Quit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    registerUser(scanner);
                    break;
                case 2:
                    authenticateUser(scanner);
                    break;
                case 3:
                    isRunning = false;
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
                    break;
            }
        }

        scanner.close();
    }

    private static void registerUser(Scanner scanner) {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        if (userCredentials.containsKey(username)) {
            System.out.println("Username already exists! Please choose a different username.");
            return;
        }
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        userCredentials.put(username, password);
        System.out.println("User registered successfully!");
    }

    private static void authenticateUser(Scanner scanner) {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (userCredentials.containsKey(username) && userCredentials.get(username).equals(password)) {
            System.out.println("Authentication successful! Welcome, " + username + ".");
        } else {
            System.out.println("Authentication failed! Invalid username or password.");
        }
    }
}