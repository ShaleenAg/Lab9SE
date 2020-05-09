package jUnit;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumbers {

	@Test
	public void test() {
		jUnitMain j = new jUnitMain();
		int result=j.addNumbers(300, 400);
		assertEquals(700,result);
	}

}
