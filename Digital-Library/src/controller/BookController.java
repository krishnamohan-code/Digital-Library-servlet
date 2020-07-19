package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDate;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BooksDao;
import model.Books;

/**
 * Servlet implementation class Home
 */
@WebServlet("/new")
public class BookController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd =this.getServletContext().getRequestDispatcher("/WEB-INF/views/BookView.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		System.out.println("Enter do post");
		String bookTitle =request.getParameter("title");
		String bookPrice=request.getParameter("price");
		String bookAuthor=request.getParameter("author");
		System.out.println(bookTitle);
		LocalDate postedOn =LocalDate.now();
		
		Books book =new Books();
		book.setBookTitle(bookTitle);
		book.setBookPrice(bookPrice);
		book.setBookAuthor(bookAuthor);
		BooksDao bookdao=  new BooksDao();
		try {
			bookdao.insertBook(book);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
























