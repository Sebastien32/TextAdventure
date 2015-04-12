import java.util.Scanner;
import java.util.Arrays;
public class Main
{
    public static void main(String []args)
    {
        String characterName = "fakename";
        String characterRace = "fakerace";
        String characterRole = "fakerole";
        int[] characterAttributes = {0, 0, 0, 0, 0, 0};
        int[] characterCompletion = {0, 0, 0, 0};
        int choiceNumber = 0;
        boolean characterSetupComplete = (characterCompletion[0] == 1)
            && (characterCompletion[1] == 1)
            && (characterCompletion[2] == 1)
            && (characterCompletion[3] == 1);
        boolean told = false;
        int[] townCompletion = new int[2];
        //declares a new Scanner object to detect inputs
        Scanner in = new Scanner(System.in);
        //creates a String called characterName that stores the character's name as retrieved from the askForName method
        characterName = askForName();
        characterCompletion[0] = 1;
        //asks player what they would like to do next
        while(!characterSetupComplete)
        {
            System.out.println("What would you like to do?");
            System.out.println("\t1. Race");
            System.out.println("\t2. Role");
            System.out.println("\t3. Attributes");
            System.out.println("\t4. More Information");
            choiceNumber = in.nextInt();
            if(!(choiceNumber == 4) && (characterCompletion[choiceNumber] == 1))
            {
                System.out.println("You have already done that.");
            }
            if(choiceNumber < 0)
            {
                System.out.println("Input not valid");
            }
            if((choiceNumber == 1) && (characterCompletion[1] == 0))
            {
                characterRace = askForRace();
                characterCompletion[1] = 1;
            }
            if((choiceNumber == 2) && (characterCompletion[2] == 0))
            {
                characterRole = askForRole();
                characterCompletion[2] = 1;
            }
            if((choiceNumber == 3) && (characterCompletion[3] == 0))
            {
                characterAttributes = askForAttributes();
                characterCompletion[3] = 1;
            }
            if(choiceNumber == 4)
            {
                printMoreInformation();
            }
            characterSetupComplete = (characterCompletion[0] == 1)
            && (characterCompletion[1] == 1)
            && (characterCompletion[2] == 1)
            && (characterCompletion[3] == 1);
        }
        Character player = new Character(characterName, characterRace, characterRole, characterAttributes);
        player.addCash(player.startingCash());
        System.out.println("Welcome, " + characterName + ". You are a " +  characterRace +
            characterRole + ". You have " + player.getCash() + " gold pieces.");
        System.out.println("Where would you like to go?");
        System.out.println("1. Pub");
        System.out.println("2. Armory");
        choiceNumber = in.nextInt();
        if(choiceNumber == 1)
        {
            told = pubEncounter(player);
            townCompletion[0]++;
            if(!told)
            {
                System.out.println("On your way out of the pub, you see a sign mentioning that the King has " +
                    "posted a 1000 gold reward for anyone who is able to defeat the dragon in the dungeon under the deadly swamp.");
            }
            System.out.println("You go to the armory now. You have no choice.");
            armory(player);
        }
        if(choiceNumber == 2)
        {
            armory(player);
            townCompletion[1]++;
        }
    }

    /*
    JAVADOCS here
     */
    //ask the player for the character's name
    public static String askForName()
    {
        //declares a new Scanner to read inputs
        Scanner in = new Scanner(System.in);
        //asks for character name
        System.out.println("Greetings! What is you name, adventurer?");
        //takes the input and stores it in the "inputName" variable
        String inputName = in.nextLine();
        return inputName;
    }

