import org.junit.Test;
import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class JunitTestCases {
    @Test
    public void testMain() {
        // Redirect System.in for user input simulation
        String input = "5000\n5\n10\n100\n10\n5\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        // Run the main method
        Main.main(new String[]{});
    }
    
    @Test
    public void testPlayerAWin(){
        // Assuming playerA wins, playerB loses
        Player playerA = new Player(5000, 5, 10, "Player A");
        Player playerB = new Player(100, 10, 50, "Player B");
        Match match = new Match(playerA, playerB);
        match.start();
        assertTrue(playerA.isAlive());
    }
    
    @Test
    public void testPlayerBWin(){
        // Assuming playerA wins, playerB loses
        Player playerA = new Player(5, 5, 10, "Player A");
        Player playerB = new Player(100, 10, 50, "Player B");
        Match match = new Match(playerA, playerB);
        match.start();
        assertTrue(playerB.isAlive());
    }
    
}

