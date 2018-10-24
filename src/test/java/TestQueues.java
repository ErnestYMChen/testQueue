import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestQueues {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testQueue() {
		System.out.println("----------Test Queue----------");
		Queue Tester = new Queue(5);
		assertTrue(Tester.isEmpty());
		assertFalse(Tester.isFull());
		assertEquals(0,Tester.getSize());
		//System.out.println(Tester.peekFront());
		//System.out.println(Tester.peekRear());
		assertTrue(Tester.insert(1));
		assertFalse(Tester.isEmpty());
		assertFalse(Tester.isFull());
		assertEquals(1,Tester.getSize());
		assertTrue(Tester.insert(2));
		assertFalse(Tester.isEmpty());
		assertFalse(Tester.isFull());
		assertEquals(2,Tester.getSize());
		assertTrue(Tester.insert(3));
		assertFalse(Tester.isEmpty());
		assertFalse(Tester.isFull());
		assertEquals(3,Tester.getSize());
		assertTrue(Tester.insert(4));
		assertFalse(Tester.isEmpty());
		assertFalse(Tester.isFull());
		assertEquals(4,Tester.getSize());
		assertTrue(Tester.insert(5));
		assertFalse(Tester.isEmpty());
		assertTrue(Tester.isFull());
		assertEquals(5,Tester.getSize());
		assertEquals(1,Tester.peekFront());
		assertEquals(5,Tester.peekRear());
		
		assertFalse(Tester.insert(6));
		
		assertEquals(1,Tester.remove());
		assertEquals(2,Tester.peekFront());
		assertEquals(5,Tester.peekRear());
		assertEquals(4,Tester.getSize());
		assertEquals(2,Tester.remove());
		assertEquals(3,Tester.peekFront());
		assertEquals(5,Tester.peekRear());
		assertEquals(3,Tester.getSize());
		assertEquals(3,Tester.remove());
		assertEquals(4,Tester.peekFront());
		assertEquals(5,Tester.peekRear());
		assertEquals(2,Tester.getSize());
		assertEquals(4,Tester.remove());
		assertEquals(5,Tester.peekFront());
		assertEquals(5,Tester.peekRear());
		assertEquals(1,Tester.getSize());
		assertEquals(5,Tester.remove());
		assertTrue(Tester.isEmpty());
		System.out.println(Tester.peekFront());
		System.out.println(Tester.peekRear());
		//assertEquals(0,Tester.peekFront());
		//assertEquals(0,Tester.peekRear());
		assertEquals(0,Tester.getSize());
		
		assertEquals(-1,Tester.remove());
		System.out.println(Tester.peekFront());
		System.out.println(Tester.peekRear());
		
		
	}

}
