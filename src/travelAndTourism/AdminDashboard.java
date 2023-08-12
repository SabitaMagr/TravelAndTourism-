package travelAndTourism;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminDashboard extends JFrame {

	AdminDashboard() {
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setLayout(null);

		JPanel p1 = new JPanel();
		p1.setLayout(null);
		p1.setBackground(new Color(0, 0, 102));
		p1.setBounds(0, 0, 1370, 70);
		add(p1);

		ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("image/dashboard.png"));
		Image i2 = img.getImage().getScaledInstance(80, 80, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel icon = new JLabel(i3);
		icon.setBounds(10, 5, 70, 70);
		p1.add(icon);

		JLabel title = new JLabel("Dashboard");
		title.setBounds(90, 22, 300, 20);
		title.setForeground(Color.WHITE);
		title.setFont(new Font("Tahoma", Font.BOLD, 22));
		p1.add(title);

		JPanel p2 = new JPanel();
		p2.setLayout(null);
		p2.setBackground(new Color(0, 0, 102));
		p2.setBounds(0, 45, 230, 690);
		add(p2);

		JButton btnUserDtl = new JButton("User Details");
		btnUserDtl.setBounds(0, 30, 229, 40);
		btnUserDtl.setForeground(Color.WHITE);
		btnUserDtl.setBackground(new Color(0, 0, 102));
		btnUserDtl.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnUserDtl.setMargin(new Insets(0, 0, 0, 70));
		btnUserDtl.setFocusable(false);
		p2.add(btnUserDtl);

		JButton btnPackage = new JButton("Package");
		btnPackage.setBounds(0, 70, 229, 40);
		btnPackage.setForeground(Color.WHITE);
		btnPackage.setBackground(new Color(0, 0, 102));
		btnPackage.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnPackage.setMargin(new Insets(0, 0, 0, 100));
		btnPackage.setFocusable(false);
		p2.add(btnPackage);

		JButton btnHotel = new JButton("Hotel");
		btnHotel.setBounds(0, 110, 229, 40);
		btnHotel.setForeground(Color.WHITE);
		btnHotel.setBackground(new Color(0, 0, 102));
		btnHotel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnHotel.setMargin(new Insets(0, 0, 0, 120));
		btnHotel.setFocusable(false);
		p2.add(btnHotel);

		JButton btnDestination = new JButton("Destination");
		btnDestination.setBounds(0, 150, 229, 40);
		btnDestination.setForeground(Color.WHITE);
		btnDestination.setBackground(new Color(0, 0, 102));
		btnDestination.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnDestination.setMargin(new Insets(0, 0, 0, 70));
		btnDestination.setFocusable(false);
		p2.add(btnDestination);

		ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("image/home.jpg"));
		Image i5 = i4.getImage().getScaledInstance(1650, 1000, Image.SCALE_DEFAULT);
		ImageIcon i6 = new ImageIcon(i5);
		JLabel image = new JLabel(i6);
		image.setBounds(0, 0, 1650, 1000);
		add(image);

		JLabel text = new JLabel("Travel and Tourism Management System");
		text.setBounds(300, 80, 1000, 70);
		text.setForeground(Color.WHITE);
		text.setFont(new Font("Raleway", Font.BOLD, 35));
		text.setHorizontalAlignment(JLabel.CENTER);
		image.add(text);
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new AdminDashboard();
	}

}
