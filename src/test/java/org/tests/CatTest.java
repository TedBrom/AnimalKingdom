package org.tests;


import org.example.Cat;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

 class CatTest
{
    @Test
    void testGetCat()
    {
        Cat testCat = new Cat("jeff", "Meow", 5);
        assertEquals(5, testCat.getAge());

    }
    @Test
    void getName()
    {
        Cat testCat1 = new Cat("harry", "Meow", 5);
        assertEquals("harry", testCat1.getName());
    }

    @Test
     void getTalking()
    {
        Cat testCat = new Cat("harry", "Meow", 5);
        assertEquals("Meow", testCat.getTalking());
    }

    @Test
     void getAge()
    {
        Cat testCat1 = new Cat("harry", "Meow", 5);
        assertEquals(5, testCat1.getAge());
    }
    @Test
    void getLifeStatus()
    {
        Cat newCat4 = new Cat("jeff", "Meow", 5);
        assertEquals(false ,newCat4.isDead());
    }


}

