import java.util.*;

// See Liskov exercise 7.11
// This version is generified
public class Bag<E> {

    // rep: map each object to the count of that object in this
    // rep-inv:  range of map contains only positive integers
    // Example:  A bag of 2 cats and a dog is map = { cat=2, dog=1 }

    private Map<E, Integer> map;

    public Bag() {
        map = new HashMap<E, Integer>();
    }

    // add 1 occurrence of e to this
    public void insert(E e) {...}

    // remove 1 occurrence of e from this
    public void remove(E e) {...}

    // return true iff e is in this
    public boolean isIn(E e) {...}

    // return cardinality of this
    public int size() {...}

    // if this is empty throw ISE
    // else return arbitrary element of this
    public E choose() {...}

    // conveniently, the <E,Integer> map is exactly the abstract state
    public String toString() { return map.toString(); }

}
