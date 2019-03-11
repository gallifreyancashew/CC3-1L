package rpg;
public class Character {
    static Dice dice = new Dice();
    public String name;
    public int strength;
    public int dexterity;
    public int intelligence;
    public int maxlife;
    public int currentlife;

    public Character(String n, int s, int d, int i) {
        name = n;
        strength = s;
        dexterity = d;
        intelligence = i;
        maxlife = dice.roll();
        currentlife=maxlife;
    }

    public int attack() {
        int attack = strength + dice.roll();
        return attack;
    }
    
    public void wound(int damage) {
        damage = dice.roll();
        currentlife= currentlife-damage;
    }
    
    public void heal(int heal) {
        heal = dice.roll();
        if (currentlife<maxlife){
            currentlife = currentlife+heal;
        } 
    }
    public String getName() {
        return name;
    }
    public int getStrength() {
        return strength;
    }
    public int getDexterity() {
        return dexterity;
    }
    public int getIntelligence() {
        return intelligence;
    }
    public int getCurrentLife() {
        return currentlife;
    }
    public int getMaxLife() {
        return maxlife;
    }
}