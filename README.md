# Magical-Arena

## Description
"Magical Arena" is a Java console game where players battle using health, strength, and attack attributes. They roll dice to attack and defend, aiming to reduce opponents' health to zero. Fast-paced and strategic, it ends when a player's health depletes.

## Getting Started
1. Download the zip file from the repository.
2. Extract the contents of the zip file to a directory on your local machine.
3. Make sure you have Java installed on your system.
4. Open a terminal or command prompt.
5. Navigate to the directory where you extracted the zip file.

 ## Compile and run the source code
 1. Compile the Java files using a Java compiler using command <br>
 `javac Main.java`
 1. Run the game using command <br>
 `java Main`

 ## How to play
 1. Enter the attributes for Player A when prompted (health, strength, attack).
 2. Enter the attributes for Player B when prompted (health, strength, attack).
 3. The game will simulate the battle between the two players, with Player having less health attacking first.
 4. The attacker's attack value, multiplied by the attacking dice roll, determines the damage inflicted, while the defender's strength value, multiplied by the defending dice roll, determines the damage defended.
 5. Any excess damage from the attacker reduces the defender's health.
 6. The game continues with players exchanging attacker and defender roles until one player's health reaches zero, indicating the end of the match.
 7. The game announces the winner based on which player's health reaches zero first.
    


