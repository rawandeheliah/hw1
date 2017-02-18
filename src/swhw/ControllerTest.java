package swhw;

import static org.junit.Assert.*;

import org.junit.Test;

public class ControllerTest {
	View v=new View();
	Controller c=new Controller(v.button1,v.button2,v.button4,v.button5,v.button6,v);
	
	@Test(expected=java.lang.NumberFormatException.class)
	public void testsetOp()
	{
		c.setOp("+");
	}
	
	@Test
	public void testGetOp() {
		v.text1.setText("2");
		v.text2.setText("2");
		c.setOp("+");
		assertTrue(c.getOp() == "+");
	}
	
	

}