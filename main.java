import java.util.Scanner;

public class Main {
   
	// Method to create a player based on user input
    public static Player createPlayer(Scanner scanner, String name){
    	
    	System.out.println("Enter " + name + "'s attribute");
    	// Prompt user for player attributes
        System.out.print("Health: ");
        int health = scanner.nextInt();

        System.out.print("Strength: ");
        int strength = scanner.nextInt();

        System.out.print("Attack: ");
        int attack = scanner.nextInt();
        
        // Create and return a new Player object with the provided attributes 
        return new Player(health,strength,attack,name);

    }
    public static void main(String[] agrs){
        Scanner scanner = new Scanner(System.in);
        // Prompt user to enter attributes for Players
        Player playerA = createPlayer(scanner, "Player A");
        Player playerB = createPlayer(scanner, "Player B");
        
        // Create a Match object with the two players and start method is called from match's class
        Match match = new Match(playerA, playerB);
        match.start();

        scanner.close();
        
    }
}