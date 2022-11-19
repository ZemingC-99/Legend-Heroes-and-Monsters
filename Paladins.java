/**
 * This class will have special features for Paladins
 * This will inherit from Heroes class
 */

public class Paladins extends Heroes{
    private Heroes hero;

    public Paladins(String name, int level, double Mp, int exp, int gold, double strength, double dexterity,
                    double agility) {
        super(name, level, Mp, exp, gold, strength, dexterity, agility);
    }

    /**
     * perform level up for Paladins
     */
    @Override
    public void levelUp() {
        super.levelUp();
        ++level;
        exp += expGained;
        expGained = 0;
        strength *= 1.1;
        dexterity *= 1.1;
        agility *= 1.05;
    }
}