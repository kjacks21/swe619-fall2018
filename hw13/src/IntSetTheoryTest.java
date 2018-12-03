import org.junit.Test;
import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(Theories.class)
public class IntSetTheoryTest {

    @DataPoint
    public static IntSetSub set = new IntSetSub();

	@Test
	public void testOldClone() {
		IntSetSub set = new IntSetSub();
		IntSetSub sub =(IntSetSub) set.clone();
		assertTrue(sub!=set);
		assertEquals(set.getClass(),sub.getClass());
		
	}

	@Theory
	public void testClone(IntSet set) {
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

	@Test
    public void testHashCode() {
        IntSet set = new IntSet();
        IntSet clone = set.clone();

        // reflexive
        assertTrue(set.hashCode() == set.hashCode());

        // symmetry
        assertEquals(set.hashCode(), clone.hashCode());

        // transitivity
        IntSet clone2 = clone.clone();
        assertEquals(set.hashCode(), clone2.hashCode());
        assertEquals(clone2.hashCode(), clone.hashCode());
    }

}
