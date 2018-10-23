public interface Indexer<E> {
    public boolean searchable (Object o);
//    // not sure if necessary

    /*public static <E> int search (Indexer<E> c, E x) throws
            NullPointerException, IllegalArgumentException, ClassCastException {
        // TODO implement
        return 0;
    }*/
   public int indexOf(Object o, E x); //throws NullPointerException;
    // find element of c

    public int sizeOf(Object o); //throws NullPointerException;
    // determine the size of c
}
