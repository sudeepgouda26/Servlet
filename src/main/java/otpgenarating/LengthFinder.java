package otpgenarating;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/printLength")
public class LengthFinder extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("string");
		
		resp.getWriter().print("<h1>");
		resp.getWriter().print("Length of the string is: " + name.length());
		resp.getWriter().print("</h1>");
		
	}
	

}
