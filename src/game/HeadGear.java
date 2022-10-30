package game;

public class HeadGear extends AbstractGear {

    public HeadGear(String firstWordOfName, String secondWordOfName, int defenseStrength, int attackStrength) {
        super(firstWordOfName, secondWordOfName, defenseStrength, attackStrength);
    }

    @Override
    public Gear combine(Gear gear) {
        if (gear instanceof HeadGear) {
            HeadGear otherHeadGear = (HeadGear) gear;
            String newFirstWordOfName = this.getFirstWordOfName() + "," + otherHeadGear.getFirstWordOfName();
            String newSecondWordOfName = otherHeadGear.getSecondWordOfName();
            int newDefenseStrength = this.getDefenseStrength() + otherHeadGear.getDefenseStrength();
            int newAttackStrength = this.getAttackStrength() + otherHeadGear.getAttackStrength();
            HeadGear newHeadGear = new HeadGear(newFirstWordOfName, newSecondWordOfName, newDefenseStrength, newAttackStrength);

            return newHeadGear;

        }
        return null;
    }
}
