
// Login Form Interface

import javax.swing.*;
import java.awt.*;

public class Login_Form 
{
    public static void main(String args[])
    {
        JFrame frame = new JFrame("Login Form");
        frame.setSize(300,300);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.white);
        frame.setLocationRelativeTo(null);

        JLabel heading = new JLabel("Enter your details");  
        heading.setBounds(80, 15, 100, 20);
        frame.add(heading); 

        JLabel firstName = new JLabel("First Name :");  
        firstName.setBounds(20, 50, 80, 20);
        frame.add(firstName);  
  
        JLabel lastName = new JLabel("Last Name :");  
        lastName.setBounds(20, 80, 80, 20);
        frame.add(lastName);  
  
        JLabel dob = new JLabel("Date of Birth :");  
        dob.setBounds(20, 110, 80, 20);
        frame.add(dob);

        JTextField firstnameTF = new JTextField();
        firstnameTF.setBounds(130,50,80,20);
        frame.add(firstnameTF);

        JTextField lastnameTF = new JTextField();
        lastnameTF.setBounds(130,80,80,20);
        frame.add(lastnameTF);

        JTextField dobTF = new JTextField();
        dobTF.setBounds(130,110,80,20);
        frame.add(dobTF);

        JButton button1 = new JButton("Submit");
        button1.setBounds(45,160,90,30);
        frame.add(button1);
        
        JButton button2 = new JButton("Cancel");
        button2.setBounds(140,160,90,30);
        frame.add(button2);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}