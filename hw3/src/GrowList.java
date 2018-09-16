import java.util.*;
//  GrowList is a mutable list that only gets longer.
public class GrowList <E> {

    private Map<Integer,E> values;
    private Map<Integer,E> new_values;

    // constructors
    public GrowList() { values = new HashMap<Integer,E>();}

    private GrowList(Map old_map) {
        values = new HashMap<Integer,E>();
        values.putAll(old_map);
    }



    // add to the end of the list
    public GrowList add(E o) {
        GrowList<E> result = new GrowList<E>(values);
        result.values.put(size(), o);
        return result;
    }

    // number of values in list
    public int size() { return values.size(); }

    // get ith value in list
    public E get(int i) {
        if (! inRange(i)) throw new IndexOutOfBoundsException("GrowList.get");
        return values.get(i);
    }

    // update ith value in list;  return previous value or null if none
    public E set(int i, E o) {
        if (! inRange(i)) throw new IndexOutOfBoundsException("GrowList.set");
         // observer
         E previous = get(i);
         // producer
         values = setNewMap(i, o);
         return previous;

    }

    // private helper method
    private Map<Integer, E> setNewMap(int i, E o) {
        // producer
        GrowList<E> result = new GrowList<E>();
        for (Integer j = 0; j < size(); j++) {
            if (j == i) {
                result.add(o);
            } else {
                result.add(values.get(j));
            }
        }
        return result.values;
    }

    // private helper method
    private boolean inRange(int i) { return (i >= 0) && (i < size()); }

    public String toString() {
        if (size() == 0) return "[]";
        String result = "[";
        for (int i = 0; i < size()-1; i++) {
            result += values.get(i) + ",";
        }
        return result + values.get(size() - 1) + "]";
    }

    public static void main(String[] args) {
        GrowList<String> list = new GrowList<String>();

        System.out.println("list is:" + list);
        list = list.add("cat");
        System.out.println("list is:" + list);
        list = list.add("dog");
        System.out.println("list is:" + list);
        list.set(1,"bat");
        System.out.println("list is:" + list);
        list.set(0, "snake");
        System.out.println("list is:" + list);
        list.add("frog");
        System.out.println("list is:" + list);
        list.set(2, "black widow");
        System.out.println("list is:" + list);

    }
}
