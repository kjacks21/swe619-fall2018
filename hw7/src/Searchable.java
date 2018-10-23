
public class Searchable<E> {
	public static <E> int search (Indexer<E> c, E x) throws
            NullPointerException, IllegalArgumentException, ClassCastException {
        // EFFECTS: If c is null throws NullPointerException, else if
        // c is not searchable, throws ClassCastException, else
        // if x is in c returns an index where x can be found,
        // else throws NotFoundException
    }
	 
}
