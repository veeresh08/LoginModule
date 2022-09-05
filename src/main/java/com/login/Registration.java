package com.login;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class Registration extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 String uname = request.getParameter("name");
		 String uemail = request.getParameter("email");
		 String pass = request.getParameter("password");
		 String umobile = request.getParameter("contact");
		 //System.out.println("encountered me 1");
		 
//		 PrintWriter out = response.getWriter();
//		 out.print(uname);
//		 out.print(uemail);
//		 out.print(upwd);
//		 out.print(umobile);
		 
		 
		 	String user = "root";
			String password = "1234";
			String url = "jdbc:mysql://localhost:3306/student_manage";
			String sql = "insert into login(uname,pass,uemail,umobile) values(?,?,?,?)";
			RequestDispatcher dispatcher = null;
				
				try {
//					System.out.println("encountered me");
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection(url,user,password);
					PreparedStatement st = con.prepareStatement(sql);
					st.setString(1, uname);
					st.setString(2, pass);
					st.setString(3, uemail);
					st.setString(4, umobile);
					//ResultSet rs = st.executeQuery();		
					
					
					int rowcount = st.executeUpdate();
					dispatcher = request.getRequestDispatcher("registration.jsp");
					if(rowcount>0) {
						request.setAttribute("status", "success");
//						System.out.println("encountered me success");
						
					}else {
						request.setAttribute("status", "failed");
					}
					
					dispatcher.forward(request, response);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
		 
	}



}
