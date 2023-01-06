package FunctionalTests.BoundaryTests;

import app.Points;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointsClassTests {

    @Test
    public void InitialPointsMustBe_0()
    {
        Points newPoints = new Points();

        assertEquals(0, newPoints.getPoints());
    }

    @Test
    public void CanIncreasePoints()
    {
        Points newPoints = new Points();

        newPoints.add();

        assertEquals(1, newPoints.getPoints());
    }

    @Test
    public void CanDecreasePoints()
    {
        Points newPoints = new Points();

        newPoints.add(); newPoints.subtract();

        assertEquals(0, newPoints.getPoints());
    }

    @Test
    public void PointsCannotBeNegative()
    {
        Points newPoints = new Points();

        newPoints.subtract();

        assertTrue((newPoints.getPoints() == 0));
    }

}
