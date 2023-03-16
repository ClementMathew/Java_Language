
// File Handling Using FileReader

import java.io.*;

class File_Handling_Using_FileReader
{
    public static void main(String args[]) throws IOException
    {
        String str = "My name is Clement";
        try (FileWriter Fw = new FileWriter("Input.txt")) 
        {
            for(int i=0;i<str.length();i++)
            {
                Fw.write(str.charAt(i));
            }
        }
        System.out.println("Written successfully");
        int ch;
        FileReader Fr = null;
        try
        {
            Fr = new FileReader("Input.txt");
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File not found");
        }
        System.out.println("The readed data is : ");
        while((ch = Fr.read()) != -1)
        {
            System.out.print((char)ch);
        }
    }
}