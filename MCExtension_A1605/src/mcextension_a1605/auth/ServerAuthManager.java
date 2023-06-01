package mcextension_a1605.auth;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ServerAuthManager {
    private static Map<String, String> userCredentials;

    public static void main(String[] args) {
        userCredentials = new HashMap<>();
        userCredentials.put("dev0", "0dev");
        userCredentials.put("dev1", "1dev");
        userCredentials.put("dev2", "2dev");
        userCredentials.put("dev3", "3dev");
        userCredentials.put("dev4", "4dev");
        userCredentials.put("dev5", "5dev");
        userCredentials.put("dev6", "6dev");
        userCredentials.put("dev7", "7dev");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter username (or 'quit' to exit):");
            String username = scanner.nextLine();

            if (username.equalsIgnoreCase("quit")) {
                System.out.println("Exiting the program...");
                break;
            }

            System.out.println("Enter password:");
            String password = scanner.nextLine();

            if (authenticateUser(username, password)) {
                System.out.println("Authentication successful! Welcome, " + username + ".");
            } else {
                System.out.println("Authentication failed! Invalid username or password.");
            }
        }

        scanner.close();
    }

    private static boolean authenticateUser(String username, String password) {
        if (userCredentials.containsKey(username) && userCredentials.get(username).equals(password)) {
            return true;
        }
        return false;
    }
}