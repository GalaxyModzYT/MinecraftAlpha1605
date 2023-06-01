package io.dev7.mcextension_a1605.auth;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AuthClient {
    public static void main(String[] args) {
        // Create a map to store client credentials
        Map<String, String> clientCredentials = new HashMap();
        clientCredentials.put("dev0", "0dev");
        clientCredentials.put("dev1", "1dev");
        clientCredentials.put("dev2", "2dev");
        clientCredentials.put("dev3", "3dev");
        clientCredentials.put("dev4", "4dev");
        clientCredentials.put("dev5", "5dev");
        clientCredentials.put("dev6", "6dev");
        clientCredentials.put("dev7", "7dev");

        // Read client input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter client ID: ");
        String clientId = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        // Validate client credentials
        if (clientCredentials.containsKey(clientId) && clientCredentials.get(clientId).equals(password)) {
            System.out.println("Authorization successful! Welcome, " + clientId + ".");
        } else {
            System.out.println("Authorization failed! Invalid client ID or password.");
        }

        // Close the scanner
        scanner.close();
    }
}