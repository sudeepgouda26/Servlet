package otpgenarating;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/printalpha")
public class PrintAlphabet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
	String x  =req.getParameter("number");
	int y = Integer.parseInt(x);
	resp.getWriter().print("<h1>");
	for(int i = 65;i<=64+y; i++) {
		resp.getWriter().print((char)i + " ");
		
	}
	resp.getWriter().print("</h1>");
	}

}
