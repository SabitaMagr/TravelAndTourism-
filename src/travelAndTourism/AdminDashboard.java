package travelAndTourism;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminDashboard extends JFrame {

	AdminDashboard()
	{
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setLayout(null);
		
		JPanel p1=new JPanel();
		p1.setLayout(null);
		p1.setBackground(new Color(0,0,102));
		p1.setBounds(0,0,1370,70);
		add(p1);
		
		ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("image/dashboard.png"));
		Image i2=img.getImage().getScaledInstance(80, 80,Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel icon=new JLabel(i3);
		icon.setBounds(10,5,70,70);
		p1.add(icon);
		
		JLabel title= new JLabel("Dashboard");
		title.setBounds(90,22,300,20);
		title.setForeground(Color.WHITE);
		title.setFont(new Font("Tahoma",Font.BOLD,22));
		p1.add(title);
		
		JPanel p2=new JPanel();
		p2.setLayout(null);
		p2.setBackground(new Color(0,0,102));
		p2.setBounds(0,45,230,690);
		add(p2);
		
		
		setVisible(true);
	}
	public static void main(String[] args) {
		new AdminDashboard();
	}

}
