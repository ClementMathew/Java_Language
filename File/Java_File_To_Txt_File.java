
// Reading Java File to Output File

import java.io.*;

class Java_File_To_Txt_File
{
    public static void main(String args[]) throws IOException
    {
        int ch;
        FileReader Fr = null;
        FileWriter Fw = null;
        try
        {
            Fr = new FileReader("File_Handle_Read_Write.java");
            Fw = new FileWriter("Output.txt");
            System.out.println("The readed data is : ");
            while((ch = Fr.read()) != -1)
            {
                System.out.print((char)ch);
                Fw.write(ch);
            }
            Fw.close();
            System.out.println("Written successfully");
        }
        catch(FileNotFoundException e)
        {
            System.out.println(e);
        }
    }
}