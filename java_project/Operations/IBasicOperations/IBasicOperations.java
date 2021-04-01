package Operations.IBasicOperations;
import Exceptions.*;
import Library_folder.Book_folder.*;
import Library_folder.Patron_folder.*;
public interface IBasicOperations
{
	public abstract void borrow(Patron p,Book b);
	public abstract void returnBook(Patron p,Book b);
	public abstract void fine(Patron p,double amount)throws invalidOperationException;
	
}