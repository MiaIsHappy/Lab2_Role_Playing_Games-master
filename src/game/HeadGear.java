package game;

/**
 * Class for HandGear, can be used for defense only
 */
public class HeadGear extends AbstractGear {

    /**
     *
     * @param firstWordOfName
     * @param secondWordOfName
     * @param defenseStrength
     * @param attackStrength
     */
    //todo attack default to 0; I made changes but tbd
    public HeadGear(String firstWordOfName, String secondWordOfName, int defenseStrength) {
        super(firstWordOfName, secondWordOfName, defenseStrength, 0);
    }

    //todo same todo with others
    @Override
    public Gear combine(Gear gear) {
        if (gear instanceof HeadGear) {
            HeadGear otherHeadGear = (HeadGear) gear;
            String newFirstWordOfName = this.getFirstWordOfName() + "," + otherHeadGear.getFirstWordOfName();
            String newSecondWordOfName = otherHeadGear.getSecondWordOfName();
            int newDefenseStrength = this.getDefenseStrength() + otherHeadGear.getDefenseStrength();
            int newAttackStrength = this.getAttackStrength() + otherHeadGear.getAttackStrength();
            HeadGear newHeadGear = new HeadGear(newFirstWordOfName, newSecondWordOfName, newDefenseStrength);

            return newHeadGear;

        }
        return null;
    }
}
