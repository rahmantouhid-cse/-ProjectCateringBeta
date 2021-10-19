package packages;

import javax.swing.*;
import java.awt.*; 
import java.sql.*; 
import java.awt.event.*; 

public class admindatabase
{
    Connection con1;
    Statement stat1;
    ResultSet rs1;
   public admindatabase()
    {
		
        try{
			Class.forName("com.mysql.jdbc.Driver");
            con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/food","root","");
               stat1=con1.createStatement();
           }
        catch (Exception aoe) 
        {
            System.out.println("error while connecting: "+aoe);
        }
    }
        //return boolean
    public Boolean checkLogin1(String uname2,String pwd3)
    {
        try {        
			
			String sql= "select * from admin where user='"+uname2+"' and password='"+pwd3+"'"; 	
    
            rs1=stat1.executeQuery(sql);
            if(rs1.next())
            {
                //TRUE if the query founds any corresponding data
                return true;
            }
            else
            {
                return false;
		}
        } catch (Exception eox) {
            // TODO Auto-generated catch block
            System.out.println("error while validating: "+eox);
            return false;
        }
		
}

}