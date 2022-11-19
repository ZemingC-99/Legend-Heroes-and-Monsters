import java.util.ArrayList;
import java.util.Scanner;

/**
 * This class will have all things related to heroes
 * This will inherit from Roles class.
 * This will also be the super class for specific hero types
 */

public class Heroes extends Roles{
    protected double Mp;
    protected int exp;
    protected int expGained;
    protected int gold;
    protected double strength;
    protected double dexterity;
    protected double agility;
    protected double dodgeChance;

    protected ArrayList<Weapon> weapons;
    protected ArrayList<Armor> armors;
    protected ArrayList<Potion> potions;
    protected ArrayList<Spell> spells;
    protected ArrayList<Items> items;

    protected Weapon currentWeapon;

    protected Armor currentArmor;

    public Heroes(String name, int level, double Mp, int exp, int gold, double strength, double dexterity,
                  double agility){
        super(name,level);
        this.Mp = Mp;
        this.exp = exp;
        this.expGained = 0;
        this.gold = gold;
        this.strength = strength;
        this.dexterity = dexterity;
        this.agility = agility;

        weapons = new ArrayList<>();
        armors = new ArrayList<>();
        potions = new ArrayList<>();
        spells = new ArrayList<>();
        items = new ArrayList<>();
        currentWeapon = null;
        currentArmor = null;

        dodgeChance = agility / 500;
    }

    public int getGold() {
        return gold;
    }

    /**
     * check if dead
     * @return bool
     */
    public boolean isFaint(){
        return Hp <= 0;
    }

    /**
     * check if hero is able to level up
     * @return bool
     */
    public boolean checkLevelUp(){
        return expGained >= level * 10;
    }

    /**
     * perform level up
     */
    public void levelUp(){
        if (!checkLevelUp()) {return;}
        setHp();
        Mp *= 1.1;
    }

    /**
     * gain experience after each fight
     * @param expGained how much exp
     */
    public void setExpGained(int expGained) {
        this.expGained += expGained;
        this.exp += expGained;
    }

    /**
     * attack a monster
     * @param monster monster
     */
    public void attack(Monsters monster) {
        String monsterName = monster.name;
        double dodgeChance = monster.dodgeChance;

        double totalDamage;
        if (currentWeapon == null){
            totalDamage = strength * 0.1;
        }else{
            totalDamage = currentWeapon.damageDealt(strength);
        }

        // check if be able to dodge
        double rand = Math.random();
        if (rand <= dodgeChance){
            System.out.println("Oh, " + monsterName + " dodged your attack!");
            return;
        }

        monster.defense -= totalDamage;
        System.out.println("You dealt " + totalDamage + " damage to " + monsterName);

        if (monster.defense <= 0){
            System.out.println(monsterName + " is dead");
            monster.Hp = 0;
        }else{
            System.out.println(monsterName + " is still alive with " + monster.defense + " hp");
        }
    }

    /**
     * Buy single item and put it into inventory
     * @param item item
     * @return bool
     */
    public boolean buy(Items item){
        if (!item.isBuyable(this)){
            System.out.println("Sorry, you are not able to buy this item...");
            return false;
        }

        System.out.println("You've successfully bought " + item.name);

        gold -= item.cost;
        items.add(item);
        if (item instanceof Weapon) { weapons.add((Weapon) item); }
        else if (item instanceof Armor) { armors.add((Armor) item); }
        else if (item instanceof Potion) { potions.add((Potion) item); }
        else if (item instanceof Spell) { spells.add((Spell) item); }

        System.out.println("Now you have " + this.getGold() + " gold");
        return true;
    }

    /**
     * This will print out the player inventory and let them sell an item
     * @param itemIndex item index
     * @return successfully sell or not
     */
    public boolean sell(int itemIndex){
        Items sellItem = items.get(itemIndex - 1);

        System.out.println("You've successfully sale " + sellItem.name + " for half of its original price");

        gold += sellItem.cost / 2;
        items.remove(itemIndex - 1);
        if (sellItem instanceof Weapon) { weapons.remove(sellItem); }
        else if (sellItem instanceof Armor) { armors.remove(sellItem); }
        else if (sellItem instanceof Potion) { potions.remove(sellItem); }
        else if (sellItem instanceof Spell) { spells.remove(sellItem); }

        System.out.println("Now you have " + this.getGold() + " gold");
        return true;
    }

