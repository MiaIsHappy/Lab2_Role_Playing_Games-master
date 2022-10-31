package game;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HeadGearTest {

    private HeadGear headGear1;
    private HeadGear headGear2;
    private HeadGear headGear3;

    @Before
    public void setUp() throws Exception {
        headGear1 = new HeadGear("Red", "hats", 10, 0);
        headGear2 = new HeadGear("Blue", "helmets", 10, 0);
        headGear3 = new HeadGear("Yellow", "visors", 10, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIfHandGearValid() {
        HeadGear headGear4 = new HeadGear("Black", "visors", 10, 10);

    }

    @Test
    public void testCombine2Items() {
        HeadGear newHeadGear = (HeadGear) headGear1.combine(headGear2);
        assertEquals(0, newHeadGear.getAttackStrength());
        assertEquals(20, newHeadGear.getDefenseStrength());
        assertEquals("Red,Blue", newHeadGear.getFirstWordOfName());
        assertEquals("helmets", newHeadGear.getSecondWordOfName());
        System.out.println(newHeadGear.getFirstWordOfName());
        System.out.println(newHeadGear.getSecondWordOfName());
        System.out.println(newHeadGear.getDefenseStrength());
        System.out.println(newHeadGear.getAttackStrength());
    }

    @Test
    public void testCombine3Items() {
        HeadGear newHeadGear = (HeadGear) headGear1.combine(headGear2);
        HeadGear newNewHeadGear = (HeadGear) newHeadGear.combine(headGear3);
        assertEquals(0, newNewHeadGear.getAttackStrength());
        assertEquals(30, newNewHeadGear.getDefenseStrength());
        assertEquals("Red,Blue,Yellow", newNewHeadGear.getFirstWordOfName());
        assertEquals("visors", newNewHeadGear.getSecondWordOfName());
        System.out.println(newNewHeadGear.getFirstWordOfName());
        System.out.println(newNewHeadGear.getSecondWordOfName());
        System.out.println(newNewHeadGear.getDefenseStrength());
        System.out.println(newNewHeadGear.getAttackStrength());
    }
}