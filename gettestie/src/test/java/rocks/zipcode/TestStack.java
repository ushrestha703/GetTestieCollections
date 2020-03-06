package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Stack;

public class TestStack {
    private Stack<String> stack;

    @org.junit.Before
    public void setUp() throws Exception {
        stack = new Stack<>();
        stack.push("Life");
        stack.push("Is");
        stack.push("Beautiful");
    }

    @org.junit.After
    public void tearDown() throws Exception { }

    @org.junit.Test
    public void TestStack1() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        Assert.assertEquals(false, stack.isEmpty()); // false
    }

    // Make a bigger test exercising more Stack methods.....

    @Test
    public void TestStackPop() {
        stack.pop();
        Assert.assertEquals(false, stack.isEmpty());
    }

    @Test
    public void TestStackPeek() { Assert.assertEquals("Beautiful", stack.peek()); }

    @Test
    public void TestStackEmpty() {
        Stack<String> stack = new Stack<>();
        Assert.assertEquals(true, stack.isEmpty());
    }

    @Test
    public void TestStackSearch() {
        stack.push("Love");
        stack.push("Enjoy");
        Assert.assertEquals(2, stack.search("Love"));
    }

}
