/**
 * This is the interface for all Items that could be traded in the market
 */
public interface Tradable {
    boolean isBuyable(Heroes hero);
}
