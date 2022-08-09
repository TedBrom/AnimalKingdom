package org.example;

public abstract class Bird extends Animal
{
    // declare variables
    private String name = "";
    private String colour = "";

    protected Bird(String name, String colour)
    {
        super(3, false);
        this.name = name;
        this.colour = colour;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}

