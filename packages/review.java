package packages;

import javax.swing.*;
import java.awt.*; 
import java.sql.*; 
import java.awt.event.*; 

public  class review extends login
{
	public review()

	{
		Color myColor = new Color(255, 128, 0);//orange	
		JFrame f=new JFrame("comment page");
		JTextArea area=new JTextArea("");
		JButton button=new JButton("done");
        area.setBounds(10,10, 310,200);  
        button.setBounds(120,220, 100,20);
					button.addActionListener(new ActionListener()
		{
		public void actionPerformed(ActionEvent e) 
		{

		
		String comment= String.valueOf(area.getText());
		try
		{
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection(  "jdbc:mysql://localhost:3306/food","root","");  
		Statement stmt=con.createStatement(); 
		String sql= "UPDATE food SET comment='"+comment+"' where user='"+loginname+"'";
		stmt.executeUpdate(sql);
		JOptionPane.showMessageDialog(null, "Thank you for your comment","Comment added",JOptionPane.INFORMATION_MESSAGE);
		}
		catch(Exception exp)
		{ System.out.println(exp);}	
		
		}
		}
		);
		
        f.add(area);  
		f.add(button);  
		f.getContentPane().setBackground(myColor);
        f.setSize(350,300);  
        f.setLayout(null);  
        f.setVisible(true);  
	}
}	