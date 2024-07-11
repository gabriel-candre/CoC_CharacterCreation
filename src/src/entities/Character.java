package entities;

public class Character {

    private String name;
    private Integer age;
    private String profession;
    private Integer sanity;
    private Integer health;
    private Integer strength;
    private Integer constitution;
    private Integer size;
    private Integer intelligence;
    private Integer power;
    private Integer education;
    private Integer dexterity;
    private Integer appearance;
    private Integer luck;

    public Character(){}

    public Character(String name, int age, String profession, int sanity, int health, int strength, int constitution,
                     int size, int intelligence, int power, int education, int dexterity, int apperance, int luck) {
        this.name = name;
        this.age = age;
        this.profession = profession;
        this.sanity = sanity;
        this.health = health;
        this.strength = strength;
        this.constitution = constitution;
        this.size = size;
        this.intelligence = intelligence;
        this.power = power;
        this.education = education;
        this.dexterity = dexterity;
        this.appearance = apperance;
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

    public int getConstitution() {
        return constitution;
    }

    public void setConstitution(int constitution) {
        this.constitution = constitution;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getEducation() {
        return education;
    }

    public void setEducation(int education) {
        this.education = education;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getAppearance() {
        return appearance;
    }

    public void setAppearance(int appearance) {
        this.appearance = appearance;
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
                +"\n Constitution: " + getConstitution()
                +"\n Size: " + getSize()
                +"\n Appearance: " + getAppearance()
                +"\n Intelligence: " + getIntelligence()
                +"\n Power: " + getPower()
                +"\n Education: " + getEducation()
                +"\n Dexterity: " + getDexterity()
                +"\n Luck: " + getLuck();
    }
}