    /*
    JAVADOCS here
     */
    //asks the player for the character's race
    public static String askForRace()
    {
        Scanner in = new Scanner(System.in);
        int inputValue = -1;
        //asks for what race a character is and gives a list of all possible races
        System.out.println("Greetings! Which race are you?");
        System.out.println("\t1. Elf");
        System.out.println("\t2. Half-elf");
        System.out.println("\t3. Dwarf");
        System.out.println("\t4. Halfling");
        System.out.println("\t5. Gnome");
        System.out.println("\t6. Human");
        System.out.println("\t7. More information");
        inputValue = in.nextInt();
        while(!(inputValue < 0) || (inputValue > 7))
        {
            if(inputValue == 1)
            {
                return "elf";
            }
            if(inputValue == 2)
            {
                return "half-elf";
            }
            if(inputValue == 3)
            {
                return "dwarf";
            }
            if(inputValue == 4)
            {
                return "halfling";
            }
            if(inputValue == 5)
            {
                return "gnome";
            }
            if(inputValue == 6)
            {
                return "human";
            }
            if(inputValue == 7)
            {
                printRaceInformation();
                System.out.println("Which race are you?");
                inputValue = in.nextInt();
            }
        }
        return "fakerace";
    }

    /*
    JAVADOCS here
     */
    //asks the player for the character's role
    //Fighter (STR), Ranger(DEX), Wizard (WIS), THIEF/ASSASSIN(INT)
    public static String askForRole()
    {
        int inputValue = -1;
        Scanner in = new Scanner(System.in);
        System.out.println("Which role would you like to be?");
        System.out.println("\t1. Knight");
        System.out.println("\t2. Ranger");
        System.out.println("\t3. Wizard");
        System.out.println("\t4. Rogue");
        System.out.println("\t5. More information about classes.");
        inputValue = in.nextInt();
        while(!(inputValue < 0) || (inputValue > 5))
        {
            if(inputValue == 1)
            {
                return "knight";
            }
            if(inputValue == 2)
            {
                return "ranger";
            }
            if(inputValue == 3)
            {
                return "wizard";
            }
            if(inputValue == 4)
            {
                return "rogue";
            }
            if(inputValue == 5)
            {
                printRoleInformation();
            }
            System.out.println("Which role would you like to be?");
            System.out.println("\t1. Knight");
            System.out.println("\t2. Ranger");
            System.out.println("\t3. Wizard");
            System.out.println("\t4. Rogue");
            System.out.println("\t5. More information about classes.");
            inputValue = in.nextInt();
        }
        return "fakerole";
    }

    /*
    JAVADOCS here
     */
    //asks the player for the character's attributes
    public static int[] askForAttributes()
    {
        Scanner in = new Scanner(System.in);
        int[] scores = new int[6];
        int attributeMethod = -1;
        System.out.println("Which method for attribute generation would you like to use?");
        System.out.println("\t1. Standard array (more safe)");
        System.out.println("\t2. Best 3 of 4 6-sided die (more random)");
        System.out.println("\t3. Point-buy (more customizable)");
        System.out.println("\t4. More information about attributes");
        attributeMethod = in.nextInt();
        while((attributeMethod < 0) || (attributeMethod > 4))
        {
            System.out.println("Input not valid.");
            System.out.println("Which method for attribute generation would you like to use?");
            System.out.println("\t1. Standard array (more safe)");
            System.out.println("\t2. Best 3 of 4 6-sided die (more random)");
            System.out.println("\t3. Point-buy (more customizable)");
            System.out.println("\t4. More information about attributes");
            attributeMethod = in.nextInt();
        }
        while(attributeMethod == 4)
        {
            printAttributeInformation();
            System.out.println("Which method for attribute generation would you like to use?");
            System.out.println("\t1. Standard array (more safe)");
            System.out.println("\t2. Best 3 of 4 6-sided die (more random)");
            System.out.println("\t3. Point-buy (more customizable)");
            System.out.println("\t4. More information about attributes");
            attributeMethod = in.nextInt();
        }
        if(attributeMethod == 1)
        {
            scores = scoreGenerator1();
            System.out.println("Your scores are:");
            System.out.println(Arrays.toString(scores));
        }
        else if(attributeMethod == 2)
        {
            scores = scoreGenerator2();
            System.out.println("Your scores are:");
            System.out.println(Arrays.toString(scores));
        }
        else if(attributeMethod == 3)
        {
            scores = scoreGenerator3();
            System.out.println("Your scores are:");
            System.out.println(Arrays.toString(scores));
        }
        return scores;
    }

