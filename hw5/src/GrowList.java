import java.util.*;
//  GrowList is a mutable list that only gets longer.
public class GrowList<E>{

    private Map<Integer,E> values;

    public Iterator values () {return new GrowListGen(this);}

    public GrowList() { values = new HashMap<Integer,E>();}

    // inner class
    private static class GrowListGen<E> implements Iterator {

    	private GrowList<E> growList;  // the GrowList being iterated
        private int n;  // next term to consider
        private E prev;  // current term to consider
    	
    	GrowListGen(GrowList<E> gl){
    		growList = gl;
    		n = 0;
    	}
    	
        public boolean hasNext() {
            // EFFECTS: Returns true if there are more elements to yield
            //     else returns false
            return n < growList.size();
        }

        public E next () throws NoSuchElementException {
            // MODIFIES: this
            // EFFECTS: If there are more results to yield, returns the next result
            //    and modifies the state of this to record the yield.
            //    Otherwise, throws NoSuchElementException
            if (growList.size() == 0 || growList.size() == n) {
                throw new NoSuchElementException("GrowList.values");
            }
            prev = growList.get(n);
            n = n + 1;
            return prev;
        }
		
		 public void remove() {
        	throw new UnsupportedOperationException("remove not supported in GrowList");
        }
		
    }

    // add to the end of the list
    public void add(E o) {
        values.put(size(), o);
    }

    // number of values in list
    public int size() {
        return values.size();
    }

    // get ith value in list
    public E get(int i) {
        if (!inRange(i)) throw new IndexOutOfBoundsException("GrowList.get");
        return values.get(i);
    }

    // update ith value in list;  return previous value or null if none
    public E set(int i, E o) {
        if (!inRange(i)) throw new IndexOutOfBoundsException("GrowList.set");
        return values.put(i, o);
    }

    // private helper method
    private boolean inRange(int i) {
        return (i >= 0) && (i < size());
    }

    public String toString() {
        if (size() == 0) return "[]";
        String result = "[";
        for (int i = 0; i < size() - 1; i++) {
            result += values.get(i) + ",";
        }
        return result + values.get(size() - 1) + "]";
    }

    public static void main(String[] args) {
        GrowList<String> list = new GrowList<String>();

        System.out.println("list is:" + list);
        list.add("cat");
        System.out.println("list is:" + list);
        list.add("dog");
        System.out.println("list is:" + list);
        list.set(1,"bat");
        System.out.println("list is:" + list);

    }
    
}