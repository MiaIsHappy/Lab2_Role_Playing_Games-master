package game;

/**
 * Class for Footwear, can be used for attack and defense
 * These items go on the character’s feet (boots/sneakers/hoverboard) and can be for attack or defense.
 */
public class Footwear extends AbstractGear {

    public Footwear(String firstWordOfName, String secondWordOfName, int defenseStrength, int attackStrength) {
        super(firstWordOfName, secondWordOfName, defenseStrength, attackStrength);
    }
    /**
     * Combine two footware. if gear is not footware, return null and log error message
     */
    @Override
    public Gear combine(Gear gear) {
        if (gear instanceof Footwear) {
            combineGearHelper((AbstractGear) gear);
            return this;
        }
        System.out.println("The Gear is not Footwear");
        return null;
    }
}
