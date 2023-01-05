package app;

public class Points {
    private int points = 0;

    public void add()
    {
        points += 1;
    }

    public void subtract()
    {
        points -= 1;
    }

    public int getPoints()
    {
        return points;
    }
}
