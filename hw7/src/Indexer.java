public interface Indexer {
    public boolean searchable (Object c);
//    // not sure if necessary

    /*public static <E> int search (Indexer<E> c, E x) throws
            NullPointerException, IllegalArgumentException, ClassCastException {
        // TODO implement
        return 0;
    }*/
	// instead maybe public int indexOf(Collection<E> collection)
   public int indexOf(Collection<E> collection, E x) //throws NullPointerException;
    // find element of c

	//public int sizeOf(Collection<E> collection)
    public int sizeOf(Collection<E> collection) //throws NullPointerException;
    // determine the size of c
}