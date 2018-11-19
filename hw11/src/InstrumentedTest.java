import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Before;

import java.util.HashSet;

public class InstrumentedTest {
    InstrumentedCollection<String> h;
    InstrumentedCollection<String> t;

    @Before
    public void init() {
        h = new InstrumentedCollection<>(new HashSet<>());
        t = new InstrumentedCollection<>(new HashSet<>());

        h.add("Dog");
        h.add("Cat");

        t.add("Dog");
        t.add("Cat");
    }

	@Test
	public void testCollectionEqualsReflexive() {
		//reflexive
		assertTrue(h.equals(h));

	}

	@Test
    public void testCollectionEqualsSymmetric() {
        // symmetry
        assertTrue(h.equals(t));
        assertTrue(t.equals(h));
    }

}
