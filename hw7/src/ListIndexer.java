import java.util.*;

public class ListIndexer implements Indexer {

    private List<E> c;

    public ListIndexer () { c = new ArrayList<E>(); }

   /* public static <E> int search (Indexer<E> c, E x) throws
            NullPointerException, IllegalArgumentException, ClassCastException {
        // EFFECTS: If c is null throws NullPointerException, else if
        // c is not searchable, throws ClassCastException, else
        // if x is in c returns an index where x can be found,
        // else throws NotFoundException
    }*/

    public Object findElementInC (Object x) {
        // find element of c
        return null;
    }

    public Object sizeOfC (Object x) {
        // determine the size of c
        return null;
    }
}
