import org.junit.Test;
import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assume.assumeTrue;


@RunWith(Theories.class)
public class IntSetTheoryTest {

    @DataPoints
    public static IntSet[] set2 = {new IntSet(), new IntSetSub(),new IntSet(),new IntSet()};
    
//	@Test
//	public void testOldClone() {
//		IntSetSub set = new IntSetSub();
//		IntSetSub sub =(IntSetSub) set.clone();
//		assertTrue(sub!=set);
//		assertEquals(set.getClass(),sub.getClass());
//
//	}

	@Theory
	public void testClone(IntSet set) {
	    assumeTrue(set!=null);

		IntSet clone = set.clone();
		
		assertTrue(set!=clone);
		assertEquals(set.getClass(),clone.getClass());
	}

	@Theory
	public void testEquals(IntSet set) {
		assumeTrue(set!=null);
		
		IntSet clone = set.clone();
		IntSet clone2 = clone.clone();

		//reflexive
		assertTrue(set.equals(set));

		// symmetry
		assertTrue(set.equals(clone));
		assertTrue(clone.equals(set));

		// transitivity
		assertTrue(set.equals(clone2));
		assertTrue(clone2.equals(clone));
	}


	@Theory
    public void testHashCode(IntSet set) {
		assumeTrue(set!=null);

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
