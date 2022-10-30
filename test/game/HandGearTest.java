package game;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HandGearTest {

    @Before
    public void setUp() throws Exception {
        HandGear handGear1 = new HandGear("Red", "Gloves", 10, 0);
        HandGear handGear2 = new HandGear("Red", "Gloves", 10, 0);
        HandGear handGear3 = new HandGear("Red", "Gloves", 10, 0);
        HandGear handGear4 = new HandGear("Red", "Gloves", 10, 0);
    }

    @Test
    public void testCombine() {

    }
}