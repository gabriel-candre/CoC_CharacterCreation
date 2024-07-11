package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Character;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        Character character = new Character();

        System.out.println("Starting character creation process!");
        System.out.println("1st Step: Rolling for characteristics: ");
        System.out.println("Strength: 3D6 x 5");
        System.out.print("Do you need the program to roll for you? (y/n) ");
        char rollOpt = sc.next().charAt(0);

        while(rollOpt != 'y' && rollOpt != 'Y' && rollOpt != 'n' && rollOpt != 'N') {
            System.out.println("Option Invalid! Try again!");
            System.out.print("Do you need the program to roll for you? (y/n) ");
            rollOpt = sc.next().charAt(0);
        }

        switch(rollOpt) {
            case 'y':
            case 'Y':
                int strength = 0;
                for (int i = 1; i <= 5; i++) {
                    int roll = (int) (Math.random() * (7 - 1) + 1);
                    System.out.println("Roll " + i + ": " + roll);
                    strength += roll;
                }
                strength *= 5;

                System.out.println("Your Strength: " + strength);

                character.setStrength(strength);

                break;
            default:
                break;
        }

        sc.close();
    }
}