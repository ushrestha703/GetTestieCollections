package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetTest {

    TreeSet<String> test;

    @org.junit.Before
    public void setUp() throws Exception {
        test = new TreeSet<String>();
        test.add("A");
        test.add("B");
        test.add("C");
    }

    @org.junit.After
    public void tearDown() throws Exception { }

    @Test
    public void TestTreeSetEmpty() { Assert.assertFalse(test.isEmpty()); }

    @Test
    public void TestTreeSetSize() { Assert.assertEquals(3,test.size()); }

    @Test
    public void TestTreeSetDescendingSet() {
        NavigableSet<String> treeReverse = test.descendingSet();
        Assert.assertEquals(test, treeReverse);
    }

    @Test
    public void TestTreeSetLast() {
        Assert.assertEquals("C",test.last());
    }

    @Test
    public void TestTreeSetPollFirst() {
        Assert.assertEquals("A",test.pollFirst());
    }

}
