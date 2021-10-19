package packages;
import javax.swing.*;
import java.awt.*; 
import java.sql.*; 
import java.awt.event.*; 
public class homepage
{
	public homepage() 
	{ 
	Frame welcomeframe=new Frame("Welcome");  

 		JPanel panel=new JPanel();  
        JPanel panel1=new JPanel();  
		
		Color myColor = new Color(255, 128, 0);//orange
		Color myColor1 = new Color(153, 0, 0);//red
		Font myFont = new Font("Calibri", Font.BOLD, 18);
		Font myFont1 = new Font("Algerian", Font.BOLD, 24);

		JLabel welcometf=new JLabel("Welcome to THE RAHMAN'S CATERING!"); 
		
		JButton webbutton=new JButton("Website");  
		JButton socialbutton=new JButton("Facebook");  
		JButton aboutbutton=new JButton("About us");  
		JButton ordernow=new JButton("Order now");	

		panel.setBounds			(0,0, 550,80); 
		panel1.setBounds		(0,530, 550,20); 
		
		welcometf.setBounds	(40,100, 500,20); 

		ordernow.setBounds(200,380, 150,25); 
		webbutton.setBounds(85,490,100,20);  
		socialbutton.setBounds(225,490,100,20);  
		aboutbutton.setBounds(360,490,100,20);  

	
		ImageIcon img= new ImageIcon("food.jpg");
		JLabel bg00= new JLabel("",img,JLabel.CENTER);
		bg00.setBounds(0,0,550,550);
		bg00.setLayout(null);
		welcomeframe.add(bg00);
		ImageIcon img2= new ImageIcon("chicken02.png");
		JLabel bg2= new JLabel("",img2,JLabel.CENTER);
		bg2.setBounds(175,140,200,200);
		bg2.setLayout(null);
		bg00.add(bg2);
		ImageIcon img3= new ImageIcon("chrome.png");
		JLabel bg3= new JLabel("",img3,JLabel.CENTER);
		bg3.setBounds(105,435,50,50);
		bg3.setLayout(null);
		bg00.add(bg3);
		ImageIcon img4= new ImageIcon("fb.png");
		JLabel bg4= new JLabel("",img4,JLabel.CENTER);
		bg4.setBounds(250,435,50,50);
		bg4.setLayout(null);
		bg00.add(bg4);
		ImageIcon img5= new ImageIcon("chicken03.png");
		JLabel bg5= new JLabel("",img5,JLabel.CENTER);
		bg5.setBounds(385,435,50,50);
		bg5.setLayout(null);
		bg00.add(bg5);
		
		webbutton.setBackground(myColor); 
		socialbutton.setBackground(myColor);
		aboutbutton.setBackground(myColor);
		ordernow.setBackground(myColor);

		panel.setBackground(myColor1); 
		panel1.setBackground(myColor1); 
		
		welcometf.setFont(myFont1);
		ordernow.setFont(myFont);


		ordernow.addActionListener(new ActionListener()
		{
        public void actionPerformed(ActionEvent e)
        {
		
			login obj = new login(); 
        }
		
		}
		);

		bg00.add(webbutton);
		bg00.add(socialbutton);
		bg00.add(aboutbutton);
		bg00.add(ordernow);
		bg00.add(welcometf);
		bg00.add(panel);
		bg00.add(panel1);

		welcomeframe.setSize(550,550);  
		welcomeframe.setLayout(null);  
		welcomeframe.setVisible(true);   
	}
}
//java -cp .;mysql-connector-java-5.1.47.jar