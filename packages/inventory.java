package packages;
import javax.swing.*;
import java.awt.*; 
import java.sql.*; 
import java.awt.event.*;  
public class inventory
{
	
	public inventory() 
	{  
		JFrame inventoryframe=new JFrame("Inventory Page");  
		JPanel panel=new JPanel();  
        JPanel panel1=new JPanel();  
        
		JLabel inventory=new JLabel("INVENTORY COUNT :");	
		
		Color myColor = new Color(255, 128, 0);//orange
		Color myColor1 = new Color(153, 51, 51);//red
		Font myFont = new Font("Calibri", Font.BOLD, 18);
		
		JLabel inventorylb=new JLabel("Egg (per pcs)");	
		JLabel inventorylb1=new JLabel("Beef (200 gm)");	
		JLabel inventorylb2=new JLabel("Chicken (1/4 pcs)");	
		JLabel inventorylb3=new JLabel("Fish (per pcs)");	
		JLabel inventorylb4=new JLabel("Bread (per slice)");	
		JLabel inventorylb5=new JLabel("Rice (per plate)");	
		JLabel inventorylb6=new JLabel("Water (250 ml)");	
		JLabel inventorylb07=new JLabel("Juice (250 ml)");	
		
		JLabel inventorylb7=new JLabel("00");	
		JLabel inventorylb8=new JLabel("00");	
		JLabel inventorylb9=new JLabel("00");	
		JLabel inventorylb10=new JLabel("00");	
		JLabel inventorylb11=new JLabel("00");	
		JLabel inventorylb12=new JLabel("00");	
		JLabel inventorylb13=new JLabel("00");	
		JLabel inventorylb14=new JLabel("00");

		JTextField inventorytf=new JTextField(""); 
		JTextField inventorytf1=new JTextField(""); 
		JTextField inventorytf2=new JTextField(""); 
		JTextField inventorytf3=new JTextField(""); 
		JTextField inventorytf4=new JTextField(""); 
		JTextField inventorytf5=new JTextField(""); 
		JTextField inventorytf6=new JTextField(""); 
		JTextField inventorytf7=new JTextField(""); 		

		JButton inventorybutton=new JButton("Update");  
		JButton inventorybutton1=new JButton("show");  
		JButton inventorybutton2=new JButton("Remove user");  

		panel.setBounds	(0,0, 550,50); 
		panel1.setBounds	(0,490, 550,50); 
		inventory.setBounds	(50,60, 200,20); 

		inventorylb.setBounds	(50,100, 150,20); 
		inventorylb1.setBounds	(50,140, 150,20); 
		inventorylb2.setBounds	(50,180, 150,20); 
		inventorylb3.setBounds	(50,220, 150,20);
		inventorylb4.setBounds	(50,260, 150,20);  
		inventorylb5.setBounds	(50,300, 150,20);
		inventorylb6.setBounds	(50,340, 150,20);  
		inventorylb07.setBounds	(50,380, 150,20); 
		
		inventorylb7.setBounds(250,100, 50,20); 
		inventorylb8.setBounds(250,140, 50,20); 
		inventorylb9.setBounds(250,180, 50,20);
		inventorylb10.setBounds(250,220, 50,20);  
		inventorylb11.setBounds(250,260, 50,20); 
		inventorylb12.setBounds(250,300, 50,20); 
		inventorylb13.setBounds(250,340, 50,20);
		inventorylb14.setBounds(250,380, 50,20);

		inventorytf.setBounds(400,100, 50,20); 
		inventorytf1.setBounds(400,140, 50,20); 
		inventorytf2.setBounds(400,180, 50,20); 
		inventorytf3.setBounds(400,220, 50,20); 
		inventorytf4.setBounds(400,260, 50,20); 
		inventorytf5.setBounds(400,300, 50,20); 
		inventorytf6.setBounds(400,340, 50,20);
		inventorytf7.setBounds(400,380, 50,20); 		

		inventorybutton.setBounds(380,420, 100,30);
		inventorybutton1.setBounds(50,420, 100,30);	
		inventorybutton2.setBounds(190,420, 150,30);	

		ImageIcon img= new ImageIcon("food.jpg");
		JLabel bg= new JLabel("",img,JLabel.CENTER);
		bg.setBounds(0,0,550,550);
		bg.setLayout(null);
		inventoryframe.add(bg);
		
		inventorybutton.setBackground(myColor); 
		inventorybutton1.setBackground(myColor); 
		inventorybutton2.setBackground(myColor1); 
		panel.setBackground(myColor1); 
		panel1.setBackground(myColor1);  


		bg.add(inventorybutton);
		bg.add(inventorybutton1);
		bg.add(inventorybutton2);
		
		bg.add(inventory);  

		bg.add(inventorylb7);  
		bg.add(inventorylb8);  
		bg.add(inventorylb9);  
		bg.add(inventorylb10);  
		bg.add(inventorylb11);
		bg.add(inventorylb12);
		bg.add(inventorylb13);
		bg.add(inventorylb14);
		
		bg.add(inventorylb);
		bg.add(inventorylb1);
		bg.add(inventorylb2);
		bg.add(inventorylb3);
		bg.add(inventorylb4);
		bg.add(inventorylb5);
		bg.add(inventorylb6);
		bg.add(inventorylb07);
		
		bg.add(inventorytf);  
		bg.add(inventorytf1);  
		bg.add(inventorytf2);  
		bg.add(inventorytf3);  
		bg.add(inventorytf4);
		bg.add(inventorytf5);
		bg.add(inventorytf6);
		bg.add(inventorytf7);
		
		bg.add(panel);
		bg.add(panel1);
		
		inventorybutton.setFont(myFont);
		inventorybutton1.setFont(myFont);
		inventorybutton2.setFont(myFont);
		inventorylb.setFont(myFont);
		inventorylb1.setFont(myFont);
		inventorylb2.setFont(myFont);
		inventorylb3.setFont(myFont);
		inventorylb4.setFont(myFont);
		inventorylb5.setFont(myFont);
		inventorylb6.setFont(myFont);
		inventorylb07.setFont(myFont);
		inventorylb7.setFont(myFont);
		inventorylb8.setFont(myFont);
		inventorylb9.setFont(myFont);
		inventorylb10.setFont(myFont);
		inventorylb11.setFont(myFont);
		inventorylb12.setFont(myFont);
		inventorylb13.setFont(myFont);
		inventorylb14.setFont(myFont);
		inventorytf.setFont(myFont);
		inventorytf1.setFont(myFont);
		inventorytf2.setFont(myFont);
		inventorytf3.setFont(myFont);
		inventorytf4.setFont(myFont);
		inventorytf5.setFont(myFont);
		inventorytf6.setFont(myFont);
		inventorytf7.setFont(myFont);
		
		inventory.setFont(myFont);
		
		 inventorybutton1.addActionListener(new ActionListener()
 {
public void actionPerformed(ActionEvent exp)
{
	try{
	Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection(  "jdbc:mysql://localhost:3306/food","root","");  
		Statement stmt=con.createStatement(); 
		String sql= "select * from admin where user='admin'";
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next())
		{
		String egg= rs.getString("egg");
		String beef= rs.getString("beef");
		String chicken= rs.getString("chicken");
		String fish= rs.getString("fish");
		String bread= rs.getString("bread");
		String rice= rs.getString("rice");
		String water= rs.getString("water");
		String juice= rs.getString("juice");
		
		inventorylb7.setText(rs.getString("egg"));
		inventorylb8.setText(rs.getString("beef"));
		inventorylb9.setText(rs.getString("chicken"));
		inventorylb10.setText(rs.getString("fish"));
		inventorylb11.setText(rs.getString("bread"));
		inventorylb12.setText(rs.getString("rice"));
		inventorylb13.setText(rs.getString("water"));
		inventorylb14.setText(rs.getString("juice"));
		}
		
		}
		catch(Exception exp3)
		{ System.out.println(exp3);}	

}
 }
		);
		
