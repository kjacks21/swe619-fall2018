import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BoundedQueueTest {
	BoundedQueue<Integer> queue;
	
	@Before
	public void init() {
		queue = new BoundedQueue<Integer>(6);
	}
	
	@Test
	public void TestPut() {
		queue.put(5);
		queue.put(45);
		assertEquals(2,queue.getCount());
		assertEquals(5,(int)queue.get());
	}

	@Test
    public void TestRepOK() {
        assertEquals(queue.repOK(), true);
    }

	@Test
	public void TestPutAll() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(24);
		list.add(12);
		list.add(2);

		queue.putAll(list);
		assertEquals(4,queue.getCount());
		int n=queue.getCount();
		for (int i = 0; i <n; i++) {
			int e = queue.get();
			assertEquals((int)list.get(i),e);
		}

	}
	@Test
	public void TestGetAll() {
		List<Integer> list = new ArrayList<Integer>();

		queue.put(10);
		queue.put(24);
		queue.put(12);
		queue.put(2);

		queue.getAll(list);
		assertEquals(4, list.size());
		int n = list.size();
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(10);
		list2.add(24);
		list2.add(12);
		list2.add(2);
		for (int i = 0; i <n; i++) {
			assertEquals((int)list.get(i),(int)list2.get(i));
		}

	}
}
