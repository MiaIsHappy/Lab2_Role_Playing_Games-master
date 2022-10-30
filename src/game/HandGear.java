package game;

public class HandGear extends AbstractGear {

    public HandGear(String firstWordOfName, String secondWordOfName, int defenseStrength, int attackStrength) {
        super(firstWordOfName, secondWordOfName, defenseStrength, attackStrength);
    }

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
