public interface Indexer<E> {
    public boolean searchable (Object o);

   public int indexOf(Object o, E x);
    // find element of c

    public int sizeOf(Object o);
    // determine the size of c
}
