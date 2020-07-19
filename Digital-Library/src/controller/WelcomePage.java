package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WelcomePage
 */
@WebServlet("/welcomepage")
public class WelcomePage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public WelcomePage() {
        super();
     
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/WEB-INF/views/welcome.jsp");
		rd.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
