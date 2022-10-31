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
    public HeadGear(String firstWordOfName, String secondWordOfName, int defenseStrength, int attackStrength) {
        super(firstWordOfName, secondWordOfName, defenseStrength, attackStrength);
        //These items go on the character’s head (hats/helmets/visors) and are only useful for defense.
        if (attackStrength != 0) throw new IllegalArgumentException();
    }

    @Override
    public Gear combine(Gear gear) {
        if (gear instanceof HeadGear) {
            combineGearHelper((AbstractGear) gear);
            return this;
        }
        System.out.println("The Gear is not HeadGear");
        return null;
    }
}