    /**
     * print out all the items player has
     */
    public void printItemList() {
        System.out.println("Here is the full list of item you own:");
        System.out.println("                  <WEAPON>\n");
        printWeaponList();
        System.out.println("                  <ARMOR>\n");
        printArmorList();
        System.out.println("                  <POTION>\n");
        printPotionList();
        System.out.println("                  <SPELL>\n");
        printSpellList();
    }

    /**
     * choose a weapon to use
     * @return weapon
     */
    public Weapon chooseWeapon() {
        if (weapons.isEmpty()){
            System.out.println("Sorry, there is no weapon in your inventory");
            return null;
        }

        printWeaponList();
        System.out.println("Please select the index of the item: ");
        Scanner sc = new Scanner(System.in);
        int choice;
        while(true){
            if (sc.hasNextInt()){
                choice = sc.nextInt();
                if (choice < 1 || choice > weapons.size()){
                    System.out.println("Invalid Input");
                    sc.next();
                }else {
                    items.remove(choice - 1);
                    return weapons.remove(choice - 1);
                }
            }else{
                System.out.println("Invalid Input");
                sc.next();
            }
        }
    }

    /**
     * allow users to use of change a weapon
     * @return if success
     */
    public boolean changeWeapon(){
        Weapon temp = chooseWeapon();
        if (temp == null){
            return false;
        }

        // If currently there is a weapon
        if (currentWeapon != null){
            items.add(currentWeapon);
            weapons.add(currentWeapon);
        }

        // If currently no weapon
        currentWeapon = temp;
        System.out.println("You are now equipped with " + currentWeapon.name);
        return true;
    }

    /**
     * print a list of weapons for users to choose
     */
    public void printWeaponList() {
        System.out.println("Name           Base Damage    Hands Required");
        System.out.println("-----------------------------------------------");

        int index = 1;
        for (Weapon weapon : weapons) {
            String name = index + ". " + weapon.name;
            int damage = weapon.getDamage();
            int hands = weapon.getHandsRequired();

            System.out.printf("%-18s %-17d %-10d", name, damage, hands);
            System.out.println();
            ++index;
        }

        System.out.println("-----------------------------------------------");
    }

    /**
     * choose an Armor to use
     * @return armor
     */
    public Armor chooseArmor() {
        if (armors.isEmpty()){
            System.out.println("Sorry, there is no armor in your inventory");
            return null;
        }

        printArmorList();
        System.out.println("Please select the index of the item: ");
        Scanner sc = new Scanner(System.in);
        int choice;
        while(true){
            if (sc.hasNextInt()){
                choice = sc.nextInt();
                if (choice < 1 || choice > armors.size()){
                    System.out.println("Invalid Input");
                    sc.next();
                }else {
                    items.remove(choice - 1);
                    return armors.remove(choice - 1);
                }
            }else{
                System.out.println("Invalid Input");
                sc.next();
            }
        }
    }

    /**
     * allow users to use of change an armor
     * @return if success
     */
    public boolean changeArmor(){
        Armor temp = chooseArmor();
        if (temp == null){
            return false;
        }

        // If currently there is an armor
        if (currentArmor != null){
            items.add(currentArmor);
            armors.add(currentArmor);
        }

        // If currently no weapon
        currentArmor = temp;
        System.out.println("You put " + currentArmor.name + " on!");
        return true;
    }

    /**
     * print a list of armors for users to choose
     */
    public void printArmorList() {
        System.out.println("Name                  Damage Reduction");
        System.out.println("-----------------------------------------------");

        int index = 1;
        for (Armor armor : armors) {
            String name = index + ". " + armor.name;
            int damage = armor.getDamageReduction();

            System.out.printf("%-28s %-5d", name, damage);
            System.out.println();
        }

        System.out.println("-----------------------------------------------");
    }

