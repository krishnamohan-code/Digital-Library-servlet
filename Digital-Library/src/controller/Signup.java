package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import dao.UserDao;
import model.User;
/**
 * Servlet implementation class Signup
 */
@WebServlet("/signup")
public class Signup extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Signup() {
        super();
    }
    
    
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/WEB-INF/views/Forms/Signup.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String email = request.getParameter("email");
		String password =request.getParameter("password");
		String phonenumber=request.getParameter("phonenumber");
		String name = request.getParameter("name");
		
	     User user = new User();
	     
	     user.setName(name);
	     user.setEmail(email);
	     user.setPassword(password);
	     user.setPhonenumber(phonenumber);
		
		UserDao userdao = new UserDao();
		
		int checkUser=0;
		try
		{
		   checkUser=userdao.signup(user);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		if(checkUser!=0)
		{
			request.setAttribute("message", "Registration successful");
			RequestDispatcher rd =this.getServletContext().getRequestDispatcher("/WEB-INF/views/Forms/Signup.jsp");
			rd.forward(request, response);
		}
		else
		{
			request.setAttribute("message", "Check Your Credentials");
			RequestDispatcher rd =this.getServletContext().getRequestDispatcher("/WEB-INF/views/Forms/Signup.jsp");
			rd.forward(request, response);
		}
	     }

}
