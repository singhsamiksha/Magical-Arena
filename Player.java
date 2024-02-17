import java.util.Random;

class Player {
    private int health;
    private int strength;
    private int attack;
    private Random random;

    public Player(int health, int strength, int attack) {
        this.health = health;
        this.strength = strength;
        this.attack = attack;
        this.random = new Random();
    }

    public int getHealth() {
        return health;
    }

    public boolean isAlive() {
        return health > 0;
    }

    public void receiveDamage(int damage) {
        health -= damage;
        if (health < 0) {
            health = 0;
        }
    }

    public int rollDice() {
        return random.nextInt(6) + 1;
    }

    public int calculateAttackDamage() {
        return attack * rollDice();
    }

    public int calculateDefendStrength() {
        return strength * rollDice();
    }
}