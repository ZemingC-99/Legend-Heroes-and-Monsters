/**
 * Spirits is the subclass of Monster class, which only has a slightly different stats.
 */
public class Spirits extends Monsters{
    public Spirits() {
    }

    public Spirits(String name, int level, double damage, double defense, double dodgeChance) {
        super(name, level, damage, defense, dodgeChance);
    }
}