package Library_folder.Patron_folder.Student_folder;
import Library_folder.Patron_folder.*;
import Exceptions.*;
public class Student extends Patron
{
	private String studentId;
	private String gaurdianName;
	private String gaurdianContactNo;
	
	public void setStudentId(String studentId)
	{
		this.studentId=studentId;
	}
	
	public void setGaurdianName(String gaurdianName)
	{
		this.gaurdianName=gaurdianName;
	}
	
	public void setGaurdianContactNo(String gaurdianContactNo)
	{
		this.gaurdianContactNo=gaurdianContactNo;
	}
	
	public String getStudentId()
	{
		return studentId=studentId;
	}
	
	public String getGaurdianName()
	{
		return gaurdianName;
	}
	
	public String getGaurdianContactNo()
	{
		return gaurdianContactNo;
	}
	
	public void showInfo()
	{
		System.out.println();
		System.out.println("Student ID: "+studentId);
		System.out.println("Student's patron id: "+getPatrontId());
		System.out.println("Student's name: "+getName());
		System.out.println("Gaurdian name: "+gaurdianName);
		System.out.println("Gaurdian contact number: "+gaurdianContactNo);
		System.out.println("Departmant name: "+getDepartmentName());
		System.out.println("Email address: "+getEmail());
		System.out.println("Stduent's contact no: "+getContactNo());
		System.out.println("Address: "+getAddress());
		System.out.println("Current balance of student"+getAmount());
		System.out.println();
	}
}