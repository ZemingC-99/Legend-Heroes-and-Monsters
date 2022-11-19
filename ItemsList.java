import java.util.ArrayList;

/**
 * This class will store all different types of Items
 */
public class ItemsList {
    private static ArrayList<Weapon> weapons;
    private static ArrayList<Armor> armors;
    private static ArrayList<Potion> potions;
    private static ArrayList<Spell> spells;
    private static ArrayList<Items> items;

    public ItemsList() {
        weapons = new ArrayList<>();
        armors = new ArrayList<>();
        potions = new ArrayList<>();
        spells = new ArrayList<>();
        items = new ArrayList<>();

        weapons.add(new Weapon("Sward",500,1,800,1));
        weapons.add(new Weapon("Bow",300,2,500,2));
        weapons.add(new Weapon("Scythe",1000,6,1100,2));
        weapons.add(new Weapon("Axe",550,5,850,1));
        weapons.add(new Weapon("TSwards",1400,8,1600,2));
        weapons.add(new Weapon("Dagger",200,1,250,1));
        items.addAll(weapons);

        armors.add(new Armor("Platinum_Shield",150,1,200));
        armors.add(new Armor("Breastplate",350,3,600));
        armors.add(new Armor("Full_Body_Armor",1000,8,1100));
        armors.add(new Armor("Wizard_Shield",1200,10,1500));
        armors.add(new Armor("Guardian_Angel",1000,10,1000));
        items.addAll(armors);

        potions.add(new Potion("Healing_Potion", 200,1,100,"Health"));
        potions.add(new Potion("Strength_Potion", 250,1,75,"Strength"));
        potions.add(new Potion("Magic_Potion", 350,2,100,"Mp"));
        potions.add(new Potion("Luck_Elixir", 500,4,65,"Agility"));
        items.addAll(potions);

        spells.add(new Spell("Snow_Cannon", 500,2,250,650,"Ice"));
        spells.add(new Spell("Ice_Blade", 250,1,100,450,"Ice"));
        spells.add(new Spell("Frost_Blizzard", 750,5,350,850,"Ice"));
        spells.add(new Spell("Flame_Tornado", 700,4,300,850,"Fire"));
        spells.add(new Spell("Breath_of_Fire", 350,1,100,450,"Fire"));
        spells.add(new Spell("Lava_Comet", 450,2,550,1000,"Fire"));
        spells.add(new Spell("Lightning_Dagger", 400,1,150,500,"Lightning"));
        spells.add(new Spell("Thunder_Blast", 750,4,400,950,"Lightning"));
        spells.add(new Spell("Electric_Arrow", 550,5,200,650,"Lightning"));
        items.addAll(spells);
    }

    public ArrayList<Weapon> getWeapons() {
        return weapons;
    }

    public ArrayList<Armor> getArmors() {
        return armors;
    }

    public ArrayList<Potion> getPotions() {
        return potions;
    }

    public ArrayList<Spell> getSpells() {
        return spells;
    }

    public ArrayList<Items> getItems() {
        return items;
    }

    public void printItems(){
        String split = "-----------------------------------------------";
        System.out.println("Name            Price    Level Required    Base Damage    Hands Required");
        System.out.println(split);

        //print the stats for all weapons
        for (int i = 0; i < weapons.size(); ++i) {
            String name = (i + 1) + ". " + weapons.get(i).name;
            int price = weapons.get(i).cost;
            int level = weapons.get(i).level;
            int damage = weapons.get(i).getDamage();
            int hands = weapons.get(i).getHandsRequired();

            System.out.printf("%-16s %-14d %-14d %-17d %-5d", name, price, level, damage, hands);
            System.out.println();
        }
        System.out.println(split);

        System.out.println("Name                    Price    Level Required    Damage Reduction");
        System.out.println(split);
        //print the stats for all armors
        for (int i = 0; i < armors.size(); ++i) {
            String name = (i + 1) + weapons.size() + ". " + armors.get(i).name;
            int price = armors.get(i).cost;
            int level = armors.get(i).level;
            int damageReduction = armors.get(i).getDamageReduction();

            System.out.printf("%-24s %-14d %-15d %-14d", name, price, level, damageReduction);
            System.out.println();
        }
        System.out.println(split);

        System.out.println("Name                    Price    Level Required    Increased Amount    Affected Attr");
        System.out.println(split);
        //print the stats for all potions
        for (int i = 0; i < potions.size(); ++i) {
            // Print all the stats of all the potions
            String name = (i + 1) + weapons.size() + armors.size() + ". " + potions.get(i).name;
            int price = potions.get(i).cost;
            int level = potions.get(i).level;
            int increaseAttr = potions.get(i).getIncreaseAmount();
            String affectedAttr = potions.get(i).getIncreaseAttr();

            System.out.printf("%-24s %-14d %-16d %-15d %-9s", name, price, level, increaseAttr, affectedAttr);
            System.out.println();
        }
        System.out.println(split);

        System.out.println("Name                    Price    Required Level    Base Damage    Mana Cost    Spell Type");
        System.out.println(split);

        // Print the stats of all spells
        for (int i = 0; i < spells.size(); ++i) {
            String name = (i + 1) + weapons.size() + armors.size() + potions.size() + ". " + spells.get(i).name;
            int price = spells.get(i).cost;
            int level = spells.get(i).level;
            int damage = spells.get(i).getDamage();
            int mpCost = spells.get(i).getMpCost();
            String type = spells.get(i).getSpellType();

            System.out.printf("%-24s %-14d %-13d %-14d %-9d %-16s", name, price, level, damage, mpCost, type);
            System.out.println();
        }
    }
}