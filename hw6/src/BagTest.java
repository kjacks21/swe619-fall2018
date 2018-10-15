import org.junit.Test;
import static org.junit.Assert.*;
public class BagTest {

	@Test
	public void PropertiesRuleTest(){
		//tests the occurrence of an object in Bag
		//Bag cannot be a subtype of LiskovGenericSet because the set 
		//cannot have any duplicates
		Bag<String> b = new Bag<String>();
		b.insert("cat");
		b.insert("Dog");
		b.insert("cat");
		int count=0;
		for(int i=0;i<b.size();i++) {
			if(b.isIn("cat")) {
				count++;
			}
		}
		assertEquals(2,count);
	}

    @Test
    public void testIsIn(){
        // test isIn() method
        Bag<String> b = new Bag<String>();
        b.insert("cat");
        assertEquals(true, b.isIn("cat"));
    }

    @Test
    public void testIsIn1(){
        // test isIn() method
        Bag<String> b = new Bag<String>();
        b.insert("cat");
        assertEquals(false, b.isIn("dog"));
    }

	@Test
    public void testRemove(){
	    // test remove() method
        Bag<String> b = new Bag<String>();
        b.insert("cat");
        b.insert("dog");
        b.remove("cat");
        assertEquals(false, b.isIn("cat"));
    }

    @Test
    public void testChoose(){
	    // test choose() method
        Bag<String> b = new Bag<String>();
        b.insert("cat");
        b.insert("dog");
        b.insert("bat");
        assertEquals(true, b.isIn(b.choose()));
    }
}
