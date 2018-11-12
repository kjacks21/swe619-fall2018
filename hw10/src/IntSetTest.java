import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class IntSetTest {


	@Test
	public void testClone() {
		IntSet set = new IntSet();
		IntSet clone = set.clone();
		
		assertTrue(set!=clone);
		assertEquals(set.getClass(),clone.getClass());
	}

	@Test
	public void testEquals() {
		IntSet set = new IntSet();
		IntSet clone = set.clone();

		//reflexive
		assertTrue(set.equals(set));

		// symmetry
		assertTrue(set.equals(clone));
		assertTrue(clone.equals(set));

		// transitivity
		IntSet clone2 = clone.clone();
		assertTrue(set.equals(clone2));
		assertTrue(clone2.equals(clone));
	}

}
