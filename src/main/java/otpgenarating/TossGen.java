package otpgenarating;

import java.io.IOException;
import java.util.Random;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
@WebServlet("/toss")
public class TossGen extends GenericServlet {

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		arg1.getWriter().print(new Random().nextBoolean() ? "heads" :"tails");
		
	}

}
