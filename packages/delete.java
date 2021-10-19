package packages;

import javax.swing.*;
import java.awt.*; 
import java.sql.*; 
import java.awt.event.*; 

public  class delete 
{
	public delete()

	{
		Color myColor = new Color(255, 128, 0);//orange	
		JFrame f=new JFrame("Delete User");
		JTextField area=new JTextField(20);
		JButton button=new JButton("Delete");
       
				Font myFont = new Font("Calibri", Font.BOLD, 20);
					button.addActionListener(new ActionListener()
		{
		public void actionPerformed(ActionEvent e) 
		{

		
		String user= String.valueOf(area.getText());
		try
		{
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection(  "jdbc:mysql://localhost:3306/food","root","");  
		Statement stmt=con.createStatement(); 
		String sql= "DELETE FROM food where user='"+user+"'";
		stmt.executeUpdate(sql);
		JOptionPane.showMessageDialog(null, "User removed","delete success",JOptionPane.INFORMATION_MESSAGE);
		}
		catch(Exception exp)
		{ System.out.println(exp);}	
		
		}
		}
		);
		button.setFont(myFont);
		area.setFont(myFont);
        f.add(area);  
		f.add(button);  
		f.getContentPane().setBackground(myColor);
        f.setSize(500,100);  
        f.setLayout(new FlowLayout());  
        f.setVisible(true);  
	}
}	