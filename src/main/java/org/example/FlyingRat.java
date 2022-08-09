package org.example;

public class FlyingRat extends Bird implements Flying
{
    public FlyingRat()
    {
        super("Polly", "Grey");
    }

    @Override
    public void poop()
    {
        System.out.println("squeezing!");
    }

    @Override
    public void eat()
    {
        String eating = "Peck peck!!!";
        System.out.println("peck peck? ");
    }



    @Override
    public void takeOff()
    {

    }

    @Override
    public void landing()
    {

    }

    @Override
    public void flap()
    {

    }

    @Override
    public void glide()
    {

    }
}
