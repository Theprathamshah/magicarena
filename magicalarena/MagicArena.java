package magicalarena;

import java.util.Random;

import static magicalarena.Dice.rollDice;

public class MagicArena {
    private static Player currentPlayer;
    private static Player otherPlayer;

    public static void startGame(Player p1, Player p2) {
        currentPlayer = p1;
        currentPlayer = p2;

        while (currentPlayer.getHealth() > 0 && otherPlayer.getHealth() > 0) {
            Random random = new Random();

            int currentPlayerRoll = rollDice(random);
            int otherPlayerRoll = rollDice(random);

            int attackDamage = currentPlayerRoll * currentPlayer.getAttackPoints();
            int defendingStrength = otherPlayerRoll*otherPlayer.getStrength();

            int damageTaken = Math.max(0,attackDamage-defendingStrength);

            otherPlayer.takeDamage(damageTaken);


            Player temporaryPlayer = currentPlayer;
            currentPlayer = otherPlayer;
            otherPlayer = temporaryPlayer;

        }
        Player winner = currentPlayer.getHealth()>0?currentPlayer:otherPlayer;
        System.out.println("Player %s is winner!".formatted(winner.getName()));
    }

    private static void updatePlayer(Player player,String name,int health){
        System.out.println("health of player %s is %d".formatted(name,health));
    }
}
