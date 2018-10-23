import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class ListIndexerTest<E> {
    ListIndexer<String> l = new ListIndexer<String>();
    static List<String> list;
	
	public static <E> int search (Indexer<E> c, E x){
		
		if(c==null)
			throw new NullPointerException("c is null");
		else if (!c.isSearchable(list))
			throw new ClassCastException("c cannot b searched");
		
		int idx =c.index(list,x);
		if(idx==-1)
			throw new IllegalArgumentException(x+" is not found");
		return idx;
	}
	@Before
	public void insert() {
		list= new ArrayList<String>();
		list.add("cat");
		list.add("Dog");
		list.add("Lizard");
	}
	
    @Test(expected = NullPointerException.class)
    public  void testSearch() {
    	
    }

    @Test(expected = NoSuchElementException.class)
    public void testSearch2() {

    }
    @Test
    public void testSearch3() {
    	int idx=search(l,"Lizard");
    	assertEquals(2,idx);
    }
}
