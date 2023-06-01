package io.dev7.mcextension_a1605.auth.suspension;

import javax.swing.*;

public class SessionUnauthorized {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(SessionUnauthorized::showPopup);
    }

    private static void showPopup() {
        String message = "Account has been temporarily suspended from Online Play due to violating the gameplay guidelines:\n" +
                "Session unauthorized\n\n" +
                "Further violations will lead to a permanent suspension\n\n" +
                "ID: 2307-gmd7";

        JOptionPane.showMessageDialog(null, message, "Disconnected: Account Suspension", JOptionPane.WARNING_MESSAGE);
    }
}