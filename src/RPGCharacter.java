import javax.swing.*;
import java.text.DecimalFormat;
import java.util.Scanner;

public class RPGCharacter {
    /*Create a program that calculates an RPG Character's battle stats based on the character's physical stats.
    The physical and battle stat can be anything you wish provided it meets these criteria:

        The physical stats (Strength, Dexterity, Spirit etc ...) will be entered by the user
        The battle stats (damage, armor, mana capacity, spell strength ...) will be calculated based on the physical stats.

     We will continue to expand on this program throughout the year, so give it some thought. There should be some complexity.

     The program should run using dialog boxes and the output should show ALL the character's stats including a name.
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        String characterName;
        int spirit,strength,speed,dexterity,energy,spellStrength;
        int life = 100;
        double damage,armor,manaCapacity;

        characterName =JOptionPane.showInputDialog("Input your characters Name!!");

        strength =Integer.parseInt((JOptionPane.showInputDialog("Input your characters strength: ")));

        dexterity =Integer.parseInt((JOptionPane.showInputDialog("Input your characters dexterity: ")));

        energy =Integer.parseInt((JOptionPane.showInputDialog("Input your characters energy: ")));

        spirit =Integer.parseInt((JOptionPane.showInputDialog("Input your characters spirit: ")));

        spellStrength = (energy +  spirit) ;
        damage = (spellStrength + strength)/2 ;
        armor = (dexterity + energy)/3 ;
        manaCapacity = (energy + dexterity);

        DecimalFormat roundTo2 = new DecimalFormat("0.00");

        JOptionPane.showMessageDialog(null, "Here is " + characterName+ "s' stats: " +"\nSpell Strength: " + roundTo2.format(spellStrength) + "\nDamage: " +
                roundTo2.format(damage) + "\nArmor: " + roundTo2.format(armor) + "\nmana Capacity: " +roundTo2.format(manaCapacity));

        System.exit(0);
    }
}
