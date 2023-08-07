package travelAndTourism;

import javax.swing.*;
import java.awt.*;

public class SignUp extends JFrame {

	SignUp() {
		setBounds(310, 150, 750, 450);
		setLayout(null);
		getContentPane().setBackground(Color.WHITE);
		// Left side
		JPanel p1 = new JPanel();
		p1.setBackground(new Color(133, 193, 233));
		p1.setBounds(0, 0, 500, 400);
		p1.setLayout(null);
		add(p1);

		JLabel lblUserName = new JLabel("Username");
		lblUserName.setBounds(50, 35, 100, 25);
		lblUserName.setFont(new Font("Tahoma", Font.BOLD, 15));
		p1.add(lblUserName);

		JTextField tfUsername = new JTextField();
		tfUsername.setBounds(180, 35, 250, 27);
		tfUsername.setBorder(BorderFactory.createEmptyBorder());
		p1.add(tfUsername);

		JLabel lblName = new JLabel("Name");
		lblName.setBounds(50, 80, 100, 25);
		lblName.setFont(new Font("Tahoma", Font.BOLD, 15));
		p1.add(lblName);

		JTextField tfName = new JTextField();
		tfName.setBounds(180, 80, 250, 27);
		tfName.setBorder(BorderFactory.createEmptyBorder());
		p1.add(tfName);

		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(50, 125, 100, 25);
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 15));
		p1.add(lblPassword);

		JTextField tfPassword = new JTextField();
		tfPassword.setBounds(180, 125, 250, 27);
		tfPassword.setBorder(BorderFactory.createEmptyBorder());
		p1.add(tfPassword);

		JLabel lblSecurity = new JLabel("Security Questions");
		lblSecurity.setBounds(50, 170, 100, 25);
		lblSecurity.setFont(new Font("Tahoma", Font.BOLD, 15));
		p1.add(lblSecurity);

		Choice security = new Choice();
		security.add("Fav Character from the Boys");
		security.add("Fav Marvel Super Hero");
		security.add("Your Lucky Number");
		security.add("Fav Cartoon");
		security.setBounds(180, 170, 250, 27);
		p1.add(security);

		JLabel lblAnswer = new JLabel("Answer");
		lblAnswer.setBounds(50, 220, 100, 25);
		lblAnswer.setFont(new Font("Tahoma", Font.BOLD, 15));
		p1.add(lblAnswer);

		JTextField tfSecurity = new JTextField();
		tfSecurity.setBounds(180, 220, 250, 27);
		tfSecurity.setBorder(BorderFactory.createEmptyBorder());
		p1.add(tfSecurity);
		
		JButton create =new JButton("Create");
		create.setBackground(Color.WHITE);
		create.setForeground(new Color(133,193,233));
		create.setFont(new Font("Tahoma",Font.BOLD,14));
		create.setBounds(100,290,110,40);
		p1.add(create);
		
		JButton back =new JButton("Back");
		back.setBackground(Color.WHITE);
		back.setForeground(new Color(133,193,233));
		back.setFont(new Font("Tahoma",Font.BOLD,14));
		back.setBounds(280,290,110,40);
		p1.add(back);

		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("image/Screenshot (109).png"));
		Image i2 = i1.getImage().getScaledInstance(700, 200, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		image.setBounds(520, 60, 200, 230);
		add(image);
		setVisible(true);
	}

	public static void main(String[] args) {
		new SignUp();
	}

}
