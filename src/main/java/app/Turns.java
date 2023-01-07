package app;

public class Turns extends Player {
    private int turns = 10;

    public int getTurns()
    {
        return this.turns;
    }

    public void decrease()
    {
        this.turns -= 1;
    }

    public void increase()
    {
        this.turns += 1;
    }
}
