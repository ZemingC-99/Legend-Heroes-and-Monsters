import java.util.ArrayList;

/**
 * This class will store all different types of Heroes
 */
public class HeroesList {
    private static ArrayList<Heroes> heroes;

    public HeroesList() {
    }

    public static void setHeroesList() {
        heroes = new ArrayList<>();
        heroes.add(new Warriors("Gaerdal_Ironhand",1,100,7,1354,700,600,500));
        heroes.add(new Warriors("Sehanine_Monnbow",1,600,8,2500,700,500,800));
        heroes.add(new Warriors("Muamman_Duathall",1,300,6,2546,900,750,500));
        heroes.add(new Warriors("Flandal_Steelskin",1,200,7,2500,750,700,650));
        heroes.add(new Warriors("Undefeated_Yoj",1,400,7,2500,800,700,400));
        heroes.add(new Warriors("Eunoia_Cyn",1,400,6,2500,700,600,800));

        heroes.add(new Paladins("Parzival", 1,300,7,2500,750,700,650));
        heroes.add(new Paladins("Sehanine_Moonbow", 1,300,7,2500,750,700,700));
        heroes.add(new Paladins("Skoraeus_Stonebones", 1,250,4,2500,650,350,600));
        heroes.add(new Paladins("Garl_Glittergold", 1,100,5,2500,600,400,500));
        heroes.add(new Paladins("Amaryllis_Astra", 1,500,5,2500,500,500,500));
        heroes.add(new Paladins("Caliber_Heist", 1,400,8,2500,400,400,400));

        heroes.add(new Sorcerers("Rillifane_Rallathil",1,1300,9,2500,750,500,450));
        heroes.add(new Sorcerers("Segojan_Earthcaller",1,900,5,2500,800,650,500));
        heroes.add(new Sorcerers("Reign_Havoc",1,800,8,2500,800,800,800));
        heroes.add(new Sorcerers("Reverie_Ashels",1,900,7,2500,800,400,700));
        heroes.add(new Sorcerers("Kalabar",1,800,6,2500,850,600,400));
        heroes.add(new Sorcerers("Skye_Soar",1,1000,5,2500,700,500,400));
    }

    public static ArrayList<Heroes> getHeroes() {
        return heroes;
    }

    public static void printList() {
        String title = "    Name                  HP    Level    Mana    Strength    Dexterity    Agility    Money    Exp";
        String split = "-----------------------------------------------";
        int i;
        int index = 1;
        System.out.println("Worriers: ");
        System.out.println(title);
        System.out.println(split);
        for (i = 0; i < heroes.size() / 3; ++i){
            System.out.printf("%3d %-20s %-8d %-6d %-9.0f %-12.0f %-11.0f %-9.0f %-8d %-5d", index, heroes.get(i).name,
                    heroes.get(i).level * 100, heroes.get(i).level, heroes.get(i).Mp, heroes.get(i).strength,
                    heroes.get(i).dexterity, heroes.get(i).agility , heroes.get(i).gold, heroes.get(i).exp);
            System.out.println();
            ++index;
        }
        System.out.println(split);
        System.out.println("Paladins: ");
        System.out.println(title);
        System.out.println(split);
        for (i = heroes.size() / 3; i < heroes.size() / 3 * 2; ++i){
            System.out.printf("%3d %-20s %-8d %-6d %-9.0f %-12.0f %-11.0f %-9.0f %-8d %-5d", index, heroes.get(i).name,
                    heroes.get(i).level * 100, heroes.get(i).level, heroes.get(i).Mp, heroes.get(i).strength,
                    heroes.get(i).dexterity, heroes.get(i).agility , heroes.get(i).gold, heroes.get(i).exp);
            System.out.println();
            ++index;
        }
        System.out.println(split);
        System.out.println("Sorcerers: ");
        System.out.println(title);
        System.out.println(split);
        for (i = heroes.size() / 3 * 2; i < heroes.size(); ++i){
            System.out.printf("%3d %-20s %-8d %-6d %-9.0f %-12.0f %-11.0f %-9.0f %-8d %-5d", index, heroes.get(i).name,
                    heroes.get(i).level * 100, heroes.get(i).level, heroes.get(i).Mp, heroes.get(i).strength,
                    heroes.get(i).dexterity, heroes.get(i).agility , heroes.get(i).gold, heroes.get(i).exp);
            System.out.println();
            ++index;
        }
    }
}
