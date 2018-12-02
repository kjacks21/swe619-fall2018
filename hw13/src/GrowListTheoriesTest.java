import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.Assume.assumeFalse;
import static org.junit.Assume.assumeNotNull;
import static org.junit.Assume.assumeTrue;

import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;


import java.util.Iterator;
import java.util.NoSuchElementException;

import org.junit.rules.ExpectedException;
import org.junit.Rule;

@RunWith(Theories.class)
public class GrowListTheoriesTest<E> {

    @DataPoint
    public static Iterator<String> g() {
        GrowList<String> g = new GrowList<String>();
        g.add("dog");
        g.add("cat");
        Iterator<String> iter = g.values();
        return iter;
    }

//    @Rule
//    public ExpectedException thrown = ExpectedException.none();

    @Theory
    public void iterHasNext(Iterator iter) {
        assumeNotNull(iter);
        assumeTrue(iter.hasNext());

        iter.next();
    }

//    @Theory
//    public void throwExceptionForNoNextElement(Iterator iter, String value) throws Exception {
//        assumeTrue(iter.hasNext());
//
//        thrown.expect(NoSuchElementException.class);
//        //perform actions
//    }

//    @Test(expected = UnsupportedOperationException.class)
//    public void testRemove() {
//        g.add(1);
//        g.add(2);
//        g.add(3);
//
//        Iterator<String> iter = g.values();
//        iter.next();
//        iter.remove();
//    }

//    @Test public void testHasNext() {
//        g.add(1);
//        g.add(2);
//        g.add(3);
//        Iterator<String> iter = g.values();
//        iter.next();
//        assertEquals(true, iter.hasNext());
//        iter.next();
//        iter.next();
//        assertEquals(false, iter.hasNext());
//
//    }

//    @Test(expected = NoSuchElementException.class)
//    public void testNext() {
//        Iterator<String> iter = g.values();
//        iter.next();
//    }
}