package travelAndTourism;

import java.awt.Color;
import java.sql.ResultSet;
import java.awt.BorderLayout;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import com.mysql.cj.jdbc.result.ResultSetMetaData;

public class User extends JFrame {
	DefaultTableModel table;
	User() {
		setBounds(250, 150, 1123, 585);
		getContentPane().setBackground(Color.WHITE);
		
        getContentPane().setBackground(Color.WHITE);
		String query = "Select * from user";
		try {
			Conn c = new Conn();
			ResultSet resultSet = c.s.executeQuery(query);

			com.mysql.cj.jdbc.result.ResultSetMetaData metaData = (com.mysql.cj.jdbc.result.ResultSetMetaData) resultSet
					.getMetaData();
			int count = metaData.getColumnCount();

			table = new DefaultTableModel();
			table.addColumn("User Id");
			table.addColumn("Name");
			table.addColumn("User Name");
			table.addColumn("Password");
			table.addColumn("Email");
			table.addColumn("Mobile No");
			table.addColumn("Id");
			table.addColumn("Gender");
			table.addColumn("Country");
			table.addColumn("Address");
			table.addColumn("Is Admin");
			table.addColumn("Status");


			while (resultSet.next()) {
				Object[] rowData = new Object[count];
				for (int i = 1; i <= count; i++) {
					rowData[i - 1] = resultSet.getObject(i);
				}
				table.addRow(rowData);
			}


		} catch (Exception e) {
			e.printStackTrace();
		}

		JTable tblUser = new JTable(table);
		JScrollPane scrollPane = new JScrollPane(tblUser); 
		add(scrollPane, BorderLayout.CENTER); 
		setVisible(true);
	}

	public static void main(String[] args) {
		new User();
	}

}
