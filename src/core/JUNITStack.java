package core;

import junit.framework.TestCase;

public class JUNITStack extends TestCase {
	
	
	public void testCreateNewEmptyStack() {
	
			Stack s1 = new Stack();
			int size = s1.getSize();
			
			assertEquals(0, size);
			assertTrue(s1.isEmpty());
	}
	
	public void testPushElmToTop() {
			Stack s2 = new Stack();
			
			assertEquals(1,s2.Top());
			assertTrue(s2.isFull());
	}

}
