import org.junit.Test;
import static org.junit.Assert.*;

public class GrowListTest<E> {
	GrowList<String> g = new GrowList<String>();
	
	@Test public void testAdd() {
		g=g.add("banana");
		g=g.add("apple");
		g=g.add("orange");
		String s = g.toString();
		assertEquals("[banana,apple,orange]",s);
	}
	@Test public void testAdd2() {
		g.add("cat");
		g.add("dog");
		String s = g.toString();
		assertEquals("[]",s);
	}
	@Test public void testAdd3() {
		g=g.add("cat");
		g=g.add("dog");
		g=g.add("snake");
		String s = g.toString();
		assertEquals("[cat,dog,snake]",s);
		g=g.add("frog");
		g=g.add("lizard");
		s = g.toString();
		assertEquals("[cat,dog,snake,frog,lizard]",s);
	}
	
	@Test public void testSet() {
		g=g.add("cat");
		g=g.add("dog");
		g=g.set(0, "snake");
		g=g.set(1, "frog");
		String s = g.toString();
		assertEquals("[snake,frog]",s);
		g=g.set(1, "lizard");
		s=g.toString();
		assertEquals("[snake,lizard]",s);
	}
	@Test public void testSet2() {
		g = g.add("Banana");
		g = g.add("Apple");
		g.set(1, "Apple");
		g.set(0, "Orange");
		String s = g.toString();
		assertEquals("[Banana,Apple]",s);
	}
	@Test public void testSet3() {
		g = g.add("Foo");
		g = g.add("Bar");
		g = g.set(1, "Foo");
		g=g.set(0, "Bar");
		String s = g.toString();
		assertEquals("[Bar,Foo]",s);
	}
}
