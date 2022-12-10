package main.java.rodomopotimer;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {
    private static void createAndShowGUI() {
        // Create and set up the window
        JFrame frame = new JFrame("Rodomopo Timer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // A placeholder label from Java Swing tutorial (i forgor how to do it all)
        JLabel label = new JLabel("Hello World");
        frame.getContentPane().add(label);

        // Center the window
        frame.setLocationRelativeTo(null);
        frame.pack();
        // Display the window
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(Main::createAndShowGUI);
    }
}
