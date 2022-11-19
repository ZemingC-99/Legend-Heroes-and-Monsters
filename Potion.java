/**
 * Potion class is a subclass of all items.
 * This will also have the feature of buyable.
 */
public class Potion extends Items{
    private final int increaseAmount;
    private final String increaseAttr;
    private final boolean isUsed;

    public Potion(String name, int cost, int level, int increaseAmount, String increaseAttr) {
        super(name, cost, level);
        this.increaseAmount = increaseAmount;
        this.increaseAttr = increaseAttr;
        this.isUsed = false;
    }

    public int getIncreaseAmount() {
        return increaseAmount;
    }

    public String getIncreaseAttr() {
        return increaseAttr;
    }

    public boolean isUsed() {
        return isUsed;
    }
}