    /*
    JAVADOCS here
     */
    //If user asks for more information
    public static void printMoreInformation()
    {
        Scanner in = new Scanner(System.in);
        int choiceNumber = 0;
        while(choiceNumber < 4)
        {
            System.out.println("What would you like information about?");
            System.out.println("\t1. List of races and their attributes.");
            System.out.println("\t2. List of roles and how they work.");
            System.out.println("\t3. List of attributes and their bonuses.");
            System.out.println("\t4. I'm done here.");
            choiceNumber = in.nextInt();
            if(choiceNumber < 0)
            {
                System.out.println("Input not valid, you have been kicked out.");
            }
            if(choiceNumber == 1)
            {
                printRaceInformation();
            }
            if(choiceNumber == 2)
            {
                printRoleInformation();
            }
            if(choiceNumber == 3)
            {
                printAttributeInformation();
            }
        }
    }

    /*
    JAVADOCS here
     */
    //Prints information about all in-game races.
    public static void printRaceInformation()
    {
        System.out.println("Here is a list of all races and their attribute bonuses:");
        System.out.println("\tElf: +1 to DEXTERITY and +1 to WISDOM");
        System.out.println("\tHalf-elf: +1 to CONSTITUTION and +1 to WISDOM");
        System.out.println("\tDwarf: +1 to CONSTITUTION and +1 to STRENGTH");
        System.out.println("\tHalfling: +1 to DEXTERITY and +1 to CHARISMA");
        System.out.println("\tGnome: +1 to DEXTERITY and +1 to INTELLIGENCE");
        System.out.println("\tHuman: +2 to ANY");
    }

    /*
    JAVADOCS here
     */
    //Prints information about all in-game roles.
    public static void printRoleInformation()
    {
        System.out.println("Here is alist of all roles and their characteristics.");
        System.out.println("\tKnight: Knights use brute force and superior strength to crush their opponents in combat." +
            "Their primary attribute is strength and their secondary attribute is constituion. Their primary weapon is the" +
            "longsword and their secondary \"weapon\" is a shield.");
        System.out.println("\tRanger: Rangers are accurate \"ranged\" specialists (duh) who use long range and mobility to beat their opponents." +
            "Their primary attribute is dexterity and their secondary attribute is intelligence. Their primary weapon is the" +
            "longbow and their secondary weapon is the short sword.");
        System.out.println("\tWizard: Wizards use their knowledge of magic spells to beat their opponents." +
            "Their primary attribute is wisdom and their secondary attribute is charisma. Their primary weapon is their" +
            "magic and their secondary weapon is short sword.");
        System.out.println("\tRogue: Rogues use their high intelligence to surprise enemies and burst them down." +
            "Their primary attribute is intelligence and their secondary attribute is dexterity. Their primary weapon is the" +
            "short bow and their secondary weapon is the short sword.");
    }

