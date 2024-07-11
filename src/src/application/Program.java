package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Character;

public class Program {
    public static void main(String[] args) {

        //Page 31 starts investigator creation on CoC 7th Ed. Digital book.\\

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        Character character = new Character();

        System.out.println("Starting character creation process!");
        System.out.println("1st Step: Rolling for characteristics: ");
        System.out.println("Strength: 3D6 x 5");
        System.out.print("Do you need the program to roll for you? (y/n) ");
        char rollOpt = sc.next().charAt(0);

        char reRoll = 'y';
        while (reRoll == 'y' || reRoll == 'Y') {
            int strength = 0;
            switch(rollOpt) {
                case 'y':
                case 'Y':

                    for (int i = 1; i <= 3; i++) {
                        int roll = (int) (Math.random() * (7 - 1) + 1);
                        System.out.println("Roll " + i + ": " + roll);
                        strength += roll;
                    }
                    strength *= 5;

                    System.out.println("Your Strength: " + strength);
                    break;
                case 'n':
                case 'N':
                    int playerRoll;
                    for (int i = 1; i <= 3; i++) {
                        System.out.print("Enter roll " + i + ": ");
                        playerRoll = sc.nextInt();
                        strength += playerRoll;
                    }
                    strength *= 5;

                    System.out.println("Your Strength: " + strength);
                    break;
                default:
                    System.out.println("Option Invalid! Try again!");
                    System.out.print("Do you need the program to roll for you? (y/n) ");
                    rollOpt = sc.next().charAt(0);
                    break;
            }
            System.out.print("Do you want to reroll? (y/n) ");
            reRoll = sc.next().charAt(0);
            if (reRoll == 'y' || reRoll == 'Y') {
                System.out.print("Do you need the program to roll for you? (y/n) ");
                rollOpt = sc.next().charAt(0);
            } else {
                character.setStrength(strength);
                rollOpt = 'n';
            }
        }

        sc.close();
    }
}