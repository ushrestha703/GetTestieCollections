package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListTest {

    private ArrayList<String> array;

    @org.junit.Before
    public void setUp() throws Exception {
        array = new ArrayList<>();
        array.add("Zip");
        array.add("Code");
        array.add("Wilmington");
    }

    @org.junit.After
    public void tearDown() throws Exception { }

    @org.junit.Test
    public void TestArrayListGetIndex() { Assert.assertEquals("Zip", array.get(0)); }

    @Test
    public void TestArrayListContains1() { Assert.assertEquals(true, array.contains("Wilmington")); }

    @Test
    public void TestArrayListContains2() { Assert.assertEquals(false, array.contains("Zoo")); }

    @Test
    public void TestArrayListSubList() {
        List<String> arrayList2 = array.subList(1, 2);
        Assert.assertEquals(array.get(1), arrayList2.get(0));
    }

    @Test
    public void TestArrayListRemoveO() { Assert.assertEquals(true, array.remove("Wilmington")); }

    @Test
    public void TestArrayListAddAll() {
        ArrayList<String> arrayList2 = new ArrayList<String>();
        arrayList2.add("Welcome to");
        arrayList2.add("Hell");
        Assert.assertEquals(true, array.addAll(arrayList2));
    }

    @Test
    public void TestArrayListReverse() {
        Collections.reverse(array);
        Assert.assertEquals(array.subList(0,3), array);
    }
}
