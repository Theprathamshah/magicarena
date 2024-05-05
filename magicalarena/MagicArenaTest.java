package magicalarena;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class MagicArenaTest {
    @Test
    public void testStartGame() {
        Player p1 = new Player("Player1", 100, 10, 5);
        Player p2 = new Player("Player2", 100, 8, 6);

        MagicArena magicArena = new MagicArena();
        magicArena.startGame(p1, p2);

        assertTrue(p1.getHealth() <= 0 || p2.getHealth() <= 0);
    }

    @Test
    public void testStartGameWithSameStats() {
        Player p1 = new Player("Player1", 100, 10, 5);
        Player p2 = new Player("Player2", 100, 10, 5);

        MagicArena magicArena = new MagicArena();
        magicArena.startGame(p1, p2);

        assertTrue(p1.getHealth() <= 0 || p2.getHealth() <= 0);
    }

    @Test
    public void testStartGameWithOnePlayerWeak() {
        Player p1 = new Player("StrongPlayer", 100, 15, 7);
        Player p2 = new Player("WeakPlayer", 100, 5, 5);

        MagicArena magicArena = new MagicArena();
        magicArena.startGame(p1, p2);

        assertTrue(p1.getHealth() > 0);
    }
}