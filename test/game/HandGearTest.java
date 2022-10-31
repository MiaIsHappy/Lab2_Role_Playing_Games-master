package game;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HandGearTest {

    private HandGear handGear1;
    private HandGear handGear2;
    private HandGear handGear3;

    @Before
    public void setUp() throws Exception {
        handGear1 = new HandGear("Red", "Gloves", 0, 10);
        handGear2 = new HandGear("Blue", "Swords", 0, 10);
        handGear3 = new HandGear("Yellow", "Shield", 0, 10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIfHandGearValid() {
        HandGear handGear4 = new HandGear("Black", "Shield", 10, 10);
    }

    @Test
    public void testCombine2Items() {
        HandGear newHandGear = (HandGear) handGear1.combine(handGear2);
        assertEquals(20, newHandGear.getAttackStrength());
        assertEquals(0, newHandGear.getDefenseStrength());
        assertEquals("Red,Blue", newHandGear.getFirstWordOfName());
        assertEquals("Swords", newHandGear.getSecondWordOfName());
        System.out.println(newHandGear.getFirstWordOfName());
        System.out.println(newHandGear.getSecondWordOfName());
        System.out.println(newHandGear.getDefenseStrength());
        System.out.println(newHandGear.getAttackStrength());
    }

    @Test
    public void testCombine3Items() {
        HandGear newHandGear = (HandGear) handGear1.combine(handGear2);
        HandGear newNewHandGear = (HandGear) newHandGear.combine(handGear3);
        assertEquals(30, newNewHandGear.getAttackStrength());
        assertEquals(0, newNewHandGear.getDefenseStrength());
        assertEquals("Red,Blue,Yellow", newNewHandGear.getFirstWordOfName());
        assertEquals("Shield", newNewHandGear.getSecondWordOfName());
        System.out.println(newNewHandGear.getFirstWordOfName());
        System.out.println(newNewHandGear.getSecondWordOfName());
        System.out.println(newNewHandGear.getDefenseStrength());
        System.out.println(newNewHandGear.getAttackStrength());
    }
}