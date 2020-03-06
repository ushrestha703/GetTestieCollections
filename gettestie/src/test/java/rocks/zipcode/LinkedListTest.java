package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;
import java.util.LinkedList;

public class LinkedListTest {

    LinkedList<String> list;

    @org.junit.Before
    public void setUp() throws Exception {
        list = new LinkedList<String>();
        list.add("X-ray");
        list.add("Yankee");
        list.add("Zulu");
    }

    @org.junit.After
    public void tearDown() throws Exception { }

    @Test
    public void TestLinkedListGetLast() { Assert.assertEquals("Zulu", list.getLast()); }

    @Test
    public void TestLinkedListContains() { Assert.assertTrue(list.contains("X-ray")); }

    @Test
    public void TestLinkedListSet() { Assert.assertEquals("Zulu", list.set(2,"Alpha")); }

    @Test
    public void TestLinkedListPeek() { Assert.assertEquals("X-ray",list.peek()); }

    @Test
    public void TestLinkedListPoll() { Assert.assertEquals("X-ray",list.poll()); }
}
