package otpgenarating;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/login"})
public class Loginjava  extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	    req.getRequestDispatcher("login.jsp").forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("un");
		String password = req.getParameter("pwd");
		
		if(username.equals("admin") && password.equals("admin")) {
			resp.getWriter().println("Login Successful");
			
		}
		else {
			resp.sendRedirect("login");
			resp.getWriter().println("Login Failed");
		}
	}

}
