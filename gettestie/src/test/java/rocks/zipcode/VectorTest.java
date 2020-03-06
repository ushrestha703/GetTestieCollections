package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;
import java.util.Vector;

public class VectorTest {
    private Vector v;
    private Vector v_clone;

    @org.junit.Before
    public void setUp() throws Exception {
        v = new Vector();
        v_clone = new Vector();
    }

    @org.junit.After
    public void tearDown() throws Exception { }

    @org.junit.Test
    public void TestVectorAdd() {
       v.add("Hydrogen");
        Assert.assertTrue(v.contains("Hydrogen"));
    }

    @Test
    public void TestVectorClear() {
        v.clear();
        Assert.assertTrue(v.isEmpty());
    }

    @Test
    public void TestVectorClone(){
        v_clone = (Vector)v.clone();
        Assert.assertEquals(true, v.equals(v_clone));
    }

    @Test
    public void TestVectorGet(){
        Vector v = new Vector();
        v.add("Hydrogen");
        v.add("Helium");
        v.add("Lithium");
        v.add("Beryllium");
        v.add("Boron");
        Assert.assertEquals("Beryllium", v.get(3));
    }
    @Test
    public void TestVectorLastIndex(){
        Vector v = new Vector();
        v.add("Hydrogen");
        v.add("Helium");
        v.add("Lithium");
        v.add("Beryllium");
        v.add("Boron");
        Assert.assertEquals(1, v.lastIndexOf("Helium"));
    }

}
