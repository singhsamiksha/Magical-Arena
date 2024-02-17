public class Match {
    private Player playerA;
    private Player playerB;

    public Match(Player playerA, Player playerB) {
        this.playerA = playerA;
        this.playerB = playerB;
    }

    public void start() {
    	Player attacker;
    	Player defender;
    	if(playerA.getHealth()< playerB.getHealth()) {
    		attacker = playerA;
            defender = playerB;
    	}
    	else {
    		attacker = playerB;
            defender = playerA;
    	}
        

        while (playerA.isAlive() && playerB.isAlive()) {
            attack(attacker, defender);
            // Swap attacker and defender for the next turn
            Player temp = attacker;
            attacker = defender;
            defender = temp;
        }

        Player winner = playerA.isAlive() ? playerA : playerB;
        if(winner == playerA) {
        	System.out.println("Player A is the winner.");
        }
        else {
        	System.out.println("Player B is the winner.");
        }
    }

    public void attack(Player attacker, Player defender) {
        int attackDamage = attacker.calculateAttackDamage();
        int defendStrength = defender.calculateDefendStrength();

        int damageTaken = Math.max(0, attackDamage - defendStrength);
        defender.receiveDamage(damageTaken);
    }
}
