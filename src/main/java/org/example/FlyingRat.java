package org.example;

public class FlyingRat extends Bird implements Flying
{
    float heading = 0f;
    boolean canTakeoff = true;
    boolean canGlide = true;
    boolean canFlap = true;

    // declare constructor
    public FlyingRat()
    {
        super("Polly", "Grey");
    }

    @Override
    public void poop()
    {
        System.out.println("You just washed your car HA!");
    }

    @Override
    public void eat()
    {
        System.out.println("One man's trash is another pigeons din din? ");
    }



    @Override
    public boolean takeOff()
    {
        return canTakeoff;
    }

    @Override
    public void landing()
    {
        //sonar lab wanted a comment here explaining why this method is empty
        //I simply hadn't got to coding it yet.
    }

    @Override
    public boolean flap()
    {
        System.out.println("I'm flapping!!!");
        return canFlap;
    }

    @Override
    public boolean glide()
    {
        return canGlide;
    }
}
