/**
 * This class will have special features for Sorcerers
 * This will inherit from Heroes class
 */

public class Sorcerers extends Heroes{
    private Heroes hero;

    public Sorcerers(String name, int level, double Mp, int exp, int gold, double strength, double dexterity,
                    double agility) {
        super(name, level, Mp, exp, gold, strength, dexterity, agility);
    }

    /**
     * perform level up for Sorcerers
     */
    @Override
    public void levelUp() {
        super.levelUp();
        ++level;
        exp += expGained;
        expGained = 0;
        strength *= 1.05;
        dexterity *= 1.1;
        agility *= 1.1;
    }
}
