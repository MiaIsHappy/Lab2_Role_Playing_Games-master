import game.AbstractGear;
import game.HandGear;
import game.HeadGear;
import game.Player;
import game.client.GameMgr;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

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


        HandGear handGear1 = new HandGear("bb", "handGear1", 1, 1);
        HandGear handGear2 = new HandGear("dd", "handGear2", 1, 1);

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


        Player player1 = new Player("tom", 0, 0);
        Player player2 = new Player("jerry", 0, 0);

        GameMgr mgr = new GameMgr(gears, player1, player2);
        mgr.startGame();

//        System.out.println(mgr.getPlayer1().getTotalAttack());
//        System.out.println(mgr.getPlayer1().getTotalDefense());
//        System.out.println(mgr.getPlayer2().getTotalAttack());
//        System.out.println(mgr.getPlayer2().getTotalDefense());


//        Optional<Gear> first = gears.stream().filter(gear -> gear instanceof HeadGear).findFirst();
//        Gear gear = first.get();
//        System.out.println(gear);
//        Optional<AbstractGear> preferredGear = gears.stream().sorted().findFirst();
//        System.out.println(preferredGear.get());

//        Collections.sort(gears);
//        System.out.println("==================");
//        for (Gear item : gears) {
//            System.out.println(item);
//        }

//        List<Gear> footGears = gears.stream().filter(gear -> gear instanceof Footwear).collect(Collectors.toList());
//        System.out.println(footGears.size());
//        for (Gear gear : handGears) {
//            System.out.println(gear);
//        }

    }
}