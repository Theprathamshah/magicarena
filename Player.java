public class Player {
    private String name;
    private int health;
    private int strength;
    private int attackPoints;

    public Player(String name,int health,int strength,int attackPoints){
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.attackPoints = attackPoints;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getAttackPoints() {
        return attackPoints;
    }

    public void setAttackPoints(int attackPoints) {
        this.attackPoints = attackPoints;
    }
    public void takeDamage(int damage){
        health -= damage;
    }
}
