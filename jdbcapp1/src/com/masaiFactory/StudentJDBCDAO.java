package com.masaiFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class StudentJDBCDAO {
	
		Connection connection = null;
		PreparedStatement ptmt = null;
		ResultSet resultSet = null;
		public StudentJDBCDAO() {
		}
		private Connection getConnection() throws SQLException {
		Connection conn;
		conn = ConnectionFactory.getInstance().getConnection();
		return conn;
		}
		public void add(Employee EmployeeBean) {
		try {
		String queryString = "INSERT INTO emp2(eid, name,Address,salary) VALUES(?,?,?,?)";
		connection = getConnection();
		ptmt = connection.prepareStatement(queryString);
		ptmt.setInt(1, EmployeeBean.getEid());
		ptmt.setString(2, EmployeeBean.getName());
		ptmt.setLong(4, EmployeeBean.getSalary());
		ptmt.setString(3, EmployeeBean.getAddress());
		ptmt.executeUpdate();
		System.out.println("Data Added Successfully");
		} catch (SQLException e) {
		e.printStackTrace();
		} finally {
		try {
		if (ptmt != null)
		ptmt.close();
		if (connection != null)
		connection.close();
		} catch (SQLException e) {
		
		e.printStackTrace();
		} catch (Exception e) {
		e.printStackTrace();
		}
		}
		}
		
		
		public void add2(Employee EmployeeBean) {
			try {
			String queryString = "INSERT INTO emp2(eid, name,salary) VALUES(?,?,?)";
			connection = getConnection();
			ptmt = connection.prepareStatement(queryString);
			ptmt.setInt(1, EmployeeBean.getEid());
			ptmt.setString(2, EmployeeBean.getName());
			ptmt.setLong(3, EmployeeBean.getSalary());
			
			ptmt.executeUpdate();
			System.out.println("Data Added Successfully");
			} catch (SQLException e) {
			e.printStackTrace();
			} finally {
			try {
			if (ptmt != null)
			ptmt.close();
			if (connection != null)
			connection.close();
			} catch (SQLException e) {
			
			e.printStackTrace();
			} catch (Exception e) {
			e.printStackTrace();
			}
			}
			}
		
		public void findAllbyeid(int id) {
			try {
			String queryString = "SELECT * FROM emp2 where eid=?";
			
			connection = getConnection();
			
			
			ptmt = connection.prepareStatement(queryString);
			
			ptmt.setInt(1, id);
			
			resultSet = ptmt.executeQuery();
			
			while (resultSet.next()) {
			System.out.println("Employee ID " + resultSet.getInt("eid")
			+ ", Name " + resultSet.getString("Name") + ", Salary "
			+ resultSet.getLong("salary") + ", Address "
			+ resultSet.getString("Address"));
			}
			} catch (SQLException e) {
			e.printStackTrace();
			} finally {
			try {
			if (resultSet != null)
			resultSet.close();
			if (ptmt != null)
			ptmt.close();
			if (connection != null)
			connection.close();
			} catch (SQLException e) {
			e.printStackTrace();
			} catch (Exception e) {
			e.printStackTrace();
			}
			}
			}
		
		
		public void updatebonus(int bonus) {
			try {
			String queryString = "UPDATE emp2 SET salary=salary+?";
			connection = getConnection();
			ptmt = connection.prepareStatement(queryString);
			ptmt.setInt(1, bonus);
			
			ptmt.executeUpdate();
			System.out.println("Table Updated Successfully");
			} catch (SQLException e) {
			e.printStackTrace();
			} finally {
			try {
			if (ptmt != null)
			ptmt.close();
			if (connection != null)
			connection.close();
			}
			catch (SQLException e) {
			e.printStackTrace();
			} catch (Exception e) {
			e.printStackTrace();
			}
			}
			}
		
		public void findAll() {
			try {
			String queryString = "SELECT * FROM emp2";
			connection = getConnection();
			ptmt = connection.prepareStatement(queryString);
			
			resultSet = ptmt.executeQuery();
			while (resultSet.next()) {
				System.out.println("Employee ID " + resultSet.getInt("eid")
				+ ", Name " + resultSet.getString("Name") + ", Salary "
				+ resultSet.getLong("salary") + ", Address "
				+ resultSet.getString("Address"));
				}
			} catch (SQLException e) {
			e.printStackTrace();
			} finally {
			try {
			if (resultSet != null)
			resultSet.close();
			if (ptmt != null)
			ptmt.close();
			if (connection != null)
			connection.close();
			} catch (SQLException e) {
			e.printStackTrace();
			} catch (Exception e) {
			e.printStackTrace();
			}
			}
			}
		
		
		
		
		public void findAllSalary(int amt) {
			try {
			String queryString = "SELECT * FROM emp2 where salary<?";
			connection = getConnection();
			ptmt = connection.prepareStatement(queryString);
			ptmt.setInt(1, amt);
			resultSet = ptmt.executeQuery();
			while (resultSet.next()) {
				System.out.println("Employee ID " + resultSet.getInt("eid")
				+ ", Name " + resultSet.getString("Name") + ", Salary "
				+ resultSet.getLong("salary") + ", Address "
				+ resultSet.getString("Address"));
				}
			} catch (SQLException e) {
			e.printStackTrace();
			} finally {
			try {
			if (resultSet != null)
			resultSet.close();
			if (ptmt != null)
			ptmt.close();
			if (connection != null)
			connection.close();
			} catch (SQLException e) {
			e.printStackTrace();
			} catch (Exception e) {
			e.printStackTrace();
			}
			}
			}
			

		
		

		
}
