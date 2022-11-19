import java.util.*;

/**
 * This class contains all the elements of the actual Legend game
 */
public class Game {
    // initialize all possible elements
    private int rolPos;
    private int colPos;
    private int numHeroes;
    private Map map;
    private ItemsList itemsList;

    private ArrayList<Heroes> heroTeam;
    private ArrayList<Monsters> monstersTeam;
    private ArrayList<Heroes> FaintHero;

    public Game() {
        rolPos = 0;
        colPos = 0;
        numHeroes = 0;
        map = new Map(8);
        itemsList = new ItemsList();
        heroTeam = new ArrayList<Heroes>();
        monstersTeam = new ArrayList<Monsters>();
        FaintHero = new ArrayList<Heroes>();
    }

    /**
     * Starts the game in a loop
     */
    public void start() {
        welcome();
        formTeam();
        printTeam();
        map.printMap();

        while (true){
            boolean move = move();
            map.printMap();

            if (move){
                interact();
//                map.printMap();
            }

            map.clearMove(rolPos,colPos);
        }
    }

    /**
     * This class prints out all the welcome message.
     */
    public void welcome() {
        System.out.println("Welcome to <<Legend: Heroes and Monsters>> !!");
        System.out.println("In this game, you will be able to choose a team of 1-3 heroes and fight again monsters");
        System.out.println("The map will be 8x8, and there are markets to buy/sell items (marked as M), " +
                "common spaces, and inaccessible spaces (marked as X)");
        System.out.println("You can use WASD to move around. Press i to show info, and q to quit...");
        System.out.println("Press any key to start the game!");

        Scanner sc = new Scanner(System.in);
        String choice = sc.nextLine();
        //quit
        if (choice.equalsIgnoreCase("Q")) {
            quit();
        } else {
            while (true) {
                //select hero number
                System.out.print("Please select how many heroes you want (1-3): ");
                if (sc.hasNextInt()) {
                    numHeroes = sc.nextInt();
                    if (numHeroes <= 3 && numHeroes >= 1) {
                        break;
                    } else {
                        System.out.println("Invalid input...");
                    }
                } else {
                    System.out.println("Invalid input...");
                    sc.next();
                }
            }
        }
    }

