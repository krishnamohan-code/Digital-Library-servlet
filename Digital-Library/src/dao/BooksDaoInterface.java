package dao;

import java.sql.SQLException;
import java.util.List;

import model.Books;

public interface BooksDaoInterface {

void insertBook(Books book) throws SQLException;
Books selectBook(int bookId);
List<Books>selectAllBooks();
boolean deleteBook(int id)throws SQLException;
boolean updateBook(Books book)throws SQLException;
}
