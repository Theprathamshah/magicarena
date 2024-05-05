package magicalarena;

import java.util.Random;


public class MagicArena {

    public  void startGame(Player p1, Player p2) {
        Player currentPlayer = p1.getHealth()<p2.getHealth()?p1:p2;
        Player otherPlayer = currentPlayer.equals(p1)?p2:p1;

        while (currentPlayer.getHealth() > 0 && otherPlayer.getHealth() > 0) {
            Dice dice = new Dice();
            int currentPlayerRoll = dice.rollDice();
            int otherPlayerRoll = dice.rollDice();

            System.out.println("Attacker is %s with dice roll %d".formatted(currentPlayer.getName(),currentPlayerRoll));
            System.out.println("Defender is %s with dice roll %d".formatted(otherPlayer.getName(),otherPlayerRoll));

            int attackDamage = currentPlayerRoll * currentPlayer.getAttackPoints();
            int defendingStrength = otherPlayerRoll*otherPlayer.getStrength();

            int damageTaken = Math.max(0,attackDamage-defendingStrength);

            otherPlayer.takeDamage(damageTaken);

            System.out.println("After this round %s's health is %d and %s's health is %d".formatted(currentPlayer.getName(),currentPlayer.getHealth(),otherPlayer.getName(),otherPlayer.getHealth()));
            Player temporaryPlayer = currentPlayer;
            currentPlayer = otherPlayer;
            otherPlayer = temporaryPlayer;

        }
        Player winner = currentPlayer.getHealth()>0?currentPlayer:otherPlayer;
        System.out.println("Player %s is winner!".formatted(winner.getName()));
    }

}
