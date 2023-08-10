package travelAndTourism;

import javax.swing.*;
import javax.swing.border.LineBorder;

import java.sql.ResultSet;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ChangePassword extends JFrame implements ActionListener {

	public int userId;
	JTextField tfPassword, tfNewPsw;
	JButton btnSave;

	ChangePassword(int userId){
		this.userId=userId;

		setTitle("Forget Password");
		setSize(550, 300);
		setLocation(400, 200);
		setLayout(null);

		JLabel chngeTitle = new JLabel("Change Password");
		chngeTitle.setBounds(85, 20, 355, 30);
		chngeTitle.setFont(new Font("SAN SERIF", Font.BOLD, 30));
		chngeTitle.setHorizontalAlignment(JLabel.CENTER);
		add(chngeTitle);

		JLabel lblPassword = new JLabel("New Password");
		lblPassword.setBounds(100, 90, 150, 25);
		lblPassword.setFont(new Font("SAN SERIF", Font.PLAIN, 18));
		add(lblPassword);

		tfPassword = new JTextField();
		tfPassword.setBounds(250, 90, 200, 30);
		tfPassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfPassword.setBorder(BorderFactory.createEmptyBorder());
		add(tfPassword);

		JLabel lblNewPsw = new JLabel("Retype Password");
		lblNewPsw.setBounds(100, 140, 150, 25);
		lblNewPsw.setFont(new Font("SAN SERIF", Font.PLAIN, 18));
		add(lblNewPsw);

		tfNewPsw = new JTextField();
		tfNewPsw.setBounds(250, 140, 200, 30);
		tfNewPsw.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfNewPsw.setBorder(BorderFactory.createEmptyBorder());
		add(tfNewPsw);

		btnSave = new JButton("Save");
		btnSave.setBounds(220, 200, 100, 36);
		btnSave.setFont(new Font("SAN SERIF", Font.PLAIN, 18));
		btnSave.setBackground(new Color(133, 193, 233));
		btnSave.setForeground(Color.WHITE);
		btnSave.setBorder(new LineBorder(new Color(133, 193, 233)));
		add(btnSave);

		setVisible(true);
	}

	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == btnSave) {
			String password = tfPassword.getText();
			String newPassword = tfNewPsw.getText();
			if (!password.equals(newPassword)) {
				JOptionPane.showMessageDialog(null, "The password you enter is incorrect !!!");
			} else {
				String query = "Update user set password='" + newPassword + "' where  userId='" + userId + "' ";
				try {
					Conn c = new Conn();
					c.s.executeUpdate(query);
					JOptionPane.showMessageDialog(null, "Password Change Successfully!!!");
					setVisible(false);
					new Login();

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static void main(String[] args) {
		int UserId=12345;
		new ChangePassword (UserId);

	}

}
