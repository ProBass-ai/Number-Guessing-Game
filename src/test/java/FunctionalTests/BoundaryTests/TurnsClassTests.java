package FunctionalTests.BoundaryTests;

import app.Turns;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TurnsClassTests {

    @Test
    public void CanIncreaseTurns()
    {
        Turns turns = new Turns();

        int initNumberOfTurns = turns.getTurns();

        turns.increase();

        int newNumberOfTurns = turns.getTurns();

        assertTrue( ( newNumberOfTurns == initNumberOfTurns + 1 ) );
    }

    @Test
    public void CanDecreaseTurns()
    {
        Turns turns = new Turns();

        int initNumberOfTurns = turns.getTurns();

        turns.decrease();

        int newNumberOfTurns = turns.getTurns();

        assertTrue( ( newNumberOfTurns == initNumberOfTurns - 1 ) );
    }

}
