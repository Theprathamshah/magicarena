package magicalarena;
import java.util.Random;

public class Dice {
    public  int rollDice() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }
}
