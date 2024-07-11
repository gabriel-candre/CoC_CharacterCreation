package entities;

public class Character {

    private String name;
    private Integer age;
    private String profession;
    private Integer sanity;
    private Integer health;
    private Integer strength;
    private Integer intelligence;
    private Integer dexterity;
    private Integer luck;

    public Character(){}

    public Character(String name, int age, String profession, int sanity, int health, int strength,
                     int intelligence, int dexterity, int luck) {
        this.name = name;
        this.age = age;
        this.profession = profession;
        this.sanity = sanity;
        this.health = health;
        this.strength = strength;
        this.intelligence = intelligence;
        this.dexterity = dexterity;
        this.luck = luck;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public int getSanity() {
        return sanity;
    }

    public void setSanity(int sanity) {
        this.sanity = sanity;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getLuck() {
        return luck;
    }

    public void setLuck(int luck) {
        this.luck = luck;
    }

    @Override
    public String toString() {
        return "Name: " + getName()
                +"\n Age: " + getAge()
                +"\n Profession: " + getProfession()
                +"\n Sanity: " + getSanity()
                +"\n Max Health: " + getHealth()
                +"\n Strength: " + getStrength()
                +"\n Intelligence: " + getIntelligence()
                +"\n Dexterity: " + getDexterity()
                +"\n Luck: " + getLuck();
    }
}
