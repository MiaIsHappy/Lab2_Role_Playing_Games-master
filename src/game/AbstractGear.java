package game;

import com.sun.xml.internal.bind.v2.TODO;

/**
 * Abstract Method for Gear Parent
 */
public abstract class AbstractGear implements Gear, Comparable<AbstractGear> {
    private String firstWordOfName;
    private String secondWordOfName;
    private int defenseStrength;
    private int attackStrength;

    /**
     * Defense and attack are default to zero. Name is seperated to two
     * @param firstWordOfName
     * @param secondWordOfName
     * @param defenseStrength
     * @param attackStrength
     */
    public AbstractGear(String firstWordOfName, String secondWordOfName, int defenseStrength, int attackStrength) {
        if (firstWordOfName == null || firstWordOfName.length() < 1 || secondWordOfName == null || secondWordOfName.length() < 1 || defenseStrength < 0 || attackStrength < 0) {
            throw new IllegalArgumentException();
        }
        this.firstWordOfName = firstWordOfName;
        this.secondWordOfName = secondWordOfName;
        this.defenseStrength = defenseStrength;
        this.attackStrength = attackStrength;
    }


    /**
     * Getter method for Defense
     * @return
     */
    public int getDefenseStrength() {
        return defenseStrength;
    }

    /**
     * Getter method for Attack
     * @return
     */
    public int getAttackStrength() {
        return attackStrength;
    }

    /**
     * Getter for first name
     * @return
     */
    public String getFirstWordOfName() {
        return firstWordOfName;
    }

    /**
     * Getter for second name
     * @return
     */
    public String getSecondWordOfName() {
        return secondWordOfName;
    }

    /**
     * Compare strength in battle
     * @param otherGear
     * @return
     */
    @Override
    public int compareTo(AbstractGear otherGear) {
        if (this.getAttackStrength() - otherGear.getAttackStrength() != 0) {
            return otherGear.getAttackStrength() - this.getAttackStrength();
        } else {
            return otherGear.getDefenseStrength() - this.getDefenseStrength();
        }
    }

    /**
     * Check if two object has the same name
     * @param obj
     * @return
     */
    //todo why use object type
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof AbstractGear) {
            AbstractGear gear = (AbstractGear) obj;
            return this.firstWordOfName.equals(gear.firstWordOfName) && this.secondWordOfName.equals(secondWordOfName);
        }
        return false;
    }

    /**
     * toString to return both names
     * @return
     */
    @Override
    public String toString() {
        return getFirstWordOfName() + " " + getSecondWordOfName();
    }
}
