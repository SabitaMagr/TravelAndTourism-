package travelAndTourism;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;

public class Login extends JFrame {

	Login() {
		setSize(700, 400);
		setLocation(310, 200);
		setLayout(null);

		getContentPane().setBackground(Color.WHITE);
//for left side
		JPanel p1 = new JPanel();
		p1.setBackground(new Color(131, 193, 233));
		p1.setBounds(0, 0, 310, 400);
		p1.setLayout(null);
		add(p1);

		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("image/Screenshot (109).png"));
		Image i2 = i1.getImage().getScaledInstance(700, 200, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		image.setBounds(60, 60, 200, 230);
		p1.add(image);
//For Right Side
		JPanel p2 = new JPanel();
		p2.setLayout(null);
		p2.setBounds(300, 35, 355, 280);
		add(p2);
//For UserName
		JLabel lblUserName = new JLabel("Username");
		lblUserName.setBounds(80, 20, 100, 25);
		lblUserName.setFont(new Font("SAN SERIF", Font.PLAIN, 18));
		p2.add(lblUserName);

		JTextField tfUsername = new JTextField();
		tfUsername.setBounds(80, 50, 200, 30);
		tfUsername.setBorder(BorderFactory.createEmptyBorder());
		p2.add(tfUsername);

// For Password
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(80, 90, 100, 25);
		lblPassword.setFont(new Font("SAN SERIF", Font.PLAIN, 18));
		p2.add(lblPassword);

		JTextField tfPassword = new JTextField();
		tfPassword.setBounds(80, 120, 200, 30);
		tfPassword.setBorder(BorderFactory.createEmptyBorder());
		p2.add(tfPassword);
//For BUtton 
		JButton login=new JButton("Login");
		login.setBounds(80,175,90,36);
		login.setFont(new Font("SAN SERIF", Font.PLAIN, 18));
		login.setBackground(new Color(133,193,233));
		login.setForeground(Color.WHITE);
		login.setBorder(new LineBorder(new Color(133,193,233)));
		p2.add(login);
		
		JButton signUp=new JButton("Sign Up");
		signUp.setBounds(190,175,90,36);
		signUp.setFont(new Font("SAN SERIF", Font.PLAIN, 18));
		signUp.setBackground(new Color(133,193,233));
		signUp.setForeground(Color.WHITE);
		signUp.setBorder(new LineBorder(new Color(133,193,233)));
		p2.add(signUp);
		
		JButton forgetPsw=new JButton("Forget Password");
		forgetPsw.setBounds(109,225,150,36);
		forgetPsw.setFont(new Font("SAN SERIF", Font.PLAIN, 18));
		forgetPsw.setBackground(new Color(133,193,233));
		forgetPsw.setForeground(Color.WHITE);
		forgetPsw.setBorder(new LineBorder(new Color(133,193,233)));
		p2.add(forgetPsw);
		
		setVisible(true);
	}

	public static void main(String[] args) {
		Login l = new Login();
	}

}
