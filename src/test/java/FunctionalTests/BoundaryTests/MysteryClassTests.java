package FunctionalTests.BoundaryTests;

import app.Mystery;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class MysteryClassTests {

    @Test
    public void MysteryNumberMustBeWithinConstraint_0_to_100()
    {
        Mystery mysteryObject = new Mystery(); mysteryObject.generate();

        int mysteryNumber = mysteryObject.getMysteryNumber();

        assertTrue((mysteryNumber <= 100));
    }


    @Test
    public void MysteryNumberMustBeWithinConstraint_0_to_500()
    {
        Mystery mysteryObject = new Mystery(); mysteryObject.generate(500);

        int mysteryNumber = mysteryObject.getMysteryNumber();

        assertTrue((mysteryNumber <= 500));
    }


    @Test
    public void MysteryNumberMustBeWithinConstraint_2_to_5()
    {
        Mystery mysteryObject = new Mystery(); mysteryObject.generate(2 ,5);

        int mysteryNumber = mysteryObject.getMysteryNumber();

        assertTrue((mysteryNumber >= 2 && mysteryNumber <= 5));
    }


}
