package Operations.TeacherOperations;
import Exceptions.*;
import Library_folder.Patron_folder.Teacher_folder.*;
public interface TeacherOperations
{
	public abstract void insertTeacher(Teacher t)throws invalidOperationException;
	public abstract void removeTeacher(Teacher t)throws invalidOperationException;
	public abstract Teacher getTeacher(String teacherid)throws invalidOperationException;
	public abstract void showAllTeacher()throws invalidOperationException;
}