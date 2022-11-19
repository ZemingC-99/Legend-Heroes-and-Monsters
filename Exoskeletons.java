/**
 * Exoskeletons is the subclass of Monster class, which only has a slightly different stats.
 */
public class Exoskeletons extends Monsters{
    public Exoskeletons() {
    }

    public Exoskeletons(String name, int level, double damage, double defense, double dodgeChance) {
        super(name, level, damage, defense, dodgeChance);
    }
}
