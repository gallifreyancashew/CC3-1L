package rpg;
//Author: Karel Cassandra
public class Wizard extends Character {
    public int maxmagic;
    public int currentmagic;
    public int lightningBolt;
    public Wizard (String n, int s, int d, int i){
        super (n,s,d,i);
        maxmagic = 20;
        currentmagic = maxmagic;
    }
    public int castLightningBolt (int i){
        if (currentmagic >= 5){
            currentmagic= currentmagic-5;
            lightningBolt = currentmagic * i;
            return dice.roll();
        } else {
            return 0;
        }
    }
    public int castHeal (){
        if (currentmagic >=8){
            currentmagic=-8;
            currentlife = currentlife + heal;
        }
        return 1;
    }
    public int getLightningDamage (){
        return lightningBolt;
    }
    public int getMaxMagic (){
        return maxmagic;
    }
    public int getCurrentMagic (){
        return currentmagic;
    }
}
