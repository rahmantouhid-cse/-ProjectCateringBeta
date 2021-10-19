package packages;
import javax.swing.*;
import java.awt.*; 
import java.sql.*; 
import java.awt.event.*; 

public class orderpage extends login
{

	public orderpage() 
	{  
		Frame orderframe=new Frame("Order Page");  

		JPanel panel=new JPanel();  
        JPanel panel1=new JPanel();  
		
		Color myColor = new Color(255, 128, 0);//orange
		Color myColor1 = new Color(153, 0, 0);//red
		Font myFont = new Font("Calibri", Font.BOLD, 18);

		JLabel welcome=new JLabel("Welcome to Catering Beta!   Please enter item quantity.");	

		JLabel orderlb=new JLabel("Egg (per pcs)");	
		JLabel orderlb1=new JLabel("Beef (200 gm)");	
		JLabel orderlb2=new JLabel("Chicken (1/4 pcs)");	
		JLabel orderlb3=new JLabel("Fish (per pcs)");	
		JLabel orderlb4=new JLabel("Bread (per slice)");	
		JLabel orderlb5=new JLabel("Rice (per plate)");	
		JLabel orderlb6=new JLabel("Water (250 ml)");	
		JLabel orderlb7=new JLabel("Juice (250 ml)");	
		JLabel orderlb8=new JLabel("Press Confirm to order now.");
		JLabel cost=new JLabel("0.00");			
		JLabel quantity=new JLabel("Quantity");			
		JLabel namelb=new JLabel("ITEM NAME");
		
		JLabel orderplb=new JLabel("10tk");	
		JLabel orderplb1=new JLabel("80tk");	
		JLabel orderplb2=new JLabel("50tk");	
		JLabel orderplb3=new JLabel("60tk");	
		JLabel orderplb4=new JLabel("5tk");	
		JLabel orderplb5=new JLabel("20tk");	
		JLabel orderplb6=new JLabel("20tk");	
		JLabel orderplb7=new JLabel("30tk");	
		
		JTextField ordertf=new JTextField(""); 
		JTextField ordertf1=new JTextField(""); 
		JTextField ordertf2=new JTextField(""); 
		JTextField ordertf3=new JTextField(""); 
		JTextField ordertf4=new JTextField(""); 
		JTextField ordertf5=new JTextField(""); 
		JTextField ordertf6=new JTextField(""); 
		JTextField ordertf7=new JTextField(""); 


		JButton orderbutton=new JButton("Total Price");  
		JButton orderbutton1=new JButton("Confirm");		
		JButton orderbutton2=new JButton("Comment");		

		panel.setBounds	(0,0, 550,80); 
		panel1.setBounds	(0,530, 550,20); 
		welcome.setBounds	(50,80, 500,20);
		

		namelb.setBounds	(50,110, 150,20); 
		quantity.setBounds	(400,110, 100,20); 
		orderlb.setBounds	(50,140, 150,20); 
		orderlb1.setBounds	(50,180, 150,20); 
		orderlb2.setBounds	(50,220, 150,20); 
		orderlb3.setBounds	(50,260, 150,20); 
		orderlb4.setBounds	(50,300, 150,20); 
		orderlb5.setBounds	(50,340, 150,20); 
		orderlb6.setBounds	(50,380, 150,20); 
		orderlb7.setBounds	(50,420, 150,20); 
		
		orderplb.setBounds	(250,140, 50,20); 
		orderplb1.setBounds	(250,180, 50,20); 
		orderplb2.setBounds	(250,220, 50,20); 
		orderplb3.setBounds	(250,260, 50,20); 
		orderplb4.setBounds	(250,300, 50,20); 
		orderplb5.setBounds	(250,340, 50,20); 
		orderplb6.setBounds	(250,380, 50,20); 
		orderplb7.setBounds	(250,420, 50,20); 
		
		cost.setBounds	(400,460, 50,20); 
		 
		
		ordertf.setBounds(400,140, 50,20); 
		ordertf1.setBounds(400,180, 50,20); 
		ordertf2.setBounds(400,220, 50,20); 
		ordertf3.setBounds(400,260, 50,20); 
		ordertf4.setBounds(400,300, 50,20); 
		ordertf5.setBounds(400,340, 50,20); 
		ordertf6.setBounds(400,380, 50,20); 
		ordertf7.setBounds(400,420, 50,20); 
		
		orderlb8.setBounds(50,460, 250,20);

		orderbutton.setBounds(360,490, 100,25);				
		orderbutton2.setBounds(225,490, 100,25);				
		orderbutton1.setBounds(85,490, 100,25);				
		
		ImageIcon img= new ImageIcon("food.jpg");
		JLabel bg= new JLabel("",img,JLabel.CENTER);
		bg.setBounds(0,0,550,550);
		bg.setLayout(null);
		orderframe.add(bg);
		
		orderbutton.setBackground(myColor); 
		orderbutton1.setBackground(myColor);
		orderbutton2.setBackground(myColor);
		panel.setBackground(myColor1); 
		panel1.setBackground(myColor1); 		


		bg.add(orderbutton);
		bg.add(orderbutton1);
		bg.add(orderbutton2);

		
		bg.add(welcome);  
		bg.add(quantity);  

		bg.add(ordertf);  
		bg.add(ordertf1);  
		bg.add(ordertf2);  
		bg.add(ordertf3);  
		bg.add(ordertf4);
		bg.add(ordertf5);
		bg.add(ordertf6);
		bg.add(ordertf7);
		
		bg.add(orderlb);
		bg.add(orderlb1);
		bg.add(orderlb2);
		bg.add(orderlb3);
		bg.add(orderlb4);
		bg.add(orderlb5);
		bg.add(orderlb6);
		bg.add(orderlb7);
		
		bg.add(orderplb);
		bg.add(orderplb1);
		bg.add(orderplb2);
		bg.add(orderplb3);
		bg.add(orderplb4);
		bg.add(orderplb5);
		bg.add(orderplb6);
		bg.add(orderplb7);
		bg.add(orderlb8);
		
		bg.add(cost);
		
		welcome.setFont(myFont);
		ordertf.setFont(myFont);
		ordertf1.setFont(myFont);
		ordertf2.setFont(myFont);
		ordertf3.setFont(myFont);
		ordertf4.setFont(myFont);
		ordertf5.setFont(myFont);
		ordertf6.setFont(myFont);
		ordertf7.setFont(myFont);
		cost.setFont(myFont);
		quantity.setFont(myFont);
		orderlb.setFont(myFont);
		orderlb1.setFont(myFont);
		orderlb2.setFont(myFont);
		orderlb3.setFont(myFont);
		orderlb4.setFont(myFont);
		orderlb5.setFont(myFont);
		orderlb6.setFont(myFont);
		orderlb7.setFont(myFont);
		orderplb.setFont(myFont);
		orderplb1.setFont(myFont);
		orderplb2.setFont(myFont);
		orderplb3.setFont(myFont);
		orderplb4.setFont(myFont);
		orderplb5.setFont(myFont);
		orderplb6.setFont(myFont);
		orderplb7.setFont(myFont);
		orderlb8.setFont(myFont);
		namelb.setFont(myFont);
		
		bg.add(panel);
		bg.add(panel1);
		bg.add(namelb);
		
		orderframe.setSize(550,550);  
		orderframe.setLayout(null);  
		orderframe.setVisible(true);  
		
		orderbutton1.addActionListener(new ActionListener()
		{
		public void actionPerformed(ActionEvent e) 
		{

		
		String egg= String.valueOf(ordertf.getText());
		String beef= String.valueOf(ordertf1.getText());
		String chicken= String.valueOf(ordertf2.getText());	
		String fish= String.valueOf(ordertf3.getText());	
		String bread= String.valueOf(ordertf4.getText());	
		String rice= String.valueOf(ordertf5.getText());	
		String water= String.valueOf(ordertf6.getText());	
		String juice= String.valueOf(ordertf7.getText());	
		try
		{
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection(  "jdbc:mysql://localhost:3306/food","root","");  
		Statement stmt=con.createStatement(); 
		String sql= "UPDATE food SET egg='"+egg+"',beef='"+beef+"',chicken='"+chicken+"',fish='"+fish+"',bread='"+bread+"',rice='"+rice+"',water='"+water+"',juice='"+juice+"' where user='"+loginname+"'";
		stmt.executeUpdate(sql);
		JOptionPane.showMessageDialog(null, "You Have ordered successfully","Success",JOptionPane.INFORMATION_MESSAGE);
		}
		catch(Exception exp)
		{ System.out.println(exp);}	
		
		}
		}
		);		
		orderbutton.addActionListener(new ActionListener()
		{
		public void actionPerformed(ActionEvent ex) 
		{
		
		String q1=ordertf.getText();
		String q2=ordertf1.getText();
		String q3=ordertf2.getText();
		String q4=ordertf3.getText();
		String q5=ordertf4.getText();
		String q6=ordertf5.getText();
		String q7=ordertf6.getText();
		String q8=ordertf7.getText();
		
		int eg= Integer.parseInt(q1);
		int be= Integer.parseInt(q2);
		int ch= Integer.parseInt(q3);	
		int fi= Integer.parseInt(q4);
		int br= Integer.parseInt(q5);
		int ri= Integer.parseInt(q6);
		int wa= Integer.parseInt(q7);
		int ju= Integer.parseInt(q8);
		int sum= 10*eg+80*be+50*ch+60*fi+5*br+20*ri+20*wa+30*ju;
		
		String total= String.valueOf(sum);
		
		cost.setText(total);


		}
		}
		);		
		orderbutton2.addActionListener(new ActionListener()
		{
        public void actionPerformed(ActionEvent eo)
        {

			review obj = new review(); 
        }
		
		}
		);
		
		}
}