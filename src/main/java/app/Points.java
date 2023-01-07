package app;

public class Points extends Player{
    private int points = 0;

    public void add()
    {
        points += 1;
    }

    public void subtract()
    {
        points = ( points > 0 ) ? points - 1 : 0;
    }

    public int getPoints()
    {
        return points;
    }
}
