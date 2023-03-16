
// File Handling - Read and Write to a file

import java.io.*;
import java.util.Scanner;

class File_Handle_Read_Write
{
	public static void main(String args[])
	{
		try
		{
			String data = "";
			File FIn = new File("Input.txt");
			File FOut = new File("Output.txt");
			
			Scanner user = new Scanner(FIn);
			while(user.hasNextLine())
			{
				data += user.nextLine();
			}
			System.out.println(data);
			FileWriter FW = new FileWriter(FOut);
			FW.write(data);
			FW.close();
			user.close();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
}
