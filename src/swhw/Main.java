package swhw;
import javax.swing.*;

public class Main extends JFrame {
	 public static void main(String[] args)
	    {
	        // this creates an instance of the ProductFrame
	       
	        View v=new View();
	        //model m=new model();
	        //Controller c=new Controller();
	        
	        v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        v.setSize(500,300);
	        v.setResizable(false);
	        
	        // this displays the frame
	        v.setVisible(true);
	    }


}
