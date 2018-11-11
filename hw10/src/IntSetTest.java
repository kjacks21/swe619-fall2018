import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.*;

public class IntSetTest {


	@Test
	public void testClone() {
		IntSet set = new IntSet();
		IntSet clone = set.clone();
		
		assertTrue(set!=clone);
		assertEquals(set.getClass(),clone.getClass());
	}

}
