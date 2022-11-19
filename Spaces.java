/**
 * This class includes all different types of spaces like Common Space, Market Space, and Inaccessible Space.
 * Each types of spaces will be a subclass that inherits this class.
 */
public class Spaces {
    protected String feature;

    public Spaces(String feature) {
        this.feature = feature;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }
}
