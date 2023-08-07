package travelAndTourism;

import javax.swing.*;
import java.awt.*;

public  class Splash extends JFrame implements Runnable {
	Thread thread;
	Splash() {
//        setSize(1000, 500);
//        setLocation(180, 100);
		ImageIcon image = new ImageIcon(ClassLoader.getSystemResource("image/Screenshot (107).png"));
		Image img2 = image.getImage().getScaledInstance(1200, 600, Image.SCALE_DEFAULT);
		ImageIcon img3 = new ImageIcon(img2);
		JLabel img = new JLabel(img3);
		add(img);

//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Set close operation
		setVisible(true);
		thread=new Thread(this);
		thread.start();
	}
	
	public void run () {
		try {
			Thread.sleep(6000);
			new Login();
			setVisible(false);
		}catch(Exception e) {}
		
	};

	public static void main(String[] args) {
		Splash frame = new Splash();
		int x = 1;
		for (int i = 1; i <= 500; x += 7, i += 6) {
			frame.setLocation(680-(x+i)/2,380-i/2);
			frame.setSize(x + i, i);
			try {
				Thread.sleep(10);

			} catch (Exception e) {

			}
		}
	}
}
