package FunctionalTests.BoundaryTests;

import app.Player;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerClassTests {


    @Test
    public void CanGetPlayersName()
    {
        Player newPlayer = new Player();

        newPlayer.setPlayerName("Tebogo");

        assertEquals("Tebogo", newPlayer.getName());
    }

}
