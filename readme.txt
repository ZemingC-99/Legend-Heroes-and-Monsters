# CS611-<Assignment 3>
## <Legends: Heroes and monsters>
---------------------------------------------------------------------------
<Zeming Chen>
<zceric@bu.edu>
<U98986406>

## Files
---------------------------------------------------------------------------
<Armor>
/**
 * Armor class is a subclass of all items.
 * This will also have the feature of buyable.
 */

<CommonSpaces>
/**
 * This class inherit from Spaces class, and it will have a 
unique feature to distinguish with others
 */

<CurrentSpaces>
/**
 * This class inherit from Spaces class, and it will have a unique feature " o "to distinguish with others
 * This type of space is only used to record where the player is
 */

<Dragons>
/**
 * Dragons is the subclass of Monster class, which only has a slightly different stats.
 */

<Exoskeletons>
/**
 * Exoskeletons is the subclass of Monster class, which only has a slightly different stats.
 */

<Game>
/**
 * This class contains all the elements of the actual Legend game
 */

<Heroes>
/**
 * This class will have all things related to heroes
 * This will inherit from Roles class.
 * This will also be the super class for specific hero types
 */

<HeroesList>
/**
 * This class will store all different types of Heroes
 */

<InaccessibleSpaces>
/**
 * This class inherit from Spaces class, and it will have a unique feature " X "to distinguish with others
 */

<Items>
/**
 * This class contains all the items in the game (weapon, spell, potion, armor)
 * This will also implement a feature called tradable
 */

<ItemsList>
/**
 * This class will store all different types of Items
 */

<Main>
/**
 * This class starts the game
 */

<Map>
/**
 * This class will contain all the elements on the game map.
 */

<MarketSpaces>
/**
 * This class inherit from Spaces class, and it will have a unique feature " M " to distinguish with others
 */

<Monsters>
/**
 * This class will have all things related to monsters
 * This will inherit from Roles class.
 * This will also be the super class for specific monster types
 */

<MonstersList>
/**
 * This class will store all different types of Heroes
 */

<Paladins>
/**
 * This class will have special features for Paladins
 * This will inherit from Heroes class
 */

<Potions>
/**
 * Potion class is a subclass of all items.
 * This will also have the feature of buyable.
 */

<Roles>
/**
 * This class includes all the roles in the game (both hero and monster)
 * This will contain some common features all roles will share (name, level, hp)
 */

<Sorcerers>
/**
 * This class will have special features for Sorcerers
 * This will inherit from Heroes class
 */

<Spaces>
/**
 * This class includes all different types of spaces like Common Space, Market Space, and Inaccessible Space.
 * Each types of spaces will be a subclass that inherits this class.
 */

<Spell>
/**
 * Spell class is a subclass of all items.
 * This will also have the feature of buyable.
 */

<Spirits>
/**
 * Spirits is the subclass of Monster class, which only has a slightly different stats.
 */

<Tradable>
/**
 * This is the interface for all Items that could be traded in the market
 */

<Warriors>
/**
 * This class will have special features for Warriors
 * This will inherit from Heroes class
 */

<Weapon>
/**
 * Weapon class is a subclass of all items.
 * This will also have the feature of buyable.
 */


## Notes
---------------------------------------------------------------------------
1. All features required in the documents are implemented.

