package org.tests;


import org.example.Flying;
import org.example.FlyingRat;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

 class PigeonTest
{
    @Test
    void getPigeonAge()
    {
        FlyingRat newPigeon = new FlyingRat();
        assertEquals(3 , newPigeon.getAge());
    }

    @Test
    void getPigeonName()
    {
        FlyingRat newPigeon2 = new FlyingRat();
        assertEquals("Polly" , newPigeon2.getName());

    }
    @Test
    void getBirdColour()
    {
        FlyingRat newPigeon3 = new FlyingRat();
        assertEquals("Grey" , newPigeon3.getColour());
    }

    @Test
    void getLifeStatus()
    {
        FlyingRat newPigeon4 = new FlyingRat();
        assertEquals(false , newPigeon4.isDead());
    }

    @Test
    void getColour()
    {
        FlyingRat newPigeon5 = new FlyingRat();
        assertEquals("Grey", newPigeon5.getColour());
    }

    @Test
    void getFlap()
    {
        FlyingRat newPigeon6 = new FlyingRat();
        assertEquals(true , newPigeon6.flap());
    }

    @Test
    void getGlide()
    {
        FlyingRat newPigeon7 = new FlyingRat();
        assertEquals(true, newPigeon7.glide());
    }
    @Test
    void getFly()
    {
        FlyingRat newPigeon8 = new FlyingRat();
        assertEquals(true, newPigeon8.takeOff());
    }
}
