package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;
import java.util.HashSet;

public class HashSetTest {

    HashSet<String> set;

    @org.junit.Before
    public void setUp() throws Exception {
        set = new HashSet<String>();
        set.add("Life");
        set.add("Is");
        set.add("Beautiful");
    }

    @org.junit.After
    public void tearDown() throws Exception { }

    @Test
    public void TestHashSetRemove() { Assert.assertTrue(set.remove("Is")); }

    @Test
    public void TestHashSetSize() { Assert.assertEquals(3, set.size()); }

    @Test
    public void TestHashSetEmpty() { Assert.assertFalse(set.isEmpty()); }

    @Test
    public void TestHashSetContains() { Assert.assertTrue(set.contains("Beautiful")); }

    @Test
    public void TestHashSetEquals() {
        HashSet<String> set2 = new HashSet<String>();
        set2.add("Life");
        set2.add("Is");
        set2.add("Beautiful");
        Assert.assertTrue(set.equals(set2));
    }
}
