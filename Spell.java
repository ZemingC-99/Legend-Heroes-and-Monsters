/**
 * Spell class is a subclass of all items.
 * This will also have the feature of buyable.
 */
public class Spell extends Items{
    private final int mpCost;
    private final int damage;
    private final String spellType;

    public Spell(String name, int cost, int level, int mpCost, int damage, String spellType) {
        super(name, cost, level);
        this.mpCost = mpCost;
        this.damage = damage;
        this.spellType = spellType;
    }

    public int getMpCost() {
        return mpCost;
    }

    public int getDamage() {
        return damage;
    }

    public String getSpellType() {
        return spellType;
    }

    public double damageDealt(double dexterity) {
        return damage + (dexterity / 10000) * damage;
    }
}
