package game;

import game.client.GearList;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.DoubleBinaryOperator;

public class Player {
    private String name;
    private int attack;
    private int defense;
    private int totalAttack;
    private int totalDefense;
    private HeadGear mHeadGear;
    private List<HandGear> mHandGear = new ArrayList<>();
    private List<Footwear> mFootwear = new ArrayList<>();

    public Player(String name, int attack, int defense) {
        this.name = name;
        this.attack = attack;
        this.defense = defense;
        this.totalAttack = attack;
        this.totalDefense = defense;
    }

    /** Pickup a gear item from GearList to equip himself/herself
     *
     * Rule 1: Prefer the type of item that the character has available slot for.
     * For example, if the character already has 2 footwear, 1 hand gear and 1 helmet,
     * the character should try to choose 1 more hand gear.
     * <p>
     * Rule 2: if rule 1 leads to multiple choices, pick the item has the highest attack strength
     * <p>
     * Rule 3: If there is still a tie after Rule 1 and 2, pick the item has the highest defense strength
     * <p>
     * Rule 4: if there is yet still a tie after Rule 1,2,3, pick a random one.
     */
    public void pickUp(GearList gearList) {
        // 1.check the head slot first
        if ((isHeadSlotEmpty() && gearList.getHeadWear().size() > 0)
                || (gearList.getFootWear().size() == 0 && gearList.getHandWear().size() == 0)) {
            wearSelfFrom(gearList.getHeadWear(), gearList);
            // 2.next check the hand slot
        } else if ((isHandSlotNotFull() && gearList.getHandWear().size() > 0)
                || (gearList.getFootWear().size() == 0 && gearList.getHeadWear().size() == 0)) {
            wearSelfFrom(gearList.getHandWear(), gearList);
            // 3.last check the foot slot
        } else if ((isHeadSlotEmpty() && gearList.getHeadWear().size() > 0)
                || (gearList.getFootWear().size() == 0 && gearList.getHandWear().size() == 0)) {
            wearSelfFrom(gearList.getHeadWear(), gearList);
        }
    }

    private void wearSelfFrom(List<AbstractGear> gears, GearList gearList) {
        AbstractGear preferredGear = getPreferredGear(gears);
        wear(preferredGear);
        gearList.remove(preferredGear);
    }

    private void wear(AbstractGear gear) {
        if (gear instanceof HeadGear) {
            if (!isHeadSlotEmpty()) {
                Gear combinedGear = mHeadGear.combine(gear);
                mHeadGear = (HeadGear) combinedGear;
            } else {
                mHeadGear = (HeadGear) gear;
            }
        } else if (gear instanceof HandGear) {
            if (!isHandSlotNotFull()) {
                mHandGear.set(0, (HandGear) mHandGear.get(0).combine(gear));
            } else {
                mHandGear.add((HandGear) gear);
            }
        } else if (gear instanceof Footwear) {
            if (!isFootSlotNotFull()) {
                mFootwear.set(0, (Footwear) mFootwear.get(0).combine(gear));
            } else {
                mFootwear.add((Footwear) gear);
            }
        }
        updateAttackDefenseStrength(gear);
    }

    private void updateAttackDefenseStrength(AbstractGear gear) {
        this.totalDefense += gear.getDefenseStrength();
        this.totalAttack += gear.getAttackStrength();
    }

    private AbstractGear getPreferredGear(List<AbstractGear> gears) {
        Optional<AbstractGear> preferredGear = gears.stream().sorted().findFirst();
        return preferredGear.get();
    }

    private boolean isHeadSlotEmpty() {
        return mHeadGear == null;
    }

    private boolean isHandSlotNotFull() {
        return mHandGear.size() < 2;
    }

    private boolean isFootSlotNotFull() {
        return mFootwear.size() < 2;
    }

    public String getName() {
        return name;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public int getTotalAttack() {
        return totalAttack;
    }

    public int getTotalDefense() {
        return totalDefense;
    }

    public HeadGear getHeadGear() {
        return mHeadGear;
    }

    public List<HandGear> getHandGear() {
        return mHandGear;
    }

    public List<Footwear> getFootwear() {
        return mFootwear;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        //tom: xx headWear1, xx handWear1
        //Attack Strength: xx, Defense Strength: xx
        StringBuilder sb = new StringBuilder();
        sb.append(this.getName()).append(", ");
        sb.append("HeadGear: ");
        if (mHeadGear != null) {
            sb.append(mHeadGear).append(", ");
        }
        sb.append("HandGear: ");
        for (HandGear handGear : mHandGear) {
            sb.append(handGear).append(",");
        }
        sb.append("Footwear: ");
        for (Footwear footwear : mFootwear) {
            sb.append(footwear).append(",");
        }
        sb.append("\r\n");
        sb.append("Attack Strength: ").append(this.totalAttack).append(", ");
        sb.append("Defense Strength: ").append(this.totalDefense).append("\r\n");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Player) {
            Player player = (Player) obj;
            return this.name.equals(player.name) && this.attack == player.attack
                    && this.defense == player.defense;
        }
        return false;
    }
}
