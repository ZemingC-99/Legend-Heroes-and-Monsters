/**
 * Weapon class is a subclass of all items.
 * This will also have the feature of buyable.
 */
public class Weapon extends Items {
    private final int damage;
    private final int handsRequired;

    public Weapon(String name, int cost, int level, int damage, int handsRequired) {
        super(name, cost, level);
        this.damage = damage;
        this.handsRequired = handsRequired;
    }

    public int getDamage() {
        return damage;
    }

    public int getHandsRequired() {
        return handsRequired;
    }

    public double damageDealt(double strength){
        return (damage + strength) *0.05;
    }
}
