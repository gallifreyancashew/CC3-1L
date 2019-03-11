package rpg;
public class TestCharacter {
    public static void main(String[] args) {
        Character playerOne = new Character ("Bob", 2, 3, 4);
        Character playerTwo = new Character ("Joe", 2, 3, 4);
        int i=1;
        while (playerOne.getCurrentLife()>0&&playerTwo.getCurrentLife()>0){
            System.out.println ("Round "+i);
            System.out.println (playerOne.name +" : "+ playerOne.getCurrentLife()+
                "\n" + playerTwo.name +" : "+playerTwo.getCurrentLife());
            System.out.println (playerOne.name +" attacks "+playerTwo.name+
                " for " +playerOne.attack());
            playerTwo.currentlife = playerTwo.currentlife - playerOne.attack();
            System.out.println (playerTwo.name +" attacks "+playerOne.name+
                " for " +playerTwo.attack());
            playerOne.currentlife = playerOne.currentlife - playerTwo.attack();
            i++;
            System.out.println();
            
            //winning conditions
            if (playerOne.getCurrentLife()<=0||playerTwo.getCurrentLife()<=0){
                if (playerOne.getCurrentLife()>playerTwo.getCurrentLife()){
                    System.out.println (playerOne.getName()+" wins!");
                } else if (playerOne.getCurrentLife()<playerTwo.getCurrentLife()){
                    System.out.println (playerTwo.getName()+" wins!");        
                }
            }
        }
    }
}
