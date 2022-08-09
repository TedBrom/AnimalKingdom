package org.example;

public abstract class Animal
{


    private boolean dead;
    private int age = 0;

    public Animal(int age, boolean dead)
    {
        this.age = age;
        this.dead = dead;
    }
    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public boolean isDead()
    {
        return dead;
    }

    public void setDead(boolean dead)
    {
        this.dead = dead;
    }


    public abstract void poop();
    public abstract void eat();


}
