package com.login.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDao {

	
		String user = "root";
		String password = "1234";
		String url = "jdbc:mysql://localhost:3306/student_manage";
		String sql = "select * from login where uname=? and pass=?";
		public boolean check(String uname,String pass) throws SQLException {
			
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection(url,user,password);
				PreparedStatement st = con.prepareStatement(sql);
				st.setString(1, uname);
				st.setString(2, password);
				ResultSet rs = st.executeQuery();		
				if(rs.next()) {
					return true;
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return false;
		}
}
