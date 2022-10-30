package game.client;

import game.*;

import java.util.List;
import java.util.stream.Collectors;

/**
 * A class used to store Gear Items
 */
public class GearList {
    List<AbstractGear> items;

    public GearList(List<AbstractGear> items) {
        if (items == null || items.size() == 0) {
            throw new IllegalArgumentException();
        }
        this.items = items;
    }

    //Get a list of HearWear
    public List<AbstractGear> getHeadWear() {
        return this.items.stream().filter(gear -> gear instanceof HeadGear).collect(Collectors.toList());
    }

    //Get a list of HandGear
    public List<AbstractGear> getHandWear() {
        return this.items.stream().filter(gear -> gear instanceof HandGear).collect(Collectors.toList());
    }

    //Get a list of Footwear
    public List<AbstractGear> getFootWear() {
        return this.items.stream().filter(gear -> gear instanceof Footwear).collect(Collectors.toList());
    }

    //Remove the Gear from list
    public void remove(Gear item) {
        this.items.remove(item);
    }

}
