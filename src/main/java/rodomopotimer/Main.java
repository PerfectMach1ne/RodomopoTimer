package main.java.rodomopotimer;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.UIManager;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Container;

public class Main {
    private static JPanel cards;
    private static JButton startClock;
    private static JButton pauseClock;
    private static JButton stopClock;

    private static void createAndShowGUI() {
        // Create and set up the window
        JFrame frame = new JFrame("Rodomopo Timer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create the timer label card for the card container
        JPanel cardTimer = new JPanel();
        JLabel timerLabel = new JLabel();
        timerLabel.setText("<html><body>" + "<div style=\"font-size:72;\">" + "00:00" + "</div></body></html>");
        cardTimer.add(timerLabel);

        // Create the buttons card for the card container
        JPanel cardButtons = new JPanel();
        startClock = new JButton("Start");
        pauseClock = new JButton("Pause");
        stopClock = new JButton("Stop");
        cardButtons.add(startClock);
        cardButtons.add(pauseClock);
        cardButtons.add(stopClock);

        // Create the card container
        cards = new JPanel(new CardLayout());
        cards.add(cardTimer);
        cards.add(cardButtons);
        frame.add(cards);

        // Center the window
        frame.setLocationRelativeTo(null);
        frame.pack();
        // Display the window
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // Setup FlatLaf Darcula theme
        try {
            UIManager.setLookAndFeel( new com.formdev.flatlaf.FlatDarculaLaf() );
        } catch( Exception ex ) {
            System.err.println("Failed to initialize LaF");
        }
//        com.formdev.flatlaf.FlatDarculaLaf.setup();

        javax.swing.SwingUtilities.invokeLater(Main::createAndShowGUI);
    }
}
