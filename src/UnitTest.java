import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;

/**
 * Created by lolik on 2017-03-31.
 */

public class UnitTest {

    String res;
    @BeforeClass
    public static  void init()
    {

    }

    @Test
    public void testContains()
    {
        Collection_O1 ds = new Collection_O1();
        ds.add(10);//0
        ds.add(20);//1
        ds.add(30);//2
        ds.add(40);
        assertEquals(Integer.valueOf(2), ds.contains(30));

    }

    @Test
    public void testContains2()
    {
        Collection_O1 ds = new Collection_O1();
        ds.add(10);
        ds.add(20);
        ds.add(30);
        ds.add(40);
        ds.remove(20);
        ds.add(50);
        assertEquals(Integer.valueOf(3), ds.contains(50));
    }
    @Test
    public void testRandomAccess()
    {
        Collection_O1 ds = new Collection_O1();
        ds.add(0);
        ds.add(999);
        ds.add(2);
        ds.add(3);
        ds.remove(999);
        ds.add(1);
        int randomIndex = 3;
        assertEquals(1, ds.getRandom(randomIndex));

    }
}
