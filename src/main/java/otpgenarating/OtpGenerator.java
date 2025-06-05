package otpgenarating;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/otp")
public class OtpGenerator extends GenericServlet  {

	
	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int otp = new Random().nextInt(100000, 999999);
		System.out.println(otp);
		arg1.getWriter().println("Your OTP is: " + otp);
		
	}

}
