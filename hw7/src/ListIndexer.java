import java.util.*;

public class ListIndexer implements Indexer {

    private List<E> c;

    public ListIndexer () { c = new ArrayList<E>(); }

	public boolean searchable (Object c){
		if(c instanceof Collection<?>)
			return true;
		return false;
	}

   public int indexOf(Collection<E> collection, E x){ //throws NullPointerException;
    // find element of c
	c = (List<E>) o;
		int i=0;
		for(i=0;i<size(c);i++) {
			if(list.get(i).equals(x)) {
				return i;
			}
		}
		return -1;
		}
   }
	//public int sizeOf(Collection<E> collection)
    public int sizeOf(Object o){ //throws NullPointerException;
    // determine the size of c
		c = (List<E>) o;
		// TODO Auto-generated method stub
		return list.size();
	}
}
