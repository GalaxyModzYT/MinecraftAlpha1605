package io.dev7.mcextension_a1605;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class HubSyncClient {
    private static final String SERVER_HOST = "localhost";
    private static final int SERVER_PORT = 34218;

    public static void main(String[] args) {
        try {
            // Connect to the hub server
            Socket socket = new Socket(SERVER_HOST, SERVER_PORT);
            System.out.println("Connected to the hub server.");

            // Initialize input/output streams
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            // Send a message to the hub
            out.println("Hello from the client!");

            // Receive and display the response from the hub
            String response = in.readLine();
            System.out.println("Response from the hub: " + response);

            // Close the connection
            socket.close();
            System.out.println("Disconnected from the hub server.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}