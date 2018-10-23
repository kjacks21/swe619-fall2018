import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ListIndexerTest<E> {
    ListIndexer<Integer> l = new ListIndexer<Integer>();

    @Test(expected = NullPointerException.class)
    public void testSearch() {

    }

    @Test(expected = NoSuchElementException.class)
    public void testSearch2() {

    }
}

