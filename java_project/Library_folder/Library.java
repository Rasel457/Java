package Library_folder;
import java.io.* ;
import java.lang.* ;
import java.util.* ;
import java.util.Scanner;
import Operations.TeacherOperations.*;
import Operations.StudentOperations.*;
import Operations.BookOperations.*;
import Exceptions.*;
import Library_folder.Book_folder.*;
import Library_folder.Patron_folder.*;
import Library_folder.Librarian_folder.*;
import FileReadWrite_folder.*;
import Library_folder.Patron_folder.Teacher_folder.*;
import Library_folder.Patron_folder.Student_folder.*;
public class Library implements TeacherOperations,StudentOperations,BookOperations
{
	Scanner sc=new Scanner(System.in);
	private String libraryName;
	private String address;
	private Book books[]=new Book[10000];
	private Teacher teacher[]=new Teacher[10000];
	private Student student[]=new Student[10000];
	
	static int noOfBooks;
	private Librarian librarian;
	
	public void setLibraryName(String libraryName)
	{
		this.libraryName=libraryName;
	}
	
	public void setLibraryAddress(String address)
	{
		this.address=address;
	}
	
	public void appointLibrarian(Librarian librarian)
	{
		this.librarian=librarian;
	}
	
	public void insertBook(Book b)throws invalidOperationException
	{
		boolean flag=false;
		for(int i=0;i<10000;i++)
		{
			if(books[i]==null)
			{
				books[i]=b;
				noOfBooks+=books[i].getNoOfCopy();
				flag=true;
				System.out.println("Insertion successful...");
				break;
			}
		}
		if(!flag)
		{
			throw new invalidOperationException("No space available for inserting new books.");
		}
	}
	
	public void removeBook(Book b)throws invalidOperationException
	{
		boolean flag=false;
		for(int i=0;i<10000;i++)
		{
			if(books[i]==b)
			{
				books[i]=null;
				flag=true;
				System.out.println("Book removal successful...");
				break;
			}
		}
		if(!flag)
		{
			throw new invalidOperationException("No book found..");
		}
		
	}
	
	public Book getBook(int bookId)throws invalidOperationException
	{
		boolean flag=false;
		
		for(int i=0;i<10000;i++)
		{
			if(books[i]!=null)
			{
				if(books[i].getID()==bookId)
				{
					System.out.println();
					books[i].showBookInfo();
					System.out.println();
					flag=true;
					return books[i];
				}
			}
			
		}
		if(!flag)
			{
				throw new invalidOperationException("No book found..");
			}
		return null;
	}
	
	public void showAllBooks()throws invalidOperationException
	{
		boolean flag=false;
		for(int i=0;i<10000;i++)
		{
			if(books[i]!=null)
			{
				System.out.println();
				System.out.println("Number: "+(i+1));
				books[i].showBookInfo();
				System.out.println();
				flag=true;
			}
		}
		
		if(!flag)
			throw new invalidOperationException("No existing book found..");
	}
	
	public void insertTeacher(Teacher t)throws invalidOperationException
	{
		int i;
		boolean flag=false;
		for(i=0;i<10000;i++)
		{
			if(teacher[i]==null)
			{
				teacher[i]=t;
				flag=true;
				System.out.println("Insertion successful...");
				break;
			}
		}
		if(!flag)
		{
			throw new invalidOperationException("No space available for inserting new student.");
		}
		
	}
	
	public void removeTeacher(Teacher t)throws invalidOperationException
	{
		int i;
		boolean flag=false;
		for(i=0;i<10000;i++)
		{
			if(teacher[i]==t)
			{
				teacher[i]=null;
				flag=true;
				System.out.println("Teacher removal successful...");
				break;
			}
		}

		if(!flag)
		{
			throw new invalidOperationException("No Teacher found..");
		}
		
	}
	
	public Teacher getTeacher(String teacherId)throws invalidOperationException
	{
		int i;
		boolean flag=false;
		for(i=0;i<10000;i++)
		{
			if(teacher[i]!=null)
			{
				String id=teacher[i].getTeacherId();
				if(id.equals(teacherId))
				{
					teacher[i].showInfo();
					flag=true;
					return teacher[i];
				}
			}
			
		}
		if(!flag)
			throw new invalidOperationException("No matching Teacher found..");
		return null;
	}
	
	public void showAllTeacher()throws invalidOperationException
	{
		boolean flag=false;
		for(int i=0;i<10000;i++)
		{
			if(teacher[i]!=null)
			{
				flag=true;
				System.out.println("Number: "+(i+1));
				teacher[i].showInfo();
			}
		}
		if(!flag)
			throw new invalidOperationException("No existing Teacher found..");
	}
	
	public void insertStudent(Student s)throws invalidOperationException
	{
		int i;
		boolean flag=false;
		for(i=0;i<10000;i++)
		{
			if(student[i]==null)
			{
				student[i]=s;
				flag=true;
				System.out.println("Insertion successful...");
				break;
			}
		}
		if(!flag)
		{
			throw new invalidOperationException("No space available for inserting new student.");
		}
		
	}
	
	public void removeStudent(Student s)throws invalidOperationException
	{
		int i;
		boolean flag=false;
		for(i=0;i<10000;i++)
		{
			if(student[i]==s)
			{
				student[i]=null;
				flag=true;
				System.out.println("Student removal successful...");
				break;
			}
		}
		
		if(!flag)
		{
			throw new invalidOperationException("No student found..");
		}
	}
	
	public Student getStudent(String studentId)throws invalidOperationException
	{
		int i;
		boolean flag=false;
		for(i=0;i<10000;i++)
		{
			if(student[i]!=null)
			{
				String id=student[i].getStudentId();
				if(id.equals(studentId))
				{
					student[i].showInfo();
					flag=true;
					return student[i];
				}
			}
			
		}
		if(!flag)
			throw new invalidOperationException("No matching student found..");
		return null;
	}
	
