/**
 * This class includes all the roles in the game (both hero and monster)
 * This will contain some common features all roles will share (name, level, hp)
 */
public class Roles {
    protected String name;
    protected int level;
    protected double Hp;

    public Roles() {
    }

    public Roles(String name, int level){
        this.name = name;
        this.level = level;
        this.Hp = level * 100;
    }

    public void setHp(){
        this.Hp = this.level * 100;
    }
}
