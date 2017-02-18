package swhw;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Controller implements ActionListener {
	
	private JButton button1,button2,button4,button5,button6;
	String op=new String();
	model m=new model();
	View v;
	
	Controller(){}

	public Controller(JButton button1 ,JButton button2,JButton button4,JButton button5,JButton button6,View v)
	{
		this.button1=button1;
		this.button2=button2;
		this.button4=button4;
		this.button5=button5;
		this.button6=button6;
		this.v=v;
	}
	/*public Controller(View v){
		
		this.v=v;
		op="+";
		}
		*/
		
	
public void setOp(String st){
	//if (!(st.equals(null)))
	{

		op=st;
		testOp();
	}
	}

public void testOp(){
	if(op != null)
	{
	if(op.equals("+"))
	{
		m.add(v.getFN(),v.getSN());
		v.setR(m.getR());
	}
	else if(op.equals("-"))
	{
		m.sub(v.getFN(),v.getSN());
		v.setR(m.getR());
	}
	else if(op.equals("/"))
	{
		m.div(v.getFN(),v.getSN());
		v.setR(m.getR());
	}
	else if(op.equals("%"))
	{
		m.mod(v.getFN(),v.getSN());
		v.setR(m.getR());
	}
	else if(op.equals("*"))
	{
		m.mul(v.getFN(),v.getSN());
		v.setR(m.getR());
	}
	}
}
public String getOp(){
	return op;
	
	
}
	public void actionPerformed(ActionEvent e) {
		 if(e.getSource()==button1)
			 setOp("+");
		 if(e.getSource()==button2)
			 setOp("-");
		 
		 
		 
		 if(e.getSource()==button4)
			 setOp("/");
		 if(e.getSource()==button5)
			 setOp("*");
		 if(e.getSource()==button6)
			 setOp("%");
			 }

	
	

}
