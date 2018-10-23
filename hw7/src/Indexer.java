public interface Indexer {
//    public Object searchable ();
//    // not sure if necessary

    public static <E> int search (Indexer<E> c, E x) throws
            NullPointerException, IllegalArgumentException, ClassCastException {
        // TODO implement
        return 0;
    }

    public <E> findElementInC (E x) throws NullPointerException;
    // find element of c

    public <E> sizeOfC (E x) throws NullPointerException;
    // determine the size of c
}
