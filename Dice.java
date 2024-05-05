import java.util.Random;

public class Dice {
    public static int rollDice(Random random) {
        return random.nextInt(6) + 1;
    }
}
