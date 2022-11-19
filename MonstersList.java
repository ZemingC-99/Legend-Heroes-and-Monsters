import java.util.ArrayList;

/**
 * This class will store all different types of Heroes
 */
public class MonstersList {
    private final ArrayList<Monsters> monsters;

    public MonstersList() {
        monsters = new ArrayList<>();
        monsters.add(new Dragons("Desghidorrah",3,300,400,35));
        monsters.add(new Dragons("Chrysophylax",2,200,500,20));
        monsters.add(new Dragons("BunsenBurner",4,400,500,45));
        monsters.add(new Dragons("Natsunomeryu",1,100,200,10));
        monsters.add(new Dragons("TheScaleless",7,700,600,75));
        monsters.add(new Dragons("Kas-Ethelinh",5,600,500,60));
        monsters.add(new Dragons("Alexstraszan",10,1000,9000,55));
        monsters.add(new Dragons("Phaarthurnax",6,600,700,60));
        monsters.add(new Dragons("D-Maleficent",9,900,950,85));
        monsters.add(new Dragons("TheWeatherbe",8,800,900,80));
        monsters.add(new Dragons("Igneel",6,600,400,60));
        monsters.add(new Dragons("BlueEyesWhite",9,900,600,75));

        monsters.add(new Exoskeletons("Cyrrollalee",7,700,800,75));
        monsters.add(new Exoskeletons("Brandobaris",3,350,450,30));
        monsters.add(new Exoskeletons("BigBad-Wolf",1,150,250,15));
        monsters.add(new Exoskeletons("WickedWitch",2,250,350,25));
        monsters.add(new Exoskeletons("Aasterinian",4,400,500,45));
        monsters.add(new Exoskeletons("Chronepsish",6,650,750,60));
        monsters.add(new Exoskeletons("Kiaransalee",8,850,950,85));
        monsters.add(new Exoskeletons("St-Shargaas",5,550,650,55));
        monsters.add(new Exoskeletons("Merrshaullk",10,1000,900,55));
        monsters.add(new Exoskeletons("St-Yeenoghu",9,950,850,90));
        monsters.add(new Exoskeletons("DocOck",6,600,600,55));
        monsters.add(new Exoskeletons("Exodia",10,1000,1000,50));

        monsters.add(new Spirits("Andrealphus",2,600,500,35));
        monsters.add(new Spirits("Blinky",1,450,350,20));
        monsters.add(new Spirits("Andromalius",3,550,450,45));
        monsters.add(new Spirits("Chiang-shih",4,700,600,10));
        monsters.add(new Spirits("FallenAngel",5,800,700,75));
        monsters.add(new Spirits("Ereshkigall",6,950,450,60));
        monsters.add(new Spirits("Melchiresas",7,350,150,55));
        monsters.add(new Spirits("Jormunngand",8,600,900,60));
        monsters.add(new Spirits("Rakkshasass",9,550,600,85));
        monsters.add(new Spirits("Taltecuhtli",10,200,200,80));
        monsters.add(new Spirits("Casper",1,100,100,60));
    }

    public ArrayList<Monsters> getMonsters() {
        return monsters;
    }
}
