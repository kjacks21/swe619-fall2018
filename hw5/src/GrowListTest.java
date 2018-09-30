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
}
