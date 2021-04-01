package Library_folder.Librarian_folder;
import Exceptions.*;
import Library_folder.Patron_folder.*;
public class Librarian
{
	private String name;
	private int LibrarianId;
	private double salary;
	private int age;
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public void setID(int id)
	{
		LibrarianId=id;
	}
	
	public void setSalary(double salary)
	{
		this.salary=salary;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getID()
	{
		return LibrarianId;
	}
	
	public double getSalary()
	{
		return salary;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public void generateFine(Patron p,double amount)throws invalidOperationException
	{
		p.fine(p,amount);
	}
}