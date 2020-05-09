package jUnit;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {

	@Test
	public void test() {
		jUnitMain j = new jUnitMain();
		String result=j.addStrings("Lab9", "SE");
		assertEquals("Lab9SE",result);
	}

}
