package travelAndTourism;

import javax.swing.*;
import javax.swing.border.LineBorder;

import java.sql.ResultSet;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ForgetPassword extends JFrame implements ActionListener {
	JTextField tfEmail;
	JButton btnChangePsw;

	ForgetPassword() {
		setTitle("Forget Password");
		setSize(550, 300);
		setLocation(400, 200);
		setLayout(null);

		JLabel chngeTitle = new JLabel("Forget Password");
		chngeTitle.setBounds(85, 20, 355, 30);
		chngeTitle.setFont(new Font("SAN SERIF", Font.BOLD, 30));
		chngeTitle.setHorizontalAlignment(JLabel.CENTER);
		add(chngeTitle);

		JLabel lblEmail = new JLabel("Enter email");
		lblEmail.setBounds(170, 90, 100, 25);
		lblEmail.setFont(new Font("SAN SERIF", Font.PLAIN, 18));
		add(lblEmail);

		tfEmail = new JTextField();
		tfEmail.setBounds(170, 130, 200, 30);
		tfEmail.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfEmail.setBorder(BorderFactory.createEmptyBorder());
		add(tfEmail);

		btnChangePsw = new JButton("Change Password");
		btnChangePsw.setBounds(180, 190, 165, 36);
		btnChangePsw.setFont(new Font("SAN SERIF", Font.PLAIN, 18));
		btnChangePsw.setBackground(new Color(133, 193, 233));
		btnChangePsw.setForeground(Color.WHITE);
		btnChangePsw.setBorder(new LineBorder(new Color(133, 193, 233)));
		add(btnChangePsw);

		setVisible(true);

	}

	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == btnChangePsw) {
			String email = tfEmail.getText();
			int userId = 0;
			if (email.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Please enter your email !!!");
			} else {
				String query = "select userId,(case when userId is not null then 'true' else 'false' end) as valid_user from user where  email='"
						+ email + "'and status='E' ";
				try {
					Conn c = new Conn();
					ResultSet resultSet = c.s.executeQuery(query);
					if (resultSet.next()) {
						String validUser = resultSet.getString("valid_user");
						userId = resultSet.getInt("userId");

						if (validUser.equals("Y ")) {
							JOptionPane.showMessageDialog(null, "Valid Email!!!");
							setVisible(false);
							new ChangePassword(userId);

						} else {
						}
					} else {
						JOptionPane.showMessageDialog(null, "User not found!");
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static void main(String[] args) {
		new ForgetPassword();
	}

}
