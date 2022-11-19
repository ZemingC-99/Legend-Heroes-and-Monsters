/**
 * This class will have special features for Warriors
 * This will inherit from Heroes class
 */

public class Warriors extends Heroes{
    private Heroes hero;

    public Warriors(String name, int level, double Mp, int exp, int gold, double strength, double dexterity,
                   double agility) {
        super(name, level, Mp, exp, gold, strength, dexterity, agility);
    }

    /**
     * perform level up for Warriors
     */
    @Override
    public void levelUp() {
        super.levelUp();
        ++level;
        exp += expGained;
        expGained = 0;
        strength *= 1.1;
        dexterity *= 1.05;
        agility *= 1.1;
    }
}
