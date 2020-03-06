package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;

public class PriorityQueueTest {

    LinkedList<String> list;

    @org.junit.Before
    public void setUp() throws Exception {
        list = new LinkedList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
    }

    @org.junit.After
    public void tearDown() throws Exception { }

    @Test
    public void TestPriorityQueueOffer(){ Assert.assertTrue(list.offer("F")); }

    @Test
    public void TestPriorityQueuePeek() { Assert.assertEquals("A",list.peek()); }

    @Test
    public void TestPriorityQueueContains() { Assert.assertTrue(list.contains("B")); }

    @Test
    public void TestPriorityQueueSize() { Assert.assertEquals(5,list.size()); }

    @Test
    public void TestPriorityQueuePollLast() { Assert.assertEquals("E",list.pollLast()); }

}
