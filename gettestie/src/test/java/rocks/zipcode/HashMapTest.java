package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class HashMapTest {

    HashMap<String, String> Map;

    @org.junit.Before
    public void setUp() throws Exception {
        Map = new HashMap<>();
        Map.put("A", "Alpha");
        Map.put("B", "Bravo");
        Map.put("C", "Charlie");
    }

    @org.junit.After
    public void tearDown() throws Exception { }

    @org.junit.Test
    public void TestHashMapContainsKey() { Assert.assertTrue( Map.containsKey("C")); }

    @Test
    public void TestHashMapEmpty() { Assert.assertFalse(Map.isEmpty()); }

    @Test
    public void TestHashMapRemove() { Assert.assertTrue(Map.remove("B", "Bravo")); }

    @Test
    public void TestHashMapReplace() { Assert.assertEquals("Charlie", Map.replace("C", "Cat")); }

    @Test
    public void TestHashMapClear() {
        Map.clear();
        Assert.assertEquals(true, Map.isEmpty());
    }
}
