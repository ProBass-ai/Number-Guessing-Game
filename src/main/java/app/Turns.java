package app;

public class Turns {
    private int turns = 10;

    public int getTurns()
    {
        return this.turns;
    }

    public void lower()
    {
        this.turns -= 1;
    }

    public void increase()
    {
        this.turns += 1;
    }
}