## How to compile and run
---------------------------------------------------------------------------
1. Download and unzip the files
2. Run the following instructions:
javac -d bin Legends/*.java
java -cp bin Main

## Input/Output Example
---------------------------------------------------------------------------
Welcome to <<Legend: Heroes and Monsters>> !!
In this game, you will be able to choose a team of 1-3 heroes and fight again monsters
The map will be 8x8, and there are markets to buy/sell items (marked as M), common spaces, and inaccessible spaces (marked as X)
You can use WASD to move around. Press i to show info, and q to quit...
Press any key to start the game!
s
Please select how many heroes you want (1-3): 2
>-<->-<->-<->-<->-<->-<->-<->-<->-<->-<-
Here is a list of heroes you can choose
Please count down and enter the index of your selection: 
Worriers: 
    Name                  HP    Level    Mana    Strength    Dexterity    Agility    Money    Exp
-----------------------------------------------
  1 Gaerdal_Ironhand     100      1      100       700          600         500       1354     7    
  2 Sehanine_Monnbow     100      1      600       700          500         800       2500     8    
  3 Muamman_Duathall     100      1      300       900          750         500       2546     6    
  4 Flandal_Steelskin    100      1      200       750          700         650       2500     7    
  5 Undefeated_Yoj       100      1      400       800          700         400       2500     7    
  6 Eunoia_Cyn           100      1      400       700          600         800       2500     6    
-----------------------------------------------
Paladins: 
    Name                  HP    Level    Mana    Strength    Dexterity    Agility    Money    Exp
-----------------------------------------------
  7 Parzival             100      1      300       750          700         650       2500     7    
  8 Sehanine_Moonbow     100      1      300       750          700         700       2500     7    
  9 Skoraeus_Stonebones  100      1      250       650          350         600       2500     4    
 10 Garl_Glittergold     100      1      100       600          400         500       2500     5    
 11 Amaryllis_Astra      100      1      500       500          500         500       2500     5    
 12 Caliber_Heist        100      1      400       400          400         400       2500     8    
-----------------------------------------------
Sorcerers: 
    Name                  HP    Level    Mana    Strength    Dexterity    Agility    Money    Exp
-----------------------------------------------
 13 Rillifane_Rallathil  100      1      1300      750          500         450       2500     9    
 14 Segojan_Earthcaller  100      1      900       800          650         500       2500     5    
 15 Reign_Havoc          100      1      800       800          800         800       2500     8    
 16 Reverie_Ashels       100      1      900       800          400         700       2500     7    
 17 Kalabar              100      1      800       850          600         400       2500     6    
 18 Skye_Soar            100      1      1000      700          500         400       2500     5    
12
Caliber_Heist joined your team!
17
Kalabar joined your team!

Here is the stats of your heroes...
Name                  HP    Level    Mana    Strength    Dexterity    Agility    Money    Exp
-----------------------------------------------
Caliber_Heist        100      1      400       400          400         400       2500     8    
Kalabar              100      1      800       850          600         400       2500     6    

Here is the world map!!    (o marks your current location)
X means the space is inaccessible, and M represents Market
+---+---+---+---+---+---+---+---+
| o |   |   |   | M | M |   | M |
+---+---+---+---+---+---+---+---+
| M |   |   |   |   | X | M | M |
+---+---+---+---+---+---+---+---+
|   |   |   | M | X |   |   | M |
+---+---+---+---+---+---+---+---+
| M | X |   |   | M |   | X | M |
+---+---+---+---+---+---+---+---+
|   | X |   | M | M | X | X |   |
+---+---+---+---+---+---+---+---+
| X | M | X | X |   |   | M | M |
+---+---+---+---+---+---+---+---+
|   | M | M |   | M | M |   | M |
+---+---+---+---+---+---+---+---+
| M | M |   |   |   | M | M |   |
+---+---+---+---+---+---+---+---+

Please enter WASD to move, Q to quit, I for info & stats: s
Here is the world map!!    (o marks your current location)
X means the space is inaccessible, and M represents Market
+---+---+---+---+---+---+---+---+
|   |   |   |   | M | M |   | M |
+---+---+---+---+---+---+---+---+
| o |   |   |   |   | X | M | M |
+---+---+---+---+---+---+---+---+
|   |   |   | M | X |   |   | M |
+---+---+---+---+---+---+---+---+
| M | X |   |   | M |   | X | M |
+---+---+---+---+---+---+---+---+
|   | X |   | M | M | X | X |   |
+---+---+---+---+---+---+---+---+
| X | M | X | X |   |   | M | M |
+---+---+---+---+---+---+---+---+
|   | M | M |   | M | M |   | M |
+---+---+---+---+---+---+---+---+
| M | M |   |   |   | M | M |   |
+---+---+---+---+---+---+---+---+

Welcome to the market. Each hero will have a chance to pick
You can either buy (press 1), sell (press 2), or skip/finish (press 3)
Caliber_Heist, what would you like to do? 
1
Name            Price    Level Required    Base Damage    Hands Required
-----------------------------------------------
1. Sward         500            1              800               1    
2. Bow           300            2              500               2    
3. Scythe        1000           6              1100              2    
4. Axe           550            5              850               1    
5. TSwards       1400           8              1600              2    
6. Dagger        200            1              250               1    
-----------------------------------------------
Name                    Price    Level Required    Damage Reduction
-----------------------------------------------
7. Platinum_Shield       150            1               200           
8. Breastplate           350            3               600           
9. Full_Body_Armor       1000           8               1100          
10. Wizard_Shield        1200           10              1500          
11. Guardian_Angel       1000           10              1000          
-----------------------------------------------
Name                    Price    Level Required    Increased Amount    Affected Attr
-----------------------------------------------
12. Healing_Potion       200            1                100             Health   
13. Strength_Potion      250            1                75              Strength 
14. Magic_Potion         350            2                100             Mp       
15. Luck_Elixir          500            4                65              Agility  
-----------------------------------------------
Name                    Price    Required Level    Base Damage    Mana Cost    Spell Type
-----------------------------------------------
16. Snow_Cannon          500            2             650            250       Ice             
17. Ice_Blade            250            1             450            100       Ice             
18. Frost_Blizzard       750            5             850            350       Ice             
19. Flame_Tornado        700            4             850            300       Fire            
20. Breath_of_Fire       350            1             450            100       Fire            
21. Lava_Comet           450            2             1000           550       Fire            
22. Lightning_Dagger     400            1             500            150       Lightning       
23. Thunder_Blast        750            4             950            400       Lightning       
24. Electric_Arrow       550            5             650            200       Lightning       
Choose an item and enter the index before it: 1
You've successfully bought Sward
Now you have 2000 gold
Here is the full list of item you own:
                  <WEAPON>

Name           Base Damage    Hands Required
-----------------------------------------------
1. Sward           800               1         
-----------------------------------------------
                  <ARMOR>

Name                  Damage Reduction
-----------------------------------------------
-----------------------------------------------
                  <POTION>

Name                   Increase Amount   Affected Attr
-----------------------------------------------
-----------------------------------------------
                  <SPELL>

Name                    Damage    Mp cost      Spell Type
-----------------------------------------------
-----------------------------------------------
Welcome to the market. Each hero will have a chance to pick
You can either buy (press 1), sell (press 2), or skip/finish (press 3)
Caliber_Heist, what would you like to do? 
1
Name            Price    Level Required    Base Damage    Hands Required
-----------------------------------------------
1. Sward         500            1              800               1    
2. Bow           300            2              500               2    
3. Scythe        1000           6              1100              2    
4. Axe           550            5              850               1    
5. TSwards       1400           8              1600              2    
6. Dagger        200            1              250               1    
-----------------------------------------------
Name                    Price    Level Required    Damage Reduction
-----------------------------------------------
7. Platinum_Shield       150            1               200           
8. Breastplate           350            3               600           
9. Full_Body_Armor       1000           8               1100          
10. Wizard_Shield        1200           10              1500          
11. Guardian_Angel       1000           10              1000          
-----------------------------------------------
Name                    Price    Level Required    Increased Amount    Affected Attr
-----------------------------------------------
12. Healing_Potion       200            1                100             Health   
13. Strength_Potion      250            1                75              Strength 
14. Magic_Potion         350            2                100             Mp       
15. Luck_Elixir          500            4                65              Agility  
-----------------------------------------------
Name                    Price    Required Level    Base Damage    Mana Cost    Spell Type
-----------------------------------------------
16. Snow_Cannon          500            2             650            250       Ice             
17. Ice_Blade            250            1             450            100       Ice             
18. Frost_Blizzard       750            5             850            350       Ice             
19. Flame_Tornado        700            4             850            300       Fire            
20. Breath_of_Fire       350            1             450            100       Fire            
21. Lava_Comet           450            2             1000           550       Fire            
22. Lightning_Dagger     400            1             500            150       Lightning       
23. Thunder_Blast        750            4             950            400       Lightning       
24. Electric_Arrow       550            5             650            200       Lightning       
Choose an item and enter the index before it: 17
You've successfully bought Ice_Blade
Now you have 1750 gold
Here is the full list of item you own:
                  <WEAPON>

Name           Base Damage    Hands Required
-----------------------------------------------
1. Sward           800               1         
-----------------------------------------------
                  <ARMOR>

Name                  Damage Reduction
-----------------------------------------------
-----------------------------------------------
                  <POTION>

Name                   Increase Amount   Affected Attr
-----------------------------------------------
-----------------------------------------------
                  <SPELL>

Name                    Damage    Mp cost      Spell Type
-----------------------------------------------
1. Ice_Blade             450        100        Ice     
-----------------------------------------------
Welcome to the market. Each hero will have a chance to pick
You can either buy (press 1), sell (press 2), or skip/finish (press 3)
Caliber_Heist, what would you like to do? 
3
Thanks for visiting the market!
Welcome to the market. Each hero will have a chance to pick
You can either buy (press 1), sell (press 2), or skip/finish (press 3)
Kalabar, what would you like to do? 
1
Name            Price    Level Required    Base Damage    Hands Required
-----------------------------------------------
1. Sward         500            1              800               1    
2. Bow           300            2              500               2    
3. Scythe        1000           6              1100              2    
4. Axe           550            5              850               1    
5. TSwards       1400           8              1600              2    
6. Dagger        200            1              250               1    
-----------------------------------------------
Name                    Price    Level Required    Damage Reduction
-----------------------------------------------
7. Platinum_Shield       150            1               200           
8. Breastplate           350            3               600           
9. Full_Body_Armor       1000           8               1100          
10. Wizard_Shield        1200           10              1500          
11. Guardian_Angel       1000           10              1000          
-----------------------------------------------
Name                    Price    Level Required    Increased Amount    Affected Attr
-----------------------------------------------
12. Healing_Potion       200            1                100             Health   
13. Strength_Potion      250            1                75              Strength 
14. Magic_Potion         350            2                100             Mp       
15. Luck_Elixir          500            4                65              Agility  
-----------------------------------------------
Name                    Price    Required Level    Base Damage    Mana Cost    Spell Type
-----------------------------------------------
16. Snow_Cannon          500            2             650            250       Ice             
17. Ice_Blade            250            1             450            100       Ice             
18. Frost_Blizzard       750            5             850            350       Ice             
19. Flame_Tornado        700            4             850            300       Fire            
20. Breath_of_Fire       350            1             450            100       Fire            
21. Lava_Comet           450            2             1000           550       Fire            
22. Lightning_Dagger     400            1             500            150       Lightning       
23. Thunder_Blast        750            4             950            400       Lightning       
24. Electric_Arrow       550            5             650            200       Lightning       
Choose an item and enter the index before it: 6
You've successfully bought Dagger
Now you have 2300 gold
Here is the full list of item you own:
                  <WEAPON>

Name           Base Damage    Hands Required
-----------------------------------------------
1. Dagger          250               1         
-----------------------------------------------
                  <ARMOR>

Name                  Damage Reduction
-----------------------------------------------
-----------------------------------------------
                  <POTION>

Name                   Increase Amount   Affected Attr
-----------------------------------------------
-----------------------------------------------
                  <SPELL>

Name                    Damage    Mp cost      Spell Type
-----------------------------------------------
-----------------------------------------------
Welcome to the market. Each hero will have a chance to pick
You can either buy (press 1), sell (press 2), or skip/finish (press 3)
Kalabar, what would you like to do? 
2
Here is the full list of item you own:
                  <WEAPON>

Name           Base Damage    Hands Required
-----------------------------------------------
1. Dagger          250               1         
-----------------------------------------------
                  <ARMOR>

Name                  Damage Reduction
-----------------------------------------------
-----------------------------------------------
                  <POTION>

Name                   Increase Amount   Affected Attr
-----------------------------------------------
-----------------------------------------------
                  <SPELL>

Name                    Damage    Mp cost      Spell Type
-----------------------------------------------
-----------------------------------------------
Please count down through the list and ignore the index before it: 1
Dagger
You've successfully sale Dagger for half of its original price
Now you have 2400 gold
Here is the full list of item you own:
                  <WEAPON>

Name           Base Damage    Hands Required
-----------------------------------------------
-----------------------------------------------
                  <ARMOR>

Name                  Damage Reduction
-----------------------------------------------
-----------------------------------------------
                  <POTION>

Name                   Increase Amount   Affected Attr
-----------------------------------------------
-----------------------------------------------
                  <SPELL>

Name                    Damage    Mp cost      Spell Type
-----------------------------------------------
-----------------------------------------------
Welcome to the market. Each hero will have a chance to pick
You can either buy (press 1), sell (press 2), or skip/finish (press 3)
Kalabar, what would you like to do? 
3
Thanks for visiting the market!
Here is the world map!!    (o marks your current location)
X means the space is inaccessible, and M represents Market
+---+---+---+---+---+---+---+---+
|   |   |   |   | M | M |   | M |
+---+---+---+---+---+---+---+---+
| o |   |   |   |   | X | M | M |
+---+---+---+---+---+---+---+---+
|   |   |   | M | X |   |   | M |
+---+---+---+---+---+---+---+---+
| M | X |   |   | M |   | X | M |
+---+---+---+---+---+---+---+---+
|   | X |   | M | M | X | X |   |
+---+---+---+---+---+---+---+---+
| X | M | X | X |   |   | M | M |
+---+---+---+---+---+---+---+---+
|   | M | M |   | M | M |   | M |
+---+---+---+---+---+---+---+---+
| M | M |   |   |   | M | M |   |
+---+---+---+---+---+---+---+---+

Please enter WASD to move, Q to quit, I for info & stats: d
Here is the world map!!    (o marks your current location)
X means the space is inaccessible, and M represents Market
+---+---+---+---+---+---+---+---+
|   |   |   |   | M | M |   | M |
+---+---+---+---+---+---+---+---+
| M | o |   |   |   | X | M | M |
+---+---+---+---+---+---+---+---+
|   |   |   | M | X |   |   | M |
+---+---+---+---+---+---+---+---+
| M | X |   |   | M |   | X | M |
+---+---+---+---+---+---+---+---+
|   | X |   | M | M | X | X |   |
+---+---+---+---+---+---+---+---+
| X | M | X | X |   |   | M | M |
+---+---+---+---+---+---+---+---+
|   | M | M |   | M | M |   | M |
+---+---+---+---+---+---+---+---+
| M | M |   |   |   | M | M |   |
+---+---+---+---+---+---+---+---+

Oh, there are monsters ahead! We need to fight!

Here is the stats of your heroes...
Name                  HP    Level    Mana    Strength    Dexterity    Agility    Money    Exp
-----------------------------------------------
Caliber_Heist        100      1      400       400          400         400       1750     8    
Kalabar              100      1      800       850          600         400       2400     6    


Here is the stats of the monsters...
Name                  HP    Level    Damage    Defense   Dodge Chance
-----------------------------------------------
Natsunomeryu         100      1        100       200           10       
BigBad-Wolf          100      1        150       250           15       

Caliber_Heist starts a fight with Natsunomeryu
Here is the full list of item you own:
                  <WEAPON>

Name           Base Damage    Hands Required
-----------------------------------------------
1. Sward           800               1         
-----------------------------------------------
                  <ARMOR>

Name                  Damage Reduction
-----------------------------------------------
-----------------------------------------------
                  <POTION>

Name                   Increase Amount   Affected Attr
-----------------------------------------------
-----------------------------------------------
                  <SPELL>

Name                    Damage    Mp cost      Spell Type
-----------------------------------------------
1. Ice_Blade             450        100        Ice     
-----------------------------------------------
What action would you like to perform? 
1 for attack, 2 to cast a spell, 3 to use a potion, 4 to change a weapon, 5 to change an armor: 4
Name           Base Damage    Hands Required
-----------------------------------------------
1. Sward           800               1         
-----------------------------------------------
Please select the index of the item: 
1
You are now equipped with Sward

Caliber_Heist starts a fight with Natsunomeryu
Here is the full list of item you own:
                  <WEAPON>

Name           Base Damage    Hands Required
-----------------------------------------------
-----------------------------------------------
                  <ARMOR>

Name                  Damage Reduction
-----------------------------------------------
-----------------------------------------------
                  <POTION>

Name                   Increase Amount   Affected Attr
-----------------------------------------------
-----------------------------------------------
                  <SPELL>

Name                    Damage    Mp cost      Spell Type
-----------------------------------------------
1. Ice_Blade             450        100        Ice     
-----------------------------------------------
What action would you like to perform? 
1 for attack, 2 to cast a spell, 3 to use a potion, 4 to change a weapon, 5 to change an armor: 2
Name                    Damage    Mp cost      Spell Type
-----------------------------------------------
1. Ice_Blade             450        100        Ice     
-----------------------------------------------
Please select the index of the item: 
1
You used a Ice spell on Natsunomeryu

Caliber_Heist starts a fight with Natsunomeryu
Here is the full list of item you own:
                  <WEAPON>

Name           Base Damage    Hands Required
-----------------------------------------------
-----------------------------------------------
                  <ARMOR>

Name                  Damage Reduction
-----------------------------------------------
-----------------------------------------------
                  <POTION>

Name                   Increase Amount   Affected Attr
-----------------------------------------------
-----------------------------------------------
                  <SPELL>

Name                    Damage    Mp cost      Spell Type
-----------------------------------------------
1. Ice_Blade             450        100        Ice     
-----------------------------------------------
What action would you like to perform? 
1 for attack, 2 to cast a spell, 3 to use a potion, 4 to change a weapon, 5 to change an armor: 1
You dealt 60.0 damage to Natsunomeryu
Natsunomeryu is dead

Kalabar starts a fight with BigBad-Wolf
Here is the full list of item you own:
                  <WEAPON>

Name           Base Damage    Hands Required
-----------------------------------------------
-----------------------------------------------
                  <ARMOR>

Name                  Damage Reduction
-----------------------------------------------
-----------------------------------------------
                  <POTION>

Name                   Increase Amount   Affected Attr
-----------------------------------------------
-----------------------------------------------
                  <SPELL>

Name                    Damage    Mp cost      Spell Type
-----------------------------------------------
-----------------------------------------------
What action would you like to perform? 
1 for attack, 2 to cast a spell, 3 to use a potion, 4 to change a weapon, 5 to change an armor: 1
You dealt 85.0 damage to BigBad-Wolf
BigBad-Wolf is still alive with 165.0 hp
It's now BigBad-Wolf's turn
The monster dealt 7.5 damage to Kalabar
Kalabar is still alive with 92.5 hp

Kalabar starts a fight with BigBad-Wolf
Here is the full list of item you own:
                  <WEAPON>

Name           Base Damage    Hands Required
-----------------------------------------------
-----------------------------------------------
                  <ARMOR>

Name                  Damage Reduction
-----------------------------------------------
-----------------------------------------------
                  <POTION>

Name                   Increase Amount   Affected Attr
-----------------------------------------------
-----------------------------------------------
                  <SPELL>

Name                    Damage    Mp cost      Spell Type
-----------------------------------------------
-----------------------------------------------
What action would you like to perform? 
1 for attack, 2 to cast a spell, 3 to use a potion, 4 to change a weapon, 5 to change an armor: 1
You dealt 85.0 damage to BigBad-Wolf
BigBad-Wolf is still alive with 80.0 hp
It's now BigBad-Wolf's turn
The monster dealt 7.5 damage to Kalabar
Kalabar is still alive with 85.0 hp

Kalabar starts a fight with BigBad-Wolf
Here is the full list of item you own:
                  <WEAPON>

Name           Base Damage    Hands Required
-----------------------------------------------
-----------------------------------------------
                  <ARMOR>

Name                  Damage Reduction
-----------------------------------------------
-----------------------------------------------
                  <POTION>

Name                   Increase Amount   Affected Attr
-----------------------------------------------
-----------------------------------------------
                  <SPELL>

Name                    Damage    Mp cost      Spell Type
-----------------------------------------------
-----------------------------------------------
What action would you like to perform? 
1 for attack, 2 to cast a spell, 3 to use a potion, 4 to change a weapon, 5 to change an armor: 1
You dealt 85.0 damage to BigBad-Wolf
BigBad-Wolf is dead
Oh!!! Successfully beats all the monsters!
Enjoy your awards in Gold and Exp! Fainted heroes will be revived!
Here is the world map!!    (o marks your current location)
X means the space is inaccessible, and M represents Market
+---+---+---+---+---+---+---+---+
|   |   |   |   | M | M |   | M |
+---+---+---+---+---+---+---+---+
| M | o |   |   |   | X | M | M |
+---+---+---+---+---+---+---+---+
|   |   |   | M | X |   |   | M |
+---+---+---+---+---+---+---+---+
| M | X |   |   | M |   | X | M |
+---+---+---+---+---+---+---+---+
|   | X |   | M | M | X | X |   |
+---+---+---+---+---+---+---+---+
| X | M | X | X |   |   | M | M |
+---+---+---+---+---+---+---+---+
|   | M | M |   | M | M |   | M |
+---+---+---+---+---+---+---+---+
| M | M |   |   |   | M | M |   |
+---+---+---+---+---+---+---+---+

Please enter WASD to move, Q to quit, I for info & stats: i

Here is the stats of your heroes...
Name                  HP    Level    Mana    Strength    Dexterity    Agility    Money    Exp
-----------------------------------------------
Caliber_Heist        200      2      700       440          440         420       1950     18   
Kalabar              200      2      700       893          660         440       2600     16   

Here is the world map!!    (o marks your current location)
X means the space is inaccessible, and M represents Market
+---+---+---+---+---+---+---+---+
|   |   |   |   | M | M |   | M |
+---+---+---+---+---+---+---+---+
| M | o |   |   |   | X | M | M |
+---+---+---+---+---+---+---+---+
|   |   |   | M | X |   |   | M |
+---+---+---+---+---+---+---+---+
| M | X |   |   | M |   | X | M |
+---+---+---+---+---+---+---+---+
|   | X |   | M | M | X | X |   |
+---+---+---+---+---+---+---+---+
| X | M | X | X |   |   | M | M |
+---+---+---+---+---+---+---+---+
|   | M | M |   | M | M |   | M |
+---+---+---+---+---+---+---+---+
| M | M |   |   |   | M | M |   |
+---+---+---+---+---+---+---+---+

Please enter WASD to move, Q to quit, I for info & stats: q
Thanks for playing! Bye!
