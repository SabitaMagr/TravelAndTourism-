package travelAndTourism;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUp extends JFrame implements ActionListener {
	JButton create, back;
	JTextField tfUsername, tfName, tfPassword, tfMobileNo, tfEmail;
	Choice role;

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

		JLabel loginTitle = new JLabel("Sign Up");
		loginTitle.setBounds(30, 13, 355, 35);
		loginTitle.setFont(new Font("SAN SERIF", Font.BOLD, 30));
		loginTitle.setHorizontalAlignment(JLabel.CENTER);
		p1.add(loginTitle);

		JLabel lblUserName = new JLabel("Username");
		lblUserName.setBounds(50, 70, 100, 25);
		lblUserName.setFont(new Font("Tahoma", Font.BOLD, 15));
		p1.add(lblUserName);

		tfUsername = new JTextField();
		tfUsername.setBounds(180, 70, 250, 27);
		tfUsername.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfUsername.setBorder(BorderFactory.createEmptyBorder());
		p1.add(tfUsername);

		JLabel lblName = new JLabel("Name");
		lblName.setBounds(50, 110, 100, 25);
		lblName.setFont(new Font("Tahoma", Font.BOLD, 15));
		p1.add(lblName);

		tfName = new JTextField();
		tfName.setBounds(180, 110, 250, 27);
		tfName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfName.setBorder(BorderFactory.createEmptyBorder());
		p1.add(tfName);

		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(50, 150, 100, 25);
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 15));
		p1.add(lblPassword);

		tfPassword = new JTextField();
		tfPassword.setBounds(180, 150, 250, 27);
		tfPassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfPassword.setBorder(BorderFactory.createEmptyBorder());
		p1.add(tfPassword);

		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(50, 190, 120, 25);
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 15));
		p1.add(lblEmail);

		tfEmail = new JTextField();
		tfEmail.setBounds(180, 190, 250, 27);
		tfEmail.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfEmail.setBorder(BorderFactory.createEmptyBorder());
		p1.add(tfEmail);

		JLabel lblmobileNo = new JLabel("Mobile No");
		lblmobileNo.setBounds(50, 230, 100, 25);
		lblmobileNo.setFont(new Font("Tahoma", Font.BOLD, 15));
		p1.add(lblmobileNo);

		tfMobileNo = new JTextField();
		tfMobileNo.setBounds(180, 230, 250, 27);
		tfMobileNo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfMobileNo.setBorder(BorderFactory.createEmptyBorder());
		p1.add(tfMobileNo);

		JLabel lblRole = new JLabel("Role");
		lblRole.setBounds(50, 270, 100, 25);
		lblRole.setFont(new Font("Tahoma", Font.BOLD, 15));
		p1.add(lblRole);

		role = new Choice();
		role.add("Admin");
		role.add("User");
		role.setBounds(180, 270, 250, 27);
		role.setFont(new Font("Tahoma", Font.PLAIN, 18));
		p1.add(role);

		create = new JButton("Create");
		create.setBackground(Color.WHITE);
		create.setForeground(new Color(133, 193, 233));
		create.setFont(new Font("Tahoma", Font.BOLD, 18));
		create.setBounds(100, 330, 110, 40);
		create.setBorder(new LineBorder(new Color(133, 193, 233)));
		p1.add(create);

		back = new JButton("Back");
		back.setBackground(Color.WHITE);
		back.setForeground(new Color(133, 193, 233));
		back.setFont(new Font("Tahoma", Font.BOLD, 18));
		back.setBorder(new LineBorder(new Color(133, 193, 233)));
		back.setBounds(280, 330, 110, 40);
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

	public static boolean isValidEmail(String email) {
	    String regex = "^[A-Za-z0-9+_.-]+@([A-Za-z0-9.-]+\\.[A-Za-z]{2,4})$";
	    Pattern pattern = Pattern.compile(regex);
	    Matcher matcher = pattern.matcher(email);
	    return matcher.matches();
	}
	
	public static boolean isValidMobileNumber(String mobileNumber) {
        String regex = "^98\\d{8}$"; // Matches "98" followed by 8 digits
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(mobileNumber);
        return matcher.matches();
    }

	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == create) {
			String username = tfUsername.getText();
			String name = tfName.getText();
			String mobileNo = tfMobileNo.getText();
			String password = tfPassword.getText();
			String email = tfEmail.getText();
			String userRole = role.getSelectedItem();

			if (username.isEmpty() || name.isEmpty() || mobileNo.isEmpty() || password.isEmpty() || email.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Please fill out all fields!!");
			} else {
				 if (!isValidEmail(email)) {
			            JOptionPane.showMessageDialog(null, "Enter email in example@mail.com format.");
			            return; 
			        }
				  if (!isValidMobileNumber(mobileNo)) {
		                JOptionPane.showMessageDialog(null, "Mobile number should of 10 digits starting with 98.");
		                return; 
		            }
				char isAdmin = userRole.equals("Admin") ? 'Y' : 'N';
				char status = 'E';
				String query = "INSERT INTO user (username, name, password, email, mobileNo,isAdmin,status) VALUES ('"
						+ username + "','" + name + "','" + password + "','" + email + "','" + mobileNo + "','"
						+ isAdmin + "','" + status + "')";
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
