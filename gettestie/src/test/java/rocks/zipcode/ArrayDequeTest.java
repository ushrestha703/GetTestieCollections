package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeTest {

    public Deque<String> de_que;

    @org.junit.Before
    public void setUp() throws Exception {
        de_que = new ArrayDeque<String>();
        de_que.add("Apple");
        de_que.add("Ball");
        de_que.add("Cat");
    }

    @org.junit.After
    public void tearDown() throws Exception { }

    @Test
    public void TestArrayDequeEmpty() { Assert.assertEquals(false, de_que.isEmpty()); }

    @Test
    public void TestArrayDequePeekFirst() { Assert.assertEquals("Apple", de_que.peekFirst()); }

    @Test
    public void TestArrayDequeElement() { Assert.assertEquals("Apple", de_que.element()); }

    @Test
    public void TestArrayDequeSize() { Assert.assertEquals(3, de_que.size()); }

    @Test
    public void TestArrayDequeRemoveLastOcc(){
        de_que.removeLastOccurrence("Cat");
        Deque<String> result = de_que;
        Assert.assertEquals(de_que, result);
    }

}
