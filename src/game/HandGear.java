package game;

/**
 *  Class for HandGear, can be used for attack and defense
 */
public class HandGear extends AbstractGear {

    //todo same todo with footware, do we need a separate constructor if it's the same with parent
    public HandGear(String firstWordOfName, String secondWordOfName, int defenseStrength, int attackStrength) {
        super(firstWordOfName, secondWordOfName, defenseStrength, attackStrength);
    }

    /**
     *
     * @param gear
     * @return
     */
    //todo this is very similar to other combine method. change to method without instanceof in abstract class, if we check instanceof in play?
    @Override
    public Gear combine(Gear gear) {
        if (gear instanceof HandGear) {
            HandGear otherHandGear = (HandGear) gear;
            String newFirstWordOfName = this.getFirstWordOfName() + "," + otherHandGear.getFirstWordOfName();
            String newSecondWordOfName = this.getSecondWordOfName();
            int newDefenseStrength = this.getDefenseStrength() + otherHandGear.getDefenseStrength();
            int newAttackStrength = this.getAttackStrength() + otherHandGear.getAttackStrength();
            HandGear newHandGear = new HandGear(newFirstWordOfName, newSecondWordOfName, newDefenseStrength, newAttackStrength);

            return newHandGear;

        }
        return null;
    }

}
