package FileReadWrite_folder;
import Exceptions.*;
import java.io.* ;
import java.lang.* ;

public class FileReadWrite
{
	File folder ;
	File file ;
	private FileWriter writer ;
	private FileReader reader ;
	private BufferedReader buffer ;
	
	public void createDirectory()
	{	
		try
		{
			folder = new File("E:/6 TH SEMISTER FINAL/java_project/saved") ;
			folder.mkdir() ;
		}
		catch(Exception e)
		{
			e.printStackTrace() ;
		}
	}
	public void writeInFile(String s)
	{
		try
		{
			file = new File("E:/6 TH SEMISTER FINAL/java_project/saved/saved_data.txt");			
			file.createNewFile();
			
			writer = new FileWriter(file, true); 
					
			writer.write(s+"\r\n") ;
			writer.flush() ;
			writer.close() ;		
		
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace() ;

		}
	}
	
	public void readFromFile()
	{
		
		try
		{
			reader = new FileReader(file);
			buffer = new BufferedReader(reader);
			String text="", temp;
			
			while((temp=buffer.readLine())!=null)
			{
				
				text=text+temp+"\r"+"\n";
			}
			
			System.out.print(text);
			reader.close();
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
		
	}
	
}