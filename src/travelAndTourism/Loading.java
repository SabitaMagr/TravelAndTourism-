package travelAndTourism;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Loading extends JFrame implements Runnable {
	Thread t;
	JProgressBar bar;
	String username;

	public void run() {
		try {
			for (int i = 1; i <= 101; i++) {
				int max = bar.getMaximum();
				int value=bar.getValue();
				if(value<max) {
					bar.setValue(bar.getValue()+1);
				}else {
					setVisible(false);
//					new AdminDashboard();
				}
				Thread.sleep(50);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	Loading(String username) {
		this.username=username;
		t=new Thread(this);
		setBounds(350, 200, 650, 400);
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);

		JLabel loading = new JLabel("Travel & Tourism Management System");
		loading.setBounds(70, 40, 500, 30);
		loading.setFont(new Font("SAN SERIF", Font.BOLD, 25));
		loading.setHorizontalAlignment(JLabel.CENTER);
		add(loading);

		bar = new JProgressBar();
		bar.setBounds(230, 130, 200, 25);
		bar.setForeground(Color.green);
		bar.setStringPainted(true);
		add(bar);

		JLabel lblloading = new JLabel("Loading, please wait ...");
		lblloading.setBounds(250, 170, 500, 30);
		lblloading.setFont(new Font("SAN SERIF", Font.PLAIN, 16));
		lblloading.setForeground(Color.RED);
		lblloading.setHorizontalAlignment(JLabel.CENTER);
		add(lblloading);

		JLabel welcome = new JLabel("Welcome "+username);
		welcome.setBounds(30, 300, 500, 30);
		welcome.setFont(new Font("SAN SERIF", Font.BOLD, 20));
		welcome.setForeground(Color.BLACK);
		add(welcome);
		t.start();
		setVisible(true);
	}

	public static void main(String[] args) {
		new Loading("");
	}

}
