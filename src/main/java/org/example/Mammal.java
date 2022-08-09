package org.example;

public abstract class Mammal extends Animal
{
    private String name = "";
    private String talking = "";
    public Mammal(String name, String talking)
    {
        super(7, false);
        this.name = name;
        this.talking = talking;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getTalking() {
        return talking;
    }

    public void setTalking(String talking) {
        this.talking = talking;
    }
}
