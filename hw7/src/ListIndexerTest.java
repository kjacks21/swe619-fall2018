import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListIndexerTest<E> {
    ListIndexer<String> l = new ListIndexer<String>();
    IndexSearch s;
    static List<String> list;

	@Before
	public void insert() {
		list= new ArrayList<String>();
		list.add("cat");
		list.add("Dog");
		list.add("Lizard");
		s= new IndexSearch(list);
	}
	
    @Test(expected = NullPointerException.class)
    public  void testSearch() {
    	int idx=IndexSearch.search(null, "lizard");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSearch2() {
        int idx=IndexSearch.search(l, "bat");
    }

    @Test
    public void testSearch3() {
    	int idx=IndexSearch.search(l,"Lizard");
    	assertEquals(2,idx);
    }
}
