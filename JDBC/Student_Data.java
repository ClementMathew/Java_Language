
import java.sql.*;

public class Student_Data 
{
    public static void main(String[] args) throws Exception
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdata","root", "8156");
        Statement s = c.createStatement();
        ResultSet r = s.executeQuery("SELECT * FROM Datas");
        System.out.println("Roll No.\tName\t\tAge");
        while(r.next()) 
        {
            System.out.println(r.getString(1) + "\t\t" + r.getString(2)+ "\t\t"+r.getString(3));
        }
        c.close();
    }
}