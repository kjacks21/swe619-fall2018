import java.util.*;

public class BoundedQueue <E> {
    // rep-invariant
    // rep is not null
    // size > 0

    protected List<E> rep;
    protected int size;  // max size of queue

    public BoundedQueue(int size) {
        if (size > 0) {
            this.size = size;
            rep = new ArrayList<>(size);
        }
    }

    public boolean isEmpty() {
        return (rep.isEmpty());
    }

    public boolean isFull() {
        return (rep.size() == size);
    }

    public int getCount() {
        return rep.size();
    }

    public void put(E e) {
        if (e != null && !isFull()) {
            rep.add(e);
        }
    }

    public E get() {
        E result = null;
        if (!isEmpty()) {
            result = rep.get(0);
            rep.remove(0);
        }
        return result;
    }

    public boolean repOK() {
        if ( rep == null ) {
            return false;
        } else if ( size < 1 ) {
            return false;
        }
        return true;
    }

    public void putAll(Iterable<? extends E> list) {
        if (!isFull()) {
            for (E e : list) {
                put(e);
            }
        }
    }

    public void getAll(Collection<? super E> list) {
        while(!isEmpty())
            list.add(get());
    }

    public static void main(String args[]) {
        BoundedQueue queue = new BoundedQueue(10);
        for (int i = 0; !queue.isFull(); i++) {
            queue.put(i);
            System.out.println("put: " + i);
        }
        while (!queue.isEmpty()) {
            System.out.println("get: " + queue.get());
        }
    }
}