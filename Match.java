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
    	Player attacker = (playerA.getHealth() <= playerB.getHealth()) ? playerA : playerB;
        Player defender = (attacker == playerA) ? playerB : playerA;
        
        System.out.println("\n\nStarting the match between " + this.playerA.getName() + " - " + this.playerB.getName());
        System.out.println(attacker.getName() + " will start with attacking");

        int rounds = 0;
        

        while (playerA.isAlive() && playerB.isAlive()) {
        	pause();
            System.out.println("\n\nRound : " + ++rounds);
            attack(attacker, defender);
            // Swap attacker and defender for the next turn
            Player temp = attacker;
            attacker = defender;
            defender = temp;
        }
        
        // Determine and print the winner of the match
        Player winner = playerA.isAlive() ? playerA : playerB;
        System.out.println("\n\n\nStatistics:");
        System.out.println("Winner: " + winner.getName() + "\nRounds Taken: " + rounds);
    }
    
    // Method to handle an attack between two players
    public void attack(Player attacker, Player defender) {
    	System.out.println("Attacker: " + attacker.getName());
        int attackDamage = attacker.calculateAttackDamage();
        int defendStrength = defender.calculateDefendStrength();

        int damageTaken = Math.max(0, attackDamage - defendStrength);
        System.out.println(attacker.getName() + ": Damaging " + defender.getName() + " with:" + damageTaken);
        defender.receiveDamage(damageTaken); // Apply damage to the defending player
        
        System.out.println(defender.getName() + ": Remaining Health: " + defender.getHealth());
    }

    public void pause() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // Do nothing if unable to sleep
        }
    }
}
