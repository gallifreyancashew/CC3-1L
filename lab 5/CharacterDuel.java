package rpg;
import java.util.*;
public class CharacterDuel{
//test class to implement objects of the subclasses    
    public static String name1;
    public static String name2;
    public static void main (String [] args){
        Random r = new Random ();
        Scanner sc = new Scanner (System.in);
        System.out.print ("Please enter a name for your Wizard: ");
        name1 = sc.nextLine();
        System.out.print ("Please enter a name for your Mercenary: ");
        name2 = sc.nextLine();
        
        //instantiating wizard and mercenary classes
        Wizard playerOne = new Wizard (name1, 1, 2, 3); //n, s, d, i
        Mercenary playerTwo = new Mercenary (name2, 1, 2, 3);
        
        //turn based loop for duel
        int i=1;
        while (playerOne.getCurrentLife()>0&&playerTwo.getCurrentLife()>0){
            System.out.println ("\nROUND "+i);
            int choice = r.nextInt ((3-1)+1)+1; //attack and/or heal randomizer
            //PLAYER ONE - WIZARD
            System.out.println (name1+" : "+ playerOne.getCurrentLife()+
                "\n" + name2 +" : "+playerTwo.getCurrentLife());
                if (choice==1){ 
                    //superclass attack method
                    System.out.println (name1 +" attacks "+name2+
                        " for " +playerOne.attack()+".");            
                    playerTwo.currentlife = playerTwo.currentlife - playerOne.attack();
                } else if (choice==2){
                    //lightning bolt and heal
                    playerOne.castLightningBolt(3);
                    System.out.println (name1 +" casts lightning bolt on "+name2+ 
                        " for " +playerOne.getLightningDamage()+" and heals self.");
                    playerOne.currentlife = playerOne.getCurrentLife() + playerOne.castHeal();
                    playerTwo.currentlife = playerTwo.getCurrentLife() - playerOne.getLightningDamage();
                } else if (choice==3){
                    //heal
                    playerOne.currentlife = playerOne.currentlife + playerOne.castHeal();
                    System.out.println (name1 + " heals self.");
                }           
            choice = r.nextInt ((3-1)+1)+1;    
            //PLAYER TWO - MERCENARY
            System.out.println ("\n"+playerOne.name +" : "+ playerOne.getCurrentLife()+
                "\n" + playerTwo.name +" : "+playerTwo.getCurrentLife());
                if (choice==1){
                    //superclass attack method
                    System.out.println (name2+ " attacks "+name1+
                            " for "+playerTwo.attack()+".");
                     playerOne.currentlife = playerOne.currentlife - playerTwo.attack();
                } else if (choice==2){
                    //shootEnemy and selfHeal method
                    playerTwo.shootEnemy(2);
                    playerTwo.currentlife = playerTwo.getCurrentLife() + playerTwo.selfHeal();
                    System.out.println (name2+ " shoots " +name1+
                            " for "+playerTwo.getShotDamage()+ " and heals self.");
                    playerOne.currentlife = playerOne.currentlife - playerTwo.getShotDamage();                    
                } else if (choice==3){
                    //slashEnemy method
                    playerTwo.slashEnemy(1);
                    System.out.println (name2+ " slashes "+name1+ " for "+
                            playerTwo.getSlashDamage()+".");
                    playerOne.currentlife = playerOne.currentlife - playerTwo.getSlashDamage();
                }
            //increments the while loop    
            i++;
            System.out.println();
        //winning conditions
        if (playerOne.getCurrentLife()<=0||playerTwo.getCurrentLife()<=0){
            if (playerOne.getCurrentLife()>playerTwo.getCurrentLife()){
                System.out.println (name1+" wins!");
            } else if (playerOne.getCurrentLife()<playerTwo.getCurrentLife()){
                System.out.println (name2+" wins!");        
            } else if (playerOne.getCurrentLife()==0&&playerTwo.getCurrentLife()==0){
                System.out.println ("Draw!");
            }
        }
        
        }
    }
}