package game;

public abstract class AbstractGear implements Gear, Comparable<AbstractGear> {
    private String firstWordOfName;
    private String secondWordOfName;
    private int defenseStrength;
    private int attackStrength;

    public AbstractGear(String firstWordOfName, String secondWordOfName, int defenseStrength, int attackStrength) {
        if (firstWordOfName == null || firstWordOfName.length() < 1 || secondWordOfName == null || secondWordOfName.length() < 1 || defenseStrength < 0 || attackStrength < 0) {
            throw new IllegalArgumentException();
        }
        this.firstWordOfName = firstWordOfName;
        this.secondWordOfName = secondWordOfName;
        this.defenseStrength = defenseStrength;
        this.attackStrength = attackStrength;
    }


    public int getDefenseStrength() {
        return defenseStrength;
    }

    public int getAttackStrength() {
        return attackStrength;
    }

    public String getFirstWordOfName() {
        return firstWordOfName;
    }

    public String getSecondWordOfName() {
        return secondWordOfName;
    }

    @Override
    public int compareTo(AbstractGear otherGear) {
        if (this.getAttackStrength() - otherGear.getAttackStrength() != 0) {
            return otherGear.getAttackStrength() - this.getAttackStrength();
        } else {
            return otherGear.getDefenseStrength() - this.getDefenseStrength();
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof AbstractGear) {
            AbstractGear gear = (AbstractGear) obj;
            return this.firstWordOfName.equals(gear.firstWordOfName) && this.secondWordOfName.equals(secondWordOfName);
        }
        return false;
    }

    @Override
    public String toString() {
        return getFirstWordOfName() + " " + getSecondWordOfName();
    }
}
