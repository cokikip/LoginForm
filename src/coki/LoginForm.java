package coki;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginForm")
public class LoginForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginForm() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF 8");
		try (
			PrintWriter out =response.getWriter()){
				String _username = request.getParameter("username");
				String _password = request.getParameter("password");
				if(_username!=null && _password !=null) {
					if(_username.equals("Collins")&&_password.equals("123456")) {
						response.sendRedirect("welcome.jsp");
					}else {
						out.println("Enter user name and password");
					}
					
				}else {
					out.println("Empty Username or Password");
				}
				
			}
		}
		

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
