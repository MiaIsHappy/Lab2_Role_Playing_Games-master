package game.client;

import game.AbstractGear;
import game.Footwear;
import game.HandGear;
import game.HeadGear;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class GearListTest {

    private List<AbstractGear> gears;
    private GearList mGearList;

    @Before
    public void setUp() throws Exception {
        gears = new ArrayList<>();
        HeadGear headGear1 = new HeadGear("11", "headGear1", 9, 8);
        HeadGear headGear2 = new HeadGear("22", "headGear2", 9, 7);
        Footwear footWear1 = new Footwear("Handsome", "Boots", 10, 10);
        Footwear footWear2 = new Footwear("Happy", "Sandals", 15, 15);
        HandGear handGear1 = new HandGear("Red", "Gloves", 10, 0);
        HandGear handGear2 = new HandGear("Quick", "Swords", 10, 0);

        gears.add(headGear1);
        gears.add(headGear2);
        gears.add(footWear1);
        gears.add(footWear2);
        gears.add(handGear1);
        gears.add(handGear2);

        mGearList = new GearList(gears);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIfGearsValid() {
        mGearList = new GearList(null);
    }

    @Test
    public void testGetHeadWear() {
        List<AbstractGear> headWears = mGearList.getHeadWear();
        assertEquals(2, headWears.size());
    }

    @Test
    public void testGetHandWear() {
        List<AbstractGear> handWears = mGearList.getHandWear();
        assertEquals(2, handWears.size());
    }

    @Test
    public void testGetFootWear() {
        List<AbstractGear> footWears = mGearList.getFootWear();
        assertEquals(2, footWears.size());
    }

    @Test
    public void testRemove() {
        mGearList.remove(gears.get(0));
        assertEquals(5, mGearList.items.size());
    }


}