    /**
     * form a hero team based on the number provided above
     */
    public void formTeam() {
        System.out.println(">-<->-<->-<->-<->-<->-<->-<->-<->-<->-<-");
        System.out.println("Here is a list of heroes you can choose");
        System.out.println("Please count down and enter the index of your selection: ");
        HeroesList.setHeroesList();
        HeroesList.printList();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numHeroes; ++i) {
            int heroIndex;
            while (true) {
                if (sc.hasNextInt()) {
                    heroIndex = sc.nextInt();
                    if (heroIndex >= 0 && heroIndex <= HeroesList.getHeroes().size()) {
                        heroTeam.add(HeroesList.getHeroes().get(heroIndex - 1));
                        System.out.println(heroTeam.get(i).name + " joined your team!");
                        break;
                    } else {
                        System.out.println("Invalid input...");
                    }
                } else {
                    System.out.println("Invalid input...");
                    sc.next();
                }
            }
        }
    }

    /**
     * This function prints the updated stats of the team everytime needed
     * function is copied from heroList print function
     */
    public void printTeam() {
        String title = "Name                  HP    Level    Mana    Strength    Dexterity    Agility    Money    Exp";
        String split = "-----------------------------------------------";
        int i;
        System.out.println();
        System.out.println("Here is the stats of your heroes...");
        System.out.println(title);
        System.out.println(split);
        for (i = 0; i < heroTeam.size(); ++i) {
            System.out.printf("%-20s %-8d %-6d %-9.0f %-12.0f %-11.0f %-9.0f %-8d %-5d", heroTeam.get(i).name,
                    heroTeam.get(i).level * 100, heroTeam.get(i).level, heroTeam.get(i).Mp, heroTeam.get(i).strength,
                    heroTeam.get(i).dexterity, heroTeam.get(i).agility, heroTeam.get(i).gold, heroTeam.get(i).exp);
            System.out.println();
        }
        System.out.println();
    }

    /**
     * This class will initialize monster team each time heroes encounter them
     */
    public void formMonsters() {
        MonstersList ml = new MonstersList();
        Monsters monster;
        ArrayList<Integer> levelList = new ArrayList<>();
        ArrayList<Monsters> temp = new ArrayList<>();
        //get hero team highest level
        for (Heroes heroes : heroTeam) {
            levelList.add(heroes.level);
        }
        int maxLevel = Collections.max(levelList);
        int[] array = randIntList(ml.getMonsters().size()-1);
        for (int a : array) {
            //select monsters from the list but not duplicate
            monster = ml.getMonsters().get(a);
            if (monster.level <= maxLevel){
                temp.add(monster);
            }
        }
        for (int i = 0; i < heroTeam.size(); ++i){
            monstersTeam.add(temp.get(i));
        }

    }

    /**
     * generate random int of a certain size
     * @param num size
     * @return int list
     */
    private int[] randIntList(int num) {
        MonstersList ml = new MonstersList();
        int min = 0, max = ml.getMonsters().size() - 1;
        int[] array = new int[num];
        Set<Integer> set = new HashSet<>();
        while (true){
            int i = (int)(Math.random() * (max-min)) +min;
            set.add(i);
            if(set.size() >= num){
                break;
            }
        }
        int j = 0;
        for (int a : set){
            array[j] = a;
            j++;
        }
        return array;
    }

    /**
     * print monster team list
     */
    public void printMonsters() {
        String title = "Name                  HP    Level    Damage    Defense   Dodge Chance";
        String split = "-----------------------------------------------";
        int i;
        System.out.println();
        System.out.println("Here is the stats of the monsters...");
        System.out.println(title);
        System.out.println(split);
        for (i = 0; i < monstersTeam.size(); ++i) {
            System.out.printf("%-20s %-8d %-8d %-9.0f %-13.0f %-9.0f", monstersTeam.get(i).name,
                    monstersTeam.get(i).level * 100, monstersTeam.get(i).level, monstersTeam.get(i).damage,
                    monstersTeam.get(i).defense, monstersTeam.get(i).dodgeChance * 500);
            System.out.println();
        }
    }

    /**
     * @return whether move or not
     */
    public boolean move() {
        Scanner sc = new Scanner(System.in);
        String action;

        //if move valid
        while (true) {
            System.out.print("Please enter WASD to move, Q to quit, I for info & stats: ");
            action = sc.nextLine();

            if (!action.equalsIgnoreCase("w") && !action.equalsIgnoreCase("a") &&
                    !action.equalsIgnoreCase("s") && !action.equalsIgnoreCase("d") &&
                    !action.equalsIgnoreCase("q") && !action.equalsIgnoreCase("i")) {
                System.out.println("This is not a valid input!");
                continue;
            }

            // move out of map
            if ((action.equalsIgnoreCase("a") && (colPos - 1 < 0)) ||
                    (action.equalsIgnoreCase("d") && (colPos + 1 >= map.getSize())) ||
                    (action.equalsIgnoreCase("w") && (rolPos - 1 < 0)) ||
                    (action.equalsIgnoreCase("s") && (rolPos + 1 >= map.getSize()))) {
                System.out.println("You cannot go out of the map!");
                continue;
            }

            // inaccessible space
            if ((action.equalsIgnoreCase("a") && (map.getMap()[rolPos][colPos - 1] instanceof InaccessibleSpaces)) ||
                    (action.equalsIgnoreCase("d") && (map.getMap()[rolPos][colPos + 1] instanceof InaccessibleSpaces)) ||
                    (action.equalsIgnoreCase("w") && (map.getMap()[rolPos - 1][colPos] instanceof InaccessibleSpaces)) ||
                    (action.equalsIgnoreCase("s") && (map.getMap()[rolPos + 1][colPos] instanceof InaccessibleSpaces))) {
                System.out.println("You cannot enter the inaccessible space!");
            } else {
                break;
            }
        }

        //after check, move
        if (action.equalsIgnoreCase("a")) {
            --colPos;
        } else if (action.equalsIgnoreCase("d")) {
            ++colPos;
        } else if (action.equalsIgnoreCase("w")) {
            --rolPos;
        } else if (action.equalsIgnoreCase("s")) {
            ++rolPos;
        }

        map.specialSet();
        // change the mark to let player know where they are
        map.setMark(rolPos, colPos);



        if (action.equalsIgnoreCase("q")) {
            quit();
        }

        if (action.equalsIgnoreCase("i")) {
            printTeam();
            return false;
        }
        return true;
    }

    /**
     * this class is used to quit the game
     */
    public void quit() {
        System.out.println("Thanks for playing! Bye!");
        System.exit(0);
    }

    /**
     * Check that certain space to see if player will enter market or start a fight
     */
    public void interact() {
        if (map.getLastMove() instanceof MarketSpaces) {
            visitMarket();
            map.printMap();
        }

        if (map.getLastMove() instanceof CommonSpaces) {
            Random rand = new Random();
            int monsterChance = rand.nextInt(3);

            if (monsterChance == 1) {
                startFight();
                map.printMap();
            }
        }
    }

    /**
     * Heroes must start a fight with the monsters if they encountered
     */
    private void startFight() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Oh, there are monsters ahead! We need to fight!");
        formMonsters();
        while (true){
            int heroNum = 0, monsterNum = 0; // keep record of which hero fight which monster

            printTeam();
            printMonsters();
            for (; heroNum < heroTeam.size() && monsterNum < monstersTeam.size(); ++heroNum){
                System.out.println();
                System.out.println(heroTeam.get(heroNum).name + " starts a fight with " + monstersTeam.get(monsterNum).name);

                heroTeam.get(heroNum).printItemList();

                System.out.println("What action would you like to perform? ");
                System.out.print("1 for attack, 2 to cast a spell, 3 to use a potion, 4 to change a weapon, 5 to change an armor: ");
                int choice;
                while (true) {
                    if (sc.hasNextInt()) {
                        choice = sc.nextInt();
                        if (choice <= 5 && choice >= 1) {
                            break;
                        } else {
                            System.out.println("Invalid input... You only have 5 choices");
                        }
                    } else {
                        System.out.println("Invalid input...");
                        sc.next();
                    }
                }

                if (!heroAction(choice, heroTeam.get(heroNum), monstersTeam.get(monsterNum))){
                    --heroNum;
                    continue;
                }

                if (!monstersTeam.get(monsterNum).isDead()){
                    System.out.println("It's now " + monstersTeam.get(monsterNum).name + "'s turn");
                    monstersTeam.get(monsterNum).attack(heroTeam.get(heroNum));
                }

                if (heroTeam.get(heroNum).isFaint() || monstersTeam.get(monsterNum).isDead()){
                    if (heroTeam.get(heroNum).isFaint()){
                        FaintHero.add(heroTeam.remove(heroNum));
                        --heroNum;
                        ++monsterNum;
                    }else {
                        monstersTeam.remove(monsterNum);
                    }
                    continue;
                }
                --heroNum;
            }
            
            if(isFightEnd()){
                break;
            }
        }


    }

    /**
     * check if a fight ended, reward if heroes win, quit if heroes lose
     * @return has fight ended
     */
    private boolean isFightEnd() {
        if(heroTeam.isEmpty()){
            System.out.println("Oh... All heroes are gone... Try it again");
            quit();
        } else if (monstersTeam.isEmpty()) {
            System.out.println("Oh!!! Successfully beats all the monsters!");
            System.out.println("Enjoy your awards in Gold and Exp! Fainted heroes will be revived!");
            reward();
        }else {
            return false;
        }
        return true;
    }

    /**
     * reward heroes after win, and revive all of them
     */
    private void reward() {
        for (Heroes hero: FaintHero){
            hero.Hp = hero.level * 100;
            hero.Mp = 500 + hero.level * 100;
            heroTeam.add(hero);
        }
        FaintHero = new ArrayList<Heroes>();

        for (Heroes hero: heroTeam){
            hero.setExpGained(hero.level * 5);
            hero.levelUp();
            hero.gold += hero.level * 100;
            hero.Hp = hero.level * 100;
            hero.Mp = 500 + hero.level * 100;
        }
    }

    /**
     * Perform correspond action like cast spell, use potion, or attack, based on player's choice
     * @param choice choice index
     * @param hero hero
     * @param monster monster
     * @return if success
     */
    private boolean heroAction(int choice, Heroes hero, Monsters monster) {
        switch (choice) {
            case 1://attack
                hero.attack(monster);
                return true;
            case 2://use spell
                hero.castSpell(monster);
                break;
            case 3://use potion
                hero.usePotion();
                break;
            case 4://change weapon
                hero.changeWeapon();
                break;
            case 5://change armor
                hero.changeArmor();
                break;
        }
        return false;
    }

    /**
     * enter the market space will allow heroes buy, sell their items
     */
    private void visitMarket() {
        Scanner sc = new Scanner(System.in);

        // each hero will have a chance to purchase
        for(int i = 0; i < heroTeam.size(); ++i){
            System.out.println("Welcome to the market. Each hero will have a chance to pick");
            System.out.println("You can either buy (press 1), sell (press 2), or skip/finish (press 3)");
            System.out.println(heroTeam.get(i).name + ", what would you like to do? ");

            int choice;
            while (true) {
                if (sc.hasNextInt()) {
                    choice = sc.nextInt();
                    if (choice <= 3 && choice >= 1) {
                        break;
                    } else {
                        System.out.println("Invalid input...");
                    }
                } else {
                    System.out.println("Invalid input...");
                    sc.next();
                }
            }

            switch (choice){
                case 1://buy
                    itemsList.printItems();
                    if (heroTeam.get(i).buy(chooseItem())) { heroTeam.get(i).printItemList();}
                    --i;
                    break;
                case 2://sell
                    heroTeam.get(i).printItemList();
                    int index = chooseInventory(heroTeam.get(i));

                    // if there is something in the inventory
                    if (index != 100){
                        heroTeam.get(i).sell(index);
                        heroTeam.get(i).printItemList();
                    }
                    --i;
                    break;
                case 3://skip
                    System.out.println("Thanks for visiting the market!");
                    break;
            }
        }
    }

    /**
     * choose an item in the inventory of a certain hero
     * @param heroes hero
     * @return item
     */
    private int chooseInventory(Heroes heroes) {
        // If nothing in the inventory
        if (heroes.items.isEmpty()){
            System.out.println("Oh, You don't have anything to sell...");
            return 100;
        }

        Scanner sc = new Scanner(System.in);

        System.out.print("Please count down through the list and ignore the index before it: ");

        int choice;
        while (true) {
            if (sc.hasNextInt()) {
                choice = sc.nextInt();
                if (choice <= heroes.items.size() && choice >= 0) {
                    System.out.println(heroes.items.get(choice - 1).name);
                    return choice;
                } else {
                    System.out.println("Invalid input...");
                }
            } else {
                System.out.println("Invalid input...");
                sc.next();
            }
        }
    }

    /**
     * choose an item in the item list
     * @return item
     */
    private Items chooseItem() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Choose an item and enter the index before it: ");

        int choice;
        while (true) {
            if (sc.hasNextInt()) {
                choice = sc.nextInt();
                if (choice <= itemsList.getItems().size() && choice >= 0) {
                    return itemsList.getItems().get(choice - 1);
                } else {
                    System.out.println("Invalid input...");
                }
            } else {
                System.out.println("Invalid input...");
                sc.next();
            }
        }
    }
}