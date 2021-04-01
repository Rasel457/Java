import java.util.Scanner;
import java.io.* ;
import java.lang.* ;
import Library_folder.*;
import Library_folder.Librarian_folder.*;
import Library_folder.Book_folder.*;
import Library_folder.Patron_folder.*;
import FileReadWrite_folder.*;
import Library_folder.Patron_folder.Student_folder.*;
import Library_folder.Patron_folder.Teacher_folder.*;
import Operations.BookOperations.*;
import Operations.IBasicOperations.*;
import Operations.StudentOperations.*;
import Operations.TeacherOperations.*;
import Exceptions.*;
 
public class Start
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		Library library=new Library();
		Librarian librarian=new Librarian();
		int option=0,studentOption=0,id=0,teacherOption=0,bookOption=0;
		String name,ID,address;
		double amnt=0;
		boolean flag=true;
		
		System.out.println();
		System.out.println("Before starting the library mangement please make a library and give the following informations.");
		
		System.out.print("Enter the library name: ");
		name=sc.nextLine();
		library.setLibraryName(name);
		
		System.out.println();
		System.out.print("Enter the address of the library: ");
		address=sc.nextLine();
		library.setLibraryAddress(address);
			
			
		System.out.println();
		System.out.println("Now appoint a librarian by giving all the details..");
		System.out.println();
		System.out.print("Enter the name of the librarian: ");
		name=sc.nextLine();
		librarian.setName(name);
		
		
		while(flag==true)
		{
			try
			{
				System.out.println();
				System.out.print("Enter the id of the librarian: ");
				id=sc.nextInt();
				librarian.setID(id);
				flag=false;
			}
			
			catch(Exception ex)
			{
				System.out.println();
				System.out.println(".....Invalid character please enter integer value.....");
				System.out.println();
				name=sc.nextLine();
				flag=true;
			}
		}
		
		flag=true;
		
		while(flag==true)
		{
			try
			{
				System.out.println();
				System.out.print("Enter the salary for the librarian: ");
				amnt=sc.nextDouble();
				librarian.setSalary(amnt);
				flag=false;
			}
			
			catch(Exception ex)
			{
				System.out.println();
				System.out.println(".....Invalid character please enter float type/integer type value.....");
				System.out.println();
				name=sc.nextLine();
				flag=true;
			}
		}
		
		flag=true;
		
		while(flag==true)
		{
			try
			{
				System.out.println();
				System.out.print("Enter the age for the librarian: ");
				int age=sc.nextInt();
				librarian.setAge(age);
				flag=false;
			}
			catch(Exception ex)
			{
				System.out.println();
				System.out.println(".....Invalid character please enter integer type value.....");
				System.out.println();
				name=sc.nextLine();
				flag=true;
			}
		}
		
		library.appointLibrarian(librarian);
		flag=true;
		
		while(true)
		{
			System.out.println();
			System.out.println("Main menu: ");
			System.out.println("1. Press 1 for Student Management");
			System.out.println("2. Press 2 for Teacher Management");
			System.out.println("3. Press 3 for Book Management");
			System.out.println("4. Press 4 for Book Borrow/Lost Management");
			System.out.println("5. Press 5 for Exit");
			
			flag=true;
			while(flag==true)
			{
				try
				{
					System.out.println();
					System.out.print("Enter your option: ");
					option=sc.nextInt();
					flag=false;
				}
				catch(Exception a)
				{
					System.out.println();
					System.out.println(".....Invalid character please enter integer type value.....");
					name=sc.nextLine();
					System.out.println();
					flag=true;
					
				}
			}

			flag=true;
			
			if(option<1 || option>5)
			{
				System.out.println("Invalid option please try again...");
				System.out.println();
				continue;
			}
				
			if(option==1)
			{
				while(true)
				{
					
					System.out.println();
					System.out.println("Choose your option for Student Management");
					System.out.println("1. Press 1 for Insert New Student");
					System.out.println("2. Press 2 for Remove Existing Student");
					System.out.println("3. Press 3 for Show All Student");
					System.out.println("4. Press 4 for return to the main menu");
						
					flag=true;
					while(flag==true)
					{
						try
						{
							System.out.println();
							System.out.print("Enter your option for student mangement: ");
							studentOption=sc.nextInt();
							name=sc.nextLine();
							System.out.println();
							flag=false;
						}
						
						catch(Exception a)
						{
							System.out.println();
							System.out.println("....Invalid charcater please enter an integer value...");
							name=sc.nextLine();
							flag=true;
						}
						
					}
					flag=true;
						
						
					if(studentOption<1 || studentOption>4)
					{
						System.out.println("...Invalid operation try again...");
						System.out.println();
						continue;
					}
					if(studentOption==1)
					{
						
						System.out.println();
						Student std=new Student();
						
						while(true)
						{
							System.out.println();
							System.out.print("Enter student id: ");
							ID=sc.nextLine();
											
							boolean flag1=library.findExistingStudentId(ID);
							if(flag1)
							{
								System.out.println();
								System.out.println("ID already exists give a new one...");
								continue;
							}
							else
								break;
						}
										
						std.setStudentId(ID);
								
						
						while(true)
						{	
							flag=true;
							while(flag==true)
							{
								try
								{
									System.out.print("Enter patron id: ");
									id=sc.nextInt();
									name=sc.nextLine();
									flag=false;
								}
								
								catch(Exception a3)
								{
									System.out.println();
									System.out.println("....Invalid charcater please enter an integer value...");
									name=sc.nextLine();
									flag=true;
								}
							}
							
							boolean flag1=library.findExistingPatron(id);
							if(flag1)
							{
								System.out.println();
								System.out.println("ID already exists give a new one...");
								continue;
							}
							else
								break;
						
						}
						std.setId(id);
						
						flag=true;
						
						System.out.print("Enter student's name: ");
						name=sc.nextLine();
						std.setName(name);		
								
						System.out.print("Enter gaurdian's name: ");
						name=sc.nextLine();
						std.setGaurdianName(name);		
									
						System.out.print("Enter gaurdian's contact number: ");
						address=sc.nextLine();
						std.setGaurdianContactNo(address);			
									
						System.out.print("Enter student's departmnet name: ");
						name=sc.nextLine();
						std.setDepartmentName(name);			
									
						System.out.print("Enter student's email address: ");
						address=sc.nextLine();
						std.setEmail(address);			
									
						System.out.print("Enter student's contact number: ");
						address=sc.nextLine();
						std.setContactNo(address);			
									
						System.out.print("Enter student's address: ");
						address=sc.nextLine();
						std.setAddress(address);			
									
									
						flag=true;
						while(flag==true)
						{
							try
							{
								System.out.println();
								System.out.print("Enter student's balance: ");
								amnt=sc.nextDouble();
								System.out.println();
								std.setAmount(amnt);
								flag=false;
							}
							
							catch(Exception a4)
							{
								System.out.println();
								System.out.println("....Invalid charcater please enter integer/float type value...");
								name=sc.nextLine();
								flag=true;
							}
							
						}
						
						try
						{
							library.insertStudent(std);	
						}
						catch(Exception a5)
						{
							System.out.println(a5);
						}
						
						
							
					}
						
					if(studentOption==2)
					{
						Student std=new Student();
						
						System.out.println();						
						System.out.println("Do you want to remove student by ID or have a list for selecting..");
						System.out.println("Press 1 for selecting by ID");
						System.out.println("Press 2 for select by list");
						
						int op=0;
						
						flag=true;
						while(flag==true)
						{
							try
							{
								System.out.println();
								System.out.print("Enter your choice: ");
								op=sc.nextInt();
								name=sc.nextLine();
								System.out.println();
								flag=false;
							}
							
							catch(Exception a)
							{
								System.out.println();
								System.out.println("....Invalid charcater please enter an integer value...");
								name=sc.nextLine();
								flag=true;
							}
							
						}
						flag=true;
						
						if(op<1 || op>2)
							System.out.println("Invalid choice...");
						
						if(op==1)
						{
							System.out.print("Enter student id: ");
							ID=sc.nextLine();
							
							try
							{
								std=library.getStudent(ID);
							}
							catch(Exception a10)
							{
								std=null;
								System.out.println(a10);
							}
							
							if(std==null)
								System.out.println("No student selected...");
							
							else
							{
								try
								{
									library.removeStudent(std);
								}
								catch(Exception a6)
								{
									System.out.println(a6);
									System.out.println();
								}
							
							}
							
						}
						if(op==2)
						{
							std=library.chooseStudent();
						
							if(std==null)
								System.out.println("No student selected...");
							else
							{
								try
								{
									library.removeStudent(std);
								}
								catch(Exception a11)
								{
									System.out.println(a11);
									System.out.println();
								}
							}
						}
						
					}
					
					if(studentOption==3)
					{
						try
						{
							library.showAllStudent();
						}
						catch(Exception a7)
						{
							System.out.println(a7);
							System.out.println();
						}
					}
						
					if(studentOption==4)
					{
						System.out.println("Loading do main menu......");
						break;
					}
						
				}
			}
			
			
			
			if(option==2)
			{
				while(true)
				{
					
					System.out.println();
					System.out.println("Choose your option for Teacher Management");
					System.out.println("1. Press 1 for Insert New Teacher");
					System.out.println("2. Press 2 for Remove Existing Teacher");
					System.out.println("3. Press 3 for Show All Teacher");
					System.out.println("4. Press 4 for return to the main menu");
						
					flag=true;
					while(flag==true)
					{
						try
						{
							System.out.println();
							System.out.print("Enter your option for Teacher mangement: ");
							teacherOption=sc.nextInt();
							name=sc.nextLine();
							System.out.println();
							flag=false;
						}
						
						catch(Exception a)
						{
							System.out.println();
							System.out.println("....Invalid charcater please enter an integer value...");
							name=sc.nextLine();
							flag=true;
						}
						
					}
					flag=true;
						
						
					if(teacherOption<1 || teacherOption>4)
					{
						System.out.println("...Invalid operation try again...");
						System.out.println();
						continue;
					}
					if(teacherOption==1)
					{
						
						System.out.println();
						Teacher tc=new Teacher();
						
						while(true)
						{
							System.out.println();
							System.out.print("Enter teacher id: ");
							ID=sc.nextLine();
											
							boolean flag1=library.findExistingTeacherId(ID);
							if(flag1)
							{
								System.out.println();
								System.out.println("ID already exists give a new one...");
								continue;
							}
							else
								break;
						}
										
						tc.setTeacherId(ID);
						
						
						flag=true;
						while(flag==true)
						{
							try
							{
								System.out.print("Enter teacher's room number: ");
								id=sc.nextInt();
								name=sc.nextLine();
								flag=false;
							}
								
							catch(Exception a3)
							{
								System.out.println();
								System.out.println("....Invalid charcater please enter an integer value...");
								name=sc.nextLine();
								flag=true;
							}
						}
						flag=true;
						
						tc.setRoom(id);
						
						while(true)
						{	
							flag=true;
							while(flag==true)
							{
								try
								{
									System.out.print("Enter patron id: ");
									id=sc.nextInt();
									name=sc.nextLine();
									flag=false;
								}
								
								catch(Exception a3)
								{
									System.out.println();
									System.out.println("....Invalid charcater please enter an integer value...");
									name=sc.nextLine();
									flag=true;
								}
							}
							
							boolean flag1=library.findExistingPatron(id);
							if(flag1)
							{
								System.out.println();
								System.out.println("ID already exists give a new one...");
								continue;
							}
							else
								break;
						
						}
						tc.setId(id);
						
						flag=true;
						
						System.out.print("Enter teacher's name: ");
						name=sc.nextLine();
						tc.setName(name);		
										
									
						System.out.print("Enter teacher's departmnet name: ");
						name=sc.nextLine();
						tc.setDepartmentName(name);			
									
						System.out.print("Enter teacher's email address: ");
						address=sc.nextLine();
						tc.setEmail(address);			
									
						System.out.print("Enter teacher's contact number: ");
						address=sc.nextLine();
						tc.setContactNo(address);			
									
						System.out.print("Enter teacher's address: ");
						address=sc.nextLine();
						tc.setAddress(address);			
									
									
						flag=true;
						while(flag==true)
						{
							try
							{
								System.out.println();
								System.out.print("Enter teacher's balance: ");
								amnt=sc.nextDouble();
								System.out.println();
								tc.setAmount(amnt);
								flag=false;
							}
							
							catch(Exception a4)
							{
								System.out.println();
								System.out.println("....Invalid charcater please enter integer/float type value...");
								name=sc.nextLine();
								flag=true;
							}
							
						}
						
						try
						{
							library.insertTeacher(tc);	
						}
						catch(Exception a5)
						{
							System.out.println(a5);
						}
						
						
							
					}
						
					if(teacherOption==2)
					{
						Teacher tc=new Teacher();
						
						System.out.println();						
						System.out.println("Do you want to remove teacher by ID or have a list for selecting..");
						System.out.println("Press 1 for selecting by ID");
						System.out.println("Press 2 for select by list");
						
						int op=0;
						
						flag=true;
						while(flag==true)
						{
							try
							{
								System.out.println();
								System.out.print("Enter your choice: ");
								op=sc.nextInt();
								name=sc.nextLine();
								System.out.println();
								flag=false;
							}
							
							catch(Exception a)
							{
								System.out.println();
								System.out.println("....Invalid charcater please enter an integer value...");
								name=sc.nextLine();
								flag=true;
							}
							
						}
						flag=true;
						
						if(op<1 || op>2)
							System.out.println("Invalid choice...");
						
						if(op==1)
						{
							System.out.print("Enter teacher id: ");
							ID=sc.nextLine();
							
							try
							{
								tc=library.getTeacher(ID);
							}
							catch(Exception a10)
							{
								tc=null;
								System.out.println(a10);
							}
							
							if(tc==null)
								System.out.println("No teacher selected...");
							
							else
							{
								try
								{
									library.removeTeacher(tc);
								}
								catch(Exception a6)
								{
									System.out.println(a6);
									System.out.println();
								}
							
							}
							
						}
						if(op==2)
						{
							tc=library.chooseTeacher();
						
							if(tc==null)
								System.out.println("No teacher selected...");
							else
							{
								try
								{
									library.removeTeacher(tc);
								}
								catch(Exception a11)
								{
									System.out.println(a11);
									System.out.println();
								}
							}
						}
					}
					
					if(teacherOption==3)
					{
						try
						{
							library.showAllTeacher();
						}
						catch(Exception a7)
						{
							System.out.println(a7);
							System.out.println();
						}
					}
						
					if(teacherOption==4)
					{
						System.out.println("Loading do main menu......");
						break;
					}
						
				}
			}
			
			
			if(option==3)
			{
				while(true)
				{
					
					System.out.println();
					System.out.println("Choose your option for Book Management");
					System.out.println("1. Press 1 for Insert New Book");
					System.out.println("2. Press 2 for Remove Existing Book");
					System.out.println("3. Press 3 for Show All Book");
					System.out.println("4. Press 4 for return to the main menu");
						
					flag=true;
					while(flag==true)
					{
						try
						{
							System.out.println();
							System.out.print("Enter your option for Book mangement: ");
							bookOption=sc.nextInt();
							name=sc.nextLine();
							System.out.println();
							flag=false;
						}
						
						catch(Exception a)
						{
							System.out.println();
							System.out.println("....Invalid charcater please enter an integer value...");
							name=sc.nextLine();
							flag=true;
						}
						
					}
					flag=true;
						
						
					if(bookOption<1 || bookOption>4)
					{
						System.out.println("...Invalid operation try again...");
						System.out.println();
						continue;
					}
					if(bookOption==1)
					{
						
						System.out.println();
						Book book=new Book();
								
						
						while(true)
						{	
							flag=true;
							while(flag==true)
							{
								try
								{
									System.out.print("Enter Book id: ");
									id=sc.nextInt();
									name=sc.nextLine();
									flag=false;
								}
								
								catch(Exception a3)
								{
									System.out.println();
									System.out.println("....Invalid charcater please enter an integer value...");
									name=sc.nextLine();
									flag=true;
								}
							}
							
							boolean flag1=library.findExistingBookId(id);
							if(flag1)
							{
								System.out.println();
								System.out.println("ID already exists give a new one...");
								continue;
							}
							else
								break;
						
						}
						book.setId(id);
						
						flag=true;
						
						System.out.print("Enter book's title: ");
						name=sc.nextLine();
						book.setTitle(name);		
										
									
						System.out.print("Enter book's subtitle: ");
						name=sc.nextLine();
						book.setSubTitle(name);			
									
						System.out.print("Enter book's Author's name: ");
						name=sc.nextLine();
						book.setAuthor(name);			
									
						System.out.print("Enter book's publisher's name: ");
						name=sc.nextLine();
						book.setPublisher(name);			
														
									
						flag=true;
						while(flag==true)
						{
							try
							{
								System.out.println();
								System.out.print("Enter book's price: ");
								amnt=sc.nextDouble();
								System.out.println();
								book.setPrice(amnt);
								flag=false;
							}
							
							catch(Exception a4)
							{
								System.out.println();
								System.out.println("....Invalid charcater please enter integer/float type value...");
								name=sc.nextLine();
								flag=true;
							}
							
						}
						
						flag=true;
						int copy=0;
						while(flag==true)
						{
							try
							{
								System.out.println();
								System.out.print("Enter book's number of copy: ");
								copy=sc.nextInt();
								System.out.println();
								book.setNoOfCopy(copy);
								flag=false;
							}
							
							catch(Exception a4)
							{
								System.out.println();
								System.out.println("....Invalid charcater please enter integer type value...");
								name=sc.nextLine();
								flag=true;
							}
							
						}
						
						try
						{
							library.insertBook(book);	
						}
						catch(Exception a5)
						{
							System.out.println(a5);
						}
						
						
							
					}
						
					if(bookOption==2)
					{
						System.out.println();
						Book book=new Book();
						
						System.out.println("Do you want to select a book by iD or have a list for selecting..");
						System.out.println("Press 1 for selecting by ID");
						System.out.println("Press 2 for select by list");
						
						int op=0;
						
						flag=true;
						while(flag==true)
						{
							try
							{
								System.out.println();
								System.out.print("Enter your choice: ");
								op=sc.nextInt();
								name=sc.nextLine();
								System.out.println();
								flag=false;
							}
							
							catch(Exception a)
							{
								System.out.println();
								System.out.println("....Invalid charcater please enter an integer value...");
								name=sc.nextLine();
								flag=true;
							}
							
						}
						flag=true;
						
						if(op<1 || op>2)
							System.out.println("Invalid choice...");
						
						if(op==1)
						{
							flag=true;
							while(flag==true)
							{
								try
								{
									System.out.println();
									System.out.print("Enter book id: ");
									id=sc.nextInt();
									name=sc.nextLine();
									System.out.println();
									flag=false;
								}
								
								catch(Exception a)
								{
									System.out.println();
									System.out.println("....Invalid charcater please enter an integer value...");
									name=sc.nextLine();
									flag=true;
								}
								
							}
							flag=true;
							
							try
							{
								book=library.getBook(id);
							}
							catch(Exception a10)
							{
								book=null;
								System.out.println(a10);
							}
							
							if(book==null)
								System.out.println("No book removed...");
							
							else
							{
								int nmbr=0;
								System.out.println("Do you want to remove all copy of this book or some copy?");
								
								flag=true;
								while(flag==true)
								{
									try
									{
										System.out.println();
										System.out.print("If you want to remove all the copy enter 0 else enter the number of copy you want to remove: ");
										nmbr=sc.nextInt();
										System.out.println();
										flag=false;
									}
									catch(Exception a8)
									{
										System.out.println();
										System.out.println("...please, Enter an integer value...");
										name=sc.nextLine();
										System.out.println();
										flag=true;
									}
								}
								
								int crnmbr=book.getNoOfCopy();
								if(nmbr==0)
								{
									try
									{
										library.removeBook(book);
									}
									catch(Exception a6)
									{
										System.out.println(a6);
										System.out.println();
									}
								}
								else if(nmbr==crnmbr)
								{
									try
									{
										library.removeBook(book);
									}
									catch(Exception a6)
									{
										System.out.println(a6);
										System.out.println();
									}
								}
								else if(nmbr>crnmbr)
								{
									System.out.println("We do not have that much books to remove...");
								}
								else
								{
									book.removeCopy(nmbr);
									System.out.println("Copy removal successful..");
									
								}
							
							}
							
						}
						if(op==2)
						{
							System.out.println("Choose which book you want to remove..");
							book=library.chooseBook();
						
							if(book==null)
								System.out.println("No book selected...");
							else
							{
								int nmbr=0;
								System.out.println("Do you want to remove all copy of this book or some copy?");
								
								flag=true;
								while(flag==true)
								{
									try
									{
										System.out.println();
										System.out.print("If you want to remove all the copy enter 0 else enter the number of copy you want to remove: ");
										nmbr=sc.nextInt();
										System.out.println();
										flag=false;
									}
									catch(Exception a8)
									{
										System.out.println();
										System.out.println("...please, Enter an integer value...");
										name=sc.nextLine();
										System.out.println();
										flag=true;
									}
								}
								
								int crnmbr=book.getNoOfCopy();
								if(nmbr==0)
								{
									try
									{
										library.removeBook(book);
									}
									catch(Exception a6)
									{
										System.out.println(a6);
										System.out.println();
									}
								}
								else if(nmbr==crnmbr)
								{
									try
									{
										library.removeBook(book);
									}
									catch(Exception a6)
									{
										System.out.println(a6);
										System.out.println();
									}
								}
								else if(nmbr>crnmbr)
								{
									System.out.println("We do not have that much books to remove...");
								}
								else
								{
									book.removeCopy(nmbr);
									System.out.println("Copy removal successfull");
									
								}
								
								
							}
						}
						
					}
					
					if(bookOption==3)
					{
						try
						{
							library.showAllBooks();
						}
						catch(Exception a7)
						{
							System.out.println(a7);
							System.out.println();
						}
					}
						
					if(bookOption==4)
					{
						System.out.println("Loading do main menu......");
						break;
					}
						
				}
			}
			
			
			if(option==4)
			{
				while(true)
				{
					
					System.out.println();
					System.out.println("Choose your option for Book Borrow/Lost Management");
					System.out.println("1. Press 1 for Borrow Book");
					System.out.println("2. Press 2 for Return Book");
					System.out.println("3. Press 3 for Generate Fine");
					System.out.println("4. Press 4 for return to the main menu");
						
					flag=true;
					while(flag==true)
					{
						try
						{
							System.out.println();
							System.out.print("Enter your option for Book Borrow/Lost mangement: ");
							bookOption=sc.nextInt();
							name=sc.nextLine();
							System.out.println();
							flag=false;
						}
						
						catch(Exception a)
						{
							System.out.println();
							System.out.println("....Invalid charcater please enter an integer value...");
							name=sc.nextLine();
							flag=true;
						}
						
					}
					flag=true;
						
						
					if(bookOption<1 || bookOption>4)
					{
						System.out.println("...Invalid operation try again...");
						System.out.println();
						continue;
					}
					if(bookOption==1)
					{
						
						System.out.println();
						Book book=new Book();
						
						System.out.println("Do you want to select a book by iD or have a list for selecting..");
						System.out.println("Press 1 for selecting by ID");
						System.out.println("Press 2 for select by list");
						
						int op=0;
						
						flag=true;
						while(flag==true)
						{
							try
							{
								System.out.println();
								System.out.print("Enter your choice: ");
								op=sc.nextInt();
								name=sc.nextLine();
								System.out.println();
								flag=false;
							}
							
							catch(Exception a)
							{
								System.out.println();
								System.out.println("....Invalid charcater please enter an integer value...");
								name=sc.nextLine();
								flag=true;
							}
							
						}
						flag=true;
						
						if(op<1 || op>2)
							System.out.println("Invalid choice...");
						
						if(op==1)
						{
							flag=true;
							while(flag==true)
							{
								try
								{
									System.out.println();
									System.out.print("Enter book id: ");
									id=sc.nextInt();
									name=sc.nextLine();
									System.out.println();
									flag=false;
								}
								
								catch(Exception a)
								{
									System.out.println();
									System.out.println("....Invalid charcater please enter an integer value...");
									name=sc.nextLine();
									flag=true;
								}
								
							}
							flag=true;
							
							try
							{
								book=library.getBook(id);
							}
							catch(Exception a10)
							{
								book=null;
								System.out.println(a10);
							}
							
							if(book==null)
								System.out.println("No book borrowed...");
							
							else
							{
								flag=true;
								while(flag==true)
								{
									try
									{
										System.out.println();
										System.out.print("Enter patron id for borrowing book: ");
										id=sc.nextInt();
										name=sc.nextLine();
										System.out.println();
										flag=false;
									}
									
									catch(Exception a)
									{
										System.out.println();
										System.out.println("....Invalid charcater please enter an integer value...");
										name=sc.nextLine();
										flag=true;
									}
									
								}
								
								flag=true;
								
								Patron p;
									
								p=library.getPatron(id);
								
								if(p==null)
								{
									System.out.println("Invalid patron id entered...");
								}
								else
								{
									boolean flg=p.previouslyBorrowed(book);
									if(flg)
									{
										System.out.println("You have previously borrowed this book please return it first you can only borrow one copy at a time...");
									}
									
									else
									{
										int cp=book.getNoOfCopy();
										if(cp==0)
										{
											System.out.println("Sorry, there is no book to give....");
										}
										else
										{
											book.removeCopy(1);
											
											if(p==null)
												System.out.println("Sorry no matching id found...");
											else
											{
												System.out.println("Book borrowing successful....");
												p.borrow(p,book);
											}
										}
									}
								}
								
							
							}
							
						}
						if(op==2)
						{
							System.out.println("Choose which book you want to borrow..");
							book=library.chooseBook();
							
							if(book==null)
								System.out.println("No book borrowed...");
							else
							{
								flag=true;
								while(flag==true)
								{
									try
									{
										System.out.println();
										System.out.print("Enter patron id for borrowing book: ");
										id=sc.nextInt();
										name=sc.nextLine();
										System.out.println();
										flag=false;
									}
									
									catch(Exception a)
									{
										System.out.println();
										System.out.println("....Invalid charcater please enter an integer value...");
										name=sc.nextLine();
										flag=true;
									}
									
								}
								
								flag=true;
								
								Patron p;
									
								p=library.getPatron(id);
								
								if(p==null)
								{
									System.out.println("Invalid patron id entered...");
								}
								else
								{
									boolean flg=p.previouslyBorrowed(book);
									if(flg)
									{
										System.out.println("You have previously borrowed this book please return it first you can only borrow one copy at a time...");
									}
									
									else
									{
										int cp=book.getNoOfCopy();
										if(cp==0)
										{
											System.out.println("Sorry, there is no book to give....");
										}
										else
										{
											book.removeCopy(1);
											
											if(p==null)
												System.out.println("Sorry no matching id found...");
											else
											{
												System.out.println("Book borrowing successful....");
												p.borrow(p,book);
											}
										}
									}
								}
							
							}
						}
								
						
					}	
						
					if(bookOption==2)
					{
						
						System.out.println();
						Book book=new Book();
						
						System.out.println("Do you want to return a book by iD or have a list for selecting..");
						System.out.println("Press 1 for selecting by ID");
						System.out.println("Press 2 for select by list");
						
						int op=0;
						
						flag=true;
						while(flag==true)
						{
							try
							{
								System.out.println();
								System.out.print("Enter your choice: ");
								op=sc.nextInt();
								name=sc.nextLine();
								System.out.println();
								flag=false;
							}
							
							catch(Exception a)
							{
								System.out.println();
								System.out.println("....Invalid charcater please enter an integer value...");
								name=sc.nextLine();
								flag=true;
							}
							
						}
						flag=true;
						
						if(op<1 || op>2)
							System.out.println("Invalid choice...");
						
						if(op==1)
						{
							flag=true;
							while(flag==true)
							{
								try
								{
									System.out.println();
									System.out.print("Enter book id: ");
									id=sc.nextInt();
									name=sc.nextLine();
									System.out.println();
									flag=false;
								}
								
								catch(Exception a)
								{
									System.out.println();
									System.out.println("....Invalid charcater please enter an integer value...");
									name=sc.nextLine();
									flag=true;
								}
								
							}
							flag=true;
							
							try
							{
								book=library.getBook(id);
							}
							catch(Exception a10)
							{
								book=null;
								System.out.println(a10);
							}
							
							if(book==null)
								System.out.println("No book returned...");
							
							else
							{
								flag=true;
								while(flag==true)
								{
									try
									{
										System.out.println();
										System.out.print("Enter patron id for returning book: ");
										id=sc.nextInt();
										name=sc.nextLine();
										System.out.println();
										flag=false;
									}
									
									catch(Exception a)
									{
										System.out.println();
										System.out.println("....Invalid charcater please enter an integer value...");
										name=sc.nextLine();
										flag=true;
									}
									
								}
								
								flag=true;
								
								Patron p;
									
								p=library.getPatron(id);
								if(p==null)
									System.out.println("Sorry no matching id found...");
								else
								{
									boolean flg=p.previouslyBorrowed(book);
									if(!flg)
									{
										System.out.println("You didn't borrowed the book so, you can't return it...");
									}
									else
									{
										book.addCopy(1);
										System.out.println("Book returning successful....");
										p.returnBook(p,book);
									}
								}
							
							}
							
						}
						if(op==2)
						{
							System.out.println("Choose which book you want to return...");
							book=library.chooseBook();
							
							if(book==null)
								System.out.println("No book returned...");
							else
							{
								flag=true;
								while(flag==true)
								{
									try
									{
										System.out.println();
										System.out.print("Enter patron id for returning book: ");
										id=sc.nextInt();
										name=sc.nextLine();
										System.out.println();
										flag=false;
									}
									
									catch(Exception a)
									{
										System.out.println();
										System.out.println("....Invalid charcater please enter an integer value...");
										name=sc.nextLine();
										flag=true;
									}
									
								}
								
								flag=true;
								
								Patron p;
									
								p=library.getPatron(id);
								if(p==null)
									System.out.println("Sorry no matching id found...");
								else
								{
									book.addCopy(1);
									System.out.println("Book returning successful....");
									p.returnBook(p,book);
								}
								
							
							}
						}
						
						
						
					}
					
					if(bookOption==3)
					{
						Patron p;
						
						
						flag=true;
						while(flag==true)
						{
							
							try
							{
								System.out.println();
								System.out.print("Enter fine amount: ");
								amnt=sc.nextDouble();
								System.out.println();
								flag=false;
							}
							
							catch(Exception a4)
							{
								System.out.println();
								System.out.println("....Invalid charcater please enter integer/float type value...");
								name=sc.nextLine();
								flag=true;
							}
							
						}
						
						flag=true;
						while(flag==true)
						{
							try
							{
								System.out.println();
								System.out.print("Enter patron id for generating fine: ");
								id=sc.nextInt();
								name=sc.nextLine();
								System.out.println();
								flag=false;
							}
								
							catch(Exception a)
							{
								System.out.println();
								System.out.println("....Invalid charcater please enter an integer value...");
								name=sc.nextLine();
								flag=true;
							}
								
						}
						
						p=library.getPatron(id);
						if(p==null)
						System.out.println("Sorry no matching id found...");
						else
						{
							try
							{
								librarian.generateFine(p,amnt);
							}
							catch(Exception a9)
							{
								System.out.println(a9);
							}
						}
					}
						
					if(bookOption==4)
					{
						System.out.println("Loading do main menu......");
						break;
					}
						
				}
			}
				
			if(option==5)
			{
				System.out.println("..................See you next time ^_^......................");
				break;
			}
			
			
		}
	}
}