	public void showAllStudent()throws invalidOperationException
	{
		boolean flag=false;
		for(int i=0;i<10000;i++)
		{
			if(student[i]!=null)
			{
				flag=true;
				System.out.println("Number: "+(i+1));
				student[i].showInfo();
			}
		}
		if(!flag)
			throw new invalidOperationException("No existing student found..");
	}
	public boolean findExistingBookId(int id)
	{
		boolean flag=false;
		for(int i=0;i<10000;i++)
		{
			if(books[i]!=null)
			{
				if(books[i].getID()==id)
				{
					flag=true;
					return true;
				}
			}
		}
		return flag;
	}
	
	public boolean findExistingPatron(int id)
	{
		boolean flag=false;
		for(int i=0;i<10000;i++)
		{
			if(student[i]!=null)
			{
				int idd=student[i].getPatrontId();
				if(idd==id)
				{
					flag=true;
					return true;
				}
			}
			
		}
		
		for(int i=0;i<10000;i++)
		{
			if(teacher[i]!=null)
			{
				int idd=teacher[i].getPatrontId();
				if(idd==id)
				{
					flag=true;
					return true;
				}
			}
			
		}
		
		return flag;
	}
	
	
	
	public boolean findExistingStudentId(String id)
	{
		boolean flag=false;
		for(int i=0;i<10000;i++)
		{
			if(student[i]!=null)
			{
				String idd=student[i].getStudentId();
				if(idd.equals(id))
				{
					flag=true;
					return true;
				}
			}
			
		}
		return flag;
	}
	
	public boolean findExistingTeacherId(String id)
	{
		boolean flag=false;
		for(int i=0;i<10000;i++)
		{
			if(teacher[i]!=null)
			{
				String idd=teacher[i].getTeacherId();
				if(idd.equals(id))
				{
					flag=true;
					return true;
				}
			}
		}
		return flag;
	}
	
	public Student chooseStudent()
	{
		int i;
		
		boolean flg=false;
		
		for(i=0;i<10000;i++)
		{
			if(student[i]!=null)
			{
				System.out.println("Number: "+(i+1));
				student[i].showInfo();
				System.out.println();
				flg=true;
			}
		}
		
		if(!flg)
		{
			System.out.println("No existing student to show...");
		}
		else
		{
			boolean flag=true;
			int inp=0;
			
			while(flag==true)
			{
				try
				{
					System.out.println();
					System.out.print("Choose desired student according to number if cannot find desired student enter 0: ");
					inp=sc.nextInt();
					flag=false;
				}
				catch(Exception ex)
				{
					System.out.println();
					System.out.println("......Invalid character please enter an integer value....");
					String s=sc.nextLine();
					System.out.println();
					flag=true;
				}
			}
			
			
			
			if(inp<1 || inp>i+1)
				return null;
			else
				return student[inp-1];
		}
		
		return null;
		
		

	}
	
	public Teacher chooseTeacher()
	{
		
		int i;
		boolean flg=false;
		
		for(i=0;i<10000;i++)
		{
			if(teacher[i]!=null)
			{
				System.out.println("Number: "+(i+1));
				teacher[i].showInfo();
				System.out.println();
				flg=true;
			}
		}
		
		if(!flg)
		{
			System.out.println("No existing teacher to show...");
		}
		else
		{
			
			boolean flag=true;
			int inp=0;
			
			while(flag==true)
			{
				try
				{
					System.out.println();
					System.out.print("Choose desired teacher according to number if cannot find desired teacher enter 0: ");
					inp=sc.nextInt();
					flag=false;
				}
				catch(Exception ex)
				{
					System.out.println();
					System.out.println("......Invalid character please enter an integer value....");
					String s=sc.nextLine();
					System.out.println();
					flag=true;
				}
			}
			
			
			if(inp<1 || inp>i+1)
				return null;
			else
				return teacher[inp-1];
		}
		return null;

	}
	
	public Book chooseBook()
	{
		int i;
		boolean flg=false;
		
		for(i=0;i<10000;i++)
		{
			if(books[i]!=null)
			{
				System.out.println("Number: "+(i+1));
				books[i].showBookInfo();
				System.out.println();
				flg=true;
			}
		}
		
		if(!flg)
		{
			System.out.println("No book to show...");
		}
		else
		{
			boolean flag=true;
			int inp=0;
		
			while(flag==true)
			{
				try
				{
					System.out.println();
					System.out.print("Choose desired book according to number if cannot find desired book enter 0: ");
					inp=sc.nextInt();
					flag=false;
				}
				catch(Exception ex)
				{
					System.out.println();
					System.out.println("......Invalid character please enter an integer value....");
					String s=sc.nextLine();
					System.out.println();
					flag=true;
				}
			}
			
			
			if(inp<1 || inp>i+1)
				return null;
			else
			{
				
				return books[inp-1];
			}
		}
		return null;
		
		
	}
	
	public Patron getPatron(int id)
	{
		for(int i=0;i<10000;i++)
		{
			if(teacher[i]!=null)
			{
				int idd=teacher[i].getPatrontId();
				if(id==idd)
				{
					Patron p=new Teacher();
					p=teacher[i];
					return p;
				}
			}
		}
		
		for(int i=0;i<10000;i++)
		{
			if(student[i]!=null)
			{
				int idd=student[i].getPatrontId();
				if(id==idd)
				{
					Patron p=new Student();
					p=student[i];
					return p;
				}
			}
		}
		
		return null;
	}
	
}