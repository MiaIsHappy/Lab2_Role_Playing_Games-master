package game;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FootwearTest {

    private Footwear footwear1;
    private Footwear footwear2;
    private Footwear footwear3;

    @Before
    public void setUp() throws Exception {
        footwear1 = new Footwear("Red", "boots", 10, 10);
        footwear2 = new Footwear("Blue", "sneakers", 10, 10);
        footwear3 = new Footwear("Yellow", "hoverboard", 10, 10);
    }

    @Test
    public void testCombine2Items() {
        Footwear newFootwear = (Footwear) footwear1.combine(footwear2);
        assertEquals(20, newFootwear.getAttackStrength());
        assertEquals(20, newFootwear.getDefenseStrength());
        assertEquals("Red,Blue", newFootwear.getFirstWordOfName());
        assertEquals("sneakers", newFootwear.getSecondWordOfName());
        System.out.println(newFootwear.getFirstWordOfName());
        System.out.println(newFootwear.getSecondWordOfName());
        System.out.println(newFootwear.getDefenseStrength());
        System.out.println(newFootwear.getAttackStrength());
    }

    @Test
    public void testCombine3Items() {
        Footwear newFootwear = (Footwear) footwear1.combine(footwear2);
        Footwear newNewFootwear = (Footwear) newFootwear.combine(footwear3);
        assertEquals(30, newNewFootwear.getAttackStrength());
        assertEquals(30, newNewFootwear.getDefenseStrength());
        assertEquals("Red,Blue,Yellow", newNewFootwear.getFirstWordOfName());
        assertEquals("hoverboard", newNewFootwear.getSecondWordOfName());
        System.out.println(newNewFootwear.getFirstWordOfName());
        System.out.println(newNewFootwear.getSecondWordOfName());
        System.out.println(newNewFootwear.getDefenseStrength());
        System.out.println(newNewFootwear.getAttackStrength());
    }
}