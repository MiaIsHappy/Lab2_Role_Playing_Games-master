package game;

import static org.junit.Assert.*;

public class PlayerTest {

    @org.junit.Before
    public void setUp() throws Exception {
        Player playerA = new Player("Tom", 100, 100);
        AbstractGear headGear1 = new HeadGear("Good", "Hat", 10, 0);
        AbstractGear headGear2 = new HeadGear("Great", "Hat", 10, 0);
        AbstractGear footWear1 = new Footwear("Handsome", "Boots", 10, 10);
        AbstractGear footWear2 = new HeadGear("Scurrying", "HoverBoard", 5, 5);
        AbstractGear footWear3 = new HeadGear("Happy", "Sandals", 15, 15);
        AbstractGear handGear1 = new HandGear("Red", "Gloves", 10, 0);
        AbstractGear handGear2 = new HandGear("Quick", "Swords", 10, 0);


//        playerA.pickUp(headGear1);
//        playerA.pickUp(headGear2);
//        playerA.pickUp(footWear1);
//        playerA.pickUp(footWear2);
//        playerA.pickUp(footWear3);
//        playerA.pickUp(handGear1);
//        playerA.pickUp(handGear2);
    }

    @org.junit.Test
    public void testPickUp() {
    }

    @org.junit.Test
    public void testGetName() {
    }

    @org.junit.Test
    public void testGetAttack() {
    }

    @org.junit.Test
    public void testGetDefense() {
    }

    @org.junit.Test
    public void testGetTotalAttack() {
    }

    @org.junit.Test
    public void testGetTotalDefense() {
    }

    @org.junit.Test
    public void testGetHeadGear() {
    }

    @org.junit.Test
    public void testGetHandGear() {
    }

    @org.junit.Test
    public void testGetFootwear() {
    }

    @org.junit.Test
    public void testSetName() {
    }

    @org.junit.Test
    public void testToString() {
    }
}