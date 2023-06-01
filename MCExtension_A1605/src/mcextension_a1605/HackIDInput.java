package mcextension_a1605;

import java.util.Scanner;

public class HackIDInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the hack ID: ");
        String hackID = scanner.nextLine();

        if (hackID.equals("secret123")) {
            System.out.println("Cheats enabled!");
            // Add your cheat code logic here
        } else {
            System.out.println("Invalid code.");
        }

        scanner.close();
    }
}