    /*
    JAVADOCS here
     */
    //Prints information about all in-game attributes.
    public static void printAttributeInformation()
    {
        System.out.println("Here is a list of all attributes and their stat bonuses:");
        //Prints info about Strength attribute
        System.out.println("Strength: Used for physical tasks such as lifting objects and melee combat stats.");
        //Prints the level 13, 16, and 18 bonuses of Strength attribute
        System.out.println("Bonuses:");
        System.out.println("\tAt 13: +1 melee damage and +5% hit chance with melee weapons.");
        System.out.println("\tAt 16: +2 melee damage and +10% hit chance with melee weapons.");
        System.out.println("\tAt 18: +4 melee damage and +20% hit chance with melee weapons.");
        System.out.println();
        //Prints info about Constitution attribute
        System.out.println("Constitution: Used for calculating total health of your character and resistances (poisons and stuns).");
        //Prints the level 13, 16, and 18 bonuses of Constitution attribute
        System.out.println("Bonuses:");
        System.out.println("\tAt 13: +5 health and +5% resistance.");
        System.out.println("\tAt 16: +10 health and +10% resistance.");
        System.out.println("\tAt 18: +20 health and +20% resistance.");
        System.out.println();
        //Prints info about Intelligence attribute
        System.out.println("Intelligence: Used for initiative.");
        //Prints the level 13, 16, and 18 bonuses of Intelligence attribute
        System.out.println("Bonuses:");
        System.out.println("\tAt 13: +1 to initiative and 10% chance to surprise enemies.");
        System.out.println("\tAt 16: +2 to initiative and 30% chance to surprise enemies.");
        System.out.println("\tAt 18: +4 to initiative and 50% chance to surprise enemies.");
        System.out.println();
        //Prints info about Dexterity attribute
        System.out.println("Dexterity: Used for skillful tasks such as lockpicking/climbing and ranged combat stats.");
        //Prints the level 13, 16, and 18 bonuses of Dexterity attribute
        System.out.println("Bonuses:");
        System.out.println("\tAt 13: +1 ranged damage and +5% hit chance with ranged weapons.");
        System.out.println("\tAt 16: +2 ranged damage and +10% hit chance with ranged weapons.");
        System.out.println("\tAt 18: +4 ranged damage and +20% hit chance with ranged weapons.");
        System.out.println();
        //Prints info about Wisdom attribute
        System.out.println("Wisdom: Used for casting spells and knowledge checks.");
        //Prints the level 13, 16, and 18 bonuses of Wisdom attribute
        System.out.println("Bonuses:");
        System.out.println("\tAt 13: +1 damage and +5% chance to hit for all spells.");
        System.out.println("\tAt 16: +2 damage and +10% chance to hit for all spells.");
        System.out.println("\tAt 18: +4 damage and +20% chance to hit for all spells.");
        System.out.println();
        //Prints info about Charisma attribute
        System.out.println("Charisma: Used for interacting with other characters and negotiating prices.");
        //Prints the level 13, 16, and 18 bonuses of Charisma attribute
        System.out.println("Bonuses:");
        System.out.println("\tAt 13: 5% more likely to get information in pubs, up to 10% off of all items.");
        System.out.println("\tAt 16: 10% more likely to get information in pubs, up to 20% off of all items.");
        System.out.println("\tAt 18: 20% more likely to get information in pubs, up to 30% off of all items.");
        System.out.println();
    }

    /*
    JAVADOCS here
     */
    //for method 1 of stats generation
    public static int[] scoreGenerator1()
    {
        int[] scores = {16, 14, 13, 12, 11, 10};
        return scores;
    }

    /*
    JAVADOCS here
     */
    //for method 2 of stats generation
    public static int[] scoreGenerator2()
    {
        int[] scores = new int[6];
        int first;
        int second;
        int third;
        int fourth;
        int total;
        for(int i = 0; i < scores.length; i++)
        {
            first = (int) (1 + 6 * Math.random());
            second = (int) (1 + 6 * Math.random());
            third = (int) (1 + 6 * Math.random());
            fourth = (int) (1 + 6 * Math.random());
            total = first + second + third + fourth - Math.min(Math.min(first, second), Math.min(third, fourth));
            System.out.println("The total was " + total);
            scores[i] = total;
        }
        return scores;
    }

