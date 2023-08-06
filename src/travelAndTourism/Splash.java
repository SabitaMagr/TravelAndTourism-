package travelAndTourism;

import javax.swing.*;

public class Splash extends JFrame  {
    Splash() {
        setSize(1200, 600);
        setLocation(200, 100);
        ImageIcon image = new ImageIcon(ClassLoader.getSystemResource("image/Screenshot (107).png"));
        JLabel img = new JLabel(image);
        add(img);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Set close operation
        setVisible(true);
    }

    public static void main(String[] args) {
            new Splash();
    }
}
