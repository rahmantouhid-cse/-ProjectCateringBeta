package packages;

import javax.swing.*;
import java.awt.*; 
import java.sql.*; 
import java.awt.event.*; 


public  class adminlogin 
{
	public adminlogin()
	
	{
		Color myColor = new Color(255, 128, 0);//orange	
		JFrame c=new JFrame("Admin Login");
		JLabel lname=new JLabel("Username");
		JLabel lpass=new JLabel("Password");
    
      JTextField tname=new JTextField(20);
      JPasswordField tpass=new JPasswordField(20);
      JButton button=new JButton("Login");
	  
		Font myFont = new Font("Calibri", Font.BOLD, 20);
	
 button.addActionListener(new ActionListener()
 {
public void actionPerformed(ActionEvent exp)
{
	admindatabase foodObj1=new admindatabase();
 
            String pswd=new String(tpass.getText());
            System.out.println("Username,Pswd:"+tname.getText()+","+pswd);
                
				
				if(foodObj1.checkLogin1(tname.getText(), pswd))
                {
					JOptionPane.showMessageDialog(null, "You have logged in successfully","Success",JOptionPane.INFORMATION_MESSAGE);
					
					inventory obj3= new inventory();
					
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Login failed!","Failed!!",JOptionPane.ERROR_MESSAGE);
				}
}
 }
		);
		lname.setFont(myFont);
		tname.setFont(myFont);
		lpass.setFont(myFont);
		tpass.setFont(myFont);
		button.setFont(myFont);
		c.getContentPane().setBackground(myColor);
       	c.add(lname);
        c.add(tname);
        c.add(lpass);
        c.add(tpass);
        c.add(button);
        c.setLayout(new FlowLayout());
        c.setVisible(true);
        c.setSize(500,180);   
	}		
}