package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.LoginService;

@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected  void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		int personid = Integer.parseInt(request.getParameter("personid"));
		LoginService l=new LoginService();
		Map a=l.guardlogin(personid);
		System.out.println("Test>>>");
		List a1= l.guardlogin1(personid); 
System.out.println(a1);
		
		

		if (a!=null) {
			request.setAttribute("personid",a);
			request.setAttribute("personidtimesheet",a1);
			
			RequestDispatcher rd = request.getRequestDispatcher("userprofile.jsp");
			rd.forward(request, response);

		} else {
			out.print("enter the correct id");
			RequestDispatcher rd = request.getRequestDispatcher("/index.html");
			rd.include(request, response);
		}
             
	}
}