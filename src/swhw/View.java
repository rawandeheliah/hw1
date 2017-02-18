package swhw;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View extends JFrame {
	

	JLabel label1,label2;
	JButton button1,button2,button4,button5,button6;
	JPanel panel,panel2,panel3,panel4;
	JTextField text1,text2,text3;
	
	public View(){
		super();
	
	       // this.setSize(100, 100);
	        this.setVisible(true);
		label1=new JLabel("number 1");
		label2=new JLabel("number 2");
		text1=new JTextField(20);
		text2=new JTextField(20);
		button1=new JButton("+");
		button2=new JButton("-");
		
		button4=new JButton("*");
		button5=new JButton("/");
		button6=new JButton("%");
		
		text3=new JTextField(20);
		panel=new JPanel(new BorderLayout());
		panel2=new JPanel();
		panel3=new JPanel();
		panel4=new JPanel();
		panel2.add(label1);
		panel2.add(text1);
		panel3.add(label2);
		panel3.add(text2);
		panel3.add(text3);
		panel4.add(button1);
		panel4.add(button2);
		panel4.add(button4);
		panel4.add(button5);
		panel4.add(button6);
		panel.add(panel2,BorderLayout.NORTH);
		panel.add(panel3,BorderLayout.CENTER);
		panel.add(panel4,BorderLayout.SOUTH);
		add(panel);
		
		ActionListener actionListener = new Controller(button1, button2, button5,button4,button6,this);
		button1.addActionListener(actionListener);
		button2.addActionListener(actionListener);
		button4.addActionListener(actionListener);
		button5.addActionListener(actionListener);
		button6.addActionListener(actionListener);
	}
		 
		
		 
	
	
	public float getFN(){
		return Float.parseFloat(text1.getText());
	}
	
	public float getSN(){
		return Float.parseFloat(text2.getText());
	}
	

	
	
	public void setR(float res)
	{
		text3.setText(""+res);
	}
	
	
	
}

