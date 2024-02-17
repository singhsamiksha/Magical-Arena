import java.util.Scanner;

public class Main {

    public static Player createPlayer(Scanner scanner){
        System.out.print("Health: ");
        int health = scanner.nextInt();

        System.out.print("Strength:");
        int strength = scanner.nextInt();

        System.out.print("Attack:  ");
        int attack = scanner.nextInt();

        return new Player(health,strength,attack);

    }
    public static void main(String[] agrs){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Player A's attribute : ");
        Player playerA = createPlayer(scanner);
        System.out.print("Enter Player b's attribute : ");
        Player playerB = createPlayer(scanner);

        Match match = new Match(playerA, playerB);
        match.fight();

        scanner.close();
        
    }
}