    /*
    JAVADOCS here
     */
    //for method 3 of stats generation
    public static int[] scoreGenerator3()
    {
        Scanner in = new Scanner(System.in);
        //stores attribute values
        int[] scores = {10, 10, 10, 10, 10, 10};
        //stores remaining points left
        int points = 22; //for now, might be increased
        //stores input from Scanner
        int inputNumber;
        //Prints current scores
        while(points > 0)
        {
            System.out.println("Your scores are:");
            System.out.println("\tStrength: " + scores[0]);
            System.out.println("\tConstitution: " + scores[1]);
            System.out.println("\tIntelligence: " + scores[2]);
            System.out.println("\tWisdom: " + scores[3]);
            System.out.println("\tDexterity: " + scores[4]);
            System.out.println("\tCharisma: " + scores[5]);
            System.out.println("What attribute would you like to increment? You have " + points + " points left.");
            System.out.println("\t1. Strength to " + (scores[0] + 1) + " for " + attributeIncrementCost(scores[0]) + " points.");
            System.out.println("\t2. Constituion to " + (scores[1] + 1) + " for " + attributeIncrementCost(scores[1]) + " points.");
            System.out.println("\t3. Intelligence to " + (scores[2] + 1) + " for " + attributeIncrementCost(scores[2]) + " points.");
            System.out.println("\t4. Dexterity to " + (scores[3] + 1) + " for " + attributeIncrementCost(scores[3]) + " points.");
            System.out.println("\t5. Wisdom to " + (scores[4] + 1) + " for " + attributeIncrementCost(scores[4]) + " points.");
            System.out.println("\t6. Charisma to " + (scores[5] + 1) + " for " + attributeIncrementCost(scores[5]) + " points.");
            inputNumber = in.nextInt();
            //If you don't have enough points left,
            if(points < attributeIncrementCost(inputNumber))
            {
                System.out.println("Not enough points.");
            }
            if(inputNumber == 1)
            {
                points -= attributeIncrementCost(scores[0]);
                scores[0]++;
            }
            if(inputNumber == 2)
            {
                points -= attributeIncrementCost(scores[1]);
                scores[1]++;
            }
            if(inputNumber == 3)
            {
                points -= attributeIncrementCost(scores[2]);
                scores[2]++;
            }
            if(inputNumber == 4)
            {
                points -= attributeIncrementCost(scores[3]);
                scores[3]++;
            }
            if(inputNumber == 5)
            {
                points -= attributeIncrementCost(scores[4]);
                scores[4]++;
            }
            if(inputNumber == 6)
            {
                points -= attributeIncrementCost(scores[5]);
                scores[5]++;
            }
        }
        return scores;
    }

    /*
    JAVADOCS here
     */
    //for calculating the cost of one atttribute point increment
    public static int attributeIncrementCost(int currentAttribute)
    {
        if(currentAttribute < 13)
        {
            return 1;
        }
        if(currentAttribute < 16)
        {
            return 2;
        }
        if(currentAttribute >= 16)
        {
            return 3;
        }
        else
        {
            return 42;
        }
    }

    /*
    JAVADOCS here
     */
    //for the pub encounter
    public static boolean pubEncounter(Character player)
    {
        boolean told = false;
        int charismaMod = 0;
        int choiceNumber = 0;
        Scanner in = new Scanner(System.in);
        if(player.getCash() < 10)
        {
            System.out.println("After hours in the pub, you find no one with any information that might" +
                "help you in any way.");
            System.out.println("You have " + player.getCash() + " gold pieces.");
        }
        System.out.println("As you enter the pub, you spot a shady figure who beckons you over.");
        System.out.println("He claims that he has information that you will need, but it will cost ");
        System.out.println("Will you:");
        System.out.println("\t1. Pay him 10 gold pieces for his information.");
        System.out.println("\t2. Ignore him.");
        choiceNumber = in.nextInt();
        if(player.getCharisma() >= 18)
        {
            charismaMod += 10;
        }
        if(player.getCharisma() >= 16)
        {
            charismaMod += 5;
        }
        if(player.getCharisma() >= 13)
        {
            charismaMod += 5;
        }
        if((choiceNumber == 1) && (100*Math.random() < ((5 * player.getCharisma()) + charismaMod)))
        {
            System.out.println("The man tells you that the king has set out a reward of 1000 gold pieces" +
                "for anyone who can slay the dragon that lives in the dungeon under the deadly forest." +
                "Perhaps a young adventurer like you might be interested in seeking fortune and glory there.");
            player.addCash(-10);
            System.out.println("You have " + player.getCash() + " gold pieces.");
            told = true;
        }
        else if(choiceNumber == 1)
        {
            System.out.println("The man takes your ten gold pieces, smiles and walks to the bar to buy another beer.");
            System.out.println("\"Wait!\", you say \"What about my information?\"");
            System.out.println("\"Oh yeah\", he says \"I lied.\"");
            player.addCash(-10);
            System.out.println("You have " + player.getCash() + " gold pieces.");
        }
        else if(choiceNumber == 2)
        {
            System.out.println("After hours in the pub, you find no one with any information that might" +
                "help you in any way but spend 5 gold pieces on drinks.");
            player.addCash(-5);
            System.out.println("You have " + player.getCash() + " gold pieces.");
            choiceNumber = 1;
        }
        return told;
    }

