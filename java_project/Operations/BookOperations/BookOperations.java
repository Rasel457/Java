package Operations.BookOperations;
import Library_folder.Book_folder.*;
import Exceptions.*;
public interface BookOperations
{
	public abstract void insertBook(Book b)throws invalidOperationException;
	public abstract void removeBook(Book b)throws invalidOperationException;
	public abstract Book getBook(int Bookid)throws invalidOperationException;
	public abstract void showAllBooks()throws invalidOperationException;
}