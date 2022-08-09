package org.tests;


import org.example.FlyingRat;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

 class PigeonTest
{
    @Test
    void getPigeonAge()
    {
        FlyingRat newPigeon = new FlyingRat();
        assertEquals(3, newPigeon.getAge());
    }

    @Test
    void getPigeonName()
    {
        FlyingRat newPigeon2 = new FlyingRat();
        assertEquals("Polly", newPigeon2.getName());

    }
    @Test
    void getBirdColour()
    {
        FlyingRat newPigeon3 = new FlyingRat();
        assertEquals("Grey", newPigeon3.getColour());
    }

}
