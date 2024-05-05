package magicalarena;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Player> players = new ArrayList<>();
        System.out.println("Enter number of players you want!");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter player name");
            String name = sc.nextLine();
            Integer health = sc.nextInt();
            Integer attackPoints = sc.nextInt();
            Integer strength = sc.nextInt();
            Player obj = new Player(name, health, strength, attackPoints);
            players.add(obj);
        }
    }
}
