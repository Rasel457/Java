package Library_folder.Patron_folder.Teacher_folder;
import Exceptions.*;
import Library_folder.Patron_folder.*;
public class Teacher extends Patron
{
	private String teacherId;
	
	private int officeRoomNo;
	
	public void setRoom(int officeRoomNo)
	{
		this.officeRoomNo=officeRoomNo;
	}
	
	public int getRoom()
	{
		return officeRoomNo;
	}
	
	public void setTeacherId(String teacherId)
	{
		this.teacherId=teacherId;
	}
	
	public String getTeacherId()
	{
		return teacherId;
	}
	
	public void showInfo()
	{
		System.out.println();
		System.out.println("Teaher ID: "+teacherId);
		System.out.println("Office room number: "+officeRoomNo);
		System.out.println("Patron id for teacher :"+getPatrontId());
		System.out.println("Teacher's name: "+getName());
		System.out.println("Departmant name: "+getDepartmentName());
		System.out.println("Email address: "+getEmail());
		System.out.println("Teacher's contact no: "+getContactNo());
		System.out.println("Address: "+getAddress());
		System.out.println("Current balance of teacher"+getAmount());
		System.out.println();
	}
}