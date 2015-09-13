package appb;

import static org.junit.Assert.*;

import org.junit.Test;

public class ServiceBTest {

	@Test
	public void testMinus() {
		IServiceB serviceB = new ServiceB();
		
		int result = serviceB.minus(20, 5);
		
		assertEquals(15, result);
	}

}
