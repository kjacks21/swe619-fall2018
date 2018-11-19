import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.HashSet;

public class InstrumentedTest {

	@Test
	public void testEquals() {
		InstrumentedCollection<String> h = new InstrumentedCollection<>(new HashSet<>());
        InstrumentedCollection<String> t = new InstrumentedCollection<>(new HashSet<>());

        h.add("Dog");
        h.add("Cat");

        t.add("Dog");
        t.add("Cat");

        // fails both

		//reflexive
		assertTrue(h.equals(h));

		// symmetry
		assertTrue(h.equals(t));
		assertTrue(t.equals(h));

	}

}
