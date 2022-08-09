package org.example;

public class Cat extends Mammal
{


    // declare constructor
    public Cat(String name, String talking, int age)
    {
        super(name, talking);
    }

    @Override
    public void eat()
    {
        System.out.println("nom nom");
    }
    @Override
    public void poop()
    {
        System.out.println("squeezing!");
    }
}

