import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestWaterBottle {
    WaterBottle water;

    @Before
    public void before(){
        water = new WaterBottle();
    }

    @Test
    public void hasVolume100(){
        assertEquals(100, water.getVolume());
    }

    @Test
    public void testAdd10(){
        assertEquals(110, water.add10());
    }

    @Test
    public void testRefill(){
        water.setVolume(0);
        assertEquals(100, water.refill());
    }

    @Test
    public void testEmpty(){
        assertEquals(0, water.empty());
    }



}
