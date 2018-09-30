import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Iterator;

public class GrowListTest<E> {
	GrowList<String> g = new GrowList<String>();

	@Test(expected = UnsupportedOperationException.class)
	public void testRemove() {
		g.add("banana");
		g.add("apple");
		g.add("oranges");
		
		Iterator<String> iter = g.values();
		iter.next();
		iter.remove();
	}

	@Test public void testHasNext() {
		g.add("x");
		g.add("y");
		g.add("z");
		Iterator<String> iter = g.values();
		iter.next();
		assertEquals(true, iter.hasNext());
		iter.next();
		iter.next();
		assertEquals(false, iter.hasNext());

	}
}
