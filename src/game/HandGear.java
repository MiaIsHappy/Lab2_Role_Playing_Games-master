package game;

/**
 *  Class for HandGear, can be used for attack and defense
 */
public class HandGear extends AbstractGear {

    public HandGear(String firstWordOfName, String secondWordOfName, int defenseStrength, int attackStrength) {
        super(firstWordOfName, secondWordOfName, defenseStrength, attackStrength);
        //These items go on the character’s hands (gloves/swords/shield) and are only used for attack
        if (defenseStrength != 0) throw new IllegalArgumentException();

    }

    @Override
    public Gear combine(Gear gear) {
        if (gear instanceof HandGear) {
            combineGearHelper((AbstractGear) gear);
            return this;
        }
        System.out.println("The Gear is not HandGear");
        return null;
    }

}
