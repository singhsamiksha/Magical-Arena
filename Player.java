import java.util.Random;

class Player {
    private int health;
    private int strength;
    private int attack;
    private Random random;
    
    // Constructor to initialize a player with given attributes
    public Player(int health, int strength, int attack) {
        this.health = health;
        this.strength = strength;
        this.attack = attack;
        this.random = new Random();
    }
 
    // Method to get the player's current health
    public int getHealth() {
        return health;
    }

    // Method to check if the player is alive (health > 0)
    public boolean isAlive() {
        return health > 0;
    }

    // Method to apply damage to the player
    public void receiveDamage(int damage) {
        health -= damage; // Reduce player's health by the given amount of damage
        if (health < 0) {
            health = 0;
        }
    }
 
    // Method to simulate rolling a six-sided die
    public int rollDice() {
        return random.nextInt(6) + 1; // Return a random integer between 1 and 6
    }

    // Method to calculate the damage inflicted by the player's attack
    public int calculateAttackDamage() {
        return attack * rollDice();
    }

    // Method to calculate the defense strength of the player
    public int calculateDefendStrength() {
        return strength * rollDice();
    }
}