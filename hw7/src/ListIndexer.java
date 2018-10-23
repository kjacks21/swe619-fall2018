import java.util.*;

public class ListIndexer<E> implements Indexer<E>{

    private List<?> c;

    public ListIndexer () { c = new ArrayList<E>(); }

    public boolean searchable(Object o) {
		if(o instanceof Collection<?>)
			return true;
		return false;
	}
	
	public int indexOf(Object o, E x) {
        // find element of c
		if(o instanceof List<?>) {
			c =  (List<?>) o;
		}
		int i=0;
		for(i=0;i<sizeOf(c);i++) {
			if(c.get(i).equals(x)) {
				return i;
			}
		}
		return -1;
	}
	
	public int sizeOf(Object o) {
		// determine the size of c
		if(o instanceof List<?>) {
			c =  (List<?>) o;
		}
		return c.size();
	}
}
