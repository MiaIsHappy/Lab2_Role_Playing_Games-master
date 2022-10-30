package game;

/**
 * Class for Footwear, can be used for attack and defense
 */
public class Footwear extends AbstractGear {

    //todo do we need a separate constructor if it's the same with parent
    public Footwear(String firstWordOfName, String secondWordOfName, int defenseStrength, int attackStrength) {
        super(firstWordOfName, secondWordOfName, defenseStrength, attackStrength);
    }
    /**
     * Combine two footware. if gear is not footware, return null and log error message
     */
    //todo similar combine in all 3 subclasses, add a log if null?
    @Override
    public Gear combine(Gear gear) {
        if (gear instanceof Footwear) {
            Footwear otherFootwear = (Footwear) gear;
            String newFirstWordOfName = this.getFirstWordOfName() + "," + otherFootwear.getFirstWordOfName();
            String newSecondWordOfName = this.getSecondWordOfName();
            int newDefenseStrength = this.getDefenseStrength() + otherFootwear.getDefenseStrength();
            int newAttackStrength = this.getAttackStrength() + otherFootwear.getAttackStrength();
            Footwear newFootwear = new Footwear(newFirstWordOfName, newSecondWordOfName, newDefenseStrength, newAttackStrength);
            return newFootwear;

        }
        return null;
    }
}
