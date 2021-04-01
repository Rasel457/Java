package Library_folder.Book_folder;
import Exceptions.*;
public class Book
{
	private int id;
	private String title;
	private String subtitle;
	private String authorName;
	private String  publisherName;
	private double price;
	protected int noOfCopy;
	
	
	
	public void setId(int id)
	{
		this.id=id;
	}
	
	public void setTitle(String title)
	{
		this.title=title;
	}
	
	public void setSubTitle(String subtitle)
	{
		this.subtitle=subtitle;
	}
	
	public void setAuthor(String authorName)
	{
		this.authorName=authorName;
	}
	
	public void setPublisher(String publisherName)
	{
		this.publisherName=publisherName;
	}
	
	public void setPrice(double price)
	{
		this.price=price;
	}
	
	public void setNoOfCopy(int noOfCopy)
	{
		this.noOfCopy=noOfCopy;
	}
	
	public int getID()
	{
		return id;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public String getAuthorName()
	{
		return authorName;
	}
	
	public String getPublisherName()
	{
		return publisherName;
	}
	
	public double getPrice()
	{
		return price;
	}
	public int getNoOfCopy()
	{
		return noOfCopy;
	}
	
	public void removeCopy(int copy)
	{
		noOfCopy-=copy;
	}
	public void addCopy(int copy)
	{
		noOfCopy+=copy;
	}
	
	
	public void showBookInfo()
	{
		System.out.println();
		System.out.println("ID: "+id);
		System.out.println("Title: "+title);
		System.out.println("Subtitle: "+subtitle);
		System.out.println("Author name: "+authorName);
		System.out.println("Publisher name: "+publisherName);
		System.out.println("Price: "+price);
		System.out.println("Number of copy: "+noOfCopy);
		System.out.println();
	}
}