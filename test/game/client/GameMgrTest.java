package game.client;

import game.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class GameMgrTest {

    private Player player1;
    private Player player2;
    private GameMgr mGameMgr;
    private List<AbstractGear> gearsList1;
    private List<AbstractGear> gearsList2;

    @Before
    public void setUp() throws Exception {
        player1 = new Player("tom", 0, 0);
        player2 = new Player("jerry", 0, 0);

    }

    private void initGearList1() {
        gearsList1 = new ArrayList<>();
        HeadGear headGear1 = new HeadGear("11", "headGear1", 9, 0);
        HeadGear headGear2 = new HeadGear("22", "headGear2", 9, 0);
        HeadGear headGear3 = new HeadGear("33", "headGear3", 7, 0);
        HeadGear headGear4 = new HeadGear("44", "headGear4", 7, 0);
        HeadGear headGear5 = new HeadGear("55", "headGear5", 4, 0);
        HeadGear headGear6 = new HeadGear("66", "headGear6", 1, 0);
        HeadGear headGear7 = new HeadGear("77", "headGear7", 1, 0);
        HeadGear headGear8 = new HeadGear("88", "headGear8", 1, 0);
        HeadGear headGear9 = new HeadGear("99", "headGear9", 1, 0);
        HeadGear headGear10 = new HeadGear("10", "headGear10", 1, 0);

        gearsList1.add(headGear1);
        gearsList1.add(headGear2);
        gearsList1.add(headGear3);
        gearsList1.add(headGear4);
        gearsList1.add(headGear5);
        gearsList1.add(headGear6);
        gearsList1.add(headGear7);
        gearsList1.add(headGear8);
        gearsList1.add(headGear9);
        gearsList1.add(headGear10);
    }

    private void initGearList2() {
        gearsList2 = new ArrayList<>();
        HeadGear headGear1 = new HeadGear("11", "headGear1", 9, 0);
        HeadGear headGear2 = new HeadGear("22", "headGear2", 9, 0);

        HandGear handGear1 = new HandGear("33", "handGear1", 0, 10);
        HandGear handGear2 = new HandGear("44", "handGear2", 0, 3);
        HandGear handGear3 = new HandGear("55", "handGear3", 0, 5);
        HandGear handGear4 = new HandGear("66", "handGear4", 0, 5);

        Footwear footwear1 = new Footwear("77", "footwear1", 10, 9);
        Footwear footwear2 = new Footwear("88", "footwear2", 10, 8);
        Footwear footwear3 = new Footwear("99", "footwear3", 9, 9);
        Footwear footwear4 = new Footwear("10", "footwear4", 8, 10);

        gearsList2.add(headGear1);
        gearsList2.add(headGear2);
        gearsList2.add(handGear1);
        gearsList2.add(handGear2);
        gearsList2.add(handGear3);
        gearsList2.add(handGear4);
        gearsList2.add(footwear1);
        gearsList2.add(footwear2);
        gearsList2.add(footwear3);
        gearsList2.add(footwear4);

    }
    @Test
    public void testStartGame1() {
        initGearList1();
        mGameMgr = new GameMgr(gearsList1, player1, player2);
        int res = mGameMgr.startGame();
        assertEquals(1, res);
    }

    @Test
    public void testStartGame2() {
        initGearList2();
        mGameMgr = new GameMgr(gearsList2, player1, player2);
        int res = mGameMgr.startGame();
        assertEquals(1, res);
    }

    @Test
    public void testGetPlayer1() {
        initGearList1();
        mGameMgr = new GameMgr(gearsList1, player1, player2);
        boolean res = mGameMgr.getPlayer1().equals(player1);
        assertEquals(true, res);
    }

    @Test
    public void testGetPlayer2() {
        initGearList1();
        mGameMgr = new GameMgr(gearsList1, player1, player2);
        boolean res = mGameMgr.getPlayer2().equals(player2);
        assertEquals(true, res);
    }
}