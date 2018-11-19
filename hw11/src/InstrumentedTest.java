import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
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
		assertFalse(h.equals(h));

	}

	@Test
    public void testCollectionEqualsSymmetric() {
        // symmetry
        assertFalse(h.equals(t));
        assertFalse(t.equals(h));
    }


    InstrumentedList<String> a;
    InstrumentedList<String> b;
    InstrumentedList<String> c;

    @Before
    public void init2() {
        a = new InstrumentedList<String>(new ArrayList<>());
        b = new InstrumentedList<String>(new LinkedList<>());
        c = new InstrumentedList<String>(new ArrayList<>());

        a.add("Dog");
        a.add("Cat");

        b.add("Dog");
        b.add("Cat");

        c.add("Dog");
        c.add("Cat");
    }

    @Test
    public void testListEqualsReflexive() {
        //reflexive
        assertTrue(a.equals(a));

    }

    @Test
    public void testListEqualsSymmetric() {
        // symmetry
        assertTrue(a.equals(b));
        assertTrue(b.equals(a));
    }

    @Test
    public void testListEqualsTransitive() {
        // transitivity
        assertTrue(a.equals(b));
        assertTrue(b.equals(c));
        assertTrue(a.equals(c));
    }

}