    /**
     * Cast spell to a monster
     * @param monster monster
     */
    public boolean castSpell(Monsters monster) {
        String name = monster.name;

        Spell s = chooseSpell();
        if(s == null){
            return false;
        }

        if (Mp < s.getMpCost()){
            System.out.println("Sorry, you don't have enough mp...");
            return false;
        }else {
            Mp -= s.getMpCost();
        }

        double damage = s.damageDealt(dexterity);
        monster.defense -= damage;

        if (s.getSpellType().charAt(0) == 'I') { monster.damage *= 0.8; }
        else if (s.getSpellType().charAt(0) == 'F') { monster.defense *= 0.8; }
        else if (s.getSpellType().charAt(0) == 'L') { monster.dodgeChance *= 0.8; }
        System.out.println("You used a " + s.getSpellType() + " spell on " + name);
        return true;
    }

    /**
     * choose a spell to cast
     * @return spell
     */
    public Spell chooseSpell(){
        if (spells.isEmpty()){
            System.out.println("Sorry, there is no spell in your inventory");
            return null;
        }

        printSpellList();
        System.out.println("Please select the index of the item: ");
        Scanner sc = new Scanner(System.in);
        int choice;
        while(true){
            if (sc.hasNextInt()){
                choice = sc.nextInt();
                if (choice < 1 || choice > spells.size()){
                    System.out.println("Invalid Input");
                    sc.next();
                }else {
                    return spells.get(choice - 1);
                }
            }else{
                System.out.println("Invalid Input");
                sc.next();
            }
        }
    }

    /**
     * print a list of spells for users to choose
     */
    public void printSpellList() {
        System.out.println("Name                    Damage    Mp cost      Spell Type");
        System.out.println("-----------------------------------------------");

        int index = 1;
        for (Spell spell : spells) {
            String name = index + ". " + spell.name;
            int damage = spell.getDamage();
            int cost = spell.getMpCost();
            String type = spell.getSpellType();

            System.out.printf("%-24s %-10d %-10d %-8s", name, damage, cost, type);
            System.out.println();
        }

        System.out.println("-----------------------------------------------");
    }

    /**
     * let player choose a potion to use
     * @return if potion is used
     */
    public boolean usePotion(){
        if (potions.isEmpty()){
            System.out.println("Sorry, you don't have any potion...");
            return false;
        }

        Potion p;
        printPotionList();
        System.out.println("Please select the index of the item: ");
        Scanner sc = new Scanner(System.in);
        int choice;
        while(true){
            if (sc.hasNextInt()){
                choice = sc.nextInt();
                if (choice < 1 || choice > potions.size()){
                    System.out.println("Invalid Input");
                    sc.next();
                }else {
                    p = potions.get(choice - 1);
                    break;
                }
            }else{
                System.out.println("Invalid Input");
                sc.next();
            }
        }

        if (p.getIncreaseAttr().charAt(0) == 'S') { strength += p.getIncreaseAmount(); }
        else if (p.getIncreaseAttr().charAt(0) == 'D') { dexterity += p.getIncreaseAmount(); }
        else if (p.getIncreaseAttr().charAt(0) == 'A') { agility += p.getIncreaseAmount(); }

        System.out.println("Successfully used potion!");

        // remove potion
        potions.remove(p);
        items.remove(p);

        return true;
    }

    /**
     * print a list of potions for users to choose
     */
    public void printPotionList() {
        System.out.println("Name                   Increase Amount   Affected Attr");
        System.out.println("-----------------------------------------------");

        int index = 1;
        for (Potion potion : potions) {
            String name = index + ". " + potion.name;
            int damage = potion.getIncreaseAmount();
            String type = potion.getIncreaseAttr();

            System.out.printf("%-28s %-14d %-18s", name, damage, type);
            System.out.println();
        }

        System.out.println("-----------------------------------------------");
    }
}
