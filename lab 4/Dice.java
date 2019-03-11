package rpg;
import java.util.Random;
public class Dice {
    private final Random r;
    public Dice() {
        r = new Random ();
        roll();
    }
    public int roll() {
        int die = r.nextInt ((6-1)+1)+1;
        return die;
    }
}