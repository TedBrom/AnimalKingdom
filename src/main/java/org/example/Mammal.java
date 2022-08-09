package org.example;

public abstract class Mammal extends Animal
{
    // declare variables
    private String name = "";
    private String talking = "";
    protected Mammal(String name, String talking)
    {
        super(5, false);
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
