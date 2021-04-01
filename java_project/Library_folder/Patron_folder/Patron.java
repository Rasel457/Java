package Library_folder.Patron_folder;
import Operations.IBasicOperations.*;
import Library_folder.Book_folder.*;
import Exceptions.*;
import java.io.* ;
import java.lang.* ;
import java.util.* ;
import FileReadWrite_folder.*;
public abstract class Patron implements IBasicOperations
{
	private int id;
	private String name;
	private String departmentName;
	private String email;
	private String contactNo;
	private String address;
	protected double amount;
	private Book book[]=new Book[1000];
	
	public void setId(int id)
	{
		this.id=id;
	}
	
	public int getPatrontId()
	{
		return id;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public void setDepartmentName(String departmentName)
	{
		this.departmentName=departmentName;
	}
	
	public void setEmail(String email)
	{
		this.email=email;
	}
	
	public void setContactNo(String contactNo)
	{
		this.contactNo=contactNo;
	}
	
	public void setAddress(String address)
	{
		this.address=address;
	}
	
	public void setAmount(double amount)
	{
		this.amount=amount;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getDepartmentName()
	{
		return departmentName;
	}
	
	public String getEmail()
	{
		return email;
	}
	
	public String getContactNo()
	{
		return contactNo;
	}
	
	public String getAddress()
	{
		return address;
	}
	
	public double getAmount()
	{
		return amount;
	}
	
	public void borrow(Patron p,Book b)
	{
		for(int i=0;i<1000;i++)
		{
			if(book[i]==null)
				book[i]=b;
		}
		
		FileReadWrite fileObject = new FileReadWrite();
		fileObject.createDirectory();
		fileObject.writeInFile("");
		fileObject.writeInFile("Information about book borrow.");
        fileObject.writeInFile("Patron's information: ");		
		fileObject.writeInFile("Id: "+id);
		fileObject.writeInFile("Name: "+name);
		fileObject.writeInFile("Department name: "+departmentName);
		fileObject.writeInFile("Email address: "+email);
		fileObject.writeInFile("Contact NO: "+contactNo);
		fileObject.writeInFile("Address :"+address);
		fileObject.writeInFile("Current amount :"+amount);
		
		
		fileObject.writeInFile("Books's information: ");		
		fileObject.writeInFile("Id: "+b.getID());
		fileObject.writeInFile("Title: "+b.getTitle());
		fileObject.writeInFile("Author name: "+b.getAuthorName());
		fileObject.writeInFile("Publisher name: "+b.getPublisherName());
		fileObject.writeInFile("Price : "+b.getPrice());
		fileObject.writeInFile("Number of copy :"+b.getNoOfCopy());
		fileObject.writeInFile("");
		
	}
	
	public void returnBook(Patron p,Book b)
	{
		for(int i=0;i<1000;i++)
		{
			if(book[i]==b)
				book[i]=null;
		}
		
		FileReadWrite fileObject = new FileReadWrite();
		fileObject.createDirectory();
		fileObject.writeInFile("");
		fileObject.writeInFile("Information about book return.");
        fileObject.writeInFile("Patron's information: ");		
		fileObject.writeInFile("Id: "+id);
		fileObject.writeInFile("Name: "+name);
		fileObject.writeInFile("Department name: "+departmentName);
		fileObject.writeInFile("Email address: "+email);
		fileObject.writeInFile("Contact NO: "+contactNo);
		fileObject.writeInFile("Address :"+address);
		fileObject.writeInFile("Current amount :"+amount);
		
		
		fileObject.writeInFile("Books's information: ");		
		fileObject.writeInFile("Id: "+b.getID());
		fileObject.writeInFile("Title: "+b.getTitle());
		fileObject.writeInFile("Author name: "+b.getAuthorName());
		fileObject.writeInFile("Publisher name: "+b.getPublisherName());
		fileObject.writeInFile("Price : "+b.getPrice());
		fileObject.writeInFile("Number of copy :"+b.getNoOfCopy());
		fileObject.writeInFile("");
	}
	
	public boolean previouslyBorrowed(Book b)
	{
		for(int i=0;i<1000;i++)
		{
			if(book[i]!=null)
			{
				if(book[i].getID()==b.getID())
					return true;
			}
		}
		
		return false;
	}
	
	
	public void removeAmount(double amount)
	{
		this.amount-=amount;
	}
	
	
	public void fine(Patron p,double amount)throws invalidOperationException
	{
		double am=p.getAmount();
		am-=amount;
		if(am<0)
			throw new invalidOperationException("Not enough money to fine");
		else
		{
			p.removeAmount(amount);
			System.out.println("Operation successful...");
			System.out.println();
		}
	}
	
	public abstract void showInfo();
}