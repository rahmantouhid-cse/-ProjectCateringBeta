import packages.*; //java -cp .;mysql-connector-java-5.1.47.jar SplashScreen

import java.awt.*;
import javax.swing.*;
 
public class SplashScreen extends JWindow {
     
    private int duration;
     
    public SplashScreen(int d) {
        duration = d;
    }
     

    public void showSplash() {
         
        JPanel content = (JPanel)getContentPane();
        content.setBackground(Color.white);
         
        int width = 550;
        int height =550;
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screen.width-width)/2;
        int y = (screen.height-height)/2;
        setBounds(x,y,width,height);
         
        JLabel label = new JLabel(new ImageIcon("chicken.png"));
        JLabel copyrt = new JLabel
                ("The Rahman's Catering", JLabel.CENTER);
        copyrt.setFont(new Font("Algerian", Font.BOLD, 30));
        content.add(label, BorderLayout.CENTER);
        content.add(copyrt, BorderLayout.SOUTH);
        Color oraRed = new Color(156, 20, 20,  255);
        content.setBorder(BorderFactory.createLineBorder(oraRed, 10));
         
        setVisible(true);
         
        try 
        { 
        	Thread.sleep(duration); 
        } 
        catch (Exception e) {}
         
        setVisible(false);
         
    }
     
    public void showSplashAndExit() {
         
        showSplash();
        System.exit(0);
         
    }
     
    public static void main(String[] args) {
         
        SplashScreen splash = new SplashScreen(3000);
        splash.showSplash();
		homepage obj = new homepage(); 
         
    }
}