		inventorybutton.addActionListener(new ActionListener()
		{
		public void actionPerformed(ActionEvent pe) 
		{
		
		String egg1= String.valueOf(inventorytf.getText());
		String beef1= String.valueOf(inventorytf1.getText());
		String chicken1= String.valueOf(inventorytf2.getText());	
		String fish1= String.valueOf(inventorytf3.getText());	
		String bread1= String.valueOf(inventorytf4.getText());	
		String rice1= String.valueOf(inventorytf5.getText());	
		String water1= String.valueOf(inventorytf6.getText());	
		String juice1= String.valueOf(inventorytf7.getText());	
		try
		{
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con5=DriverManager.getConnection(  "jdbc:mysql://localhost:3306/food","root","");  
		Statement stmt5=con5.createStatement(); 
		String sql= "UPDATE admin SET egg='"+egg1+"',beef='"+beef1+"',chicken='"+chicken1+"',fish='"+fish1+"',bread='"+bread1+"',rice='"+rice1+"',water='"+water1+"',juice='"+juice1+"' where user='admin'";
		stmt5.executeUpdate(sql);
		JOptionPane.showMessageDialog(null, "Inventory updated","Success",JOptionPane.INFORMATION_MESSAGE);
		}
		catch(Exception exp1)
		{ System.out.println(exp1);}	
		}
		}
		);
		inventorybutton2.addActionListener(new ActionListener()
		{
		public void actionPerformed(ActionEvent pew) 
		{
			delete obj5= new delete();

		}
		}
		);
		
		
		inventoryframe.setSize(550,550);  
		//inventoryframe.setLayout(null);  
		inventoryframe.setVisible(true); 
		inventoryframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
