package game;

public class Footwear extends AbstractGear {

    public Footwear(String firstWordOfName, String secondWordOfName, int defenseStrength, int attackStrength) {
        super(firstWordOfName, secondWordOfName, defenseStrength, attackStrength);
    }

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
