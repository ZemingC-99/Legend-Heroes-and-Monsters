/**
 * Dragons is the subclass of Monster class, which only has a slightly different stats.
 */
public class Dragons extends Monsters{
    public Dragons() {
    }

    public Dragons(String name, int level, double damage, double defense, double dodgeChance) {
        super(name, level, damage, defense, dodgeChance);
    }
}
