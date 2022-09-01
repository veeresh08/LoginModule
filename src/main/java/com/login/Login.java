package com.login;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.login.dao.LoginDao;



@WebServlet("/Login")
public class Login extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String uname = request.getParameter("uname");
		String password = request.getParameter("password");
		
		LoginDao dao = new LoginDao();
			
			try {
				if(dao.check(uname, password)) {
					
					HttpSession session = request.getSession();
					session.setAttribute("username",uname);
					response.sendRedirect("welcome.jsp");
					
				}else {
					response.sendRedirect("login.jsp");
				}
			} catch (SQLException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}


}
