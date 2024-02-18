import java.util.Random;

class Player {
    private int health;
    private int strength;
    private int attack;
    private String name;
    private Random random;
    
    // Constructor to initialize a player with given attributes
    public Player(int health, int strength, int attack, String name) {
        this.health = health;
        this.strength = strength;
        this.attack = attack;
        this.name = name;
        this.random = new Random();
    }
 
    // Method to get the player's current health
    public int getHealth() {
        return health;
    }
    
 // To get the name of the player
    public String getName() {
        return this.name;
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
    	int diceValue = random.nextInt(6) + 1;
        System.out.println(this.getName() + ": Rolling dice; Got dice value of " + diceValue);
        return diceValue; // Return a random integer between 1 and 6
    }

    // Method to calculate the damage inflicted by the player's attack
    public int calculateAttackDamage() {
    	int diceValue = rollDice();
        int attackValue = attack * diceValue;
        System.out.println(this.getName() + ": Attack Value: " + attackValue);
        return attackValue;
    }

    // Method to calculate the defense strength of the player
    public int calculateDefendStrength() {
    	int diceValue = rollDice();
        int defendValue = strength * diceValue;
        System.out.println(this.getName() + ": Defend Value: " + defendValue);
        return defendValue;
    }
}