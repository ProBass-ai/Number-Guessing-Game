package app;

import java.util.Random;


public class Mystery {
    int mysteryNumber;
    Random rand = new Random();


    public void generate()
    {
        int endPoint = 100;
        mysteryNumber = rand.nextInt(endPoint);
    }


    public void generate(int endPoint)
    {
        mysteryNumber = rand.nextInt(endPoint);
    }


    public void generate(int startPoint, int endPoint)
    {
        mysteryNumber = rand.nextInt(startPoint, endPoint);
    }


    public int getMysteryNumber()
    {
        return mysteryNumber;
    }

}
