/**
 * This class will have all things related to monsters
 * This will inherit from Roles class.
 * This will also be the super class for specific monster types
 */

public class Monsters extends Roles{
    protected double damage;
    protected double defense;
    protected double dodgeChance;

    public Monsters() {
    }

    public Monsters(String name, int level, double damage, double defense, double dodgeChance) {
        super(name, level);
        this.damage = damage;
        this.defense = defense;
        this.dodgeChance = dodgeChance / 500;
    }

    /**
     * check if dead
     * @return bool
     */
    public boolean isDead(){
        return defense <= 0;
    }

    /**
     * attack a hero and check the status afterwards
     * @param hero hero under attack
     */
    public void attack(Heroes hero){
        String name = hero.name;
        double chance = hero.dodgeChance;

        // check if be able to dodge
        double rand = Math.random();
        if (rand <= dodgeChance){
            System.out.println("Oh, " + name + " dodged an attack from the monster!");
            return;
        }

        double totalDamage = damage/20;
        if (hero.currentArmor == null){
            hero.Hp -= totalDamage;
        }else {
            totalDamage = Math.abs(damage - hero.currentArmor.getDamageReduction()/10.0);
            hero.Hp -= totalDamage;
        }
        System.out.println("The monster dealt " + totalDamage + " damage to " + name);

        if (hero.isFaint()){
            System.out.println(name + " is faint");
        }else{
            System.out.println(name + " is still alive with " + hero.Hp + " hp");
        }
    }
}
