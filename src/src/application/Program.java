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
        System.out.println("1st Step: Rolling for characteristics: \n-");

        System.out.println("Strength: (3D6) x 5");
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
        System.out.println("-");

        System.out.println("Constitution: (3D6) x 5");
        System.out.print("Do you need the program to roll for you? (y/n) ");
        rollOpt = sc.next().charAt(0);

        reRoll = 'y';
        while (reRoll == 'y' || reRoll == 'Y') {
            int cons = 0;
            switch(rollOpt) {
                case 'y':
                case 'Y':

                    for (int i = 1; i <= 3; i++) {
                        int roll = (int) (Math.random() * (7 - 1) + 1);
                        System.out.println("Roll " + i + ": " + roll);
                        cons += roll;
                    }
                    cons *= 5;

                    System.out.println("Your Constitution: " + cons);
                    break;
                case 'n':
                case 'N':
                    int playerRoll;
                    for (int i = 1; i <= 3; i++) {
                        System.out.print("Enter roll " + i + ": ");
                        playerRoll = sc.nextInt();
                        cons += playerRoll;
                    }
                    cons *= 5;

                    System.out.println("Your Constitution: " + cons);
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
                character.setConstitution(cons);
                rollOpt = 'n';
            }
        }
        System.out.println("-");

        System.out.println("Size: ((2D6) + 6) x 5");
        System.out.print("Do you need the program to roll for you? (y/n) ");
        rollOpt = sc.next().charAt(0);

        reRoll = 'y';
        while (reRoll == 'y' || reRoll == 'Y') {
            int size = 0;
            switch(rollOpt) {
                case 'y':
                case 'Y':

                    for (int i = 1; i <= 2; i++) {
                        int roll = (int) (Math.random() * (7 - 1) + 1);
                        System.out.println("Roll " + i + ": " + roll);
                        size += roll;
                    }
                    size += 6;
                    size *= 5;

                    System.out.println("Your Size: " + size);
                    break;
                case 'n':
                case 'N':
                    int playerRoll;
                    for (int i = 1; i <= 2; i++) {
                        System.out.print("Enter roll " + i + ": ");
                        playerRoll = sc.nextInt();
                        size += playerRoll;
                    }
                    size += 6;
                    size *= 5;

                    System.out.println("Your Size: " + size);
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
                character.setSize(size);
                rollOpt = 'n';
            }
        }
        System.out.println("-");

        System.out.println("Dexterity: (3D6) x 5");
        System.out.print("Do you need the program to roll for you? (y/n) ");
        rollOpt = sc.next().charAt(0);

        reRoll = 'y';
        while (reRoll == 'y' || reRoll == 'Y') {
            int dex = 0;
            switch(rollOpt) {
                case 'y':
                case 'Y':

                    for (int i = 1; i <= 3; i++) {
                        int roll = (int) (Math.random() * (7 - 1) + 1);
                        System.out.println("Roll " + i + ": " + roll);
                        dex += roll;
                    }
                    dex *= 5;

                    System.out.println("Your Dexterity: " + dex);
                    break;
                case 'n':
                case 'N':
                    int playerRoll;
                    for (int i = 1; i <= 3; i++) {
                        System.out.print("Enter roll " + i + ": ");
                        playerRoll = sc.nextInt();
                        dex += playerRoll;
                    }
                    dex *= 5;

                    System.out.println("Your Dexterity: " + dex);
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
                character.setDexterity(dex);
                rollOpt = 'n';
            }
        }
        System.out.println("-");

        System.out.println("Appearance: (3D6) x 5");
        System.out.print("Do you need the program to roll for you? (y/n) ");
        rollOpt = sc.next().charAt(0);

        reRoll = 'y';
        while (reRoll == 'y' || reRoll == 'Y') {
            int appe = 0;
            switch(rollOpt) {
                case 'y':
                case 'Y':

                    for (int i = 1; i <= 3; i++) {
                        int roll = (int) (Math.random() * (7 - 1) + 1);
                        System.out.println("Roll " + i + ": " + roll);
                        appe += roll;
                    }
                    appe *= 5;

                    System.out.println("Your Appearance: " + appe);
                    break;
                case 'n':
                case 'N':
                    int playerRoll;
                    for (int i = 1; i <= 3; i++) {
                        System.out.print("Enter roll " + i + ": ");
                        playerRoll = sc.nextInt();
                        appe += playerRoll;
                    }
                    appe *= 5;

                    System.out.println("Your Appearance: " + appe);
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
                character.setAppearance(appe);
                rollOpt = 'n';
            }
        }
        System.out.println("-");

        System.out.println("Intelligence: ((2D6) + 6) x 5");
        System.out.print("Do you need the program to roll for you? (y/n) ");
        rollOpt = sc.next().charAt(0);

        reRoll = 'y';
        while (reRoll == 'y' || reRoll == 'Y') {
            int inte = 0;
            switch(rollOpt) {
                case 'y':
                case 'Y':

                    for (int i = 1; i <= 2; i++) {
                        int roll = (int) (Math.random() * (7 - 1) + 1);
                        System.out.println("Roll " + i + ": " + roll);
                        inte += roll;
                    }
                    inte += 6;
                    inte *= 5;

                    System.out.println("Your Intelligence: " + inte);
                    break;
                case 'n':
                case 'N':
                    int playerRoll;
                    for (int i = 1; i <= 2; i++) {
                        System.out.print("Enter roll " + i + ": ");
                        playerRoll = sc.nextInt();
                        inte += playerRoll;
                    }
                    inte += 6;
                    inte *= 5;

                    System.out.println("Your Intelligence: " + inte);
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
                character.setIntelligence(inte);
                rollOpt = 'n';
            }
        }
        System.out.println("-");

        System.out.println("Power: (3D6) x 5");
        System.out.print("Do you need the program to roll for you? (y/n) ");
        rollOpt = sc.next().charAt(0);

        reRoll = 'y';
        while (reRoll == 'y' || reRoll == 'Y') {
            int pow = 0;
            switch(rollOpt) {
                case 'y':
                case 'Y':

                    for (int i = 1; i <= 3; i++) {
                        int roll = (int) (Math.random() * (7 - 1) + 1);
                        System.out.println("Roll " + i + ": " + roll);
                        pow += roll;
                    }
                    pow *= 5;

                    System.out.println("Your Power: " + pow);
                    break;
                case 'n':
                case 'N':
                    int playerRoll;
                    for (int i = 1; i <= 3; i++) {
                        System.out.print("Enter roll " + i + ": ");
                        playerRoll = sc.nextInt();
                        pow += playerRoll;
                    }
                    pow *= 5;

                    System.out.println("Your Power: " + pow);
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
                character.setPower(pow);
                rollOpt = 'n';
            }
        }
        System.out.println("-");

        System.out.println("Education: ((2D6) + 6) x 5");
        System.out.print("Do you need the program to roll for you? (y/n) ");
        rollOpt = sc.next().charAt(0);

        reRoll = 'y';
        while (reRoll == 'y' || reRoll == 'Y') {
            int edu = 0;
            switch(rollOpt) {
                case 'y':
                case 'Y':

                    for (int i = 1; i <= 2; i++) {
                        int roll = (int) (Math.random() * (7 - 1) + 1);
                        System.out.println("Roll " + i + ": " + roll);
                        edu += roll;
                    }
                    edu += 6;
                    edu *= 5;

                    System.out.println("Your Education: " + edu);
                    break;
                case 'n':
                case 'N':
                    int playerRoll;
                    for (int i = 1; i <= 2; i++) {
                        System.out.print("Enter roll " + i + ": ");
                        playerRoll = sc.nextInt();
                        edu += playerRoll;
                    }
                    edu += 6;
                    edu *= 5;

                    System.out.println("Your Education: " + edu);
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
                character.setEducation(edu);
                rollOpt = 'n';
            }
        }
        System.out.println("-");

        System.out.println("Luck: (3D6) x 5");
        System.out.print("Do you need the program to roll for you? (y/n) ");
        rollOpt = sc.next().charAt(0);

        reRoll = 'y';
        while (reRoll == 'y' || reRoll == 'Y') {
            int luck = 0;
            switch(rollOpt) {
                case 'y':
                case 'Y':

                    for (int i = 1; i <= 3; i++) {
                        int roll = (int) (Math.random() * (7 - 1) + 1);
                        System.out.println("Roll " + i + ": " + roll);
                        luck += roll;
                    }
                    luck *= 5;

                    System.out.println("Your Luck: " + luck);
                    break;
                case 'n':
                case 'N':
                    int playerRoll;
                    for (int i = 1; i <= 3; i++) {
                        System.out.print("Enter roll " + i + ": ");
                        playerRoll = sc.nextInt();
                        luck += playerRoll;
                    }
                    luck *= 5;

                    System.out.println("Your Luck: " + luck);
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
                character.setLuck(luck);
                rollOpt = 'n';
            }
        }
        System.out.println("Finished rolling for raw characteristics! This is how they turned out:");
        System.out.println("STR: " + character.getStrength());
        System.out.println("CON: " + character.getConstitution());
        System.out.println("SIZ: " + character.getSize());
        System.out.println("APP: " + character.getAppearance());
        System.out.println("INT: " + character.getIntelligence());
        System.out.println("POW: " + character.getPower());
        System.out.println("EDU: " + character.getEducation());
        System.out.println("DEX: " + character.getDexterity());
        System.out.println("LCK: " + character.getLuck());
        System.out.println("-----");

        sc.close();
    }
}