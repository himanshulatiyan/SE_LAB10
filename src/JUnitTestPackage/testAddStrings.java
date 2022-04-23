package JUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {

	@Test
	public void test() {
		JUnitFunctions junitstring=new JUnitFunctions();
		String result=junitstring.AddStrings("capstone","project");
		assertEquals("capstoneproject",result);
	}

}
