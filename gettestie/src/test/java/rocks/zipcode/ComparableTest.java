package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

public class ComparableTest {

    @org.junit.Before
    public void setUp() throws Exception { }

    @org.junit.After
    public void tearDown() throws Exception { }

    @Test
    public void TestComparable() {
        String s1 = "Zoomba";
        String s2 = "Zoo";
        Assert.assertEquals(3, s1.compareTo(s2));
    }
}
