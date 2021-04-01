package Operations.StudentOperations;
import Exceptions.*;
import Library_folder.Patron_folder.Student_folder.*;
public interface StudentOperations
{
	public abstract void insertStudent(Student s)throws invalidOperationException;
	public abstract void removeStudent(Student s)throws invalidOperationException;
	public abstract Student getStudent(String studentId)throws invalidOperationException;
	public abstract void showAllStudent()throws invalidOperationException;

}