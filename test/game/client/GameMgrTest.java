package game.client;

import game.AbstractGear;
import game.HeadGear;
import game.Player;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class GameMgrTest {

    private Player player1;
    private Player player2;
    private GameMgr mGameMgr;


    @Before
    public void setUp() throws Exception {
        List<AbstractGear> gears = new ArrayList<>();
        HeadGear headGear1 = new HeadGear("11", "headGear1", 9, 8);
        HeadGear headGear2 = new HeadGear("22", "headGear2", 9, 7);
        HeadGear headGear3 = new HeadGear("33", "headGear3", 7, 10);
        HeadGear headGear4 = new HeadGear("44", "headGear4", 7, 9);
        HeadGear headGear5 = new HeadGear("55", "headGear5", 4, 8);
        HeadGear headGear6 = new HeadGear("66", "headGear6", 1, 7);
        HeadGear headGear7 = new HeadGear("77", "headGear7", 1, 4);
        HeadGear headGear8 = new HeadGear("88", "headGear8", 1, 3);
        HeadGear headGear9 = new HeadGear("99", "headGear9", 1, 2);
        HeadGear headGear10 = new HeadGear("10", "headGear10", 1, 1);

        gears.add(headGear1);
        gears.add(headGear2);
        gears.add(headGear3);
        gears.add(headGear4);
        gears.add(headGear5);
        gears.add(headGear6);
        gears.add(headGear7);
        gears.add(headGear8);
        gears.add(headGear9);
        gears.add(headGear10);

        player1 = new Player("tom", 0, 0);
        player2 = new Player("jerry", 0, 0);
        mGameMgr = new GameMgr(gears, player1, player2);
    }

    @Test
    public void testStartGame() {
        mGameMgr.startGame();
    }

    @Test
    public void testGetPlayer1() {
        boolean res = mGameMgr.getPlayer1().equals(player1);
        assertEquals(true, res);
    }

    @Test
    public void testGetPlayer2() {
        boolean res = mGameMgr.getPlayer2().equals(player2);
        assertEquals(true, res);
    }
}