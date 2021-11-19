package com.hccs.advweb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import com.hccs.advweb.util.DatabaseUtil;

public class CustomerList {
	private ArrayList<Customer> customerList = new ArrayList<Customer>();

	public void setCustomerList(ArrayList<Customer> customerList) {
		this.customerList = customerList;
	}

	public ArrayList<Customer> getCustomerList() {
		try {
			Connection conn = DatabaseUtil.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("Select * from customer_information");

			while (rs.next()) {
				String name = rs.getString("name");
				String email = rs.getString("email");
				String phone = rs.getString("phone");
				String message = rs.getString("message");
				Customer customer = new Customer(name, email, phone, message);
				System.out.println(name + email + phone + message);
				customer.setName(name);
				customer.setEmail(email);
				customer.setPhone(phone);
				customer.setMessage(message);
				customerList.add(customer);
			}

		} catch (Exception e) {
			e.getMessage();
		}
		return customerList;
	}

	public static void addCustomer(Customer cus) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DatabaseUtil.getConnection();
			Statement stmt = conn.createStatement();

			String name = cus.getName();
			String email = cus.getEmail();
			String phone = cus.getPhone();
			String message = cus.getMessage();

			String sql = "INSERT INTO customer_information (name,email,phone,message) VALUES (?,?,?,?)";
			PreparedStatement student = conn.prepareStatement(sql);
			student.setString(1, name);
			student.setString(2, email);
			student.setString(3, phone);
			student.setString(4, message);
			student.execute();
			stmt.close();
			conn.close();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public CustomerList() {
	}

}
