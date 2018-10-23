import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
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
	    	IndexSearch.search(null, "lizard");
	    }

	    @Test(expected = IllegalArgumentException.class)
	    public void testSearch2() {
	        IndexSearch.search(l, "bat");
	    }

	    @Test
	    public void testSearch3() {
	    	int idx=IndexSearch.search(l,"Lizard");
	    	assertEquals(2,idx);
	    }
    @Test
    public void testindexOf() {
    	int idx=l.indexOf(list, "cat");
    	assertEquals(0,idx);
    }
    @Test
    public void testSearchable() {
    	boolean val = l.searchable(new HashMap<String,String>());
    	assertFalse(val);
    	
    }
    @Test
    public void testSearchable2() {
    	boolean val = l.searchable(new ArrayList<String>());
    	assertTrue(val);
    }
    @Test
   public void testSizeOf() {
	   int size = l.sizeOf(list);
	   assertEquals(3,size);
   }
}
