package org.example;

public class Cat extends Mammal
{


    // declare constrcutor
    public Cat(String name, String talking, int age)
    {
        super(name, talking);
    }

    @Override
    public void eat()
    {
        String eating = "Nom nom";
        System.out.println("nom nom");
    }
    @Override
    public void poop()
    {
        System.out.println("squeezing!");
    }
}

