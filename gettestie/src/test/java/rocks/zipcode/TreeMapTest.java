package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;
import java.util.TreeMap;

public class TreeMapTest {

    TreeMap<String, Integer> test = new TreeMap<>();;

    @org.junit.Before
    public void setUp() throws Exception {
        test.put("A",1);
        test.put("B",2);
        test.put("C",3);
        test.put("D",4);
    }
    @org.junit.After
    public void tearDown() throws Exception { }

    @Test
    public void TestTreeMapSize() { Assert.assertEquals(4, test.size()); }

    @Test
    public void TestTreeMapContainsKey() { Assert.assertTrue(test.containsKey("A")); }

    @Test
    public void TestTreeMapContainsValue() { Assert.assertFalse(test.containsValue(6)); }

    @Test
    public void TestTreeMapFloorKey() { Assert.assertEquals("D",test.floorKey("D")); }

    @Test
    public void TestTreeMapClear() {
        test.clear();
        Assert.assertEquals(true, test.isEmpty());
    }
}
