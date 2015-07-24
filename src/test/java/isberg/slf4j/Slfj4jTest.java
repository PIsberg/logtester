package isberg.slf4j;

import static org.junit.Assert.*;
import isberg.slfj4.TestSlf4j;

import org.junit.Before;
import org.junit.Test;

public class Slfj4jTest {
	private TestSlf4j testSlf4j;
	
	@Before
	public void setup() {
		testSlf4j = new TestSlf4j();
	}

	//#Test 1 Stringconcatenation
	@Test
	public void test() {
		assertEquals(true, true);
	//	testSlf4j.logStrConcat(10000);
		
	}

}
