package magicalarena;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Player> players = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Prompt user for the number of players
        System.out.print("Enter the number of players: ");
        int numPlayers = scanner.nextInt();

        // Loop to get player details from user input
        for (int i = 0; i < numPlayers; i++) {
            System.out.println("Enter details for player " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.next();
            System.out.print("Health: ");
            int health = scanner.nextInt();
            System.out.print("Strength: ");
            int strength = scanner.nextInt();
            System.out.print("Attack Points: ");
            int attackPoints = scanner.nextInt();

            // Create Player object and add to ArrayList
            Player player = new Player(name, health, strength, attackPoints);
            players.add(player);
        }

        MagicArena magicArena = new MagicArena();
        magicArena.startGame(players.getFirst(),players.getLast());

        scanner.close();
    }

}
