package io.dev7.mcextension_a1605.auth;

import java.security.SecureRandom;
import java.util.Base64;
import java.util.Scanner;

public class AuthKey {
    private static String generateAuthKey() {
        byte[] key = new byte[32];
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextBytes(key);
        return Base64.getEncoder().encodeToString(key);
    }

    public static void main(String[] args) {
        String authKey = generateAuthKey();

        System.out.println("Auth Key: " + authKey);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Auth Key: ");
        String userInput = scanner.nextLine();

        if (userInput.equals(authKey)) {
            System.out.println("Authorization successful!");
        } else {
            System.out.println("Authorization failed! Invalid Auth Key.");
        }

        scanner.close();
    }
}