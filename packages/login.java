package packages;
import javax.swing.*;
import java.awt.*; 
import java.sql.*; 
import java.awt.event.*; 
public class login
{
	public static String loginname;

	public login() 
	{  
		Frame loginframe=new Frame("login + register");  

 		JPanel panel=new JPanel();  
        JPanel panel1=new JPanel();  
		
		Color myColor = new Color(255, 128, 0);//orange
		Color myColor1 = new Color(153, 0, 0);//red
		Font myFont = new Font("Calibri", Font.BOLD, 18);

		JTextField logintf=new JTextField(""); 
		JPasswordField logintf1=new JPasswordField(""); 

		JLabel loginMessage=new JLabel("PLEASE LOGIN :");	
		JLabel loginlb=new JLabel("User Name");	
		JLabel loginlb1=new JLabel("Password");	
		
		JButton loginbutton=new JButton("Login");  
		JButton registerbutton=new JButton("Register");  
		JButton adminbutton=new JButton("Admin");  
			

		JLabel registration=new JLabel("NEW REGISTRATION :");	
		JLabel registerlb=new JLabel("User name");	
		JLabel registerlb1=new JLabel("Password");	
		JLabel registerlb2=new JLabel("Phone no.");	
		JLabel registerlb3=new JLabel("Address");	
		JTextField registertf=new JTextField(""); 
		JPasswordField registertf1=new JPasswordField(""); 
		JTextField registertf2=new JTextField(""); 
		JTextField registertf3=new JTextField("");	

		panel.setBounds			(0,0, 550,80); 
		panel1.setBounds		(0,530, 550,20); 
		loginMessage.setBounds	(50,100, 500,20); 
		adminbutton.setBounds	(450,100, 100,20); 
		
		loginlb.setBounds		(50,140, 150,20); 
		loginlb1.setBounds		(50,180, 150,20); 
		loginbutton.setBounds	(200,220, 150,30);  		
		registration.setBounds	(50,300, 500,20); 
		registerlb.setBounds	(50,340, 150,20); 
		registerlb1.setBounds	(50,380, 150,20); 
		registerlb2.setBounds	(50,420, 150,20); 
		registerlb3.setBounds	(50,460, 150,20); 
		
		logintf.setBounds(200,140, 250,20); 
		logintf1.setBounds(200,180, 250,20); 

		
		registertf.setBounds(200,340, 250,20); 
		registertf1.setBounds(200,380, 250,20); 
		registertf2.setBounds(200,420, 250,20); 
		registertf3.setBounds(200,460, 250,20); 
		registerbutton.setBounds(200,490,150,30);  

	
		ImageIcon img= new ImageIcon("food.jpg");
		JLabel bg= new JLabel("",img,JLabel.CENTER);
		bg.setBounds(0,0,550,550);
		bg.setLayout(null);
		loginframe.add(bg);
		
		loginbutton.setBackground(myColor); 
		registerbutton.setBackground(myColor);
		adminbutton.setBackground(myColor);

		panel.setBackground(myColor1); 
		panel1.setBackground(myColor1); 
		
		loginMessage.setFont(myFont);
		loginbutton.setFont(myFont);
		registerbutton.setFont(myFont);
		logintf.setFont(myFont);
		logintf1.setFont(myFont);
		loginlb.setFont(myFont);
		loginlb1.setFont(myFont);
		registration.setFont(myFont);
		registertf.setFont(myFont);
		registertf1.setFont(myFont);
		registertf2.setFont(myFont);
		registertf3.setFont(myFont);
		registerlb.setFont(myFont);
		registerlb1.setFont(myFont);
		registerlb2.setFont(myFont);
		registerlb3.setFont(myFont);

		loginbutton.addActionListener(new ActionListener()
		{
        public void actionPerformed(ActionEvent e)
        {
		
			database foodObj=new database();
 
            String pwd=new String(logintf1.getText());
            System.out.println("Username,Pwd:"+logintf.getText()+","+pwd);
                //The entered username and password are sent via "checkLogin()" which return boolean
                
				
				if(foodObj.checkLogin(logintf.getText(), pwd))
                {
					JOptionPane.showMessageDialog(null, "You have logged in successfully","Success",JOptionPane.INFORMATION_MESSAGE);
					loginname=String.valueOf(logintf.getText());
					
					orderpage obj1= new orderpage();
					
					
                }
                else
                {
                    //a pop-up box
                    JOptionPane.showMessageDialog(null, "Login failed!","Failed!!",JOptionPane.ERROR_MESSAGE);
				}
        }
		
		}
		);

		registerbutton.addActionListener(new ActionListener()
		{
        public void actionPerformed(ActionEvent ep)
        {
			{
			String user= String.valueOf(registertf.getText());
			String password= String.valueOf(registertf1.getText());
			String phone= String.valueOf(registertf2.getText());	
			String address= String.valueOf(registertf3.getText());	
			
			try
			{
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  "jdbc:mysql://localhost:3306/food","root","");  
			Statement stmt=con.createStatement(); 
			String sql= "insert into food (user,password,phone,address,egg,beef,chicken,fish,bread,rice,water,juice,comment)values('"+user+"','"+password+"','"+phone+"','"+address+"',0,0,0,0,0,0,0,0,'no comment')"; 	
			stmt.executeUpdate(sql);
			JOptionPane.showMessageDialog(null, "You have registered successfully","Success",JOptionPane.INFORMATION_MESSAGE);
			}
			catch(Exception exp)
			{ System.out.println(exp);}	
			}
        }
		}
		);
		
		adminbutton.addActionListener(new ActionListener()
		{
        public void actionPerformed(ActionEvent ex)
        {
			adminlogin obj2=new adminlogin();
        }
		}
		);
		
		bg.add(loginbutton);
		bg.add(adminbutton);
		bg.add(registerbutton);		
		bg.add(loginMessage);  
		bg.add(logintf);  
		bg.add(logintf1);  
		bg.add(loginlb);
		bg.add(loginlb1);		
		bg.add(registration);		
		bg.add(registertf);  
		bg.add(registertf1);  
		bg.add(registertf2);  
		bg.add(registertf3);  		
		bg.add(registerlb);
		bg.add(registerlb1);
		bg.add(registerlb2);
		bg.add(registerlb3);
		bg.add(panel);
		bg.add(panel1);

		loginframe.setSize(550,550);  
		loginframe.setLayout(null);  
		loginframe.setVisible(true);   
	}
}
