package swhw;

import static org.junit.Assert.*;

import org.junit.Test;

public class ViewTest {
	View v=new View();

	@Test
	public void testGetFN() {
		v.text1.setText("2");		
		assertTrue(v.getFN() == 2);
		
	
	}

	@Test
	public void testGetSN() {
		v.text2.setText("8");		
		assertTrue(v.getSN() == 8);
	}

	@Test
	public void testSetR() {
		v.setR(9);
		assertTrue(Float.parseFloat(v.text3.getText()) == 9);
	}

}
