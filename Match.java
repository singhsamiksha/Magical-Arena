public class Match {
    private Player playerA;
    private Player playerB;
    
    //Constructor
    public Match(Player playerA, Player playerB) {
        this.playerA = playerA;
        this.playerB = playerB;
    }

    public void start() {
    	// Determine the initial attacker and defender based on their health
    	Player attacker = (playerA.getHealth() < playerB.getHealth()) ? playerA : playerB;
        Player defender = (attacker == playerA) ? playerB : playerA;
        

        while (playerA.isAlive() && playerB.isAlive()) {
            attack(attacker, defender);
            // Swap attacker and defender for the next turn
            Player temp = attacker;
            attacker = defender;
            defender = temp;
        }
        
        // Determine and print the winner of the match
        Player winner = playerA.isAlive() ? playerA : playerB;
        if(winner == playerA) {
        	System.out.println("Player A is the winner.");
        }
        else {
        	System.out.println("Player B is the winner.");
        }
    }
    
    // Method to handle an attack between two players
    public void attack(Player attacker, Player defender) {
        int attackDamage = attacker.calculateAttackDamage();
        int defendStrength = defender.calculateDefendStrength();

        int damageTaken = Math.max(0, attackDamage - defendStrength);
        defender.receiveDamage(damageTaken); // Apply damage to the defending player
    }
}
