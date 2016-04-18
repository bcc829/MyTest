package pratice1.tdd;

import static org.junit.Assert.*;

import org.junit.Test;

public class Testcase1 {

	@Test
	public void test() {
		Test1 a = new Test1();
		assertEquals(3,a.add(3));
	}

}
