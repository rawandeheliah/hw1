package swhw;
import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;

public class modelTest extends TestCase {
	model m=new model();
	@Test
	public void testAdd() {
		float x=2 ; float y=8;
		m.add(x, y);
	float res=m.getR();
		assertTrue(res==10);
	}
	

	@Test
	public void testDiv() {
		float x=2 ; float y=8;
		m.div(y, x);
	float res=m.getR();
		assertTrue(res==4);
	}

	@Test
	public void testMul() {
		float x=2 ; float y=8;
		m.mul(x, y);
	float res=m.getR();
		assertTrue(res==16);
	}

	@Test
	public void testMod() {
		float x=2 ; float y=8;
		m.mod(x, y);
	float res=m.getR();
		assertTrue(res==2);
	}

	@Test
	public void testSub() {
		float x=2 ; float y=8;
		m.sub(x, y);
	float res=m.getR();
		assertTrue(res==-6);
	}

}
