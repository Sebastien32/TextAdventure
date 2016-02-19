import java.util.Scanner;
public class Character
{
    String primaryWeapon = "";
    String secondaryWeapon = "";
    String characterName = "";
    String characterRace = "";
    String characterRole = "";
    int[] attributes = new int[6];
    int cash = 0;
    Scanner in = new Scanner(System.in);
    public Character(String name, String race, String role, int[] tempAttributes)
    {
        characterName = name;
        characterRace = race;
        characterRole = role;
        attributes = tempAttributes;
        //Str, con, int, dex, wis, con
        if(characterRace.equals("elf"))
        {
            attributes[3]++;
            attributes[4]++;
        }
        if(characterRace.equals("half-elf1"))
        {
            attributes[1]++;
            attributes[4]++;
        }
        if(characterRace.equals("dwarf"))
        {
            attributes[1]++;
            attributes[0]++;
        }
        if(characterRace.equals("halfling"))
        {
            attributes[3]++;
            attributes[5]++;
        }
        if(characterRace.equals("gnome"))
        {
            attributes[3]++;
            attributes[2]++;
        }
        if(characterRace.equals("human"))
        {
            System.out.println("Which attribute would you like to increment by 2 (because you are human)?");
            System.out.println("\t1. Strength");
            System.out.println("\t1. Constitution");
            System.out.println("\t1. Intelligence");
            System.out.println("\t1. Dexterity");
            System.out.println("\t1. Wisdom");
            System.out.println("\t1. Charisma");
            int inputValue = in.nextInt();
            attributes[inputValue - 1]++;
        }
    }

    /*
     * Javadocs Here
     */
    public String getRole()
    {
        return characterRole;
    }

    /*
     *Javadocs Here
     */
    public int getStrength()
    {
        return attributes[0];
    }

    /*
    Javadocs Here
     */
    public int getConstitution()
    {
        return attributes[1];
    }

    /*
    Javadocs Here
     */
    public int getIntelligence()
    {
        return attributes[2];
    }

    /*
    Javadocs Here
     */
    public int getDexterity()
    {
        return attributes[3];
    }

    /*
    Javadocs Here
     */
    public int getWisdom()
    {
        return attributes[4];
    }

    /*
    Javadocs Here
     */
    public int getCharisma()
    {
        return attributes[5];
    }
    /*
    Javadocs Here
     */
    public int startingCash()
    {
        int totalCash = 0;
        for(int i = 0; i < this.getCharisma(); i++)
        {
            totalCash += 1 + 6 * Math.random();
        }
        return totalCash;
    }

    /*
    Javadocs Here
     */
    public int getCash()
    {
        return cash;
    }

    /*
    Javadocs Here
     */
    public void addCash(int cashToAdd)
    {
        cash += cashToAdd;
    }
    public void addPrimaryWeapon(String wep)
    {
        primaryWeapon = wep;
    }

    public void addSecondaryWeapon(String wep)
    {
        secondaryWeapon = wep;
    }

    public String getPrimaryWeapon()
    {
        return primaryWeapon;
    }

    public String getSecondaryWeapon()
    {
        return secondaryWeapon;
    }

}
