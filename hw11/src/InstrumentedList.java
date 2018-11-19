import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


public class InstrumentedList<E> extends ForwardingList<E>{
    private int addCount = 0;

    public InstrumentedList(List<E> l){ super(l); }

    @Override public boolean add(E e){
        addCount++;
        return super.add(e);
    }

    @Override public void add(int index, E e){
        addCount++;
        super.add(index, e);
    }

    @Override public boolean addAll(Collection<? extends E> c) {
        addCount += c.size();
        return super.addAll(c);
    }

    public int getAddCount(){ return addCount; }
}

class ForwardingList<E> implements List<E> {
    private final List<E> l;

    public ForwardingList(List<E> l)  { this.l = l; }
    public boolean add(E e)           { return l.add(e); }
    public void add(int index, E e)   { l.add(index, e); }
    public boolean addAll(Collection<? extends E> c)            { return l.addAll(c); }
    public boolean addAll(int index, Collection<? extends E> c) { return l.addAll(index, c); }
    public void clear()               { l.clear(); }
    public boolean contains(Object o) { return l.contains(o); }
    public boolean containsAll(Collection<?> c)                 { return l.containsAll(c); }
    public boolean equals(Object o)   { return l.equals(o); }
    public E get(int index)           { return l.get(index); }
    public int hashCode()             { return l.hashCode(); }
    public int indexOf(Object o)      { return l.indexOf(o); }
    public boolean isEmpty()          { return l.isEmpty(); }
    public Iterator<E> iterator()     { return l.iterator(); }
    public int lastIndexOf(Object o)  { return l.lastIndexOf(o); }
    public ListIterator<E> listIterator()                       { return l.listIterator(); }
    public ListIterator<E> listIterator(int index)              { return l.listIterator(index); }
    public E remove(int index)        { return l.remove(index); }
    public boolean remove(Object o)   { return l.remove(o); }
    public boolean removeAll(Collection<?> c)                   { return l.removeAll(c); }
    public boolean retainAll(Collection<?> c)                   { return l.retainAll(c); }
    public E set(int index, E element)                          { return l.set(index, element); }
    public int size()                 { return l.size(); }
    public List<E> subList(int fromIndex, int toIndex)          { return l.subList(fromIndex, toIndex); }
    public Object[] toArray()         { return l.toArray(); }
    public <T> T[] toArray(T[] a)     { return l.toArray(a); }
    public String  toString()         { return l.toString(); }

}
