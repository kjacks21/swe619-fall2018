import java.awt.List;
import static org.junit.Assert.*;

import org.junit.Test;

public class GrowListTest {
    GrowList<String> g = new GrowList<String>();

    // Testing repOk()
    //
    @Test public void testRepOk() {
         assertEquals(g.repOK(), false);
     }

    // Testing the method contract
     @Test(expected = IndexOutOfBoundsException.class)
     public void testIndexOutOfBounds() {
         g.add("apple");
         g.add("Peach");
         g.set(4, "banana");
     }
}
