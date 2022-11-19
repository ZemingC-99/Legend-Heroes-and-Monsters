/**
 * Armor class is a subclass of all items.
 * This will also have the feature of buyable.
 */
public class Armor extends Items{
    private final int damageReduction;

    public Armor(String name, int cost, int level, int damageReduction) {
        super(name, cost, level);
        this.damageReduction = damageReduction;
    }

    public int getDamageReduction() {
        return damageReduction;
    }
}