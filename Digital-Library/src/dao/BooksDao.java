package dao;

import java.sql.SQLException;
import java.util.List;

import model.Books;

public class BooksDao  implements BooksDaoInterface {

	@Override
	public void insertBook(Books book) throws SQLException {
	
		
	}

	@Override
	public Books selectBook(int bookId) {
	
		return null;
	}

	@Override
	public List<Books> selectAllBooks() {
	
		return null;
	}

	@Override
	public boolean deleteBook(int id) throws SQLException {
	
		return false;
	}

	@Override
	public boolean updateBook(Books book) throws SQLException {
		
		return false;
	}

	

}
