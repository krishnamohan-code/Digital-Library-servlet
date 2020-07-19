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
 * Servlet implementation class Login
 */
@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Login() {
        super();
      
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/WEB-INF/views/Forms/Login.jsp");
		
		rd.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String email = request.getParameter("email");
		String password =request.getParameter("password");
		
		User user = new User();
		user.setEmail(email);
        user.setPassword(password);
       UserDao userdao = new UserDao();
        boolean ValidationUser =false;
       
        	ValidationUser= userdao.loginUser(user);
            if (ValidationUser)
            {    
            	request.setAttribute("message", "Login success");
            	System.out.println("working");
            	RequestDispatcher rd= this.getServletContext().getRequestDispatcher("/WEB-INF/views/BookView.jsp");
    			rd.forward(request, response);
            }
            else
            {
            	request.setAttribute("message", "Login Falied");
            	RequestDispatcher rd= this.getServletContext().getRequestDispatcher("/WEB-INF/views/Forms/Login.jsp");
    			rd.forward(request, response);
            }
	}

}
