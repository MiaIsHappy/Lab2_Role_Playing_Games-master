package game;

import game.client.GearList;
import org.junit.Before;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class PlayerTest {
    private Player playerA;
    private AbstractGear headGear1;
    private AbstractGear headGear2;
    private AbstractGear footWear1;
    private AbstractGear footWear2;
    private AbstractGear handGear1;
    private AbstractGear handGear2;

    private List<AbstractGear> gears;
    private GearList mGearList;

    @Before
    public void setUp() throws Exception {
        playerA = new Player("Tom", 100, 100);
        gears = new ArrayList<>();
        headGear1 = new HeadGear("Good", "Hat", 10, 0);
        headGear2 = new HeadGear("Great", "Hat", 10, 0);
        footWear1 = new Footwear("Handsome", "Boots", 10, 10);
        footWear2 = new Footwear("Scurrying", "HoverBoard", 10, 0);
        handGear1 = new HandGear("Red", "Gloves", 0, 10);
        handGear2 = new HandGear("Quick", "Swords", 0, 10);

        gears.add(headGear1);
        gears.add(headGear2);
        gears.add(footWear1);
        gears.add(footWear2);
        gears.add(handGear1);
        gears.add(handGear2);
        mGearList = new GearList(gears);


        playerA.pickUp(mGearList);
        playerA.pickUp(mGearList);
        playerA.pickUp(mGearList);
        playerA.pickUp(mGearList);
        playerA.pickUp(mGearList);
        playerA.pickUp(mGearList);
    }

    @org.junit.Test
    public void testPickUp() {
        testGetTotalAttack();
        testGetTotalDefense();
        testGetHandGear();
        testGetHeadGear();
        testGetFootwear();
    }

    @org.junit.Test
    public void testGetName() {
        assertEquals("Tom", playerA.getName());
    }

    @org.junit.Test
    public void testGetAttack() {
        assertEquals(100, playerA.getAttack());
    }

    @org.junit.Test
    public void testGetDefense() {
        assertEquals(100, playerA.getDefense());
    }

    @org.junit.Test
    public void testGetTotalAttack() {
        System.out.println(playerA.getTotalAttack());
        assertEquals(130, playerA.getTotalAttack());
    }

    @org.junit.Test
    public void testGetTotalDefense() {
        System.out.println(playerA.getTotalDefense());
        assertEquals(140, playerA.getTotalDefense());
    }

    @org.junit.Test
    public void testGetHeadGear() {
        HeadGear headGear = playerA.getHeadGear();
        assertEquals(0, headGear.getAttackStrength());
        assertEquals(20, headGear.getDefenseStrength());
        assertEquals("Good,Great", headGear.getFirstWordOfName());
        assertEquals("Hat", headGear.getSecondWordOfName());
        System.out.println(headGear.getFirstWordOfName());
        System.out.println(headGear.getSecondWordOfName());
        System.out.println(headGear.getDefenseStrength());
        System.out.println(headGear.getAttackStrength());

    }

    @org.junit.Test
    public void testGetHandGear() {
        List<HandGear> handGears = playerA.getHandGear();
        assertEquals(2, handGears.size());
    }

    @org.junit.Test
    public void testGetFootwear() {
        List<Footwear> footwears = playerA.getFootwear();
        assertEquals(2, footwears.size());
    }

}