class Match {
    private Player playerA;
    private Player playerB;

    public Match(Player playerA, Player playerB) {
        this.playerA = playerA;
        this.playerB = playerB;
    }

    public void fight() {
        Player attacker = playerA.getHealth() < playerB.getHealth() ? playerA : playerB;
        Player defender = attacker == playerA ? playerB : playerA;

        while (playerA.isAlive() && playerB.isAlive()) {
            int attackDamage = attacker.calculateAttackDamage();
            int defendStrength = defender.calculateDefendStrength();

            int damageTaken = Math.max(0, attackDamage - defendStrength);
            defender.receiveDamage(damageTaken);

            // Swap attacker and defender
            Player temp = attacker;
            attacker = defender;
            defender = temp;
        }

        Player winner = playerA.isAlive() ? playerA : playerB;
        if(winner == playerA) {
        	System.out.println("playerA is the winner.");
        }else {
        	System.out.println("playerB is the winner.");
        }
        
    }
}