    /*
    JAVADOCS here
     */
    //for the pub encounter
    public static void armory(Character player)
    {
        Scanner in = new Scanner(System.in);
        String primaryWeapon = "fakeweapon";
        String secondaryWeapon = "fakeweapon";
        System.out.println("Welcome to the Armory!");
        System.out.println("Here are the available items:");
        int largeCost = 10;
        int smallCost = 5;
        if(player.getRole().equals("knight"))
        {
            primaryWeapon = "longsword";
            secondaryWeapon = "shield";
        }
        if(player.getRole().equals("ranger"))
        {
            primaryWeapon = "longbow";
            secondaryWeapon = "short sword";
        }
        if(player.getRole().equals("rogue"))
        {
            primaryWeapon = "short bow";
            secondaryWeapon = "short sword";
        }
        if(player.getCharisma() >= 18)
        {
            largeCost -= 1;
        }
        if(player.getCharisma() >= 16)
        {
            largeCost -= 1;
            smallCost -= 1;
        }
        if(player.getCharisma() >= 13)
        {
            largeCost -= 1;
        }
        if(player.getRole().equals("knight"))
        {
            System.out.println("\tLongsword: " + largeCost + "gold. Does 1-6 damage.");
            System.out.println("\tShield: " + smallCost + "gold. Blocks 1-2 damage (passive).");
        }
        if(player.getRole().equals("Ranger"))
        {
            System.out.println("\tLongbow: " + largeCost + "gold. Does 1-6 damage.");
            System.out.println("\tShort sword: " + smallCost + "gold. Does 1-4 damage.");
        }
        if(player.getRole().equals("Wizard"))
        {
            System.out.println("\t1) Magic missile: Does 1-4 damage. Costs " + smallCost);
            System.out.println("\t2) Healing aura: Returns 1-4 health. Costs " + smallCost);
            System.out.println("\t3) Rain of Fire: Does 1-2 damage to all enemies. Costs " + smallCost);      
        }
        if(player.getRole().equals("Rogue"))
        {
            System.out.println("\tShort bow: " + largeCost + "gold. Does 1-4 damage.");
            System.out.println("\tShort sword: " + smallCost + "gold. Does 1-4 damage.");
        }
        if(!(player.getRole().equals("wizard")) && (player.getCash() > largeCost))
        {
            System.out.println("Would you like to buy item 1? Y/N)");
            if(in.next().toLowerCase().equals("y"))
            {
                player.addPrimaryWeapon(primaryWeapon);
            }
        }
        if(!(player.getRole().equals("wizard")) && (player.getCash() > largeCost))
        {
            System.out.println("Would you like to buy item 2? Y/N");
            if(in.next().toLowerCase().equals("y"))
            {
                player.addSecondaryWeapon(secondaryWeapon);
            }
        }

        String spell1 = "";
        String spell2 = "";

        if(player.getRole().equals("wizard"))
        {
            while(in.hasNextInt() && player.getCash() > smallCost)
            {
                if(spell1.equals(""))
                {

                    if(in.nextInt() == 1)
                    {
                        spell1 = "Magic missile";
                    }
                    if(in.nextInt() == 2)
                    {
                        spell1 = "Healing aura";
                    }
                    if(in.nextInt() == 3)
                    {
                        spell1 = "Rain of fire";
                    }
                }
                else
                {
                    if(in.nextInt() == 1)
                    {
                        spell2 = "Magic missile";
                    }
                    if(in.nextInt() == 2)
                    {
                        spell2 = "Healing aura";
                    }
                    if(in.nextInt() == 3)
                    {
                        spell2 = "Rain of fire";
                    }
                }
            }
            player.addPrimaryWeapon(spell1);
            player.addSecondaryWeapon(spell2);
        }

    }
}
