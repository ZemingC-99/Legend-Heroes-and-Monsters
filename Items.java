/**
 * This class contains all the items in the game (weapon, spell, potion, armor)
 * This will also implement a feature called tradable
 */
public class Items implements Tradable{
    protected String name;
    protected int cost;
    protected int level;

    public Items() {
    }

    public Items(String name, int cost, int level) {
        this.name = name;
        this.cost = cost;
        this.level = level;
    }

    /** check if any item can be bought by a hero
     * @param hero hero
     * @return bool
     */
    @Override
    public boolean isBuyable(Heroes hero) {
        return hero.level >= level && hero.getGold() >= cost;
    }
}
