package org.tests;


import org.example.Cat;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CatTest
{
    @Test
     public void testGetCat()
    {
        Cat testCat = new Cat("jeff", "Meow", 7);
        assertEquals(7, testCat.getAge());

    }
    @Test
     public void getName()
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


}

