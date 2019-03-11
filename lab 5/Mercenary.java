package rpg;
//Author: Karel Cassandra
public class Mercenary extends Character {
    //create a new .java file which extends Character
    public int maxshots;
    public int currentshots;
    public int bandage;
    public int shotDamage;
    public int slashDamage;
    public Mercenary (String n, int s, int d, int i){
        super (n,s,d,i);
        maxshots = 30;
        currentshots = maxshots;
        bandage=10;
    }
    public int shootEnemy (int d){
    //contains at least one new method which uses dexterity as an attack modifier
        if (currentshots >= 5){
            currentshots= currentshots - 2;
            shotDamage = currentshots*d;
            return dice.roll();
        } else {
            return 0;
        }
    }
    public int slashEnemy (int s){
    //additional method which uses strength as an attack modifier
        slashDamage = 10 * s;
        return slashDamage;
    }
    public int selfHeal (){
    //heals self while variable bandages is more than 0
        if (currentlife>maxlife && bandage >=1){
            bandage=-1;
            super.currentlife = currentlife+5;
        } else if (bandage < 1){
            System.out.println ("You're out of bandages!");
        }
        return 1;
    }
    public int getMaxShots (){
        return maxshots;
    }
    public int getCurrentShots (){
        return currentshots;
    }
    public int getShotDamage(){
        return shotDamage;
    }
    public int getSlashDamage(){
        return slashDamage;
    }
}
