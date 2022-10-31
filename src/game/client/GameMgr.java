package game.client;

import game.*;

import java.util.List;

/**
 * Class for game
 */
public class GameMgr {
    GearList mGearList; // a list of gear items
    Player player1;
    Player player2;

    /**
     * Constructor throw exception if invalid input
     * @param items
     * @param player1
     * @param player2
     */
    public GameMgr(List<AbstractGear> items, Player player1, Player player2) {
        if (items == null || items.size() != 10 || player1 == null || player2 == null ) {
            throw new IllegalArgumentException();
        }
        this.mGearList = new GearList(items);
        this.player1 = player1;
        this.player2 = player2;
    }

    /**
     * two players take turns to choose gear;
     * return result based on damage
     * @return
     *      1  - play1 wins;
     *      2  - play2 wins;
     *      0  - tie;
     */
    public int startGame() {
        int damageP1 = 0, damageP2 = 0;
        //The two players take turns to dress themselves
        for (int i = 0; i < 5; i++) {
            //Each turn, the player can only choose one item
            this.player1.pickUp(mGearList);
            this.player2.pickUp(mGearList);
            System.out.println("================" + "Round " + (i + 1) + "================");
            //Print out each character what they are wearing and their attack and defense strength
            System.out.println(player1);
            System.out.println(player2);
            //Calculate the damage after each turn
            damageP1 = player2.getTotalAttack() - player1.getTotalDefense();
            damageP2 = player1.getTotalAttack() - player2.getTotalDefense();
        }
        System.out.println("================" + " Results " + "================");
        System.out.println("player1 total damage: " + damageP1);
        System.out.println("player2 total damage: " + damageP2);
        if (damageP1 < damageP2) {
            System.out.println("Player1 wins");
            return 1;
        } else if (damageP1 > damageP2) {
            System.out.println("Player2 wins");
            return 2;
        } else {
            System.out.println("A tie");
            return 0;
        }
    }

    /**
     * Getter method
     * @return
     */
    public Player getPlayer1() {
        return player1;
    }
    /**
     * Getter method
     * @return
     */
    public Player getPlayer2() {
        return player2;
    }
}
