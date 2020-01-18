import java.io.*;

public class Prelimact2 
{
	public static void main(String [] args)throw IOException
	{
		BufferedReader in = new BufferedReader(new FileReader(phonebook.txt));
		String data=" ";
		while((data=in.read()) !=null) {
			if(data.toString().equals("1001-11"))
			{
			System.out.println("We're found the record!");
			data = in.read();
			System.out.println("Firstname:" + data.toString());
			data = in.read();
			System.out.println("Lastname:" + data.toString());
			data = in.read();
			System.out.println("CP#:" + data.toString());
		}
		}
	}
}