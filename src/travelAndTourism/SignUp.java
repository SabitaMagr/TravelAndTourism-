package travelAndTourism;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUp extends JFrame implements ActionListener {
	JButton create, back;
	JTextField tfUsername, tfName, tfPassword, tfAnswer;
	Choice security, role;

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

		tfUsername = new JTextField();
		tfUsername.setBounds(180, 35, 250, 27);
		tfUsername.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfUsername.setBorder(BorderFactory.createEmptyBorder());
		p1.add(tfUsername);

		JLabel lblName = new JLabel("Name");
		lblName.setBounds(50, 80, 100, 25);
		lblName.setFont(new Font("Tahoma", Font.BOLD, 15));
		p1.add(lblName);

		tfName = new JTextField();
		tfName.setBounds(180, 80, 250, 27);
		tfName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfName.setBorder(BorderFactory.createEmptyBorder());
		p1.add(tfName);

		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(50, 125, 100, 25);
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 15));
		p1.add(lblPassword);

		tfPassword = new JTextField();
		tfPassword.setBounds(180, 125, 250, 27);
		tfPassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfPassword.setBorder(BorderFactory.createEmptyBorder());
		p1.add(tfPassword);

		JLabel lblSecurity = new JLabel("Security Ques");
		lblSecurity.setBounds(50, 170, 120, 25);
		lblSecurity.setFont(new Font("Tahoma", Font.BOLD, 15));
		p1.add(lblSecurity);

		security = new Choice();
		security.add("Fav Character from the Boys");
		security.add("Fav Marvel Super Hero");
		security.add("Your Lucky Number");
		security.add("Fav Cartoon");
		security.setBounds(180, 170, 250, 27);
		p1.add(security);

		JLabel lblAnswer = new JLabel("Answer");
		lblAnswer.setBounds(50, 210, 100, 25);
		lblAnswer.setFont(new Font("Tahoma", Font.BOLD, 15));
		p1.add(lblAnswer);

		tfAnswer = new JTextField();
		tfAnswer.setBounds(180, 210, 250, 27);
		tfAnswer.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfAnswer.setBorder(BorderFactory.createEmptyBorder());
		p1.add(tfAnswer);

		JLabel lblRole = new JLabel("Role");
		lblRole.setBounds(50, 260, 100, 25);
		lblRole.setFont(new Font("Tahoma", Font.BOLD, 15));
		p1.add(lblRole);

		role = new Choice();
		role.add("Admin");
		role.add("User");
		role.setBounds(180, 260, 250, 27);
		p1.add(role);

		create = new JButton("Create");
		create.setBackground(Color.WHITE);
		create.setForeground(new Color(133, 193, 233));
		create.setFont(new Font("Tahoma", Font.BOLD, 14));
		create.setBounds(100, 320, 110, 40);
		p1.add(create);

		back = new JButton("Back");
		back.setBackground(Color.WHITE);
		back.setForeground(new Color(133, 193, 233));
		back.setFont(new Font("Tahoma", Font.BOLD, 14));
		back.setBounds(280, 320, 110, 40);
		p1.add(back);

		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("image/Screenshot (109).png"));
		Image i2 = i1.getImage().getScaledInstance(700, 200, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		image.setBounds(520, 60, 200, 230);
		add(image);

		create.addActionListener(this);
		back.addActionListener(this);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == create) {
			String username = tfUsername.getText();
			String name = tfName.getText();
			String answer = tfAnswer.getText();
			String password = tfPassword.getText();
			String Secques = security.getSelectedItem();
			String userRole = role.getSelectedItem();
			if (username.isEmpty() || name.isEmpty() || answer.isEmpty() || password.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Please fill out all fields!!");
			} else {
				char isAdmin = userRole.equals("Admin") ? 'Y' : 'N';
				char status = 'E';
				String query = "INSERT INTO user (username, name, password, securityQues, answer) VALUES ('" + username
						+ "','" + name + "','" + password + "','" + Secques + "','" + answer + "')";
				try {
					Conn c = new Conn();
					c.s.executeUpdate(query);
					JOptionPane.showMessageDialog(null, "User Created Successfully!!");
					setVisible(false);
					new Login();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		} else if (ae.getSource() == back) {
			setVisible(false);
			new Login();
		}

	}

	public static void main(String[] args) {
		new SignUp();
	}

}
