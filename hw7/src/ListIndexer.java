import java.util.*;

public class ListIndexer<E> implements Indexer<E>{

    private List<?> c;

    public ListIndexer () { c = new ArrayList<E>(); }

   /* public static <E> int search (Indexer<E> c, E x) throws
            NullPointerException, IllegalArgumentException, ClassCastException {
        // EFFECTS: If c is null throws NullPointerException, else if
        // c is not searchable, throws ClassCastException, else
        // if x is in c returns an index where x can be found,
        // else throws NotFoundException
    }*/
    public  boolean searchable(Object o) {
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
