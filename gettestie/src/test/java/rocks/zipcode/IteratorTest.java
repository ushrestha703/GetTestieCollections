package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.ListIterator;

public class IteratorTest {

    ArrayList<String> list;

    @org.junit.Before
    public void setUp() throws Exception {
        list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
    }

    @org.junit.After
    public void tearDown() throws Exception { }

    @org.junit.Test
    public void TestIteratorContains() { Assert.assertTrue(list.contains("D")); }

    @Test
    public void TestIteratorGet(){ Assert.assertEquals("E",list.get(4)); }

    @Test
    public void TestIteratorHasPrevious() {
        ListIterator iterator = list.listIterator();
        Assert.assertFalse(iterator.hasPrevious());
    }

    @Test
    public void TestIteratorRemove() { Assert.assertTrue(list.remove("C")); }

    @Test
    public void TestIteratorRemove2() { Assert.assertFalse(list.remove("F")); }

}
